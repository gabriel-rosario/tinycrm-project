package models;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import beans.CRMBean;
import beans.ClientBean;
import beans.OpportunityBean;

public class OpportunityModel extends CRMModel{

	private static String SALES_FILE = "data/opportunities.tsv";

	public OpportunityModel() {
		super();
	}

	public void doInit() {
		super.doInit();
		ArrayList<CRMBean> beans = parseBeansFromFile(SALES_FILE);
		this.setList(beans);
		setIndex(0);
	}

	public void doAdd() {
		long id = 1;
		if (this.getCount() > 0) {
			id = ((OpportunityBean) this.getBean(this.getCount()-1)).getId() + 1;
		}
		this.getAllBeans().add(new OpportunityBean(id));
		this.setIndex(this.getCount() - 1);
	}
	
	public void doSave() {
		super.doSave();
		saveBeansToFile(SALES_FILE);
	}

	public ArrayList<CRMBean> parseBeansFromFile(String filename) {
		File inputFile = new File(filename);
		try {
			ArrayList<CRMBean> opportunityBeans = new ArrayList<CRMBean>();
			Scanner inputScanner = new Scanner(inputFile);
			inputScanner.nextLine();  // Ignore header line
			int count = 0;
			inputScanner.useDelimiter("[\t\n]");
			while (inputScanner.hasNextLine()) {
				String ID = inputScanner.next();
				int id = Integer.parseInt(ID);
				OpportunityBean newBean = new OpportunityBean(id);
				String product = inputScanner.next();
				newBean.setProduct(product);
				String ppu = inputScanner.next();
				newBean.setPPU(ppu);
				String quantity = inputScanner.next();
				newBean.setQuantity(quantity);
				String price = Integer.toString(Integer.parseInt(quantity)*Integer.parseInt(ppu));
				newBean.setPrice(price);
				String close = inputScanner.next();
				newBean.setClose(close);
				String status = inputScanner.next();
				newBean.setStatus(status);
				String description = inputScanner.next();
				newBean.setDescription(description);
				inputScanner.nextLine();  // Skip over anything left in line
				opportunityBeans.add(newBean);
				count++;
			}
			inputScanner.close();
			return opportunityBeans;
		}
		catch (FileNotFoundException e) {
			throw new RuntimeException("Fatal Error: Input file not Found");
		}
	}
	
	public void saveBeansToFile(String filename) {
		ArrayList<CRMBean> opportunityBeans = getAllBeans();
		File outputFile = new File(filename);
		try {
			PrintWriter out = new PrintWriter(outputFile);
			out.println("SSSCRM Opportunities data file");
			for (CRMBean bean : opportunityBeans) {
				out.println(beanToFileLine(bean));
			}
			out.close();
		}
		catch (FileNotFoundException e) {
			throw new RuntimeException("Fatal Error: Output file not Found");
		}
	}

	public String beanToFileLine(CRMBean bean) {
		String result = "";
		OpportunityBean ob = (OpportunityBean) bean;
		result += ob.getId();
		result += '\t';
		result += ob.getProduct();
		result += '\t';
		result += ob.getPPU();
		result += '\t';
		result += ob.getQuantity();
		result += '\t';
		result += ob.getPrice();
		result += '\t';
		result += ob.getClose();
		result += '\t';
		result += ob.getStatus();
		result += '\t';
		result += ob.getDescriptionOpp();
		return result;
	}

}

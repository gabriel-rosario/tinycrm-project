package models;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import beans.CRMBean;
import beans.NewClientBean;

public class NewClientModel extends CRMModel{

	private static String CLIENTS_FILE = "data/clients.tsv";

	
	public NewClientModel() {
		super();
	}
	
	@Override
	public void doInit() {
		super.doInit();
		ArrayList<CRMBean> beans = parseBeansFromFile(CLIENTS_FILE);
		this.setList(beans);
		setIndex(0);	
		}

	@Override
	public void doAdd() {
		long id = 1;
		if (this.getCount() > 0) {
			id = ((NewClientBean) this.getBean(this.getCount()-1)).getId() + 1;
		}
		this.getAllBeans().add(new NewClientBean(id));
		this.setIndex(this.getCount() - 1);
	}


	@Override
	public void doSave() {
		super.doSave();
		saveBeansToFile(CLIENTS_FILE);
	}
	
	public ArrayList<CRMBean> parseBeansFromFile(String filename) {
		File inputFile = new File(filename);
		try {
			ArrayList<CRMBean> clientBeans = new ArrayList<CRMBean>();
			Scanner inputScanner = new Scanner(inputFile);
			inputScanner.nextLine();  // Ignore header line
			int count = 0;
			inputScanner.useDelimiter("[\t\n]");
			while (inputScanner.hasNextLine()) {
				String ID = inputScanner.next();
				int id = Integer.parseInt(ID);
				NewClientBean newBean = new NewClientBean(id);
				String company = inputScanner.next();
				newBean.setCompany(company);
				String clientPhone = inputScanner.next();
				newBean.setClientPhone(clientPhone);
				String clientEmail = inputScanner.next();
				newBean.setClientEmail(clientEmail);
				String website = inputScanner.next();
				newBean.setWebsite(website);
				String address = inputScanner.next();
				newBean.setAddress(address);
				String city = inputScanner.next();
				newBean.setCity(city);
				String state = inputScanner.next();
				newBean.setState(state);
				inputScanner.nextLine();  // Skip over anything left in line
				clientBeans.add(newBean);
				count++;
			}
			inputScanner.close();
			return clientBeans;
		}
		catch (FileNotFoundException e) {
			throw new RuntimeException("Fatal Error: Input file not Found");
		}
	}
	
	public void saveBeansToFile(String filename) {
		
		ArrayList<CRMBean> clientsBeans = getAllBeans();
		File outputFile = new File(filename);
		try {
			PrintWriter out = new PrintWriter(outputFile);
			// Print Header Line
			out.println("SSSCRM Clients data file");
			for (CRMBean bean : clientsBeans) {
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
		NewClientBean cb = (NewClientBean) bean;
		result += cb.getId();
		result += '\t';
		result += cb.getCompany();
		result += '\t';
		result += cb.getClientPhone();
		result += '\t';
		result += cb.getClientEmail();
		result += '\t';
		result += cb.getWebsite();
		result += '\t';
		result += cb.getAddress();
		result += '\t';
		result += cb.getCity();
		result += '\t';
		result += cb.getState();
		return result;
		
	}

}

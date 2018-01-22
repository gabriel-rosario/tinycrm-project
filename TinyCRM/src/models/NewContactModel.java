package models;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import beans.CRMBean;
import beans.ContactBean;
import beans.NewClientBean;
import beans.NewContactBean;

public class NewContactModel extends CRMModel{
	
	private static String CONTACTS_FILE = "data/contacts.tsv";
	
	public NewContactModel() {
		super();
	}

	@Override
	public void doInit() {
		super.doInit();
		ArrayList<CRMBean> beans = parseBeansFromFile(CONTACTS_FILE);
		this.setList(beans);
		this.setIndex(0);
	}

	@Override
	public void doAdd() {
		long id = 1;
		if (this.getCount() > 0) {
			id = ((NewContactBean) this.getBean(this.getCount()-1)).getId() + 1;
		}
		this.getAllBeans().add(new NewContactBean(id));
		this.setIndex(this.getCount() - 1);
	}

	@Override
	public void doSave() {
		super.doSave();
		saveBeansToFile(CONTACTS_FILE);
	}
	

	public ArrayList<CRMBean> parseBeansFromFile(String filename) {
		File inputFile = new File(filename);
		try {
			ArrayList<CRMBean> contactBeans = new ArrayList<CRMBean>();
			Scanner inputScanner = new Scanner(inputFile);
			inputScanner.nextLine();  // Ignore header line
			int count = 0;
			inputScanner.useDelimiter("[\t\n]");
			while (inputScanner.hasNextLine()) {
				String ID = inputScanner.next();
				int id = Integer.parseInt(ID);
				NewContactBean newBean = new NewContactBean(id);
				String firstName = inputScanner.next();
				newBean.setFirstName(firstName);
				String lastName = inputScanner.next();
				newBean.setLastName(lastName);
				String phone = inputScanner.next();
				newBean.setContactPhone(phone);
				String email = inputScanner.next();
				newBean.setContactEmail(email);
				String company = inputScanner.next();
				newBean.setCompany(company);
				String position = inputScanner.next();
				newBean.setPosition(position);
				String phone2 = inputScanner.next();
				newBean.setClientPhone(phone2);
				String email2 = inputScanner.next();
				newBean.setClientEmail(email2);
				String website = inputScanner.next();
				newBean.setWebsite(website);
				inputScanner.nextLine();  // Skip over anything left in line
				contactBeans.add(newBean);
				count++;
			}
			inputScanner.close();
			return contactBeans;
		}
		catch (FileNotFoundException e) {
			throw new RuntimeException("Fatal Error: Input file not Found");
		}
	}
	
	public String beanToFileLine(CRMBean bean) {

		String result = "";
		NewContactBean cb = (NewContactBean) bean;
		result += cb.getId();
		result += '\t';
		result += cb.getFirstName();
		result += '\t';
		result += cb.getLastName();
		result += '\t';
		result += cb.getContactPhone();
		result += '\t';
		result += cb.getContactEmail();
		result += '\t';
		result += cb.getCompany();
		result += '\t';
		result += cb.getPosition();
		result += '\t';
		result += cb.getClientPhone();
		result += '\t';
		result += cb.getClientEmail();
		result += '\t';
		result += cb.getWebsite();
		return result;
		
	}

	public void saveBeansToFile(String filename) {
		
		ArrayList<CRMBean> contactBeans = getAllBeans();
		File outputFile = new File(filename);
		try {
			PrintWriter out = new PrintWriter(outputFile);
			// Print Header Line
			out.println("SSSCRM Contacts data file");
			for (CRMBean bean : contactBeans) {
				out.println(beanToFileLine(bean));
			}
			out.close();
		}
		catch (FileNotFoundException e) {
			throw new RuntimeException("Fatal Error: Output file not Found");
		}
	}


}

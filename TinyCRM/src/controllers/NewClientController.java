package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import exceptions.InvalidFormFieldData;
import main.CRMMain;
import models.CRMModel;
import models.NewClientModel;
import models.OpportunityModel;
//import swingViews.ClientSwingView;
import swingViews.NewClientSwingView;
import swingViews.NewContactsSwingView;
import swingViews.NewSwingView;
//import swingViews.SwingView;
import views.NewClientCRMView;
import views.NewContactCRMView;
import views.OpportunityTCRMView;

public class NewClientController extends CRMController{

	public static final Pattern VALID_NAME = Pattern.compile("^[a-zA-Z\\s]+");
	public static final Pattern VALID_PHONE_NUMBER = Pattern.compile("[0-9]+");
	public static final Pattern VALID_EMAIL = Pattern.compile("[a-zA-Z0-9._-]+[@][a-zA-Z]+[.][a-z]{3}");
	public static final Pattern VALID_WEBSITE = Pattern.compile("[w]{3}[.][a-zA-Z0-9]+[.][a-z]{3}");
	public static final Pattern VALID_STATUS = Pattern.compile("^[a-zA-Z\\s]+");
	public static final Pattern VALID_PRODUCT = Pattern.compile("^[a-zA-Z\\s]+");
	public static final Pattern VALID_PRICE = Pattern.compile("[0-9]+[.][0-9]{2}");

	
	
	public NewClientController(NewSwingView view, CRMModel model, CRMModel oppModel) {
		super(view, model);
		
		NewClientSwingView cv = (NewClientSwingView) view;
		OpportunityModel oppModel2 = (OpportunityModel) oppModel;

		cv.setSelectOppItems(oppModel2.getAllBeans());
		cv.clearFieldErrors();
		cv.setSelectOppListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Opp Combo Box Selected");
			}
		});
	}

	public void doLeft() {
		System.out.println("ClientController.doLeft()");
		super.doLeft();
	}

	public void doRight() {
		System.out.println("ClientController.doRight()");
		super.doRight();
	}

	public void doEdit() {
		System.out.println("ClientController.doRight()");
		super.doEdit();
	}

	public void doAdd() {
		System.out.println("ClientController.doAdd()");
		super.doAdd();
	}

	public void doDelete() {
		System.out.println("ClientController.doDelete()");
		super.doDelete();
	}

	public void doSave() {
		System.out.println("ClientController.doSave()");
		super.doSave();
	}
	
	public void doSelectOpp() {
		this.refreshView();
	}
	
	public void doSelectContacts() {
		this.refreshView();
	}

	public void validateForm() throws InvalidFormFieldData {
		getValidationErrors().clear();
		validateCompany();
		validateClientPhone();
		validateClientEmail();
		validateWebsite();
		validateLastName();
		validateFirstName();
		validateState();
		validateCity();
		validateAddress();
		validateContactEmail();
		validateContactPhone();
		validateStatus();
		validatePrice();
		validateProduct();

if (getValidationErrors().size() > 0)
			throw new InvalidFormFieldData ("Invalid Form");
	}

	public void validateCompany() {
		NewClientCRMView view = (NewClientCRMView) getView();
		if (view.getCompanyTextField().trim().length() == 0) {
			addValidationError("Company", "Empty Company. Required Field.");
		}
	}

	public void validateClientPhone() {
		NewClientCRMView view = (NewClientCRMView) getView();
		
		ArrayList<Character> onlyNumbersTelephone = new ArrayList<Character>();
		
		for(int i = 0; i<view.getClientPhoneTextField().length();i++) {
			switch(view.getClientPhoneTextField().charAt(i)) {
			case '0':
				onlyNumbersTelephone.add('0');
				break;
			case '1':
				onlyNumbersTelephone.add('1');
				break;
			case '2':
				onlyNumbersTelephone.add('2');
				break;
			case '3':
				onlyNumbersTelephone.add('3');
				break;
			case '4':
				onlyNumbersTelephone.add('4');
				break;
			case '5':
				onlyNumbersTelephone.add('5');
				break;
			case '6':
				onlyNumbersTelephone.add('6');
				break;
			case '7':
				onlyNumbersTelephone.add('7');
				break;
			case '8':
				onlyNumbersTelephone.add('8');
				break;
			case '9':
				onlyNumbersTelephone.add('9');
				break;
			default:
				break;
			}
					
		}
		
		String newTelephoneNumber = "";
		
		for(int idx=0;idx<onlyNumbersTelephone.size();idx++) {
				newTelephoneNumber += onlyNumbersTelephone.get(idx);
		}
		
		System.out.println(newTelephoneNumber);
						
		Matcher numMatcher = VALID_PHONE_NUMBER.matcher(newTelephoneNumber);
		boolean valid = numMatcher.matches();
		if (newTelephoneNumber.length() == 0) {
			addValidationError("ClientPhone", "Empty Telephone. Required Field.");
		}else if(!valid) {
			addValidationError("ClientPhone", "Invalid number. It should only contain numbers.");
		}
		
		if(valid) {
			char [] formattedNumber = new char [newTelephoneNumber.length()+3];
			formattedNumber[0] = '(';
			formattedNumber[4] = ')';
			formattedNumber[8] = '-';
			for(int i = 0; i<newTelephoneNumber.length();i++) {
				if(i<3) {
					formattedNumber[i+1] = newTelephoneNumber.charAt(i);
				}else if(i>2 && i<6) {
					formattedNumber[i+2] = newTelephoneNumber.charAt(i);
				}else{
					formattedNumber[i+3] = newTelephoneNumber.charAt(i);
				}
			}
			String newNumber = new String(formattedNumber);
			view.setClientPhoneTextField(newNumber);
		}
		
	}

	public void validateClientEmail() {
		NewClientCRMView view = (NewClientCRMView) getView();
		Matcher emailMatcher = VALID_EMAIL.matcher(view.getClientEmailTextField());
		boolean valid = emailMatcher.matches();
		
		if (view.getClientEmailTextField().trim().length() == 0) {
			addValidationError("ClientEmail", "Empty Email. Required Field.");
		}
		else if(!valid) {
				addValidationError("ClientEmail", "Invalid Email. Please try again. Example: example@example.com");
		}
	}
	
	public void validateWebsite() {
		NewClientCRMView view = (NewClientCRMView) getView();
		Matcher websiteMatcher = VALID_WEBSITE.matcher(view.getWebsiteTextField());
		
		boolean valid = websiteMatcher.matches();
		
		if (view.getWebsiteTextField().trim().length() == 0) {
			addValidationError("Website", "Empty Website. Required Field.");
		}else if(!valid) {
			addValidationError("Website", "Invalid Website. Example: www.example.com");
		}
	}

	public void validateAddress() {
		NewClientCRMView view = (NewClientCRMView) getView();
		if (view.getAddressTextField().trim().length() == 0) {
			addValidationError("Address Street", "Empty Address. Required Field.");
		}
	}

	public void validateCity() {
		NewClientCRMView view = (NewClientCRMView) getView();
		Matcher cityMatcher = VALID_NAME.matcher(view.getCityTextField());
		
		boolean valid = cityMatcher.matches();
		
		
		if (view.getCityTextField().trim().length() == 0) {
			addValidationError("City", "Empty City. Required Field.");
		}else if(!valid) {
			addValidationError("City", "Invalid City. Enter only letters.");
		}
		
		if(valid) {
			String formattedCity = view.getCityTextField().substring(0, 1).toUpperCase() + view.getCityTextField().substring(1).toLowerCase();
			view.setCityTextField(formattedCity);
		}
	}
	
	public void validateState() {
		NewClientCRMView view = (NewClientCRMView) getView();
		Matcher stateMatcher = VALID_NAME.matcher(view.getStateTextField());
		
		boolean valid = stateMatcher.matches();
		
		if (view.getStateTextField().trim().length() == 0) {
			addValidationError("State", "Empty State. Required Field.");
		}else if(!valid) {
			addValidationError("State", "Invalid State. Enter only letters");
		}
		
		if(valid) {
			String formattedState = view.getStateTextField().substring(0, 1).toUpperCase() + view.getStateTextField().substring(1).toLowerCase();
			view.setStateTextField(formattedState);
		}

	}
	
	public void validateFirstName() throws InvalidFormFieldData {
		NewClientCRMView view = (NewClientCRMView) getView();
			
			Matcher nameMatcher = VALID_NAME.matcher(view.getFirstNameTextField());
			boolean valid = nameMatcher.matches();

			if (view.getFirstNameTextField().trim().length() == 0) {
				addValidationError("FirstName", "Empty First Name. Required Field.");
			}else if(!valid) {
				addValidationError("FirstName", "Invalid First Name. It should only contain letters");
			}
			
			if(valid) {
				String formattedName = view.getFirstNameTextField().substring(0, 1).toUpperCase() + view.getFirstNameTextField().substring(1).toLowerCase();
				view.setFirstNameLabelError(formattedName);
			}
		}

	public void validateLastName() throws InvalidFormFieldData {
		NewClientCRMView view = (NewClientCRMView) getView();
		Matcher nameMatcher = VALID_NAME.matcher(view.getLastNameTextField());
		boolean valid = nameMatcher.matches();
		
		if (view.getLastNameTextField().trim().length() == 0) {
			addValidationError("LastName", "Empty Last Name. Required Field.");
		}else if(!valid) {
			addValidationError("LastName", "Invalid Last Name. It should only contain letters");
		}
		
		if(valid) {
			String formattedName = view.getLastNameTextField().substring(0, 1).toUpperCase() + view.getLastNameTextField().substring(1).toLowerCase();
			view.setLastNameTextField(formattedName);
		}
	}	
	
	public void validateContactPhone() {
		NewClientCRMView view = (NewClientCRMView) getView();		
		ArrayList<Character> onlyNumbersTelephone = new ArrayList<Character>();
		
		for(int i = 0; i<view.getContactsPhoneTextField().length();i++) {
			switch(view.getContactsPhoneTextField().charAt(i)) {
			case '0':
				onlyNumbersTelephone.add('0');
				break;
			case '1':
				onlyNumbersTelephone.add('1');
				break;
			case '2':
				onlyNumbersTelephone.add('2');
				break;
			case '3':
				onlyNumbersTelephone.add('3');
				break;
			case '4':
				onlyNumbersTelephone.add('4');
				break;
			case '5':
				onlyNumbersTelephone.add('5');
				break;
			case '6':
				onlyNumbersTelephone.add('6');
				break;
			case '7':
				onlyNumbersTelephone.add('7');
				break;
			case '8':
				onlyNumbersTelephone.add('8');
				break;
			case '9':
				onlyNumbersTelephone.add('9');
				break;
			default:
				break;
			}
					
		}
		
		String newTelephoneNumber = "";
		
		for(int idx=0;idx<onlyNumbersTelephone.size();idx++) {
				newTelephoneNumber += onlyNumbersTelephone.get(idx);
		}
		
		System.out.println(newTelephoneNumber);
						
		Matcher numMatcher = VALID_PHONE_NUMBER.matcher(newTelephoneNumber);
		boolean valid = numMatcher.matches();
		if (newTelephoneNumber.length() == 0) {
			addValidationError("ContactPhone", "Empty Telephone. Required Field.");
		}else if(!valid) {
			addValidationError("ContactPhone", "Invalid number. It should only contain numbers.");
		}
		
		if(valid) {
			char [] formattedNumber = new char [newTelephoneNumber.length()+3];
			formattedNumber[0] = '(';
			formattedNumber[4] = ')';
			formattedNumber[8] = '-';
			for(int i = 0; i<newTelephoneNumber.length();i++) {
				if(i<3) {
					formattedNumber[i+1] = newTelephoneNumber.charAt(i);
				}else if(i>2 && i<6) {
					formattedNumber[i+2] = newTelephoneNumber.charAt(i);
				}else{
					formattedNumber[i+3] = newTelephoneNumber.charAt(i);
				}
			}
			String newNumber = new String(formattedNumber);
			view.setContactsPhoneTextField(newNumber);
		}
		
	}

	public void validateContactEmail() {
		NewClientCRMView view = (NewClientCRMView) getView();
		Matcher emailMatcher = VALID_EMAIL.matcher(view.getContactsEmailTextField());
		boolean valid = emailMatcher.matches();
		
		if (view.getContactsEmailTextField().trim().length() == 0) {
			addValidationError("ContactEmail", "Empty Email. Required Field.");
		}
		else if(!valid) {
				addValidationError("ContactEmail", "Invalid Email. Please try again. Example: example@example.com");
		}
	}
	
	public void validateStatus() throws InvalidFormFieldData {
		NewClientCRMView view = (NewClientCRMView) getView();
		Matcher statusMatcher = VALID_STATUS.matcher(view.getStatusTextField());
		boolean valid = statusMatcher.matches();
		
		if (view.getStatusTextField().trim().length() == 0) {
			addValidationError("Status", "Empty Status. Required Field.");
		}else if(!valid) {
			addValidationError("Status", "Invalid Status. Enter only letters");
		}
	}
	
	public void validatePrice() throws InvalidFormFieldData {
		NewClientCRMView view = (NewClientCRMView) getView();
		Matcher priceMatcher = VALID_PRICE.matcher(view.getPriceTextField());
		boolean valid = priceMatcher.matches();
		if (view.getPriceTextField().trim().length() == 0) {
			addValidationError("Price", "Empty Price. Required Field.");
		}else if(!valid) {
			addValidationError("Price", "Invalid Price. Enter only numbers and \".\".  Example price 4.99");
		}
	}
	public void validateProduct() throws InvalidFormFieldData {
		NewClientCRMView view = (NewClientCRMView) getView();
		Matcher productMatcher = VALID_PRODUCT.matcher(view.getProductTextField());
		boolean valid = productMatcher.matches();

		if (view.getProductTextField().trim().length() == 0) {
			addValidationError("Product", "Empty Product. Required Field.");
		}else if(!valid) {
			addValidationError("Product", "Invalid Product. Enter Letters only");
		}
	}

	protected void refreshView() {
		super.refreshView();
		String errorString = "";
		NewClientSwingView cv = (NewClientSwingView) getView();
		cv.clearFieldErrors();
		Map<String, String> validationErrors = getValidationErrors();
		if (validationErrors.size() > 0) {
			errorString = "Fields in red are invalid";
			if (validationErrors.containsKey("Company")) { cv.setCompanyLabelError(validationErrors.get("Company")); }
			if (validationErrors.containsKey("ClientPhone")) { cv.setClientPhoneLabelError(validationErrors.get("ClientPhone")); }
			if (validationErrors.containsKey("ClientEmail")) { cv.setClientEmailLabelError(validationErrors.get("ClientEmail")); }
			if (validationErrors.containsKey("Website")) { cv.setWebsiteLabelError(validationErrors.get("Website")); }
			if (validationErrors.containsKey("Address Street")) { cv.setAddressLabelError(validationErrors.get("Address Street")); }
			if (validationErrors.containsKey("City")) { cv.setCityLabelError(validationErrors.get("City")); }
			if (validationErrors.containsKey("State")) { cv.setStateLabelError(validationErrors.get("State")); }
			if (validationErrors.containsKey("FirstName")) { cv.setFirstNameLabelError(validationErrors.get("FirstName")); }
			if (validationErrors.containsKey("LastName")) { cv.setLastNameLabelError(validationErrors.get("LastName")); }
			if (validationErrors.containsKey("ContactPhone")) { cv.setContactPhoneLabelError(validationErrors.get("ContactPhone")); }
			if (validationErrors.containsKey("ContactEmail")) { cv.setContactEmailLabelError(validationErrors.get("ContactEmail")); }
			if (validationErrors.containsKey("Product")) { cv.setProductLabelError(validationErrors.get("Product")); }
			if (validationErrors.containsKey("Status")) { cv.setStatusLabelError(validationErrors.get("Status")); }
			if (validationErrors.containsKey("Price")) { cv.setPriceLabelError(validationErrors.get("Price")); }
		}
		cv.setMessagesText(errorString);
	}

	public void refreshDropdowns() {
		NewClientCRMView cv = (NewClientCRMView) getView();
		cv.setSelectOppItems(CRMMain.opportunityModel.getAllBeans());
		cv.setSelectContactItems(CRMMain.contactModel.getAllBeans());
	}
}

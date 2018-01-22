package controllers;

import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import exceptions.InvalidFormFieldData;
import main.CRMMain;
import models.CRMModel;
import swingViews.ContactSwingView;
import swingViews.NewContactsSwingView;
import swingViews.NewSwingView;
import views.ContactTCRMView;
import views.NewContactCRMView;

public class NewContactController extends CRMController {
	
	public static final Pattern VALID_NAME = Pattern.compile("^[a-zA-Z\\s]+");
	public static final Pattern VALID_PHONE_NUMBER = Pattern.compile("[0-9]+");
	public static final Pattern VALID_EMAIL = Pattern.compile("[a-zA-Z0-9.]+[@][a-zA-Z]+[.][a-z]{3}");
	public static final Pattern VALID_WEBSITE = Pattern.compile("[w]{3}[.][a-zA-Z0-9]+[.][a-z]{3}");
	
	public NewContactController(NewSwingView view, CRMModel model) {
		super(view, model);
		
	}

	public void doInit() {
		super.doInit();
		refreshDropdowns();
	}
	
	public void doLeft() {
		System.out.println("ContactController.doLeft()");
		super.doLeft();
	}

	public void doRight() {
		System.out.println("ContactController.doRight()");
		super.doRight();
	}

	public void doEdit() {
		System.out.println("ContactController.doEdit()");
		super.doEdit();
	}

	public void doAdd() {
		System.out.println("ContactController.doAdd()");
		super.doAdd();
	}

	public void doDelete() {
		System.out.println("ContactController.doDelete()");
		super.doDelete();
	}

	public void doSave() {
		System.out.println("ContactController.doSave()");
		super.doSave();
	}

//	public void doSelectClient() {
//		this.refreshView();
//	}

	public void validateForm() throws InvalidFormFieldData {
		getValidationErrors().clear();
		validateFirstName();
		validateLastName();
		validateCompany();
		validateContactPhone();
		validateContactEmail();
		validatePosition();
		if (getValidationErrors().size() > 0)
			throw new InvalidFormFieldData ("Invalid Form");
	}

	public void validateFirstName() throws InvalidFormFieldData {
		NewContactCRMView view = (NewContactCRMView) getView();
			
			Matcher nameMatcher = VALID_NAME.matcher(view.getFirstNameText());
			boolean valid = nameMatcher.matches();

			if (view.getFirstNameText().trim().length() == 0) {
				addValidationError("FirstName", "Empty First Name. Required Field.");
			}else if(!valid) {
				addValidationError("FirstName", "Invalid First Name. It should only contain letters");
			}
			
			if(valid) {
				String formattedName = view.getFirstNameText().substring(0, 1).toUpperCase() + view.getFirstNameText().substring(1).toLowerCase();
				view.setFirstNameText(formattedName);
			}
		}

	public void validateLastName() throws InvalidFormFieldData {
		NewContactCRMView view = (NewContactCRMView) getView();
		Matcher nameMatcher = VALID_NAME.matcher(view.getLastNameText());
		boolean valid = nameMatcher.matches();
		
		if (view.getLastNameText().trim().length() == 0) {
			addValidationError("LastName", "Empty Last Name. Required Field.");
		}else if(!valid) {
			addValidationError("LastName", "Invalid Last Name. It should only contain letters");
		}
		
		if(valid) {
			String formattedName = view.getLastNameText().substring(0, 1).toUpperCase() + view.getLastNameText().substring(1).toLowerCase();
			view.setLastNameText(formattedName);
		}
	}	
	
	
	public void validateCompany() throws InvalidFormFieldData {
		NewContactCRMView view = (NewContactCRMView) getView();
		if (view.getCompanyText().trim().length() == 0) {
			addValidationError("Company", "Empty Company. Required Field.");
		}
	}	
	public void validateContactPhone() throws InvalidFormFieldData {
		NewContactCRMView view = (NewContactCRMView) getView();
		ArrayList<Character> onlyNumbersTelephone = new ArrayList<Character>();
		
		for(int i = 0; i<view.getContactPhoneText().length();i++) {
			switch(view.getContactPhoneText().charAt(i)) {
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
			addValidationError("Telephone", "Empty Telephone. Required Field.");
		}else if(!valid) {
			addValidationError("Telephone", "Invalid number. It should only contain numbers.");
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
			view.setContactPhoneText(newNumber);
		}
		
	}

	public void validateContactEmail() throws InvalidFormFieldData {
		NewContactCRMView view = (NewContactCRMView) getView();
		Matcher emailMatcher = VALID_EMAIL.matcher(view.getContactEmailText());
		boolean valid = emailMatcher.matches();
		
		if (view.getContactEmailText().trim().length() == 0) {
			addValidationError("Email", "Empty Email. Required Field.");
		}else if(!valid) {
			addValidationError("Email", "Invalid Email Address.");
		}
	}
	
	public void validatePosition() throws InvalidFormFieldData {
		NewContactCRMView view = (NewContactCRMView) getView();
		Matcher positionMatcher = VALID_NAME.matcher(view.getPositionText());
		boolean valid = positionMatcher.matches();
		
		if (view.getPositionText().trim().length() == 0) {
			addValidationError("Position", "Empty Position. Required Field.");
		}else if(!valid) {
			addValidationError("Position", "Invalid Position. Enter only letters");
		}
	}

	public void refreshDropdowns() {
//		ContactTCRMView cv = (ContactTCRMView) getView();
//		cv.setSelectClientItems(CRMMain.clientModel.getAllBeans());
	}

	protected void refreshView() {
		super.refreshView();
		String errorString;
		NewContactsSwingView cv = (NewContactsSwingView) getView();
		cv.clearFieldErrors();
		Map<String, String> validationErrors = getValidationErrors();
		if (validationErrors.size() > 0) {
			errorString = "Fields in red are invalid";
			if (validationErrors.containsKey("FirstName")) { cv.setFisrtNameLblError(validationErrors.get("FirstName")); }
			if (validationErrors.containsKey("LastName")) { cv.setLastNameLblError(validationErrors.get("LastName")); }
			if (validationErrors.containsKey("Company")) { cv.setCompanyLblError(validationErrors.get("Company")); }
			if (validationErrors.containsKey("Telephone")) { cv.setContactPhoneLblError(validationErrors.get("Phone")); }
			if (validationErrors.containsKey("Email")) { cv.setContactEmailLblError(validationErrors.get("Email")); }
			if (validationErrors.containsKey("Position")) { cv.setPositionLblError(validationErrors.get("Position")); }
			cv.setMessagesText(errorString);
		}
	}
}

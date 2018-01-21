package controllers;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import exceptions.InvalidFormFieldData;
import models.CRMModel;
import swingViews.SwingView;
import views.ContactTCRMView;

public class NewContactController extends ContactController{

	public NewContactController(SwingView contactView, CRMModel contactModel, CRMModel clientModel) {
		super(contactView, contactModel, clientModel);
		// TODO Auto-generated constructor stub
	}
	
	public static final Pattern VALID_NAME = Pattern.compile("^[a-zA-Z\\s]+");
	public static final Pattern VALID_PHONE_NUMBER = Pattern.compile("[0-9]+");
	public static final Pattern VALID_EMAIL = Pattern.compile("[a-zA-Z0-9.]+[@][a-zA-Z]+[.][a-z]{3}");
	public static final Pattern VALID_WEBSITE = Pattern.compile("[w]{3}[.][a-zA-Z0-9]+[.][a-z]{3}");


	@Override
	public void validateForm() throws InvalidFormFieldData {
		getValidationErrors().clear();
		validateFirstName();
		validateLastName();
		validateCompany();
		validateTelephone();
		validateEmail();
		validateFacebook();
		if (getValidationErrors().size() > 0)
			throw new InvalidFormFieldData ("Invalid Form");
	}

	@Override
	public void validateFirstName() throws InvalidFormFieldData {
		ContactTCRMView view = (ContactTCRMView) getView();
		//view.getTextFirstName().toLowerCase();
		
		Matcher nameMatcher = VALID_NAME.matcher(view.getTextFirstName());
		boolean valid = nameMatcher.matches();

		if (view.getTextFirstName().trim().length() == 0) {
			addValidationError("FirstName", "Empty First Name. Required Field.");
		}else if(!valid) {
			addValidationError("FirstName", "Invalid First Name. It should only contain letters");
		}
		
		if(valid) {
			String formattedName = view.getTextFirstName().substring(0, 1).toUpperCase() + view.getTextFirstName().substring(1).toLowerCase();
			view.setTextFirstName(formattedName);
		}
	}
	
	@Override
	public void validateLastName() throws InvalidFormFieldData {
		ContactTCRMView view = (ContactTCRMView) getView();
		//view.getTextLastName().toLowerCase();
		
		Matcher nameMatcher = VALID_NAME.matcher(view.getTextLastName());
		boolean valid = nameMatcher.matches();
		
		if (view.getTextLastName().trim().length() == 0) {
			addValidationError("LastName", "Empty Last Name. Required Field.");
		}else if(!valid) {
			addValidationError("LastName", "Invalid Last Name. It should only contain letters");
		}
		
		if(valid) {
			String formattedName = view.getTextLastName().substring(0, 1).toUpperCase() + view.getTextLastName().substring(1).toLowerCase();
			view.setTextLastName(formattedName);
		}
	}	
	
	@Override
	public void validateCompany() throws InvalidFormFieldData {
		ContactTCRMView view = (ContactTCRMView) getView();
		if (view.getTextCompany().trim().length() == 0) {
			addValidationError("Company", "Empty Company. Required Field.");
		}
	}	

	
	@Override
	public void validateTelephone() throws InvalidFormFieldData {
		ContactTCRMView view = (ContactTCRMView) getView();
		
		ArrayList<Character> onlyNumbersTelephone = new ArrayList<Character>();
		
		for(int i = 0; i<view.getTextTelephone().length();i++) {
			switch(view.getTextTelephone().charAt(i)) {
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
			view.setTextTelephone(newNumber);
		}
		
	}
	
	@Override
	public void validateEmail() throws InvalidFormFieldData {
		ContactTCRMView view = (ContactTCRMView) getView();
		Matcher emailMatcher = VALID_EMAIL.matcher(view.getTextEmail());
		boolean valid = emailMatcher.matches();
		
		if (view.getTextEmail().trim().length() == 0) {
			addValidationError("Email", "Empty Email. Required Field.");
		}else if(!valid) {
			addValidationError("Email", "Invalid Email Address.");
		}
	}
	
	@Override
	public void validateFacebook() throws InvalidFormFieldData {
		ContactTCRMView view = (ContactTCRMView) getView();		
		
		if (view.getTextFacebook().trim().length() == 0) {
			addValidationError("Facebook", "Empty Facebook. Required Field.");
		}
	}
}

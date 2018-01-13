package controllers;

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
		Matcher nameMatcher = VALID_NAME.matcher(view.getTextFirstName());
		boolean valid = nameMatcher.matches();

		if (view.getTextFirstName().trim().length() == 0) {
			addValidationError("FirstName", "Empty First Name. Required Field.");
		}else if(!valid) {
			addValidationError("FirstName", "Invalid First Name. It should only contain letters");
		}
	}
	
	@Override
	public void validateLastName() throws InvalidFormFieldData {
		ContactTCRMView view = (ContactTCRMView) getView();
		Matcher nameMatcher = VALID_NAME.matcher(view.getTextLastName());
		boolean valid = nameMatcher.matches();
		
		if (view.getTextLastName().trim().length() == 0) {
			addValidationError("LastName", "Empty Last Name. Required Field.");
		}else if(!valid) {
			addValidationError("LastName", "Invalid Last Name. It should only contain letters");
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
		Matcher numMatcher = VALID_PHONE_NUMBER.matcher(view.getTextTelephone());
		boolean valid = numMatcher.matches();
		if (view.getTextTelephone().trim().length() == 0) {
			addValidationError("Telephone", "Empty Telephone. Required Field.");
		}else if(!valid) {
			addValidationError("Telephone", "Invalid number. It should only contain numbers.");
		}
		
		if(valid) {
			char [] formattedNumber = new char [13];
			formattedNumber[0] = '(';
			formattedNumber[4] = ')';
			formattedNumber[8] = '-';
			for(int i = 0; i<view.getTextTelephone().length();i++) {
				if(i<3) {
					formattedNumber[i+1] = view.getTextTelephone().charAt(i);
				}else if(i>2 && i<6) {
					formattedNumber[i+2] = view.getTextTelephone().charAt(i);
				}else{
					formattedNumber[i+3] = view.getTextTelephone().charAt(i);
				}
			}
			String newNumber = new String(formattedNumber);
			view.setTextTelephone(newNumber);
		}
		
	}
	
	@Override
	public void validateEmail() throws InvalidFormFieldData {
		ContactTCRMView view = (ContactTCRMView) getView();
		if (view.getTextEmail().trim().length() == 0) {
			addValidationError("Email", "Empty Email. Required Field.");
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

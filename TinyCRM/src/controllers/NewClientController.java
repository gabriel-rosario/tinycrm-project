package controllers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import exceptions.InvalidFormFieldData;
import models.CRMModel;
import swingViews.SwingView;
import views.ClientTCRMView;

public class NewClientController extends ClientController{
	
	public static final Pattern VALID_PHONE_NUMBER = Pattern.compile("[0-9]+");
	public static final Pattern VALID_EMAIL = Pattern.compile("\"\\\\b[\\\\w.%-]+@[-.\\\\w]+\\\\.[A-Za-z]{2,4}\\\\b\"",Pattern.CASE_INSENSITIVE);

	public NewClientController(SwingView view, CRMModel model) {
		super(view, model);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void validateForm() throws InvalidFormFieldData {
		getValidationErrors().clear();
		validateCompany();
		validateTelephone();
		validateEmail();
		validateWebsite();
		validateFacebook();
		if (getValidationErrors().size() > 0)
			throw new InvalidFormFieldData ("Invalid Form");
	}
	
	@Override
	public void validateCompany() {
		ClientTCRMView view = (ClientTCRMView) getView();
		if (view.getTextCompany().trim().length() == 0) {
			addValidationError("Company", "Empty Company. Required Field.");
		}
	}
	
	@Override
	public void validateTelephone() {
		ClientTCRMView view = (ClientTCRMView) getView();
		Matcher numMatcher = VALID_PHONE_NUMBER.matcher(view.getTextTelephone());
		boolean valid = numMatcher.matches();
		
		if (view.getTextTelephone().trim().length() == 0) {
			addValidationError("Telephone", "Empty Telephone. Required Field.");
		}else if(!valid){
			addValidationError("Telephone", "Number Entered is not valid. Enter only digits");
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
	public void validateEmail() {
		ClientTCRMView view = (ClientTCRMView) getView();
		Matcher emailMatcher = VALID_EMAIL.matcher(view.getTextEmail());
		boolean valid = emailMatcher.matches();
		
		if (view.getTextEmail().trim().length() == 0) {
			addValidationError("Email", "Empty Email. Required Field.");
		}
//			else if(!valid) {
//			addValidationError("Email", "Invalid Email. Please enter another.");
//		}
	}
	
	@Override
	public void validateWebsite() {
		ClientTCRMView view = (ClientTCRMView) getView();
		if (view.getTextWebsite().trim().length() == 0) {
			addValidationError("Website", "Empty Website. Required Field.");
		}
	}
	
	@Override
	public void validateFacebook() {
		ClientTCRMView view = (ClientTCRMView) getView();
		if (view.getTextFacebook().trim().length() == 0) {
			addValidationError("Facebook", "Empty Facebook. Required Field.");
		}
	}

}

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
//import models.ClientModel;
//import swingViews.ContactSwingView;
import swingViews.OppSwingView;
import swingViews.NewContactsSwingView;
import swingViews.NewSwingView;
import views.NewClientCRMView;
//import views.ContactTCRMView;
import views.OpportunityTCRMView;

public class OpportunityController extends CRMController{
	
	public static final Pattern VALID_STATUS = Pattern.compile("^[a-zA-Z\\s]+");
	public static final Pattern 	VALID_NAME = Pattern.compile("^[a-zA-Z\\s]+");
	public static final Pattern VALID_PRICE = Pattern.compile("[0-9]+[.][0-9]{2}");
	public static final Pattern VALID_PHONE_NUMBER = Pattern.compile("[0-9]+");
	public static final Pattern VALID_PRODUCT = Pattern.compile("^[a-zA-Z\\s]+");
	public static final Pattern VALID_QUANTITY = Pattern.compile("[0-9]+");
	public static final Pattern VALID_DATE = Pattern.compile("([12]\\d{3}\\/(0[1-9]|1[0-2])\\/(0[1-9]|[12]\\d|3[01]))");
	public static final Pattern VALID_EMAIL = Pattern.compile("[a-zA-Z0-9._-]+[@][a-zA-Z]+[.][a-z]{3}");


	
	public OpportunityController(NewSwingView oppView, CRMModel oppModel, CRMModel clientModel) {
		super(oppView, oppModel);
		
		OppSwingView ov = (OppSwingView) oppView;
		NewClientModel clientModel2 = (NewClientModel) clientModel;

		ov.setSelectClientItems(clientModel2.getAllBeans());
		ov.clearFieldErrors();
		ov.setSelectClientListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Client Combo Box Selected");
			}
		});
	}
	
	public void doInit() {
		super.doInit();
		refreshDropdowns();
	}
	
	public void doLeft() {
		System.out.println("OpportunitiesController.doLeft()");
		super.doLeft();
	}

	public void doRight() {
		System.out.println("OpportunitiesController.doRight()");
		super.doRight();
	}

	public void doEdit() {
		System.out.println("OpportunitiesController.doRight()");
		super.doEdit();
	}

	public void doAdd() {
		System.out.println("OpportunitiesController.doAdd()");
		super.doAdd();
	}

	public void doDelete() {
		System.out.println("OpportunitiesController.doDelete()");
		super.doDelete();
	}

	public void doSave() {
		System.out.println("OpportunitiesController.doSave()");
		super.doSave();
	}
	
	public void doSelectOpp() {
		this.refreshView();
	}

	public void validateForm() throws InvalidFormFieldData {
		getValidationErrors().clear();
		validateStatus();
		validatePrice();
		validateClose();
		validateDescription();
		validateProduct();
		validateQuantity();
		validatePPU();
		validateClientPhone();
		validateAddress();
		validateEmail();
		validateCity();
		validateState();
		if (getValidationErrors().size() > 0)
			throw new InvalidFormFieldData ("Invalid Form");
	}

	public void validateStatus() throws InvalidFormFieldData {
		OpportunityTCRMView view = (OpportunityTCRMView) getView();
		Matcher statusMatcher = VALID_STATUS.matcher(view.getTextStatus());
		boolean valid = statusMatcher.matches();
		
		if (view.getTextStatus().trim().length() == 0) {
			addValidationError("Status", "Empty Status. Required Field.");
		}else if(!valid) {
			addValidationError("Status", "Invalid Status. Enter only letters");
		}
	}
	
	public void validatePrice() throws InvalidFormFieldData {
		OpportunityTCRMView view = (OpportunityTCRMView) getView();
		Matcher priceMatcher = VALID_PRICE.matcher(view.getTextPrice());
		boolean valid = priceMatcher.matches();
		if (view.getTextPrice().trim().length() == 0) {
			addValidationError("Price", "Empty Price. Required Field.");
		}else if(!valid) {
			addValidationError("Price", "Invalid Price. Enter only numbers and \".\".  Example price 4.99");
		}
	}
	
	public void validateClose() throws InvalidFormFieldData {
		OpportunityTCRMView view = (OpportunityTCRMView) getView();
		Matcher dateMatcher = VALID_DATE.matcher(view.getTextCloseDate());
		boolean valid = dateMatcher.matches();
		
		if (view.getTextCloseDate().trim().length() == 0) {
			addValidationError("Close", "Empty Close. Required Field.");
		}else if(!valid) {
			addValidationError("Close", "Invalid Date. Enter date in following format: YYYY/MM/DD");
		}
	}
	
	public void validateDescription() throws InvalidFormFieldData {
		OpportunityTCRMView view = (OpportunityTCRMView) getView();
		if (view.getTextDescription().trim().length() == 0) {
			addValidationError("Description", "Empty Description. Required Field.");
		}
	}
	
	public void validateProduct() throws InvalidFormFieldData {
		OpportunityTCRMView view = (OpportunityTCRMView) getView();
		Matcher productMatcher = VALID_PRODUCT.matcher(view.getTextProduct());
		boolean valid = productMatcher.matches();

		if (view.getTextProduct().trim().length() == 0) {
			addValidationError("Product", "Empty Product. Required Field.");
		}else if(!valid) {
			addValidationError("Product", "Invalid Product. Enter Letters only");
		}
	}
	
	public void validateQuantity() throws InvalidFormFieldData {
		OpportunityTCRMView view = (OpportunityTCRMView) getView();
		Matcher quantityMatcher = VALID_QUANTITY.matcher(view.getTextQuantity());
		boolean valid = quantityMatcher.matches();

		if (view.getTextQuantity().trim().length() == 0) {
			addValidationError("Quantity", "Empty Quantity. Required Field.");
		}else if (!valid) {
			addValidationError("Quantity", "Invalid Quantity. Enter only Numbers");
		}
	}
	
	public void validatePPU() throws InvalidFormFieldData {
		//4.55
		OpportunityTCRMView view = (OpportunityTCRMView) getView();
		
		Matcher ppuMatcher = VALID_PRICE.matcher(view.getTextPrice());
		boolean valid = ppuMatcher.matches();
		if (view.getTextPrice().trim().length() == 0) {
			addValidationError("Price Per Unit", "Empty Price. Required Field.");
		}else if(!valid) {
			addValidationError("Price Per Unit", "Invalid Price Per Unit. Enter only numbers and \".\".  Example price 4.99");
		}
	}
	
	public void validateClientPhone() throws InvalidFormFieldData {
		OpportunityTCRMView view = (OpportunityTCRMView) getView();
		
		ArrayList<Character> onlyNumbersTelephone = new ArrayList<Character>();
		
		for(int i = 0; i<view.getTextPhone().length();i++) {
			switch(view.getTextPhone().charAt(i)) {
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
			view.setTextPhone(newNumber);
		}
	}
	
	public void validateAddress() throws InvalidFormFieldData{
		OpportunityTCRMView view = (OpportunityTCRMView) getView();
		if (view.getTextAddress().trim().length() == 0) {
			addValidationError("ClientAddress", "Empty Address. Required Field.");
		}
	}
	
	public void validateEmail() throws InvalidFormFieldData{
		OpportunityTCRMView view = (OpportunityTCRMView) getView();
		Matcher emailMatcher = VALID_EMAIL.matcher(view.getTextEmail());
		boolean valid = emailMatcher.matches();
		
		if (view.getTextEmail().trim().length() == 0) {
			addValidationError("ClientEmail", "Empty Email. Required Field.");
		}
		else if(!valid) {
				addValidationError("ClientEmail", "Invalid Email. Please try again. Example: example@example.com");
		}
	}
	
	public void validateCity() throws InvalidFormFieldData{
		OpportunityTCRMView view = (OpportunityTCRMView) getView();
		Matcher cityMatcher = VALID_NAME.matcher(view.getTextCity());
		
		boolean valid = cityMatcher.matches();
		
		
		if (view.getTextCity().trim().length() == 0) {
			addValidationError("ClientCity", "Empty City. Required Field.");
		}else if(!valid) {
			addValidationError("ClientCity", "Invalid City. Enter only letters.");
		}
		
		if(valid) {
			String formattedCity = view.getTextCity().substring(0, 1).toUpperCase() + view.getTextCity().substring(1).toLowerCase();
			view.setTextCity(formattedCity);
		}
	}
	
	public void validateState() throws InvalidFormFieldData{
		OpportunityTCRMView view = (OpportunityTCRMView) getView();
		Matcher stateMatcher = VALID_NAME.matcher(view.getTextState());
		
		boolean valid = stateMatcher.matches();
		
		if (view.getTextState().trim().length() == 0) {
			addValidationError("ClientState", "Empty State. Required Field.");
		}else if(!valid) {
			addValidationError("ClientState", "Invalid State. Enter only letters");
		}
		
		if(valid) {
			String formattedState = view.getTextState().substring(0, 1).toUpperCase() + view.getTextState().substring(1).toLowerCase();
			view.setTextState(formattedState);
		}

	}
	
	public void refreshDropdowns() {
		OpportunityTCRMView ov = (OpportunityTCRMView) getView();
		ov.setSelectClientItems(CRMMain.clientModel.getAllBeans());
	}
	
	
	protected void refreshView() {
		super.refreshView();
		String errorString;
		OppSwingView ov = (OppSwingView) getView();
		ov.clearFieldErrors();
		Map<String, String> validationErrors = getValidationErrors();
		if (validationErrors.size() > 0) {
			errorString = "Fields in red are invalid";
			if (validationErrors.containsKey("Status")) { ov.setErrorStatus(validationErrors.get("Status")); }
			if (validationErrors.containsKey("Price")) { ov.setErrorPrice(validationErrors.get("Price")); }
			if (validationErrors.containsKey("Close")) { ov.setErrorCloseDate(validationErrors.get("Close")); }
			if (validationErrors.containsKey("Description")) { ov.setErrorDescription(validationErrors.get("Description")); }
			if (validationErrors.containsKey("Product")) { ov.setErrorProduct(validationErrors.get("Product")); }
			if (validationErrors.containsKey("Quantity")) { ov.setErrorQuantity(validationErrors.get("Quantity")); }
			if (validationErrors.containsKey("Price Per Unit")) { ov.setErrorPPU(validationErrors.get("Price Per Unit")); }
			if (validationErrors.containsKey("ClientPhone")) { ov.setErrorClientPhone(validationErrors.get("ClientPhone")); }
			if (validationErrors.containsKey("ClientEmail")) { ov.setErrorClientEmail(validationErrors.get("ClientEmail")); }
			if (validationErrors.containsKey("ClientAddress")) { ov.setErrorClientAddress(validationErrors.get("ClientAddress")); }
			if (validationErrors.containsKey("ClientCity")) { ov.setErrorClientCity(validationErrors.get("ClientCity")); }
			if (validationErrors.containsKey("ClientState")) { ov.setErrorClientState(validationErrors.get("ClientState")); }

			ov.setMessagesText(errorString);
		}
	}

}

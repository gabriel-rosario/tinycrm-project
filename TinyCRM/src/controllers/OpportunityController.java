package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
//import views.ContactTCRMView;
import views.OpportunityTCRMView;

public class OpportunityController extends CRMController{
	
	public static final Pattern VALID_STATUS = Pattern.compile("^[a-zA-Z\\s]+");
	public static final Pattern VALID_PRICE = Pattern.compile("[0-9]+[.][0-9]{2}");
	public static final Pattern VALID_PRODUCT = Pattern.compile("^[a-zA-Z\\s]+");
	public static final Pattern VALID_QUANTITY = Pattern.compile("[0-9]+");
	public static final Pattern VALID_DATE = Pattern.compile("^[a-zA-Z\\s]+");

	
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
	
	public void doSelectClient() {
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
		//yyyy/mm/dd
		OpportunityTCRMView view = (OpportunityTCRMView) getView();
		if (view.getTextCloseDate().trim().length() == 0) {
			addValidationError("Close", "Empty Close. Required Field.");
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
			if (validationErrors.containsKey("Close Date")) { ov.setErrorCloseDate(validationErrors.get("Close Date")); }
			if (validationErrors.containsKey("Description")) { ov.setErrorDescription(validationErrors.get("Description")); }
			if (validationErrors.containsKey("Product")) { ov.setErrorDescription(validationErrors.get("Product")); }
			if (validationErrors.containsKey("Quantity")) { ov.setErrorDescription(validationErrors.get("Quantity")); }
			if (validationErrors.containsKey("Price Per Unit")) { ov.setErrorDescription(validationErrors.get("Price Per Unit")); }
			ov.setMessagesText(errorString);
		}
	}

}

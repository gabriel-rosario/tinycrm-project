package controllers;

import java.util.Map;

import exceptions.InvalidFormFieldData;
import models.CRMModel;
//import swingViews.ClientSwingView;
import swingViews.NewClientSwingView;
import swingViews.NewSwingView;
//import swingViews.SwingView;
import views.NewClientCRMView;

public class NewClientController extends CRMController{

	public NewClientController(NewSwingView view, CRMModel model) {
		super(view, model);
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

	public void validateForm() throws InvalidFormFieldData {
		getValidationErrors().clear();
		validateCompany();
		validateClientPhone();
		validateClientEmail();
		validateWebsite();
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
		if (view.getClientPhoneTextField().trim().length() == 0) {
			addValidationError("Client Phone", "Empty Phone. Required Field.");
		}
	}
	public void validateClientEmail() {
		NewClientCRMView view = (NewClientCRMView) getView();
		if (view.getClientEmailTextField().trim().length() == 0) {
			addValidationError("Client Email", "Empty Email. Required Field.");
		}
	}
	public void validateWebsite() {
		NewClientCRMView view = (NewClientCRMView) getView();
		if (view.getWebsiteTextField().trim().length() == 0) {
			addValidationError("Website", "Empty Website. Required Field.");
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
		if (view.getCityTextField().trim().length() == 0) {
			addValidationError("City", "Empty City. Required Field.");
		}
	}
	
	public void validateState() {
		NewClientCRMView view = (NewClientCRMView) getView();
		if (view.getStateTextField().trim().length() == 0) {
			addValidationError("State", "Empty State. Required Field.");
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
			if (validationErrors.containsKey("Client Phone")) { cv.setClientPhoneLabelError(validationErrors.get("Client Phone")); }
			if (validationErrors.containsKey("Client Email")) { cv.setClientEmailLabelError(validationErrors.get("Email")); }
			if (validationErrors.containsKey("Website")) { cv.setWebsiteLabelError(validationErrors.get("Website")); }
			if (validationErrors.containsKey("Address Street")) { cv.setAddressLabelError(validationErrors.get("Address Street")); }
			if (validationErrors.containsKey("City")) { cv.setCityLabelError(validationErrors.get("City")); }
			if (validationErrors.containsKey("State")) { cv.setAddressLabelError(validationErrors.get("State")); }
		}
		cv.setMessagesText(errorString);
	}

	public void refreshDropdowns() {}

}

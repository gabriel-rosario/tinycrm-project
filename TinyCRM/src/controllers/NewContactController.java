package controllers;

import java.util.Map;

import exceptions.InvalidFormFieldData;
import main.CRMMain;
import models.CRMModel;
import swingViews.ContactSwingView;
import swingViews.NewContactsSwingView;
import swingViews.NewSwingView;
import views.ContactTCRMView;
import views.NewContactCRMView;

public class NewContactController extends CRMController {
	
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
		refreshDropdowns();
		super.doEdit();
	}

	public void doAdd() {
		System.out.println("ContactController.doAdd()");
		refreshDropdowns();
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
		if (view.getFirstNameText().trim().length() == 0) {
			addValidationError("FirstName", "Empty First Name. Required Field.");
		}
	}
	public void validateLastName() throws InvalidFormFieldData {
		NewContactCRMView view = (NewContactCRMView) getView();
		if (view.getLastNameText().trim().length() == 0) {
			addValidationError("LastName", "Empty Last Name. Required Field.");
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
		if (view.getContactPhoneText().trim().length() == 0) {
			addValidationError("Phone", "Empty Phone. Required Field.");
		}
	}
	public void validateContactEmail() throws InvalidFormFieldData {
		NewContactCRMView view = (NewContactCRMView) getView();
		if (view.getContactEmailText().trim().length() == 0) {
			addValidationError("Email", "Empty Email. Required Field.");
		}
	}
	public void validatePosition() throws InvalidFormFieldData {
		NewContactCRMView view = (NewContactCRMView) getView();
		if (view.getPositionText().trim().length() == 0) {
			addValidationError("Position", "Empty Position. Required Field.");
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
			if (validationErrors.containsKey("Facebook")) { cv.setPositionLblError(validationErrors.get("Position")); }
			cv.setMessagesText(errorString);
		}
	}
}

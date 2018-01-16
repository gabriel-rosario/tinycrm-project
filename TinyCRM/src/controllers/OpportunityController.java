package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import exceptions.InvalidFormFieldData;
import main.CRMMain;
import models.CRMModel;
import models.ClientModel;
import swingViews.ContactSwingView;
import swingViews.OpportunitySwingView;
import swingViews.SwingView;
import views.ContactTCRMView;
import views.OpportunityTCRMView;

public class OpportunityController extends CRMController{
	
	public OpportunityController(SwingView oppView, CRMModel oppModel, CRMModel clientModel) {
		super(oppView, oppModel);
		
		OpportunitySwingView ov = (OpportunitySwingView) oppView;
		ClientModel clientModel2 = (ClientModel) clientModel;

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

	public void validateForm() throws InvalidFormFieldData {
		getValidationErrors().clear();
		validateStatus();
		validatePrice();
		validateClose();
		validateDescription();
		if (getValidationErrors().size() > 0)
			throw new InvalidFormFieldData ("Invalid Form");
	}

	public void validateStatus() throws InvalidFormFieldData {
		OpportunityTCRMView view = (OpportunityTCRMView) getView();
		if (view.getTextStatus().trim().length() == 0) {
			addValidationError("Status", "Empty Status. Required Field.");
		}
	}
	
	public void validatePrice() throws InvalidFormFieldData {
		OpportunityTCRMView view = (OpportunityTCRMView) getView();
		if (view.getTextPrice().trim().length() == 0) {
			addValidationError("Price", "Empty Price. Required Field.");
		}
	}
	
	public void validateClose() throws InvalidFormFieldData {
		OpportunityTCRMView view = (OpportunityTCRMView) getView();
		if (view.getTextClose().trim().length() == 0) {
			addValidationError("Close", "Empty Close. Required Field.");
		}
	}
	
	public void validateDescription() throws InvalidFormFieldData {
		OpportunityTCRMView view = (OpportunityTCRMView) getView();
		if (view.getTextDescription().trim().length() == 0) {
			addValidationError("Description", "Empty Description. Required Field.");
		}
	}

	public void refreshDropdowns() {
		OpportunityTCRMView ov = (OpportunityTCRMView) getView();
		ov.setSelectClientItems(CRMMain.clientModel.getAllBeans());
	}
	
	protected void refreshView() {
		super.refreshView();
		String errorString;
		OpportunitySwingView ov = (OpportunitySwingView) getView();
		ov.clearFieldErrors();
		Map<String, String> validationErrors = getValidationErrors();
		if (validationErrors.size() > 0) {
			errorString = "Fields in red are invalid";
			if (validationErrors.containsKey("Status")) { ov.setErrorStatus(validationErrors.get("Status")); }
			if (validationErrors.containsKey("Price")) { ov.setErrorPrice(validationErrors.get("Price")); }
			if (validationErrors.containsKey("Close")) { ov.setErrorClose(validationErrors.get("Close")); }
			if (validationErrors.containsKey("Description")) { ov.setErrorDescription(validationErrors.get("Description")); }
			ov.setMessagesText(errorString);
		}
	}

}
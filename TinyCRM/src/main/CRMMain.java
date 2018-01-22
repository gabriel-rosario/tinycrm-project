package main;

import java.awt.EventQueue;
import java.util.HashMap;
import java.util.Map;
//import controllers.ClientController;
import beans.CRMBean;
import controllers.CRMController;
//import controllers.ContactController;
import controllers.NewClientController;
import controllers.NewContactController;
import controllers.OpportunityController;
import models.CRMModel;
//import models.ClientModel;
//import models.ContactModel;
import models.NewClientModel;
import models.NewContactModel;
import models.OpportunityModel;
//import swingViews.ClientSwingView;
//import swingViews.ContactSwingView;
import swingViews.NewClientSwingView;
import swingViews.NewContactsSwingView;
import swingViews.NewSwingView;
import swingViews.OpeningMenu;
import swingViews.OppSwingView;

public class CRMMain {

	public static CRMModel opportunityModel = new OpportunityModel();
	
	// Create Contacts module MVC objects
	public static NewSwingView clientView = new NewClientSwingView();
	public static CRMModel clientModel = new NewClientModel();
	public static CRMController clientController = new NewClientController(clientView, clientModel,opportunityModel);

	// Create Clients module MVC objects
	public static NewSwingView contactView = new NewContactsSwingView();
	public static CRMModel contactModel = new NewContactModel();
	// Contacts module has relationship with Clients module so we pass the Clients model object to the Contacts controller
	public static CRMController contactController = new NewContactController(contactView, contactModel,clientModel); 


	// Create Opportunity module MVC objects
	public static NewSwingView opportunityView = new OppSwingView();
	
	public static CRMController opportunityController = new OpportunityController(opportunityView, opportunityModel, clientModel);

	private static String currentModule ;
	private static NewSwingView currentView;

	//Create Opening instance
	public static OpeningMenu openingView = new OpeningMenu();

	// mapModuleToView holds the view object for each module
	public static Map<String,NewSwingView> mapModuleToView = new HashMap<String,NewSwingView>();
	// mapModuleToIndex holds the index in the module selection combo box for each module
	public static Map<String,Integer> mapModuleToIndex = new HashMap<String,Integer>();

	public static void main (String[] args) {

			contactView.setModuleSelectionItems(new String[] {"Contacts", "Clients", "Opportunities"});
			clientView.setModuleSelectionItems(new String[] {"Contacts", "Clients", "Opportunities"});
			opportunityView.setModuleSelectionItems(new String[] {"Contacts", "Clients", "Opportunities"});

			mapModuleToView.put("Contacts", contactView);
			mapModuleToView.put("Clients", clientView);
			mapModuleToView.put("Opportunities", opportunityView);

			mapModuleToIndex.put("Contacts", 0);
			mapModuleToIndex.put("Clients", 1);
			mapModuleToIndex.put("Opportunities", 2);
			//mapModuleToIndex.put("Reports", 1);

			clientController.doInit();
			clientController.setSwitchModuleListener((String s) -> CRMMain.switchToModule(s));

			contactController.doInit();
			contactController.setSwitchModuleListener((String s) -> CRMMain.switchToModule(s));

			opportunityController.doInit();
			opportunityController.setSwitchModuleListener((String s) -> CRMMain.switchToModule(s));

			//contactView.setModuleSelected(mapModuleToIndex.get("Contacts"));
			//switchToModule("Contacts");
			openingView.press();
			if(openingView.press()) {
				openingView.dispose();
				switchToModule(openingView.getOpenModule());
			}

	}

		public static void switchToModule(String moduleName) {

			if (moduleName.equals(currentModule)) return;
			
			NewSwingView nextView = mapModuleToView.get(moduleName);
			
			if (nextView != null) {
				
				nextView.setMessagesText("OUR CRM: " + moduleName);

				nextView.setVisible(true);
				if (currentView != null) currentView.setVisible(false);
				
				currentModule = moduleName;
				currentView = nextView;
				currentView.setModuleSelected(mapModuleToIndex.get(currentModule));
			}
			else {
				currentView.setModuleSelected(mapModuleToIndex.get(currentModule));
				currentView.setMessagesText(moduleName + " Module Not Available Yet");
			}
		}
}

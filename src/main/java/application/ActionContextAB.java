package application;

import action.ActionContext;
import banque.AgenceBancaire;

public class ActionContextAB implements ActionContext {

	AgenceBancaire theAg;
	
	public ActionContextAB(AgenceBancaire ag) {
		theAg = ag;
		
	}
	
	public AgenceBancaire getContext() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
 }

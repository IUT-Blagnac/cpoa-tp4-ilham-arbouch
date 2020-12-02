package application;



import java.util.List;

import action.Action;
import action.ActionList;
import banque.AgenceBancaire;

public class ActionListAB<E> implements ActionList<E> {

	String title;
	List <Action<AgenceBancaire>> myMenu;
	String dec;
	String decTwice;
	String numberOptSep;
	
	public ActionListAB(String m, String c, String t ){
		
	}
	public String actionMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	public String actionCode() {
		// TODO Auto-generated method stub
		return null;
	}

	public void execute(AgenceBancaire ag) throws Exception {
		// TODO Auto-generated method stub
	}
	
	public String Title() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String listTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean addAction(Action ac) {
		// TODO Auto-generated method stub
		return false;
	}

	public int listsize() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean removeAction(Action ac) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean getAction(Action ac) {
		// TODO Auto-generated method stub
		return false;
	}
	private int readResponse() {
		return  (Integer) null;
	}
	private void printMenu() {
		
	}
	private void printTitle(AgenceBancaire ac) {
	
	}
	private void tempo() {
		
	}
}

package posSystem;

public class roster {
	private MenuOptions head;
	
	
	public roster() {
		head = null;
		
	}
	
	//will have options to add different items 
	public void addItem(String ingredients, String recipe, double price, String nutritionalInfo) {
		if(head == null) {
			head = new MenuOptions(ingredients, recipe, price, nutritionalInfo);
			return;
		}
	}
	/*
	public void addEmployee(EmployeOrderInfo front) {
		front.setNext(h);
		h = front;
	}
	public void addEmployee(long employeeID, String name) {
		EmployeeOrderInfo temp = new EmployeeOrderInfo(employeeID, name);
		temp.setNext(head);
		head = temp;
	}
	*/
	public void addItemToFront(Integer num, String ingredients, String recipe, double price, String nutritionalInfo) {
		MenuOptions temp = new MenuOptions(num, ingredients, recipe, price, nutritionalInfo);
		temp.setNext(head);
		head = temp;
	}
	public void addItemToFront(MenuOptions front) {
		front.setNext(head);
		head = front;
	}
	// will have option to add a record in a sorted format
	public void addSorted(MenuOptions sort) {
		if(head == null ) { //if the list is empty
			head = sort;
			return;
		}
		if(sort.getNum() < head.getNum()) { //if the number is smaller than the head
			sort.setNext(head);
			head = sort;
			return;
		}
		MenuOptions temp = head;
		while(temp != null) { // make sure there is not and identical uin 
			if(temp.getNum() == sort.getNum() ) {
				System.out.println("Please use a different Burger Number.");
				return;
			}
			if(temp.getNext() == null) { // adds it at the end of the list if there is no more uins
				temp.setNext(sort);
				return;
			}
			//place it between the correct numbers
			if(temp.getNum() < sort.getNum() && temp.getNext().getNum() > sort.getNum()) {
				sort.setNext(temp.getNext());
				temp.setNext(sort);
				return;
			}
			temp = temp.getNext();
		}
	}
	// will have the code needed to delete an item ordered
	
	
	//will have the toString method
	public String toString() {
		if(head ==null)
			return "Empty list";// if there is nothing on the list will say empty list 
		String toReturn = new String();
		MenuOptions temp = head;
		
		while(temp != null) {//if head is not null we will printout the information needeed 
			toReturn += temp.toString() + ",";
			temp = temp.getNext();
		}
		return toReturn;
	}
	
	public String toCSV() {
		String strexport = "";
		MenuOptions node = head; 
		while(node != null) {
			strexport += node.toCSV() + "\n" ; 
			node = node.getNext();
		}
		return strexport;
	}
	
	public void printList() {
		//prints the list selected 
		MenuOptions node = head; //pointer
		while(node != null) { //goes through the entire list 
			System.out.println(node.toString());
			node = node.getNext();
		}
	}
	
	public roster clone() { //COPIES THE LIST IN REVERSE
		roster result = new roster(); //creates a new roster to store the cloned values
		MenuOptions temp = head;
		while(temp != null) { //goes through the list and if temp(head) is not null clone the element
			result.addItemToFront(temp.clone());
			temp= temp.getNext(); // goes to the next element 
		}
		return result; //returns the new roster 
	}
	
	public roster insertionSort() {
		roster toReturn = new roster(); //blank roster
		MenuOptions temp = head; // this will help check if the list is blank if it is temp is new head
		while(temp != null) { // if temp is not null 
			toReturn.addSorted(temp.clone()); // we add a clone of temp to the roster 
			temp = temp.getNext(); 
		}
		return toReturn;
	}
}

package posSystem;

public class employeeRoster {
	private EmployeeOrderInfo head;
	
	
	public employeeRoster() {
		head = null;
		
	}
	
	//will have options to add different items 
	public void addEmployee(Long employeeID, Long orderNumber, double time1, double time2, double elapsedTime) {
		if(head == null) {
			head = new EmployeeOrderInfo(employeeID, orderNumber, time1, time2, elapsedTime);
			return;
		}
	}
	
	
	public void addEmployee(EmployeeOrderInfo front) {
		front.setNext(head);
		head = front;
	}
	public void addEmployeeFront(long employeeID, String name) {
		EmployeeOrderInfo temp = new EmployeeOrderInfo(employeeID, name);
		temp.setNext(head);
		head = temp;
	}
	public void addEmployeeFront(Long employeeID, Long orderNumber, double time1, double time2, double elapsedTime) {
		EmployeeOrderInfo temp = new EmployeeOrderInfo(employeeID, orderNumber, time1, time2, elapsedTime);
		temp.setNext(head);
		head = temp;
	}


	// will have option to add a record in a sorted format
	public void addSorted(EmployeeOrderInfo sort) {
		if(head == null ) { //if the list is empty
			head = sort;
			return;
		}
		if(sort.getEmployeeID() < head.getEmployeeID()) { //if the UIN is smaller than the head
			sort.setNext(head);
			head = sort;
			return;
		}
		EmployeeOrderInfo temp = head;
		while(temp != null) { // make sure there is not and identical uin 
			//if(temp.getPrice() == sort.getPrice() ) {
				//System.out.println("Please use a different price.");
				//return;
			//}
			if(temp.getNext() == null) { // adds it at the end of the list if there is no more uins
				temp.setNext(sort);
				return;
			}
			//place it between the correct numbers
			if(temp.getEmployeeID() < sort.getEmployeeID() && temp.getNext().getEmployeeID() > sort.getEmployeeID()) {
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
		EmployeeOrderInfo temp = head;
		
		while(temp != null) {//if head is not null we will printout the information needeed 
			toReturn += temp.toString() + ",";
			temp = temp.getNext();
		}
		return toReturn;
	}
	
	public String toCSV() {
		String strexport = "";
		EmployeeOrderInfo node = head; 
		while(node != null) {
			strexport += node.toCSV() + "\n" ; 
			node = node.getNext();
		}
		return strexport;
	}
	
	public void printList() {
		//prints the list selected 
		EmployeeOrderInfo node = head; //pointer
		while(node != null) { //goes through the entire list 
			System.out.println(node.toString());
			node = node.getNext();
		}
	}
	
	public employeeRoster clone() { //COPIES THE LIST IN REVERSE
		employeeRoster result = new employeeRoster(); //creates a new roster to store the cloned values
		EmployeeOrderInfo temp = head;
		while(temp != null) { //goes through the list and if temp(head) is not null clone the element
			result.addEmployee(temp.clone());
			temp= temp.getNext(); // goes to the next element 
		}
		return result; //returns the new roster 
	}
}

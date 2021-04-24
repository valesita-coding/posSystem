package posSystem;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class PointOfSalesSystem {
	
	
	static Scanner scnr = new Scanner(System.in);
	static employeeRoster unsortedE;
	static employeeRoster sortedE;
	static roster unsorted;
	static roster sorted;
	static ArrayList<MenuOptions> options = new ArrayList<MenuOptions>();
	static ArrayList<Double> searches = new ArrayList<Double>();
	static ArrayList<EmployeeOrderInfo> employeeID = new ArrayList<EmployeeOrderInfo>();
	
	public static void main(String[] args) {
		unsorted = new roster();
		sorted = new roster();
		unsortedE = new employeeRoster();
		sortedE = new employeeRoster();
		
		loadMenuFile(args[0]); //loads menu list 
		loadEmployeeFile(args[1]); //loads employeeList
		//loadMenuFile(args[1]); //loads ad-ons list 
		
		boolean done = false;
		//System.out.println("completed ");
		while(!done) {
			//logIN();
			printMenu();
			
			String input = scnr.nextLine();
			//options for the user and their outputs
			if(input.equals("1")) { //1 
				recipeMenu();
			}
			else if(input.equals("2")) { //2 
				sortMenu();
			}
			else if(input.equals("3")) { // 3 
				addOnsList();
			}
			else if(input.equals("4")) { //4  
				placeOrder();
			}
			else if(input.equals("5")) { // gives out the menu for types of sorting algorithms and does the sorting selected
				searchRecords();
			}
			else if(input.equals("6")) { //prints out the unsorted list 
				saveAll();
			}
			else if(input.equals("7")) { // sorts the records according to the desire of the user 
				changeRecord();
			}
			else if(input.equals("8")) { //prints out available famous sandwiches 
				addRecord();
			}
			else if (input.equals("9")) {
				deleteRecord();
			}
			else if(input.equals("0")) { //quits it 
				done = true;
				System.out.println("Thank you for playing. Goodbye.");
			}
			else {
				System.out.println("Sorry. That is not a valid option"); // if input is not 1-7 or 0 
				System.out.println("Please try again!");
			}
		}
		
		
		scnr.close();
		
		

	}
	
	public static void logIN() {
		
		System.out.println("To log in enter employee ID:");
		
		String id = scnr.nextLine();
		boolean done = false;
		long idNum =0;
		while(!done) {
			try {
				idNum = Long.parseLong(id);
				if(unsortedE.employeeSearch(idNum) ==false ) {
					System.out.println("Access denied.");
					
					System.out.println();
					//String trash = scnr.nextLine();
					break;
				}
				else {
					unsortedE.Search(idNum);
					System.out.println("Access approved. ");
					//12String trash = scnr.nextLine();
				}
				
				done= true;
				
			}catch (Exception e){
				System.out.println("Please enter a valid employee ID");
				
			}
		}
		
		
		System.out.println();
		
	}
	
	public static void printMenu() {
		//prints current menu 
		//will show different options such as
		//ingredients, recipe, price and nutritional info 
		/*
		 * 1 ingredients
		 * 2 recipe
		 * 3 price
		 * 4 nutritional info 
		 * 5 search records 
		 * 6 sort records
		 */
		System.out.println("Joe-Bob’s Burgers (JBB)");
		System.out.println("Please select an option");
	
		System.out.println("1   Print Menu");
		System.out.println("2   Sort Menu");
		System.out.println("3   Ad-ons list");
		System.out.println("4   Place order");
		System.out.println("5   Search for menu item");
		System.out.println("6   Export Employee order info");
		System.out.println("7   Change menu item");
		System.out.println("8   Add item to menu");
		System.out.println("9   Delete item from menu");
		System.out.println("0   Exit");
		//System.out.println();
	}
	
	public static void placeOrder() {
		//will hold the items that the client wants to order 
		// and the expected price 
		System.out.println();
		
		
		
		//will also have the option to check out which will provide the total items and some descriptions such 
		//as name of the recipe and price
		// and will have total price 
	}
	
	public static void addOnsList() {
		//All ingredients listed
		/* shown by category 
		 * 		ex. bread type, meat, cheeses, etc
		 * at end show everything, and "Y" to confirm "N" keep editing
		 */
		String filename = scnr.nextLine();
		
		System.out.println("The ingredients available are:");
		loadMenuFile(filename);
		
		System.out.println();
		
	}
	public static void recipeMenu() {
		//All recipes listed	
		/*list of known recipes with their ingredients
		 * gives option to add or delete something from recipe
		 * 		aka Secret Recipe
		 * * at end show everything, and "Y" to confirm "N" keep editing
		 */
		System.out.println("Here are some of our known recipes:");
		unsorted.printList();
		System.out.println();
	}
	public static void price() {

		
		System.out.println();
		
		
		
	}

	
	public static void customized() {
		//aka Secret menu 
		// allows user to customize their order 
		//shows free and extra cost ingredients to choose from
		System.out.println("Secret menu");
		System.out.println("Select the ingredients you would like:");
		System.out.println("1   add to order");
		
		System.out.println();
	}
	
	public static void printEmployeeList() {
		//will print unsorted records 
		unsortedE.printList();
	}
	
	
	public static void searchRecords() {
		//thinking on making it a class 
		//will search for a record that matches 1 or more parameters 
		// will call the searchItem() class 
		
	}
	public static void sortMenu(){
		//thinking on making it a class 
		//will sort based on 1 or more parameters provided by user 
		// will call the sortRecords() class 
		sorted = unsorted.insertionSort();
		System.out.println(sorted);
	}
	
	
	
	
	public static void addRecord(){
		//will give the option to add more items to the order 
		// will call the menuoptions class 
		
	}
	
	public static void changeRecord(){
		//will give the option to change a record/ customize it 
		
	}
	public static void deleteRecord(){
		//will delete a desired record 
		System.out.println("To delete an item from the menu you must enter the id number of that item:");
		//String delete = scnr.nextLine();
		
		int deleteItem = scnr.nextInt();
	}
	
	
	public static void totalPrice() {
		//will add all menu items prices ordered and add-ons
		//will show the TotalPrice
	}
	
	
	public static void saveAll() {
		//will save all data to a file(s) so that correct order is served. 
		//employee info
	}
	
	
	
	public static void employeeReward(String filename) {
		// will call the employee order info class 
	//will show the rewards earned by each employee	
		/*most orders
		 * most in sales
		 * most add-ons charges
		 * fastest average delivery time
		 * most orders delivered < 2 min 
		 * 
		 * Wall of shame = orders > 7 min 
		 */
	}
	
	static void loadMenuFile(String filename) {
		//loads students from a CSV file 
		// will store students in the unsorted list
		try {
			
			int countLoaded = 0;
			//String filename = scnr.nextLine().trim();
			unsorted = new roster();
			sorted = new roster();
			Scanner filescanner = new Scanner(new File(filename));
			while(filescanner.hasNext()) {
				String line = filescanner.nextLine();
				String[] values = line.split(",");
				if(!values[3].equals("Price")) {
					
					//studentNode temp = new studentNode(values[0], values[1], Long.parseLong(values[2]));
					unsorted.addItemToFront(Integer.parseInt(values[0]), values[1], values[2], Double.parseDouble(values[3]), values[4]);
					
					//sorted.addStudentSorted(temp.clone());
					//System.out.println("something");
					//students.add(new studentNode(values[0], values[1], Double.parseDouble(values[2]))); 
					countLoaded++;
				}
			}//end of while loop for scanning the file 
			System.out.println("Done loading data. " + countLoaded + " famous recipes available");
			System.out.println();
		}
		catch (Exception e) {
			System.out.println("Could not open student list: " + e );
			
		}
	}
	
	static void loadEmployeeFile(String filename) {
		//loads students from a CSV file 
		// will store students in the unsorted list
		try {
			
			int countLoaded = 0;
			//String filename = scnr.nextLine().trim();
			//filename = scnr.nextLine().trim();
			Scanner filescanner = new Scanner(new File(filename));
			unsortedE= new employeeRoster();
			sortedE = new employeeRoster();
			while(filescanner.hasNext()) {
				String line = filescanner.nextLine();
				String[] values = line.split(",");
				//String id = "ID";
				
				if(!values[0].equals("ID")) {
				
					long newID = Long.parseLong(values[0]);
					unsortedE.addEmployeeFront(newID, values[1]);
					
					countLoaded++;
				}
			}//end of while loop for scanning the file 
			System.out.println("Done loading data. " + countLoaded + " employees registered");
			System.out.println();
		}
		catch (Exception e) {
			System.out.println("Could not open student list: " + e );
			
		}
	}
	

}
	
	

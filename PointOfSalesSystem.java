package posSystem;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
//C:\Users\vales\Documents\try1.csv
public class PointOfSalesSystem {
	static Scanner scnr = new Scanner(System.in);
	static employeeRoster unsortedE;
	static employeeRoster sortedE;
	static roster unsorted;
	static roster sorted;
	
	static ArrayList<MenuOptions> options = new ArrayList<MenuOptions>();
	static ArrayList<Double> searches = new ArrayList<Double>();
	
	public static void main(String[] args) {
		unsorted = new roster();
		sorted = new roster();
		unsortedE = new employeeRoster();
		sortedE = new employeeRoster();
		
		loadMenuFile(args[0]); //loads menu list 
		loadEmployeeFile(args[1]); //loads employeeList
		//loadFile(args[2]); //loads ad-ons list 
		
		boolean done = false;
		
		while(!done) {
			logIN();
			printMenu();
			
			String input = scnr.nextLine();
			//options for the user and their outputs
			if(input.equals("1")) { //1 
				ingredients();
			}
			else if(input.equals("2")) { //2 
				recipe();
			}
			else if(input.equals("3")) { // 3 
				price();
			}
			else if(input.equals("4")) { //4  
				nutritionalInfo();
			}
			else if(input.equals("5")) { // gives out the menu for types of sorting algorithms and does the sorting selected
				searchRecords();
			}
			else if(input.equals("6")) { //prints out the unsorted list 
				printRecords();
			}
			else if(input.equals("7")) { // sorts the records according to the desire of the user 
				sortRecords();
			}
			else if(input.equals("8")) { //prints out available famous sandwiches 
				//loadFile();
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
				break;
				
			}catch (Exception e){
				System.out.println("Please enter a valid employee ID");
			}
		}
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
		System.out.println("Joe-Bob�s Burgers (JBB)");
		System.out.println("Please select an option");
	
		System.out.println("1   Ingredients");
		System.out.println("2   Recipes");
		System.out.println("3   Prices");
		System.out.println("4   Nutritional Info");
		System.out.println("5   Search records");
		System.out.println("6   Print records");
		System.out.println("7   Sort records");
		System.out.println("8   Famous Recipes");
		System.out.println("9   Check cart items");
		System.out.println("0   Exit");
		//System.out.println();
	}
	
	public static void cartItems() {
		//will hold the items that the client wants to order 
		// and the expected price 
		System.out.println("Cart items:");
		
		
		
		//will also have the option to check out which will provide the total items and some descriptions such 
		//as name of the recipe and price
		// and will have total price 
	}
	
	public static void ingredients() {
		//All ingredients listed
		/* shown by category 
		 * 		ex. bread type, meat, cheeses, etc
		 * at end show everything, and "Y" to confirm "N" keep editing
		 */
		System.out.println("The ingredients available are:");
		
		
		System.out.println();
		
	}
	public static void recipe() {
		//All recipes listed	
		/*list of known recipes with their ingredients
		 * gives option to add or delete something from recipe
		 * 		aka Secret Recipe
		 * * at end show everything, and "Y" to confirm "N" keep editing
		 */
		System.out.println("Here are some of our known recipes:");
		
		System.out.println();
	}
	public static void price() {
		//All prices listed 
		/*list of prices ordered by 
		 *  ex. type of meat (low to high, high to low
		 *  description 
		 *  add-on prices 
		 *  * at end show everything, and "Y" to confirm "N" keep editing
		
		 */
		
		System.out.println("Here is the list of prices:");
		System.out.println("Add-on prices:");
		
		System.out.println();
		
		
		
	}
	public static void nutritionalInfo() {
		//nutritional info for each ingredient  
		System.out.println("Nutritional info about our recipes:");
		
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
	
	public static void printRecords() {
		//will print unsorted records 
		unsorted.printList();
	}
	
	public static void searchRecords() {
		//thinking on making it a class 
		//will search for a record that matches 1 or more parameters 
		// will call the searchItem() class 
	}
	public static void sortRecords(){
		//thinking on making it a class 
		//will sort based on 1 or more parameters provided by user 
		// will call the sortRecords() class 
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
	}
	
	
	public static void totalPrice() {
		//will add all menu items prices ordered and add-ons
		//will show the TotalPrice
	}
	
	
	public static void saveAll() {
		//will save all data to a file(s) so that correct order is served. 
		//items ordered
		//add-ons
		//prices
		//nutr info
		//employee info
	}
	
	
	
	public static void employeeReward() {
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
			unsortedE= new employeeRoster();
			sortedE = new employeeRoster();
			Scanner filescanner = new Scanner(new File(filename));
			while(filescanner.hasNext()) {
				String line = filescanner.nextLine();
				String[] values = line.split(",");
				if(!values[0].equals("Employee ID")) {
					
					//studentNode temp = new studentNode(values[0], values[1], Long.parseLong(values[2]));
					unsortedE.addEmployeeFront(Long.parseLong(values[0]), values[1]);
					
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
	
	
}
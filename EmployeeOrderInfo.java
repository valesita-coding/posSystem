package posSystem;

public class EmployeeOrderInfo {
//will be used to keep track of the order info for each employee 
	private long employeeID;
	private String name;
	public long getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private long OrderNumber;
	private double Time1;// orders taken at particular time
	private double Time2;// orders served at particular time
	private double elapsedTime; // how long it took the order from time1 to time2
	
	//not sure if use name, number and elapsed time or 
	// reward descriptions 
	public EmployeeOrderInfo() {
		
	}
	
	@Override
	public String toString() {
		return "EmployeeOrderInfo [Name=" + employeeID + ", OrderNumber=" + OrderNumber + ", Time1=" + Time1 + ", Time2="
				+ Time2 + ", elapsedTime=" + elapsedTime + "]";
	}

	public EmployeeOrderInfo(long employeeID, String name) {
		super();
		this.employeeID = employeeID;
		this.name = name;
		
	}
	public EmployeeOrderInfo(long employeeID, long orderNumber, double time1, double time2, double elapsedTime) {
		super();
		this.employeeID = employeeID;
		OrderNumber = orderNumber;
		Time1 = time1;
		Time2 = time2;
		this.elapsedTime = elapsedTime;
	}


	public long getOrderNumber() {
		return OrderNumber;
	}

	public void setOrderNumber(long orderNumber) {
		OrderNumber = orderNumber;
	}

	public double getTime1() {
		return Time1;
	}

	public void setTime1(double time1) {
		Time1 = time1;
	}

	public double getTime2() {
		return Time2;
	}

	public void setTime2(double time2) {
		Time2 = time2;
	}

	public double getElapsedTime() {
		return elapsedTime;
	}

	public void setElapsedTime(double elapsedTime) {
		this.elapsedTime = elapsedTime;
	}


	

	

}

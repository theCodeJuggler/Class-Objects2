//Class to implement Vehicle behaviors and properties
class Vehicle {

	private double currentSpeed;
	private double currentDirection;
	private String ownerName;
	private static int highestVehicleIdentificationNumber;
	private int vehicleID;
	
	private static final int TURN_LEFT = 90;
	private static final int TURN_RIGHT = -90;
	
	//non-arg constructor
	Vehicle()
	{
	}
	
	//parameterized constructor
	Vehicle(String ownerName)
	{
		this.ownerName = ownerName;
	}
	
	//getting the current speed for the main()
	public double getCurrentSpeed() {
		return currentSpeed;
	}

	//setting the current speed from the main()
	public void setCurrentSpeed(double currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	//retrieving the current direction
	public double getCurrentDirection() {
		return currentDirection;
	}

	//setting the current direction
	public void setCurrentDirection(double currentDirection) {
		this.currentDirection = currentDirection;
	}
	
	//function to modify currentSpeed
	void changeSpeed(double speed)
	{
		this.currentSpeed = speed;
	}
	
	//function to specify the condition for the stopped vehicle
	void stop()
	{
		this.currentSpeed = 0;
	}
	
	//function to turn by degrees
	void turnByDegree(double degree, String direction)
	{
		if(direction.equals("left"))
			currentDirection+=degree;
		if(direction.equals("right"))
			currentDirection-=degree;
	}
	
	//function to turn by Direction of 90
	void turnByDirection(String direction)
	{
		if(direction.equals("left"))
			currentDirection+=TURN_LEFT;
		if(direction.equals("right"))
			currentDirection+=TURN_RIGHT;	
	}

	//returning Highest Vehicle Identification Number to the main()
	public static int getHighestVehicleIdentificationNumber() {
		return highestVehicleIdentificationNumber;
	}

	//setting Highest Vehicle Identification Number from the main()
	public static void setHighestVehicleIdentificationNumber(int highestVehicleIdentificationNumber) {
		Vehicle.highestVehicleIdentificationNumber = highestVehicleIdentificationNumber;
	}
	
	//setting vehicle id
	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}

	//returning vehicle ID
	public int getVehicleID() {
		return vehicleID;
	}

	//displaying the details
	@Override
	public String toString() {
		return "Vehicle [currentSpeed=" + currentSpeed + ", currentDirection=" + currentDirection + ", ownerName="
				+ ownerName + ", vehicleID=" + vehicleID + "]";
	}
	
}

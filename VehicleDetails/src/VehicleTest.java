import java.io.*;
//Tester program to test the Vehicle class
public class VehicleTest {

	public static void main(String args[])throws IOException
	{
		String direction;
		int choice;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//Accepting the owner name
		System.out.print("Enter Owner Name :: ");
		String ownerName = in.readLine();
		
		Vehicle bmwX4 = new Vehicle(ownerName);
		
		//accepting vehilce id numbers
		System.out.print("Enter The Highest Vehicle Identification Number :: ");
		bmwX4.setHighestVehicleIdentificationNumber(Integer.parseInt(in.readLine()));
		
		System.out.print("Enter The Vehicle Identification Number :: ");
		bmwX4.setVehicleID(Integer.parseInt(in.readLine()));
				
		do
		{
			System.out.println("Press\n1. Change Speed\n2. Stop\n3. Turn by Degrees\n4. Turn by Direction\n5. Display Informations\n6. Exit");
			System.out.print("Enter Your Choice :: ");
			choice = Integer.parseInt(in.readLine());
			
			switch(choice)
			{
			case 1: //accepting the speed to change
				System.out.print("Enter Speed :: ");
				bmwX4.changeSpeed(Integer.parseInt(in.readLine()));
				break;
				
			case 2: //case for stopping the vehicle
				bmwX4.stop();
				break;
				
			case 3: //case for changing direction by degrees
				System.out.print("Enter Direction (left / right) : ");
				direction = in.readLine(); //accepting left/right of the direction
				System.out.print("Enter Degrees : ");
				double degrees = Double.parseDouble(in.readLine()); //accepting the degrees
				
				bmwX4.turnByDegree(degrees, direction);
				
				break;
				
			case 4:	//case for changing direction by 90 degrees
				System.out.print("Enter Direction (left / right) : ");
				direction = in.readLine();
				
				bmwX4.turnByDirection(direction);
				
				break;
				
			case 5:	//displaying all informations
				System.out.println(bmwX4);
				break;
				
			case 6:
				break;
				
			default:
				System.out.println("Wrong Option Chosen !!");
			}
		}while(choice!=6);
	
	}
}

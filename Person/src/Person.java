//Class implementing prperties of a person
import java.time.LocalDate;
class Person
{

	private String name;
	private Date dob;

	//parameterized constructor to initialize the instance members		
	Person(int d, int m, int y, String name)
	{
		dob = new Date(d, m, y);
		this.name = name;
	}

	//function to display the results in the specified format
	void display()
	{	
		System.out.println("Name " + name);
		// converting into dd mm yyyy
		String day = Integer.toString(dob.getD()), month = Integer.toString(dob.getM()),
				year = Integer.toString(dob.getY());
		if (dob.getD() < 10)
			day = "0" + day;
		if (dob.getM() < 10)
			month = "0" + month;

		//displaying using the given format
		System.out.println("DOB:- " + day + "/" + month + "/" + year);
		
		//Converting current time to the local date class
		LocalDate now = LocalDate.now();
		int currentMonth = now.getMonthValue();
		int currentYear = now.getYear();
		int currentDay = now.getDayOfMonth();
		Date currentDate = new Date(currentDay, currentMonth, currentYear);
		int ageArray[] = dob.differenceDate(currentDate);
		System.out.println("Age is " + ageArray[0] + " days, " + ageArray[1] + " months and " + ageArray[2] + " years");
		System.out.println();
	}
	
	//method to identify older of the two persons
	void olderOne(Person person)
	{
		int ageDifference[]=dob.differenceDate(person.dob);
		
		System.out.println(this.name+" is older than "+person.name+" by "+ ageDifference[0] + " days, " + ageDifference[1] + " months and " + ageDifference[2] + " years");
	}
}

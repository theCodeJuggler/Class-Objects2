//Driver program to test the Country class
import java.io.*;
class CountryTest {

	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//Accepting the number of countries from the user
		System.out.println("Enter The Number of Countries :: ");
		int noOfCountries = Integer.parseInt(in.readLine());
		
		Country ar[] = new Country[noOfCountries]; //Class type array
		
		//accepting the inputs from the user
		System.out.println("Enter The Following Informations:\nCountry Name\nPopulation\nArea");
		for(int i=0;i<noOfCountries;i++)
		{
			System.out.println("Country "+(i+1));
			ar[i] = new Country(in.readLine(), Integer.parseInt(in.readLine()), Double.parseDouble(in.readLine()));
		}
		
		//Finding the max area
		double max = ar[0].area;
		int index = 0;
		for(int i=1; i<noOfCountries; i++)
		{
			if(max<ar[i].area)
			{
				max = ar[i].area;
				index = i;
			}
		}
		System.out.println("Country With Largest Area ::  Country Name : "+ar[index].name+" Country Area : "+max);
		
		//finding the max population
		max = ar[0].population;
		index = 0;
		for(int i=1; i<noOfCountries; i++)
		{
			if(max<ar[i].population)
			{
				max = ar[i].population;
				index = i;
			}
		}
		System.out.println("Country With Largest Population ::  Country Name : "+ar[index].name+" Country Population : "+max);
		
		//finding the max population density
		max = ar[0].population/ar[0].area;
		index = 0;
		for(int i=1; i<noOfCountries; i++)
		{
			if(max<ar[i].population/ar[0].area)
			{
				max = ar[i].population/ar[0].area;
				index = i;
			}
		}
		System.out.println("Country With Largest Population Density ::  Country Name : "+ar[index].name+" Country Population Density : "+max);
	}
}

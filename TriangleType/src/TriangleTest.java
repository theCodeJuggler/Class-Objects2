import java.io.*;
//Driver program to test Triangle class
public class TriangleTest {

	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//Accepting the dimension \s of the triangle
		System.out.println("Enter The Dimensions of The Traingle :: ");
		double sideOne = Double.parseDouble(in.readLine());
		double sideTwo = Double.parseDouble(in.readLine());
		double sideThree = Double.parseDouble(in.readLine());
		
		Triangle triangle = new Triangle(sideOne, sideTwo, sideThree);
		
		//checking for each of triangle type
		if(triangle.isEquilateral())
			System.out.println("The Triangle is Equilaeral Triangle.");
		
		if(triangle.isIsosceles())
			System.out.println("The Triangle is Isosceles Triangle.");
		
		if(triangle.isScalene())
			System.out.println("The Triangle is Scalene Triangle.");
		
		if(triangle.isRight())
			System.out.println("The Triangle is Right Angled Triangle.");
		
	}
}

//Implementation of Triangle 
public class Triangle {
	
	private double side1;
	private double side2;
	private double side3;
	
	//Initializing the instance memebers with the users values
	Triangle(double side1, double side2, double side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	//Checking for right angles triangle
	boolean isRight()
	{
		
		if(side1>side2 && side1>side3) //checking for the largest side
		{
			if((side1*side1) == (side2*side2+side3*side3)) //checking pythagoras theorem
				return true;
			else
				return false;
		}
		else if(side2>side1 && side2>side3) //checking for the largest side
		{			
			if((side2*side2) == (side1*side1+side3*side3)) //checking pythagoras theorem
				return true;
			else
				return false;
		}
		else if (side3>side2 && side3>side1) //checking for the largest side
		{
			if((side3*side3) == (side2*side2+side1*side1)) //checking pythagoras theorem
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	//checking for scalene triangle
	boolean isScalene()
	{
		if(side1 != side2 && side2 != side3 && side3 != side1)
			return true;
		else		
			return false;
	}
	
	//checking for isosceles triangle
	boolean isIsosceles()
	{
		if(side1 == side2 || side2 == side3 || side3 == side1)
			return true;
		else		
			return false;
	}
	
	//checking for equilateral triangle
	boolean isEquilateral()
	{
		if(side1 == side2 && side1 == side3)
			return true;
		else
			return false;
	}
}

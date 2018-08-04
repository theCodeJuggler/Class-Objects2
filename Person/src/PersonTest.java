//Driver program to test the Person class
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1=new Person(5,6,1980,"Ram");
		Person person2=new Person(2,3,1987,"Shyam");
		
		System.out.println("First persons details:");
		person1.display();
		
		System.out.println("Second persons details:");
		person2.display();
		
		person1.olderOne(person2);
	}

}

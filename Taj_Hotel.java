/* Q1)"Taj Hotel" given the 5- list of Room types, cost per day Room types cost per day luxury 2500 a/c 2000 non a/c 1500 deluxe
do the hotel reservation process.*/
package TajHotel;
import java.util.*;
public class Taj_Hotel
{
	
	public static void main(String[] args)
	{
		String name;// customer nsme
		int age;//customer age
		long mobileno;//customer mobile numner
		long id_no;// customer id
		char ans;// ask to custmer for stay again in hotel
		char daysans;//
		int choice;// choice to customer room seleceted in hotel
		int days;// days to customer stay in hotel
		float bill=0;// Bill for customer
		Scanner sc = new Scanner(System.in);//Scanner class to takes input from user
		System.out.println("------------------Welcome To Taj Hotel---------------------");

		do
		{
			
			System.out.println("Please choice Your Room for stay.");//Choices for customer hoel rooms
			System.out.println("1. luxury Room Cost Per day \t\t\t 2500rs");
			System.out.println("2. a/c Room Cost Per day \t\t\t 2000rs ");
			System.out.println("3. non a/c Room Cost Per day \t\t\t 1500rs"); 
			System.out.println("4. deluxe Room Cost Per day \t\t\t 1800rs");
			choice=sc.nextInt();
			System.out.println("Enter Your Name = ");
			name=sc.next();// take name input from customer
			System.out.println("Enter Your Age = ");
			age=sc.nextInt();// take age input from customer
			System.out.println("Enter Your Mobile Number = ");
			mobileno=sc.nextLong();// take mobile number from customer
			System.out.println("Enter Your Adhar Id_Number = ");
			id_no=sc.nextLong();// take adhar id from cutomer
			switch(choice)
			{
			case 1:// choice for luxury Room
				do 
				{
					System.out.println("Your selected Room is luxury Room");
					System.out.println("How many days You want to stay");
					days=sc.nextInt();
					bill=2500*days;
					System.out.println("Your Details are");
					System.out.println("Welcome"+" "+name+" "+"In Our Taj Hotel"+"\n"+"Your Age is"+" "+age+"\n"+"Your Mobile Number is"+" "+mobileno+"\n"+"Your Adhar Id_Number is"+" "+id_no+"\n"+"your Room No is 101");	
					System.out.println("Your Total Payment is = "+bill);
					System.out.println("Do You Want To Stay More Days Again Y/N");
					daysans=sc.next().charAt(0);
				}while(daysans=='Y'||daysans=='y');
				break;
				
				
			case 2:// choice for a/c Room
				do 
				{
					System.out.println("Your selected Room is a/c Room");
					System.out.println("How many days You want to stay");
					days=sc.nextInt();
					bill=2000*days;
					System.out.println("Welcome in our Taj Hotel your Room No is 201");	
					System.out.println("Your Total Payment is = "+bill);
					System.out.println("Do You Want To Stay More Days Again Y/N");
					daysans=sc.next().charAt(0);
				}while(daysans=='Y'||daysans=='y');
				break;
				
				
			case 3:// choice for non a/c Room
				do 
				{
					System.out.println("Your selected Room is non a/c");
					System.out.println("How many days You want to stay");
					days=sc.nextInt();
					bill=1500*days;
					System.out.println("Welcome in our Taj Hotel your Room No is 301");	
					System.out.println("Your Total Payment is = "+bill);
					System.out.println("Do You Want To Stay More Days Again Y/N");
					daysans=sc.next().charAt(0);
				}while(daysans=='Y'||daysans=='y');
				break;
				
				
			case 4:// choice for deluxe Room
				do 
				{
					System.out.println("Your selected Room is deluxe Room");
					System.out.println("How many days You want to stay");
					days=sc.nextInt();
					bill=1800*days;
					System.out.println("Welcome in our Taj Hotel your Room No is 401");	
					System.out.println("Your Total Payment is = "+bill);
					System.out.println("Do You Want To Stay More Days Again Y/N");
					daysans=sc.next().charAt(0);
				}while(daysans=='Y'||daysans=='y');
				break;
			default :
				System.out.println("Please select valid Room Type");				
			
			}	
			System.out.println("Do you want to Stay Again Y/N");
			ans=sc.next().charAt(0);
		}while(ans=='Y'||ans=='y');

			
	}

}

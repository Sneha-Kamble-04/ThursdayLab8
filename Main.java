/*
 Q3)Creating one superclass Hill stations and three subclasses Manali, 
 Mussoorie, Gulmarg. Subclasses extend the superclass and override its location() 
 and famousfor() method. We will call the location() and famousfor() method by the Parent class’
 i.e. Hillstations class. As it refers to the base class object and 
 the base class method overrides the superclass method; the base class method is invoked at runtime. 

 */
package HillStation;
//Superclass
class HillStations 
{
	 // Method to get the location
	 public void location() 
	 {
	     System.out.println("Location: Generic Hill Station");
	 }
	
	 // Method to get what the place is famous for
	 public void famousFor() 
	 {
	     System.out.println("Famous For: Scenic Beauty");
	 }
}

//Subclass Manali
class Manali extends HillStations 
{
	 // Override the location method for Manali
	 @Override
	 public void location() 
	 {
	     System.out.println("Location: Manali, Himachal Pradesh");
	 }
	
	 // Override the famousFor method for Manali
	 @Override
	 public void famousFor() 
	 {
	     System.out.println("Famous For: Snow-capped Mountains and Adventure Sports");
	 }
}

//Subclass Mussoorie
class Mussoorie extends HillStations 
{
	 // Override the location method for Mussoorie
	 @Override
	 public void location() 
	 {
	     System.out.println("Location: Mussoorie, Uttarakhand");
	 }
	
	 // Override the famousFor method for Mussoorie
	 @Override
	 public void famousFor() 
	 {
	     System.out.println("Famous For: The Queen of Hills and Camel's Back Road");
	 }
}

//Subclass Gulmarg
class Gulmarg extends HillStations 
{
	 // Override the location method for Gulmarg
	 @Override
	 public void location() 
	 {
	     System.out.println("Location: Gulmarg, Jammu and Kashmir");
	 }
	
	 // Override the famousFor method for Gulmarg
	 @Override
	 public void famousFor() 
	 {
	     System.out.println("Famous For: Ski Resort and the Gulmarg Gondola");
	 }
}

public class Main 
{
 public static void main(String[] args) 
	 {
	     // Create objects of each subclass
	     HillStations manali = new Manali();
	     HillStations mussoorie = new Mussoorie();
	     HillStations gulmarg = new Gulmarg();
	
	     // Call the overridden methods using the superclass reference
	     manali.location();
	     manali.famousFor();
	
	     System.out.println();
	
	     mussoorie.location();
	     mussoorie.famousFor();
	
	     System.out.println();
	
	     gulmarg.location();
	     gulmarg.famousFor();
	 }
}


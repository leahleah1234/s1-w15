import java.util.*;
// Represent a person's name with three components, a first name,
// a middle name, and a last name.

public class Friends {

   // declare and initialize the ArrayList
   ArrayList<Name> people = new ArrayList<Name>(); 
   // declare and initialize the Random class
   Random rand = new Random(); 
   
   // the constructor
   public Friends () {
       // add three names to the ArrayList
       people.add(new Name("Leah", "Marie", "Hsueh"));
       people.add(new Name("Ariana", "", "Grande"));
       people.add(new Name("Emma", "Marie", "Guy"));
   }
   
   public void printRandomFriend(){
       //return a random Name object from the List
       System.out.println(people.get(rand.nextInt(people.size())).fullName()); 
    }

   
  
}
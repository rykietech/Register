//@rykietech

import java.util.*;
import java.util.Scanner;
public class Register {

	public String name;
	public String s_name;
	public String email;
	public String p_number;
	public String passwrd;
		
	public Register(String nme,String snme,String eml,String pnum,String pwrd){
		name = nme;
		s_name = snme;
		email = eml;
		p_number = pnum;
		passwrd = pwrd;				
					
	}
//________________________________________________________________________	
//Setters 
//________________________________________________________________________
	public void setName(String n){
		name = n;	
	}
	
	public void setSname(String s){
		s_name = s;	
	}
			
	public void setEmail(String em){
		email = em;	
	}

	public void setPnum(String pnum){
		p_number = pnum;			
	}
		
	public void setPwrd(String pwrd){
		passwrd = pwrd;			
	}
//______________________________________________________________________	
//Getters
//______________________________________________________________________
	public String getName(){
		return name;	
	}

	public String getSname(){
		return s_name;	
	}
			
	public String getEmail(){
		return email;	
	}

	public String getPnum(){
		return p_number;			
	}
		
	public String getPwrd(){
		return passwrd;			
	}
//______________________________________________________________________
//Method vaidators
//______________________________________________________________________
// validate first name
   
	public boolean firstName( String firstName ) {
		name = firstName;
      return name.matches( "[A-Z][a-z]*" );
   }
// validate last name
	public boolean lastName( String lastName ) {
		s_name = lastName;      
		return s_name.matches( "[A-Z][a-z]*" );
   }
//Email validator 
   public boolean isValid(String emal) {
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		email = emal;
      return email.matches(regex); // checks if email matches format
   }
//phone validator
	public boolean is_Valid(String s) {
		String regex = "\\d{3}-\\d{3}-\\d{4}"; // xxx-xxx-xxxx
		p_number = s;
      return p_number.matches(regex);
   }
//_________________________________________________________________________
		
   public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lets register!");
		System.out.println("Please enter your Name: ");
		String n = scan.nextLine();
		System.out.println("Please enter your Surname: ");
		String s = scan.nextLine();
		System.out.println("Please enter your email address: ");
		String e = scan.nextLine();
		System.out.println("Enter your phone number: ");
		String ph = scan.nextLine();
		System.out.println("Enter your password");
		String pw = scan.nextLine();
		Register user = new Register(n,s,e,ph,pw);
//_________________________________________________________________________
		boolean registered = false;
		while (!registered){
				
	   	if(user.firstName(user.getName())){
				if (user.lastName(user.getSname())){
					if (user.isValid(user.getEmail())){
						if (user.is_Valid(user.getPnum())){
							System.out.println("You are finally registered");
							registered = true;																		
						}
						else{
							System.out.println("You have not entered a valid number");
							System.out.println("Enter your phone number: ");
							ph = scan.nextLine();
							user.setPnum(ph);	
						}										
					}
					else{
						System.out.println("You have not entered a valid email");
						System.out.println("Please enter your email address: ");
						e = scan.nextLine();
						user.setEmail(e);												 
					}								
				}
				else{
					System.out.println("You have not entered a valid surname");	
					System.out.println("Please enter your Surname: ");
					s = scan.nextLine();
					user.setSname(s);							
				}
		}
		else{
			System.out.println("You have not entered a valid name");
			System.out.println("Please enter your Name: ");
			n = scan.nextLine();
			user.setName(n);						
		}			
							
	}

      

	}

}

package email_application;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private String alternateEmail;
	private int defaultPasswordLength = 10;
	private int mailBoxCapacity = 500;
	private String companySuffix = "CompanyName.com";
	
	public Email(String fName, String lName) {
		this.firstName = fName;
		this.lastName = lName;
		
		this.department = setDepartment();
		
		// Call a method to return random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		// Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "_" + companySuffix;
	}
	
	private String setDepartment() {
		System.out.print("New worker: " + firstName + ". \nDEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) {
		return "Sales";
	} else if(depChoice == 2) {
		return "Development";
	} else if(depChoice == 3) {
		return "Accounting";
	} else {
		return " ";
	}
}
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*";
		char[] password = new char[length];
		for(int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
			
		}
		return new String(password);
	}
	
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {
		return mailBoxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String display() {
		return "DISPLAY NAME: " + firstName + " " + lastName + 
			   "\nCOMPANY EMAIL: " + email + 
			   "\nMAILBOX CAPACITY: " + mailBoxCapacity + "mb";
	}
	
	
}

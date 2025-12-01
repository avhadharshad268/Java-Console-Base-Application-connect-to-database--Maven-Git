package main;

import java.util.Scanner;

public class Ecommercemain {
    public static void main (String [] args ) {
    	System.out.println("Welcome to E-commerce");
    	System.out.println("\t What You want Today");
    	Scanner sc = new Scanner(System.in);
        while (true) {
        	System.out.println("\t 1.Login");
        	System.out.println("\t 2.Product ");
        	System.out.println("\t 3.Quit");
        	
        	int option = sc.nextInt();
        	if (1==option) {
            	System.out.println("\t ***Welcome to Product Managemnt*** ");
            	Productmanagemnt.productmanagemnt ();
        	}
        	else if (2==option) {
            	System.out.println("\t ***Welcome to Product Managemnt*** ");
            	Productmanagemnt.productmanagemnt ();
        	}
        	else if (3 == option) {
            	System.out.println(" **Exit The Application** ");
                System.exit(0);
        	}
        	else {
        		System.out.println("Hey user You entre wrong opetion");
        	}
        }
    	
    }
}

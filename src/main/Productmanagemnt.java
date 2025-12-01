package main;

import java.util.Scanner;


public class Productmanagemnt {
    public static void productmanagemnt () {
 	   
    	product s1  = new product();
    	Scanner sc = new Scanner(System.in);
    	System.out.println("****Welcome To Product Managemnt****");
    	while (true ) {
        System.out.println(" 1. Add Product ");
    	System.out.println(" 2. Update Product ");
    	System.out.println(" 3. Search Product ");
    	System.out.println(" 4. Delet Product ");
    	System.out.println(" 5. Quit");
        
    	int option = sc.nextInt();
    	if (1==option) {
    		
    	System.out.println("\t Entre Product Name");
    	s1.Name = sc.next();	
    	System.out.println(" Entre Product Quantity");
    	s1.Quantity = sc.nextInt();

    	System.out.println(" Entre Product Prize");
    	s1.Prize = sc.nextInt();
    	System.out.println("\t  Product Name =" + " "+ s1.Name);
    	System.out.println("\t  Product Prize =" + " " + s1.Quantity );
    	System.out.println("\t Product Prize = " +" "+ s1.Name);
    	}
    	else if (2==option) {
        	System.out.println("2. Update Product");
    	}
    	else if (3==option) {
        	System.out.println("3. Print Product");
        	System.out.println("\t  Product Name =" + " "+ s1.Name);
        	System.out.println("\t  Product Prize =" + " " + s1.Quantity );
        	System.out.println("\t Product Prize = " +" "+ s1.Name);

    	}
    	else if (4==option) {
        	System.out.println("4. Delet Product");
    	}
    	else if (5==option){
        	System.out.println("Exit from Product Managemnt");
        	return;
    	}
    	else {
        	System.out.println("Option is invalid !!!");
    	}
    	}	
    }

}

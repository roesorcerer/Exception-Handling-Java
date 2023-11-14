package module3lab;

import java.util.Random;

/**
 * @author Rowan Stratton
 * Module 03 Assignment - Enable Exception Handling
 *
 */

public class ExceptionHandling {

   public static void main(String[] args) {
       
	   Random random = new Random(); //setting objects 
       int array[] = new int[1000];  //setting variables
       int max = 10000; 
       int min = 1;
       double average = 0;

       try {
    	   
    	   for (int a = 0; a <1000; a++) {
    		  array[a] = random.nextInt(max);//loop to grab 10000 random numbers. 
	    	   
	    	   
    	   }
       	       for (int a = 1; a < 1000; a++) {   //sorting the array. 
	           int sort = array[a]; 
	           int b = a - 1;
	           
	          
	           while (b >= 0 && array[b] > sort) { 
	               array[b + 1] = array[b]; 
	               b -= 1;
	           }
	           array[b + 1] = sort; 
	       }
       	       

	       max = array[array.length-1]; //max value
	       min = array[0];//min element 
	       average = array[0];//Average 
	
	       // Adding up each value from the array loop and determining the average. 
	       for (int a = 1; a < 1000; a++) {
	           average += array[a];
	           average = average / 1000;
	           
       }
	       System.out.println("The maximum randomly generated number is: " + max); //printing min max and average as per calculations above. 
	       System.out.println("The minimum randomly generated number is: " + min);
	       System.out.println("The average of all random numbers is: " + average);    
	       
	       }
       catch(Exception A) { //exception for try statement. Since there is no input from user this will not print. 
    	   
    	   System.out.print("Numbers incorrectly classified.");
    	   
       }
       finally { 
    	   System.out.println("Program ends.");    
       }
       		
   }	
       
   } 
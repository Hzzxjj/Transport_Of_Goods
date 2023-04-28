/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectccsw;

/**
 *
 * @author hanan
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class projectccsw {
    public static void main(String[] args) {
        
        
        //case1 sign in 
        //case 2 sign up
        //case 3 feature
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        int n = 0;
       
        do{
        System.out.println("Please enter your choice ");
                System.out.println("1- sign in ");
        System.out.println("2- sign up ");
        System.out.println("3- transportation and delivery dates ");
        System.out.println("4- Exit");

        n = in.nextInt();


       switch (n) {
                case 1:
        String username = "myusername";
        String password = "mypassword";
        
        System.out.print("Enter username: ");
        String enteredUsername = input.nextLine();
        
        System.out.print("Enter password: ");
        String enteredPassword = input.nextLine();
        
        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("Sign in successful!");
        } else {
            System.out.println("Invalid username or password.");
        }      

                    break;
                case 2:
      
        String confirmPassword;
        
        System.out.print("Enter username: ");
        username = input.nextLine();
        
        System.out.print("Enter password: ");
        password = input.nextLine();
        
        System.out.print("Confirm password: ");
        confirmPassword = input.nextLine();
        
        if (password.equals(confirmPassword)) {
            System.out.println("Sign up successful!");
        } else {
            System.out.println("Passwords do not match.");
        }
                    break;
                case 3:
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Enter transportation date (dd/MM/yyyy): ");
        LocalDate transportationDate = LocalDate.parse(input.nextLine(), formatter); 
        System.out.print("Enter delivery date (dd/MM/yyyy): ");
        LocalDate deliveryDate = LocalDate.parse(input.nextLine(), formatter);
        if (deliveryDate.isBefore(transportationDate)) {
            System.out.println("Invalid dates. Delivery date cannot be before transportation date.");
        } else {
            System.out.println("Transportation date: " + transportationDate.format(formatter));
            System.out.println("Delivery date: " + deliveryDate.format(formatter));        

        }        
       
                    break;
    
       case 4:
        System.out.print("Thanks for using our app");
        break;
        
         default:
                    System.out.println("Invalid input!");
                    break;
        
       } }  while (n != 4);

       
       
       }       
        
        }
      
	


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transp;

/**
 *
 * @author hanan
 */

import java.util.Scanner;


public class GoBox {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loggedIn = false;
        boolean registered = false;
        String username = "";
        String password = "";
        
        while (true) {
            System.out.println("Welcome to the Transportation Of Goods System!");
            System.out.println("1. Sign in");
            System.out.println("2. Sign up");
            System.out.println("3- transportation and delivery dates");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    if (registered) {
                        System.out.print("Enter your username: ");
                        String inputUsername = input.next();
                        System.out.print("Enter your password: ");
                        String inputPassword = input.next();
                        
                        if (inputUsername.equals(username) && inputPassword.equals(password)) {
                            System.out.println("You are now logged in!");
                            loggedIn = true;
                        } else {
                            System.out.println("Incorrect username or password.");
                        }
                    } else {
                        System.out.println("You need to sign up first.");
                    }
                    break;
                case 2:
                    System.out.print("Enter your desired username: ");
                    username = input.next();
                    System.out.print("Enter your desired password: ");
                    password = input.next();
                    registered = true;
                    System.out.println("You are now registered!");
                    break;
                case 3:
                    
     System.out.println("Welcome back, " + username + "!");
                System.out.println("What is your address?");
                String address = input.next();
                System.out.println("What is the received date?");
                String receivedDate = input.next();
                System.out.println("What is the time of receipt?");
                String timeOfReceipt = input.next();
                System.out.println("Are you an individual or a company?");
                String userType = input.next();   
                   
                    
                case 4:
       System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                    
 
                   
                    
                    
                default:
                    System.out.println("Invalid choice.");
                    break;
                    
       
                    
            }
            
       
                
                
                
            }
        }
    }



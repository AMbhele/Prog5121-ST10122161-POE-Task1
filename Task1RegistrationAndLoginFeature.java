/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.pkg1.registration.and.login.feature;

import java.util.Scanner;

/**
 *
 * @author mvelo
 */
public class Task1RegistrationAndLoginFeature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        String userName;
        String password;
        // to keep count 
        int upperCount=0;
       int digitCount=0;
       
       
       
         // constants
     final  int upperCountLimit = 5;
     final  int underscoreCountLimit=1;
    final   int digitCountLimit = 3;
       
       
        
      Scanner kb= new Scanner(System.in);
       System.out.println("Enter your username");
        userName=kb.nextLine();
        
         
        System.out.println(" Enter the password");
        // save it 
        password=kb.nextLine();
        
        // checks for each bit-->password break it up-->add it to the count 
        int stringLength=password.length(); // finds out the size of the word
        // now take each character and check it
        
        for (int i = 0; i < stringLength; i++) {
            
            char vChar=password.charAt(i);
            
            if (Character.isUpperCase(vChar))upperCount ++;
            
            else if (Character.isDigit(vChar)) digitCount ++;
            
        }
       
            // if itmeets all requirements?
            
            if(upperCount>=upperCountLimit && digitCount>=digitCountLimit)
            System.out.println("You can enter");
           
            else
            {
                // if its wrong--> build onto it 
               
               System.out.println("You can not enter ");     
               System.out.println("Password does not meet the requirements:\n");
                if(upperCount<upperCountLimit)  {
                   System.out.println("Not enough lower case letters");}
                if (digitCount<digitCountLimit){
                   System.out.println("Not enough digits");}
                
                if Username.contains("_");
      
            }
       }
       
       
       
    }
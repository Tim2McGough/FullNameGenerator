package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FullNameApplication {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       String firstName= "";
       String middleName = "";
       String lastName = "";
       String suffix = "";
       System.out.println("Hello. Please enter your full name: ");
       String fullName = keyboard.nextLine();
       String []parts = fullName.split(Pattern.quote(" "));
       if (parts.length ==2){
           firstName=parts[0];
           lastName=parts[1];
           System.out.print("First Name:");
           System.out.println(parts[0]);
           System.out.print("Last Name: ");
           System.out.println(parts[1]);
       } else if ( parts.length ==3) {
           System.out.print("First Name:");
           System.out.println(parts[0]);
           System.out.print("Middle Name: ");
           System.out.println(parts[1]);
           System.out.print("Last Name: ");
           System.out.println(parts[2]);
       } else{ System.out.print("First Name:");
           System.out.println(parts[0]);
           System.out.print("Middle Name: ");
           System.out.println(parts[1]);
           System.out.print("Last Name: ");
           System.out.println(parts[2]);
           System.out.print("Suffix: ");
           System.out.println(parts[3]);
           

       }


    }
}

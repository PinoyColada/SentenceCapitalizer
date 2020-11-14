package com.Hatamosa;


/*
Authors: Ryan Hatamosa
*/
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // prompts the user what the program will do
        System.out.println("This program will return each sentence you typed with a capitalized first letter of the first word!");
        System.out.println("Please, enter a string: ");
        // allows user to input string
        String s = input.nextLine();

        // Variable result gets from method capitalizedWord
        String result = capitalizedWord(s);
        System.out.println(result);

        // ends program
        input.close();

    }

    // method capitalizedWord is created with parameter string "s"
    public static String capitalizedWord(String s){
        String str ="";
        boolean found = false;
        for(int i=0; i<s.length(); i++){
            // char variable "ch" is created with the value of the first letter of the word
            char ch = s.charAt(i);
            if(i == 0 || (found && ch != ' ')){
                // makes the first word of the string, first letter "ch" capitalized
                str = str + String.valueOf(ch).toUpperCase();
                found = false;
            }
            else{
                // the "."" marks the end of the sentence
                if(ch == '.'){
                    found = true;
                    // returns the toUpperCase string and period
                } str = str + ch;
            }
        }
        // returns value to class main
        return str;
    }
    
}

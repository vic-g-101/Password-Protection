/*
 * This is a program that evaluates the strength of your
 * password.
 */

import java.util.Scanner;

public class PasswordSecurity {
    public static void main(String args[] ) {
        Scanner input = new Scanner(System.in);

    System.out.print("Please enter a password: " );

        final int UPPERCASE = 1;
        final int LOWERCASE = 1;
        final int SYMBOLS = 1;
        final int NUMBERS = 1;

        String password = input.nextLine();
        int length = password.length();
        int k = password.length() % 10; 
        if (length < 8 ){
            System.out.println("Password is too short");
            System.exit(0);
        }
        System.out.print("Password strength: ");
        
        int uppercase_count = 0;
        int lowercase_count = 0;
        int symbols_count = 0;
        int numbers_count = 0;

        for (int i = 0; i < length; i++){
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch))
            uppercase_count++;
            else if (Character.isLowerCase(ch))
            lowercase_count++;
            else if (Character.isDigit(ch))
            numbers_count++;
            else {
            symbols_count++;
            }
            

        }
        if (uppercase_count >= UPPERCASE && lowercase_count < LOWERCASE && 
        numbers_count < NUMBERS && symbols_count < SYMBOLS){
                System.out.println("very weak");
                System.out.print("Here is a suggested stronger password: ");
        }
            else if (uppercase_count < UPPERCASE && lowercase_count >= LOWERCASE && 
            numbers_count < NUMBERS && symbols_count < SYMBOLS){
                System.out.println("very weak");
                System.out.print("Here is a suggested stronger password: "); 
            }
            else if (uppercase_count < UPPERCASE && lowercase_count < LOWERCASE && 
            numbers_count >= NUMBERS && symbols_count < SYMBOLS){
                System.out.println("very weak");
                System.out.print("Here is a suggested stronger password: ");
             }
            else if (uppercase_count < UPPERCASE && lowercase_count < LOWERCASE &&
            numbers_count < NUMBERS && symbols_count >= SYMBOLS){
                System.out.println("very weak");
                System.out.print("Here is a suggested stronger password: ");
            }

        else if (uppercase_count >= UPPERCASE && lowercase_count >= LOWERCASE && 
        numbers_count < NUMBERS && symbols_count < SYMBOLS){
                System.out.println("weak");
                System.out.print("Here is a suggested stronger password: ");
        }
             else if (uppercase_count >= UPPERCASE && lowercase_count < LOWERCASE && 
             numbers_count >= NUMBERS && symbols_count < SYMBOLS){
                System.out.println("weak");
                System.out.print("Here is a suggested stronger password: ");
            }
             else if (uppercase_count >= UPPERCASE && lowercase_count < LOWERCASE && 
             numbers_count < NUMBERS && symbols_count >= SYMBOLS){
                System.out.println("weak");
                System.out.print("Here is a suggested stronger password: ");
            }
            else if (uppercase_count < UPPERCASE && lowercase_count < LOWERCASE && 
            numbers_count >= NUMBERS && symbols_count >= SYMBOLS){
                System.out.println("weak");
                System.out.print("Here is a suggested stronger password: ");
                }
            else if (uppercase_count < UPPERCASE && lowercase_count >= LOWERCASE && 
            numbers_count >= NUMBERS && symbols_count < SYMBOLS){
                System.out.println("weak");
                System.out.print("Here is a suggested stronger password: ");
                    }
            else if (uppercase_count < UPPERCASE && lowercase_count >= LOWERCASE && 
            numbers_count < NUMBERS && symbols_count >= SYMBOLS){
                System.out.println("weak");
                System.out.print("Here is a suggested stronger password: ");
                        } 

        else if (uppercase_count >= UPPERCASE && lowercase_count >= LOWERCASE && 
        numbers_count >= NUMBERS && symbols_count < SYMBOLS){
                System.out.println("medium");
                System.out.print("Here is a suggested stronger password: ");
         }
            else if (uppercase_count >= UPPERCASE && lowercase_count >= LOWERCASE && 
            numbers_count < NUMBERS && symbols_count >= SYMBOLS){
                System.out.println("medium");
                System.out.print("Here is a suggested stronger password: ");
            }
            else if (uppercase_count >= UPPERCASE && lowercase_count < LOWERCASE && 
            numbers_count >= NUMBERS && symbols_count >= SYMBOLS){
                System.out.println("medium");
                System.out.print("Here is a suggested stronger password: ");
            }
            else if (uppercase_count < UPPERCASE && lowercase_count >= LOWERCASE && 
            numbers_count >= NUMBERS && symbols_count >= SYMBOLS){
                System.out.println("medium");
                System.out.print("Here is a suggested stronger password: ");
            }
            else{
                System.out.println("strong");
        }


        // THE RULES AND STUFF
        if (uppercase_count + lowercase_count < 2 && symbols_count <= 0){
        System.out.print("Cse");
        }
        if (symbols_count <=0 ){
            String new_password = password.concat("@!");
            System.out.print(new_password);
            }
        if (lowercase_count <= 0){
            for (int i = 0; i < password.length(); i++){
            if (Character.isUpperCase(password.charAt(i))){
           int uppercase_position = password.indexOf(i);
            System.out.print(Character.toLowerCase(uppercase_position));
            }
        }
        }
    }
}
    

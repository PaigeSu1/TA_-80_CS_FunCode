//This is normally were you will put in what your code does
//import Statements will always go here
//This is a comment line
/*
This is a comment block
 */

public class Main {
    public static void main(String[] args) {

        int c = 1234; //initializing a variable of type int
        System.out.printf("c is: %d\n", c);

        // Extract digits in reverse order
        //The First Digit
        int first_digit = c % 10;
        System.out.printf("First digit: %d\n", first_digit);


        //The Second Digit
        int second_digit = (c / 10) % 10;
        System.out.printf("Second digit: %d\n", second_digit);


        //The Third Digit
        int third_digit = (c / 100) % 10;
        System.out.printf("Third digit: %d\n", third_digit);


        //The Fourth Digit
        int fourth_digit = (c / 1000) % 10;
        System.out.printf("Fourth digit: %d\n", fourth_digit);


        // Combine the digits to form the reversed number
        int reversed = first_digit * 1000 + second_digit * 100 + third_digit * 10 + fourth_digit;
        System.out.println("Reversed number: " + reversed);
    }
}

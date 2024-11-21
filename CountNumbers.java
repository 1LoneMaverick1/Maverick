package Count_Numbers;

import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter an integer: ");//User input message.
        int number = s.nextInt();//Taking the User input.

        int count = countNumbers(number);//Calling the countDigi
        System.out.println("The number of digits in the given integer is: " + count);
    }

    public static int countNumbers(int num) {
        
        if (num == 0) {
            return 1; // Special case for 0
        }

        int count = 0;
        while (num > 0) {
            count++;
            num /= 10; //To remove the last digits.
        }
        return count;
    }
}

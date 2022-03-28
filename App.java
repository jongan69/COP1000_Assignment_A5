package build;

import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("A5 Assignnment Code");
        System.out.println("Enter your first number:");
        Scanner inp = new Scanner(System.in);
        int num1;
        // Input
        num1 = inp.nextInt();
        // Initialize Array
        int i = 0;
        int ar[] = { num1 };
        int numArray[] = new int[num1];
        // For each input
        while (num1 != 19) {
            // If !19, push element to array
            if (num1 != 19) {
                numArray[i++] = num1;
                System.out.println("Array is now: " + Arrays.toString(numArray));
                // Get annd set new Input
                System.out.println("Enter your next number:");
                Scanner inp2 = new Scanner(System.in);
                num1 = inp2.nextInt();
            }

            // output sum as result
            if (num1 == 19) {
                int total = 0;
                for (int x = 0; x < numArray.length; x++) {
                    total = total + numArray[x];
                }
                System.out.println("Array Total is: " + total);
            }
           
        }
    }
}

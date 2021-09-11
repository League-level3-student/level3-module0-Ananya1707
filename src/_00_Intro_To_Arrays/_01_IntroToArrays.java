package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
        String[] colors = new String[5];
        //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
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Yellow";
        colors[3] = "Green";
        colors[4] = "Blue";

        // 2. print the third element in the array
        System.out.println(colors[3]);

        // 3. set the third element to a different value
        colors[3] = "Purple";

        // 4. print the third element again
        System.out.println(colors[3]);

        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
        for(int i = 0; i < colors.length; i++){
        	colors[i] = "Pink";
        }

        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
        for(int i = 0; i < colors.length; i++){
        	System.out.println(colors[i]);
        }

        // 7. make an array of 50 integers
        int[] integers = new int[50];


        // 8. use a for loop to make every value of the integer array a random
        //    number
        Random r = new Random();
        
        for(int i = 0; i < integers.length; i++){
        	integers[i] = r.nextInt(50);
        }

        // 9. without printing the entire array, print only the smallest number
        //    on the array     
        int smallestNum = integers[0];
        for(int i = 1; i < integers.length; i++){
        	if(integers[i] <= smallestNum) {
        		smallestNum = integers[i];
        	}
        }
        System.out.println("smallest number: " + smallestNum);
        

        // 10 print the entire array to see if step 8 was correct
        for(int i = 0; i < integers.length; i++){
        	System.out.println(integers[i]);
        }

        // 11. print the largest number in the array.
        int largestNum = integers[0];
        for(int i = 1; i < integers.length; i++){
        	if(integers[i] >= largestNum) {
        		largestNum = integers[i];
        	}
        }
        System.out.println("largest number: " + largestNum);
        

        // 12. print only the last element in the array
        System.out.println("last element: " + integers[49]);

    }
}

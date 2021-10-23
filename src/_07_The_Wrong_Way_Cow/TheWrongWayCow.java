/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

import java.util.Arrays;

public class TheWrongWayCow {

    public static int[] findWrongWayCow(final char[][] field) {
        // Fill in the code to return the [col, row] coordinate position of the
        // head (letter 'c') of the wrong way cow!
        int[] count = {0,0,0,0};
        int[] wrongWayCow = new int[2];
        int[][] rowcol = new int[4][2];
    
    	 for(int row = 0; row < field.length; row++) {
             for(int col = 0; col < field[row].length; col++) {
            	 if(field[row][col] == 'c') {
            		 if(col < field[row].length - 2) {
            			//left to right
                		 if(field[row][col+1] == 'o') {
                			 if(field[row][col+2] == 'w') {
                				 count[0]+=1;
                				 if(count[0] == 1) {
                					 rowcol[0][0]=col;
                					 rowcol[0][1]=row;

                				 }
                			     				 

                			 }
                		 }
            		 }
            	     
            		 if(col > 1) {
            			//right to left
            			 if(field[row][col-1] == 'o') {
                			 if(field[row][col-2] == 'w') {
                				 count[1]+=1;
                				 if(count[1] == 1) {
                					 rowcol[1][0]=col;
                					 rowcol[1][1]=row;

                				 }
                				 
                			 }
                		 }
            		 }
            		
            		 if(row > 1) {
            			//down to up
                		 if(field[row-1][col] == 'o') {
                			 if(field[row-2][col] == 'w') {
                				 count[2]+=1;
                				 if(count[2] == 1) {
                					 rowcol[2][0]=col;
                					 rowcol[2][1]=row;

                				 }
                				 
                			 }
                		 }
            		 }
            		
            		 if(row < field.length - 2) {
            			//up to down
                		 if(field[row+1][col] == 'o') {
                			 if(field[row+2][col] == 'w') {
                				 count[3]+=1;
                				 if(count[3] == 1) {
                					 rowcol[3][0]=col;
                					 rowcol[3][1]=row;

                				 }
                				 
                			 }
                		 }
            		 }
            	 }
            	 
            	
            	 
             }
    	 }
    	 
    	 if(count[0] == 1) {
    		 wrongWayCow[0]= rowcol[0][0];
			 wrongWayCow[1]= rowcol[0][1];
    		 
    	 }
    	 else if(count[1] == 1) {
    		 wrongWayCow[0]= rowcol[1][0];
			 wrongWayCow[1]= rowcol[1][1];
    		 
    	 }
    	 else if(count[2] == 1) {
    		 wrongWayCow[0]= rowcol[2][0];
			 wrongWayCow[1]= rowcol[2][1];
    		 
    	 }
    	 else if(count[3] == 1) {
    		 wrongWayCow[0]= rowcol[3][0];
			 wrongWayCow[1]= rowcol[3][1];
    		 
    	 }
    	 
    	 System.out.println(Arrays.toString(wrongWayCow));
    	 return wrongWayCow;

    }
}

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

public class TheWrongWayCow {

    public static int[] findWrongWayCow(final char[][] field) {
        // Fill in the code to return the [col, row] coordinate position of the
        // head (letter 'c') of the wrong way cow!
        int[] count = new int[4];
        int[] wrongWayCow = new int[2];
    
    	 for(int row = 0; row < field.length; row++) {
             for(int col = 0; col < field[row].length; col++) {
            	 if(field[row][col] == 'c') {
            		 if(col < field[row].length - 2) {
            			//left to right
                		 if(field[row][col+1] == 'o') {
                			 if(field[row][col+2] == 'w') {
                				 count[0]+=1;
                				 wrongWayCow[0] = row;
                				 wrongWayCow[1] = col;       				 

                			 }
                		 }
            		 }
            	     
            		 if(col > 1) {
            			//right to left
            			 if(field[row][col-1] == 'o') {
                			 if(field[row][col-2] == 'w') {
                				 count[1]+=1;
                				 wrongWayCow[0] = row;
                				 wrongWayCow[1] = col;
                				 
                			 }
                		 }
            		 }
            		
            		 if(row > 1) {
            			//down to up
                		 if(field[row-1][col] == 'o') {
                			 if(field[row-2][col] == 'w') {
                				 count[2]+=1;
                				 wrongWayCow[0] = row;
                				 wrongWayCow[1] = col;
                				 
                			 }
                		 }
            		 }
            		
            		 if(row < field.length - 2) {
            			//down to up
                		 if(field[row+1][col] == 'o') {
                			 if(field[row+2][col] == 'w') {
                				 count[3]+=1;
                				 wrongWayCow[0] = row;
                				 wrongWayCow[1] = col;
                				 
                			 }
                		 }
            		 }
            		
            		             		 
            	 }
             }
        }
    	 
    	 return wrongWayCow;
    		 
    		 
    	 
//    	 for(int i = 0; i<count.length; i++){
//			 if(count[i] == 1) {
//				 return wrongWayCow;
//		    	
//			 }
//			 else {
//				 return null;
//			 }
			 
		}


    }


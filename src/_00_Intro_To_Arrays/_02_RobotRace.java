package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
    public static void main(String[] args) {
    	Random random = new Random();
        boolean race = true;
        int winner = 0;

        // 2. create an array of 5 robots.
        Robot[] robots = new Robot[3];
        int[] degree = new int[3];

        // 3. use a for loop to initialize the robots. 
        for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot("mini");
			robots[i].setSpeed(100);
		}
        		
        // 4. make each robot start at the bottom of the screen, side by side, facing up
        for (int i = 0; i < robots.length; i++) {
        	robots[i].setY(300);
			robots[i].setX(100 + i*(700/robots.length));
		}
    
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
        
        while(race == true) {
        	for (int i = 0; i < robots.length; i++) {
        		//for(int j = 0; j < random.nextInt()) {
        		//	robots[i].move(1);
        		//	robots[i].microTurn(1);
        		//}

        		if(robots[i].getY() <= 15) {
        			winner = i;
        			race = false;
        		}
            }

        }
            
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
    
        // 7. declare that robot the winner and throw it a party!
        System.out.println("robot " + winner + " is the winner!!!");

  
        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.
    }

}

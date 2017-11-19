
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	static Robot rob = new Robot();
	public static void main(String[] args) {
		
		// 1. Set the X position of the robot so that it starts on the left.
		rob.setAngle(-90);
		// You also need to show the robot to see the result of this line.

		// 2. Make the robot draw a star shape. Hint: 144.
         rob.setSpeed(10);
     	rob.penDown();
		star(5);
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}
	
	static void star(int num) {
		for (int i = 0; i < num ; i++) {
	 
    rob.move(100);
    rob.setAngle(144);}
	}
}

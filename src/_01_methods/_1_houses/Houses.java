package _01_methods._1_houses;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {

	public void run() {
		Robot rob = new Robot();
		rob.setSpeed(500);
		rob.setX(50);
		rob.setY(300);
		for(int i=0;i<10;i++) {
			String color = JOptionPane.showInputDialog("Do you want a yellow house, a green house, a blue house, or a red house?");
			String size = JOptionPane.showInputDialog("Do you want a small, medium, or large house?");
			String roof = JOptionPane.showInputDialog("Do you want a flat or peak roof?");
			building(roof,size,color,rob);
		}
	}
	static void pointyRoof(Robot rob) {
		rob.turn(45);
		rob.move(28);
		rob.turn(90);
		rob.move(28);	
	}
	static void flatRoof(Robot rob) {
		rob.turn(90);
		rob.move(20);
		rob.turn(90);
	}
	static void building(String roof, String size, String col, Robot rob) {
		rob.penDown();
		if(col.equals("red")) {
			rob.setPenColor(255,0,0);
		}
		if(col.equals("blue")) {
			rob.setPenColor(0,0,255);
		}
		if(col.equals("green")) {
			rob.setPenColor(0,255,0);
		}
		if(col.equals("yellow")) {
			rob.setPenColor(255,255,0);
		}
		if(size.equals("small")) {
			rob.setAngle(0);
			rob.move(60);
			if(roof.equals("flat")) {
				flatRoof(rob);
			} else {
				pointyRoof(rob);
			}	
			rob.setAngle(180);
			rob.move(60);
			rob.turn(-90);
			rob.setPenColor(0,255,0);
			rob.move(20);
		}
		if(size.equals("medium")) {
			rob.setAngle(0);
			rob.move(125);
			if(roof.equals("flat")) {
				rob.turn(90);
				rob.move(20);
				rob.turn(90);
			} else {
				rob.turn(45);
				rob.move(28);
				rob.turn(90);
				rob.move(28);
			}
			rob.setAngle(180);
			rob.move(125);
			rob.turn(-90);
			rob.setPenColor(0,255,0);
			rob.move(20);
		}
		if(size.equals("large")) {
			rob.setAngle(0);
			rob.move(200);
			if(roof.equals("flat")) {
				rob.turn(90);
				rob.move(20);
				rob.turn(90);
			} else {
				rob.turn(45);
				rob.move(28);
				rob.turn(90);
				rob.move(28);
			}
			rob.setAngle(180);
			rob.move(200);
			rob.turn(-90);
			rob.setPenColor(0,255,0);
			rob.move(20);
		}
	}
}

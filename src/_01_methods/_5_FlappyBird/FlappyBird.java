package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
	static final int WIDTH = 800;
	static final int HEIGHT = 600;
	int pg = (int) random(150,250);
	int px = 799;
	int x = 150;
	int y = 300;
	int py = 533;
	int pz = 267;
	int uph = (int) random(100,200);
	int uph1 = (int) random(100,200);
	int uph2 = (int) random(100,200);
	int velocity = -12;
	int gravity = 1;

	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {

	}

	@Override
	public void draw() {
		background(173,216,230);
		fill(255,255,0);
		strokeWeight(2);
		ellipse(x,y,50,50);
		y+=velocity;
		velocity+=gravity;
		fill(50,255,0);
		rect(px,0,50,uph);
		rect(px,uph+pg,50,600-(uph+pg));
		rect(pz,0,50,uph1);
		rect(pz,uph1+pg,50,600-(uph1+pg));
		rect(py,0,50,uph2);
		rect(py,uph2+pg,50,600-(pg+uph2));
		px -= 5;
		py -= 5;
		pz -= 5;
		if(px < -50) {
			px = 799;
		uph = (int) random(100,400);	
		}
		if(py < -50) {
			py = 799;
		uph2 = (int) random(100,400);
		}
		if(pz < -50) {
			pz = 799;
		uph1 = (int) random(100,400);
		}
	}

	public void mousePressed() {
		velocity = -15;	
	}

	static public void main(String[] args) {
		PApplet.main(FlappyBird.class.getName());
	}
}

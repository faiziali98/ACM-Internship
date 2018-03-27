/*
 * File: Breakout.jav;
 * -------------------
 * Name:
 * Section Leader:
 * 
 * This file will eventually implement the game of Breakout.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class Breakout extends GraphicsProgram {

/** Width and height of application window in pixels */
	public static final int APPLICATION_WIDTH = 400;
	public static final int APPLICATION_HEIGHT = 600;

/** Dimensions of game board (usually the same) */
	private static final int WIDTH = APPLICATION_WIDTH;
	private static final int HEIGHT = APPLICATION_HEIGHT;

/** Dimensions of the paddle */
	private static final int PADDLE_WIDTH = 60;
	private static final int PADDLE_HEIGHT = 10;

/** Offset of the paddle up from the bottom */
	private static final int PADDLE_Y_OFFSET = 30;

/** Number of bricks per row */
	private static final int NBRICKS_PER_ROW = 10;

/** Number of rows of bricks */
	private static final int NBRICK_ROWS = 10;

/** Separation between bricks */
	private static final int BRICK_SEP = 4;

/** Width of a brick */
	private static final int BRICK_WIDTH =(WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;


/** Height of a brick */
	private static final int BRICK_HEIGHT = 8;

/** Radius of the ball in pixels */
	private static final int BALL_RADIUS = 10;

/** Offset of the top brick row from the top */
	private static final int BRICK_Y_OFFSET = 70;

/** Number of turns */
	private static final int NTURNS = 3;
	
	 private static final int DELAY = 20;
/** Runs the Breakout program. */
	 
	 public void run() {
	        
		 String[] redy={"Ready","Get","Set","Go"};
		 
		 for (int i=0; i<4;i++)
		 {
			 add (img3);
		    GLabel nTurns = new GLabel(redy[i]);
	        nTurns.setLocation(WIDTH/2 - nTurns.getWidth()/2, HEIGHT/2 - 2 * BALL_RADIUS);
	        nTurns.setFont(new Font("Serif", Font.BOLD, 22));
            nTurns.setColor(Color.blue);
	        add(nTurns);
	        pause(1000);
	        remove(nTurns);
		 }
	       addMouseListeners();
	        Graphics();
	        play();
	        
	 }
	        
	    
	 GImage img = new GImage("images.png");
	 GImage img1 = new GImage("img.png");
	 GImage img2 = new GImage("img2.png");
	 GImage img3 = new GImage("img3.png");
	    
	 private void Graphics() {
	        
		 	remove(img3);
		 	add(img);
	        cBricks(); 
	        cPaddle();
	        cBall();
	        bck.loop();
	    }
	 
	 private GRect brick;
	 private GRect paddle; 
	 private GOval ball;
	
	    
	    private void cBricks() {
	        
	        for (int i = 0; i < NBRICK_ROWS; i++)
	            for (int j = 0; j < NBRICKS_PER_ROW; j++) {
	                brick = new GRect(WIDTH/2 - (NBRICKS_PER_ROW * BRICK_WIDTH + (NBRICKS_PER_ROW - 1) * BRICK_SEP)/2 + j*(BRICK_WIDTH + BRICK_SEP), BRICK_Y_OFFSET + i*(BRICK_HEIGHT + BRICK_SEP), BRICK_WIDTH, BRICK_HEIGHT );
	                brick.setFilled(true);
	            
	                if (i == 0 || i == 1)
	                    brick.setFillColor(Color.RED);
	                else if (i == 2 || i == 3)
	                    brick.setFillColor(Color.ORANGE);
	                else if (i == 4 || i == 5)
	                    brick.setFillColor(Color.YELLOW);
	                else if (i == 6 || i == 7)
	                    brick.setFillColor(Color.GREEN);
	                else if (i == 8 || i == 9)
	                    brick.setFillColor(Color.CYAN);
	            
	                add(brick);
	            }
	        
	    }
	    
	    private void cPaddle() {
	        
	        paddle = new GRect(WIDTH/2 - PADDLE_WIDTH/2, HEIGHT - PADDLE_Y_OFFSET - PADDLE_HEIGHT, PADDLE_WIDTH, PADDLE_HEIGHT);
	        paddle.setFilled(true);
	        add(paddle);
	        
	    }
	    
	    private void cBall() {
	        
	        ball = new GOval(WIDTH/2 - BALL_RADIUS, HEIGHT/2 - BALL_RADIUS, 2 * BALL_RADIUS, 2 * BALL_RADIUS);
	        ball.setFilled(true);
	        add(ball);
	        
	    }
	    
		private int nBricks=100;
		private int nTurns=NTURNS;
		
		public void mouseMoved(MouseEvent event) {
			if ((event.getX() < getWidth() - PADDLE_WIDTH/2) && (event.getX() > PADDLE_WIDTH/2)) {
				paddle.setLocation(event.getX() - PADDLE_WIDTH/2, getHeight() - PADDLE_Y_OFFSET - PADDLE_HEIGHT);
			}
		}
		private GLabel missed1= new GLabel("Score : "+(100-nBricks));
		private GLabel missed2= new GLabel("Turns Left : "+nTurns);
		 private void play()
		 {
			 setupVelocity();
			 while (nTurns > 0 && nBricks > 0) {
		            moveBall();
		            checkForCollision();
		            remove(missed1);
		            missed1 = new GLabel("Score : "+(100-nBricks));
		            missed1.setLocation(WIDTH/2 - missed1.getWidth()/2, HEIGHT/2 - 2 * BALL_RADIUS);
		            missed1.setFont(new Font("Serif", Font.BOLD, 22));
		            missed1.setColor(Color.blue);
		            add(missed1);
		            remove(missed2);
		            missed2 = new GLabel("Turns Left : "+nTurns);
		            missed2.setLocation(WIDTH/2 - missed1.getWidth()/2-10, HEIGHT/2 - 2 * BALL_RADIUS+40);
		            missed2.setFont(new Font("Serif", Font.BOLD, 22));
		            missed2.setColor(Color.blue);
		            add(missed2);
		            
		            if (nBricks ==10||nBricks ==20||nBricks ==30||nBricks ==40||nBricks ==50||nBricks ==60||nBricks ==70||nBricks ==80||nBricks ==90)
		            {
		            	vy=vy+0.1;
		            	vx=vx+0.1;
		            			
		            }
		            pause(DELAY);
		        }
			 if (nTurns == 0 && nBricks != 0)
			 {bck = MediaTools.loadAudioClip("mute.wav");
			 
			 remove(img);
			 add(img1);}
			 else if (nTurns !=0  && nBricks == 0)
			 {bck = MediaTools.loadAudioClip("mute.wav");
			 bck.loop();
			 remove(img);
			 add(img2);
			 victory.play();}
		 }
		private double vx;
		private double vy=3.0;
		
		private RandomGenerator rgen = new RandomGenerator();
		
		private void setupVelocity() {
	        
	        vx = rgen.nextDouble(1.0, 3.0);
	        if (rgen.nextBoolean())
	            vx = -vx;

	    } 
		private void moveBall() {
	        
	        ball.move(vx, vy);
	        
	    }
		
		private void checkForCollision() {
	        
	        checkForWall();
	        checkForObject();
	        
	    }
		
		private double xPaddle;
		
		 private void checkForWall() {
		       
		        if (ball.getX() + 2 * BALL_RADIUS > WIDTH) {
		            vx = -vx;
		            double x = ball.getX() + 2 * BALL_RADIUS - WIDTH;
		            ball.move(-2 * x, 0);
		        } else
		        
		        if (ball.getX() < 0) {
		            vx = -vx;
		            double x = -ball.getX();
		            ball.move(2 * x, 0);
		        } else
		        
		        if (ball.getY() < 0) {
		            vy = -vy;
		            double x = -ball.getY();
		            ball.move(0, 2 * x);
		        } else
		        
		        if (ball.getY() + 2 * BALL_RADIUS > HEIGHT) {
		        	
		            nTurns=nTurns-1;
		            remove (missed1);
		            GLabel missed = new GLabel("Oops! You missed the ball.");
		            missed.setLocation(WIDTH/2 - missed.getWidth()/2-40, HEIGHT/2 - 2 * BALL_RADIUS);
		            missed.setFont(new Font("Serif", Font.BOLD, 22));
		            missed.setColor(Color.blue);
		            add(missed);
		            pause(2000);
		            remove(missed);
		            ball.setLocation(WIDTH/2 - BALL_RADIUS, HEIGHT/2 - BALL_RADIUS);
		            play();
		            
		        }
		        
		    
		 }
		 AudioClip bounceClip = MediaTools.loadAudioClip("bounce.au");
		 AudioClip victory = MediaTools.loadAudioClip("vic.wav");
		 AudioClip bck = MediaTools.loadAudioClip("bck.wav");

		 
		 private void checkForObject() {

		        GObject collider = getCollidingObject();
		        
		        if (collider == null) { } 
		        
		        else if (collider != paddle && collider!=missed1 && collider!=img&& collider!=missed2&& collider!=img1) {
		            
		            vy = -vy;
		            bounceClip.play();
		            remove(collider);
		            nBricks--;
		                
		        }
		            
		        else if (collider == paddle) {
		                
		            vy = -vy;
		            bounceClip.play();
		            
		            if (xPaddle < 12)
		                vx = 6;
		            else if (xPaddle >= 12 && xPaddle < 24)
		                vx = 4;
		            else if (xPaddle >= 24 && xPaddle < 36)
		                vx += 0;
		            else if (xPaddle >= 36 && xPaddle < 48)
		                vx = -4;
		            else if (xPaddle >=48)
		                vx = -6;
		           
		        }
		        
		    }
		   
		    private GObject getCollidingObject() {
		        
		        GObject object;
		        object = getElementAt(ball.getX(), ball.getY());
		        
		        if (object != null) {
		            return object;
		        } else {
		            object = getElementAt(ball.getX() + 2 * BALL_RADIUS, ball.getY());
		            if(object != null) {
		                return object;
		            } else {
		                object = getElementAt(ball.getX() + 2 * BALL_RADIUS, ball.getY() + 2 * BALL_RADIUS);
		                if(object != null) {
		                    xPaddle = paddle.getX() + PADDLE_WIDTH - ball.getX() + BALL_RADIUS;
		                    return object;
		                } else {
		                    object = getElementAt(ball.getX(), ball.getY() + 2 * BALL_RADIUS);
		                    if(object != null) {
		                        xPaddle = paddle.getX() + PADDLE_WIDTH - ball.getX() + BALL_RADIUS;
		                    }
		                        return object;
		                }
		            }
		        }
		    }
}

	    
	    
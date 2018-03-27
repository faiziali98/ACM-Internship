import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.*;
import java.awt.*;


public class Game extends JFrame {
Panel panel;

	public Game(){

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640,480);
        setResizable(false); 
        setLocationRelativeTo(null);
        setTitle("Game v2");
        panel= new Panel(this);
        this.add(panel);
        setVisible(true);
        start();

	}

    public void start(){
        Thread t=Thread.currentThread();
        while(true){
            try {
                t.sleep(50);
                int[] j=panel.move(5,5);
                panel.repaint();
        } catch(Exception e){
          System.out.println("Error");   
        }
    }
}

    public static void main(String[] args) {

        new Game();
        
    }

}
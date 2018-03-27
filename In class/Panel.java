import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    JFrame frame;
    Graphics2D g2d;
    BufferedImage buff;
    ImageIcon ii;
    ImageIcon ii2;
    Image bg;
    Image ball;
    int x;
    int y;

    public Panel(JFrame f){
        frame = f;
        buff = new BufferedImage(frame.getWidth(), frame.getHeight(),BufferedImage.TYPE_INT_RGB);
        g2d = buff.createGraphics();

        //Adds black background
        ii = new ImageIcon(this.getClass().getResource("black.jpg"));
        bg = ii.getImage();
        g2d.drawImage(bg,0,0,frame.getWidth(),frame.getHeight(),frame);

        //add a ball
        ii2 = new ImageIcon(this.getClass().getResource("ball.jpg"));
        ball = ii2.getImage();
        g2d.drawImage(ball,0,0,50,40,frame);
        x=0;
        y=0;
    }

    public int[] move(int a, int b){
        int[] k={a,b};
        x+=a;
        y+=b;
        g2d.drawImage(bg,0,0,frame.getWidth(),frame.getHeight(),frame);
        g2d.drawImage(ball,x,y,50,40,frame);
        return k;

    }

    public void paint(Graphics g)
    {
        ((Graphics2D)g).drawImage(buff,0,0,frame);
    }

}
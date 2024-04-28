import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Label;

public class GUI2 {
    public static void main(String[] args){


        JFrame frame = new JFrame(); // CREATES A FRAME
        frame.setSize(500,500); // set x,y dimension
        frame.setResizable(false); //prevent frame from being resized
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // WHEN YOU CLICK THE X IT WILL CLOSE APP
        frame.setTitle("JFrame title goes here"); //sets title of frame
        frame.setVisible(true); // make frame visible

        

        ImageIcon image = new ImageIcon("https://www.google.com/imgres?q=4g%20capital&imgurl=https%3A%2F%2Fkenyanwallstreet.com%2Fwp-content%2Fuploads%2F2020%2F12%2F4G-Capital.png&imgrefurl=https%3A%2F%2Fkenyanwallstreet.com%2F4g-capital-hits-1-millionth-loan-for-msmes%2F4g-capital%2F&docid=xKQ2DyMp-EcoxM&tbnid=BEv8hCzUrIR5nM&vet=12ahUKEwjAucqGguOFAxW5wAIHHSzrAvAQM3oECFwQAA..i&w=1397&h=776&hcb=2&ved=2ahUKEwjAucqGguOFAxW5wAIHHSzrAvAQM3oECFwQAA");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(java.awt.Color.ORANGE); // background color
        

        JLabel label = new JLabel(); //creates label
        label.setText("Whats up"); //set text of label
        frame.add(label);
        label.setHorizontalTextPosition(JLabel.LEFT);
        label.setVerticalTextPosition(JLabel.TOP);
        Label.setFo


        

        
        
    }
    
}

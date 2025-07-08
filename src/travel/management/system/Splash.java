//Splash screen code
//video link - https://www.youtube.com/watch?v=bZF7h4cfRa4&list=PL_6klLfS1WqGq4vlp6jQyE6rGOX0ocB17&index=2
package travel.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable{
    Thread thread;
    
    Splash(){
        setTitle("Welcome");     // Shows on top title bar

//       setSize(1200,600);      //used to define and create frame and frame size
//       setLocation(180,120);    //to open frame from center, as by default it alway opens from top-left corner.
//       used for hard coding of frame       
        setVisible(true);   //as initially when frame size is set it's hidden

       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons//splash.jpg"));
       //used to get images from the "icons"folder that we copied in our project folder
       Image i2 = i1.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
       //used to scale Image
       ImageIcon i3 = new ImageIcon(i2); 
       //we can't pass scaled image directly to 'JLabel' so will again convert scaled image to ImageIcon and then use 
       JLabel image = new JLabel(i3); 
       add(image);
       //'JLabel' and 'add' are used to add image to our frame.
       image.setBounds(0, 0, 1200, 600);
       //used to add the location on screen where image is to placed on form
       
       thread = new Thread(this);
       thread.start();
    }
    
    public void run() {
        try{
            Thread.sleep(7000);
            //new Login();
            setVisible(false);
            //This whole multiThreading is used to close the frame after 7 seconds
            new Login();   //call Login frame after 7000 micro second
        }
        catch(Exception e){
            
        }
    }
    
    
    public static void main(String[] args){
        Splash frame = new Splash();
        
        int x = 1;
        
        for(int i = 1; i<=600; i+=7){
            frame.setLocation(770 - i, 420 - (i/2));
            frame.setSize(i+i,i);
            try{
                Thread.sleep(5);
            }
            catch(Exception e){
            }
        }
    }
}

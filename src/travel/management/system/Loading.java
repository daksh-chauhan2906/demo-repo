
package travel.management.system;

import java.awt.*;
import javax.swing.*;

public class Loading extends JFrame implements Runnable{
    
    Thread t;
    JProgressBar bar;
    String Susername2;
    
    public void run(){
        try{
            for(int i = 1; i <= 101; i++){
                int max = bar.getMaximum();//100
                int value = bar.getValue();
                
                if(value < max){
                    bar.setValue(bar.getValue() + 1);
                }
                else{
                    setVisible(false);
                    new Dashboard();
                }
                Thread.sleep(50);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    Loading(String Susername){
        this.Susername2 = Susername;//storing local variable in globle variable
        t = new Thread(this);
        
        setBounds(500, 200, 650, 400);
        getContentPane().setBackground(Color.WHITE); 
        setLayout(null);
        
        JLabel text = new JLabel("Travel and Tourism Application");
        text.setBounds(55,40,600,40);
        text.setForeground(Color.BLUE);
        text.setFont(new Font("Raleway", Font.BOLD, 35));
        add(text);
        
        bar = new JProgressBar();
        bar.setBounds(150, 120, 300, 30);
        bar.setStringPainted(true);
        add(bar);
        
        JLabel loading = new JLabel("Loading, please wait...");
        loading.setBounds(235,160,150,30);
        loading.setForeground(Color.RED);
        loading.setFont(new Font("Raleway", Font.BOLD, 16));
        add(loading);
        
        JLabel username = new JLabel("Welcome "+Susername);
        username.setBounds(20,320,600,30);
        username.setForeground(Color.RED);
        username.setFont(new Font("Raleway", Font.BOLD, 16));
        add(username);
        
        t.start();
        setVisible(true);
    }
    
    public static void main(String[] args){
        new Loading("");
    }
}

package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JButton password, login,signup;
    JTextField tfusername, tfpassword;
    Login() {
        setTitle("Log in");     // Shows on top title bar

        setSize(900,400);
        setLocation(320,200);
        setLayout(null);    //to place the panel at specific position in frame, we telling tha  t we ade discarding by default layout that is 'border layout' set by swing package

        
        JPanel p1 = new JPanel();     //used to divide frame in parts
        p1.setBackground(new Color(131, 193, 233));
        p1.setBounds(0,0,400,400);     //to place the panel at specific position in frame
        add(p1);     // this will add panel to frame
        p1.setLayout(null);    
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(180, 200, Image.SCALE_DEFAULT);   
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(95, 80, 200,  200);//if setLayout is null then only setBounds will work
        p1.add(image);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400, 0, 500, 400);
        
        p2.setBackground(Color.BLACK);
        add(p2);
        //-------------------------------username--------------------------------
        JLabel lblusername = new JLabel("Username ");
        lblusername.setBounds(60, 30, 150, 50);//where to place on panel
        lblusername.setFont(new Font("SAN_SERIF",Font.PLAIN, 20));
        lblusername.setForeground(new Color(131, 193, 233));// for text color
        p2.add(lblusername);
        
        //to add text field
        tfusername = new JTextField();
        tfusername.setBounds(60,80,300,23);
        tfusername.setBorder(BorderFactory.createEmptyBorder());//to remove border around textfield
        p2.add(tfusername);
        //-----------------------------------------------------------------------
        //-------------------------------password--------------------------------
        JLabel lblpassword = new JLabel("Password ");
        lblpassword.setBounds(60, 120, 150, 50);//where to place on panel
        lblpassword.setFont(new Font("SAN_SERIF",Font.PLAIN, 20));
        lblpassword.setForeground(new Color(131, 193, 233));// for text color
        p2.add(lblpassword);
        
        //to add text field
        tfpassword = new JTextField();
        tfpassword.setBounds(60,170,300,23);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());//to remove border around textfield
        p2.add(tfpassword);
        //-----------------------------------------------------------------------
        //-------------------------------------------login button----------------
        login = new JButton("Login");
        login.setBounds(60,250,130,30);
        login.setBackground(new Color(131, 193, 233));
        login.setForeground(Color.black);
        login.setBorder(new LineBorder(new Color(133, 193,233)));//to remove the border we set border of same color as background
        login.addActionListener(this);
        p2.add(login);
        //----------------------------------------------------------------------
        //-------------------------------------------signup button----------------
        signup = new JButton("Sign up");
        signup.setBounds(230,250,130,30);
        signup.setBackground(new Color(131, 193, 233));
        signup.setForeground(Color.black);
        signup.setBorder(new LineBorder(new Color(133, 193,233)));//to remove the border we set border of same color as background
        signup.addActionListener(this);
        p2.add(signup);
        //----------------------------------------------------------------------
        //-------------------------------------------forget password button----------------
        password = new JButton("Forgot password");
        password.setBounds(150,300,130,30);
        password.setBackground(new Color(131, 193, 233));
        password.setForeground(Color.black);
        password.setBorder(new LineBorder(new Color(133, 193,233)));//to remove the border we set border of same color as background
        password.addActionListener(this);
        p2.add(password);
        //----------------------------------------------------------------------
        JLabel text = new JLabel("Trouble in login...");
        text.setBounds(330, 305, 150, 20);
        text.setForeground(Color.RED);// for text color
        p2.add(text);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == login){
            try{
                String Susername = tfusername.getText();
                String Spassword = tfpassword.getText();
                
                String query = "select * from account where username = '"+Susername+"' AND password = '"+Spassword+"'";
                Conn c = new Conn();
                ResultSet rs= c.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Loading(Susername);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect Credentials","Login Error",JOptionPane.ERROR_MESSAGE);
                }
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == signup){
            setVisible(false);
            new Signup();
        }
        else if(ae.getSource() == password){
            setVisible(false);
            new ForgetPassword();
        }
        else{
            
        }
    }
    
    public static void main(String[] args){
        new Login();
    }
}

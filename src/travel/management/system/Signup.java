package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Signup extends JFrame implements ActionListener {
    JButton create, back;
    JTextField tfusername, tfname, tfpassword, tfsecurityanswer;
    Choice security;
    
    Signup(){
        setTitle("Sign up");     // Shows on top title bar

        setBounds(320,200,900,400);//to make farme
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(133,193,233));
        p1.setBounds(0, 0, 500, 400);// this will only work if setLayout to null
        p1.setLayout(null);//so that other components in this panel use setBounds function
        add(p1);
        
        //----------------------------------------------------------username-----------------------------------------------------------------
        JLabel lblusername = new JLabel("Username");
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblusername.setBounds(50,40,125,25);
        p1.add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(200, 40, 180, 20);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        //------------------------------------------------------------------------------------------------------------------------------------
        
        //----------------------------------------------------------name-----------------------------------------------------------------
        JLabel lblname = new JLabel("Name");
        lblname.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblname.setBounds(50,80,125,25);
        p1.add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(200, 80, 180, 20);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        //------------------------------------------------------------------------------------------------------------------------------------

        //----------------------------------------------------------password-----------------------------------------------------------------
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblpassword.setBounds(50,120,125,25);
        p1.add(lblpassword);
        
        tfpassword = new JTextField();
        tfpassword.setBounds(200, 120, 180, 20);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);
        //------------------------------------------------------------------------------------------------------------------------------------

        //----------------------------------------------------------security question dropdown-----------------------------------------------------------------
        JLabel lblsecurity = new JLabel("Security Question");
        lblsecurity.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblsecurity.setBounds(50,160,150,20);
        p1.add(lblsecurity);
        
        security = new Choice();//For Dropdown
        security.add("Fav movie??");
        security.add("Fav car??");
        security.add("Fav country??");
        security.add("Fav food??");
        security.add("Your lucky number??");
        security.setBounds(200,160,180,20);
        p1.add(security);
        
        //----------------------------------------------------------security answer-----------------------------------------------------------------
        JLabel lblsecurityanswer = new JLabel("Security Answer");
        lblsecurityanswer.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblsecurityanswer.setBounds(50,200,125,25);
        p1.add(lblsecurityanswer);
        
        tfsecurityanswer = new JTextField();
        tfsecurityanswer.setBounds(200, 200, 180, 20);
        tfsecurityanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfsecurityanswer);
        //------------------------------------------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------------------------------------------
        
        //-------------------------------------------------------Buttons----------------------------------------------------------------------
        create = new JButton("Create");
        create.setBackground(Color.WHITE);
        create.setForeground(new Color(133,193,233));
        create.setBounds(70, 270, 110, 27);
        create.setFont(new Font("tahoma",Font.BOLD,14));
        create.setBorder(BorderFactory.createEmptyBorder());
        create.addActionListener(this);//here we tell that some action is to performed after button is clicked
        p1.add(create);
        
        back = new JButton("Back");
        back.setBackground(Color.WHITE);
        back.setForeground(new Color(133,193,233));
        back.setBounds(250, 270, 110, 27);
        back.setFont(new Font("tahoma",Font.BOLD,14));
        back.setBorder(BorderFactory.createEmptyBorder());
        back.addActionListener(this);//here we tell that some action is to performed after button is clicked
        p1.add(back);
        //-----------------------------------------------------------------------------------------------------------------------------------------
        JPanel p2 = new JPanel();
        p2.setBackground(Color.white);
        p2.setBounds(500, 0, 400, 400);// this will only work if setLayout to null
        p2.setLayout(null);//so that other components in this panel use setBounds function
        add(p2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(180, 200, Image.SCALE_DEFAULT);   
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(90, 80, 200,  200);//if setLayout is null then only setBounds will work
        p2.add(image);
        //------------------------------------------------------------------------------------------------------------------------------------------

        
        setVisible(true);//must be always done at last
    }
    
    public void actionPerformed(ActionEvent ae) {
        //and here we write what action is to be performed when buttons are been clicked
        
        if(ae.getSource() == create){//to find which button
            String username = tfusername.getText();
            String name = tfname.getText();
            String password = tfpassword.getText();
            String question = security.getSelectedItem();
            String answer = tfsecurityanswer.getText();
            
            String query = "insert into account values('"+username+"', '"+name+"', '"+password+"',  '"+question+"', '"+answer+"')";//for varchar datatype in database wull is single qoutation mark
            try{
                Conn c = new Conn();
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Account Created Successfully");//show popup
                setVisible(false);
                new Login();
            } catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == back){//to find which button
                setVisible(false);
                new Login();
        }
        
    }
    
    public static void main(String[] args){
        new Signup();
    }
}

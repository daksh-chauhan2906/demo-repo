package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;//for ResultSet

public class ForgetPassword extends JFrame implements ActionListener{
    JTextField tfusername, tfname,tfquestion, tfanswer, tfpassword;
    JButton search, getpassword, back;
    
    ForgetPassword(){
        setTitle("Forget Password");
        
        setBounds(320,200,900,400);
        getContentPane().setBackground(Color.WHITE);//to set background color of whole frame
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(590, 80, 200, 200);
        add(image);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0, 0, 500, 365);
        p1.setBackground(new Color(133,193,233));
        add(p1);
        
        
        //----------------------------------------------username----------------------
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 37, 100, 25);
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(180, 40, 180, 20);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        //-------------------------------------------------------------------------------
        //-----------------------------------------Button--------------------------------
        search = new JButton("Search");
        search.setBackground(Color.white);
        search.setForeground(new Color(133,193,233));
        search.setBounds(380,40,100,20);
        search.setBorder(BorderFactory.createEmptyBorder());
        search.addActionListener(this);
        p1.add(search);
        //-------------------------------------------------------------------------------
        //----------------------------------------------name----------------------
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(40, 77, 100, 25);
        lblname.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(180, 80, 180, 20);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        //-------------------------------------------------------------------------------
        //----------------------------------------------security question----------------------
        JLabel lblquestion = new JLabel("Security Question");
        lblquestion.setBounds(40, 117, 150, 25);
        lblquestion.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(lblquestion);
        
        tfquestion = new JTextField();
        tfquestion.setBounds(180, 120, 180, 20);
        tfquestion.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfquestion);
        //--------------------------------------------------------------------------------------
        JLabel lblanswer = new JLabel("Security Answer");
        lblanswer.setBounds(40, 157, 150, 25);
        lblanswer.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(lblanswer);
        
        tfanswer = new JTextField();
        tfanswer.setBounds(180, 160, 180, 20);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);
        //-------------------------------------------------------------------------------
        //---------------------------------------------Button----------------------------
        getpassword = new JButton("Get Password");
        getpassword.setBackground(Color.white);
        getpassword.setForeground(new Color(133,193,233));
        getpassword.setBounds(380,160,100,20);
        getpassword.setBorder(BorderFactory.createEmptyBorder());
        getpassword.addActionListener(this);
        p1.add(getpassword);
        //-------------------------------------------------------------------------------
        //-----------------------------------------------password------------------------
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40, 197, 150, 25);
        lblpassword.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(lblpassword);
        
        tfpassword = new JTextField();
        tfpassword.setBounds(180, 200, 180, 20);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);
        
        back = new JButton("Back");
        back.setBackground(Color.WHITE);
        back.setForeground(new Color(133,193,233));
        back.setBounds(130, 250, 110, 25);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.addActionListener(this);
        p1.add(back);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == search){
            try{
                String query = "select * from account where username = '"+tfusername.getText()+"'";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);//to store resultset
                
                if(rs.next()){//if correct username is entered
                    tfname.setText(rs.getString("name"));
                    tfquestion.setText(rs.getString("security"));
                } else {//if the user with such username does not exist
                    JOptionPane.showMessageDialog(null, "User does not exist", "Error", JOptionPane.ERROR_MESSAGE);
                    tfname.setText("");
                    tfquestion.setText("");
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == getpassword){
            try{
                String query = "select * from account where answer = '"+tfanswer.getText()+"' AND username = '"+tfusername.getText()+"'";
                Conn c = new Conn();
                
                ResultSet rs = c.s.executeQuery(query);
                if(rs.next()){//if answer is correct
                    tfpassword.setText(rs.getString("password"));
                }
                else{//if answer is wrong
                    JOptionPane.showMessageDialog(null, "Wrong Answer");
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
           setVisible(false);
           new Login();
        }
    }
    
    public static void main(String[] args){
        new ForgetPassword();
    }
}

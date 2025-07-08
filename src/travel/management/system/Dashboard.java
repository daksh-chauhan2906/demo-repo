package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dashboard extends JFrame implements ActionListener{
    
    JButton addCustomerDetails, updatePersonalDetails, viewPersonalDetails, deletePersonalDetails, checkPackages, bookPackages, viewPackages, viewHotels, bookHotels, viewBookedHotels, destinations, payments, cal, notepad, about;

    Dashboard() {
        setTitle("Dashboard");
        //setBounds(0,0,1600,1000);instead this 
        setExtendedState(JFrame.MAXIMIZED_BOTH);//it will maximize the size to the maximum of any system
        setLayout(null);
        
        //---------------------panel 1---------------------------------------------
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(25, 42, 86));
        p1.setBounds(0, 0, 1600, 65);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(7, 0, 70, 70);
        p1.add(icon);
        
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(85, 0, 130, 70);
        heading.setFont(new Font("Tahoma",Font.BOLD,20));
        heading.setForeground(Color.WHITE);
        p1.add(heading);
        //---------------------------------------------------------------------------
        //-------------------------panel 2----------------------------------------------
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(25, 42, 86));
        p2.setBounds(0, 65, 300, 730);
        add(p2);
        
        addCustomerDetails = new JButton("Add Customer Detail");
        addCustomerDetails.setBounds(0,0,300,48);
        addCustomerDetails.setBackground(new Color(25, 42, 86));
        addCustomerDetails.setForeground(Color.white);
        addCustomerDetails.setFont(new Font("Tahoma", Font.PLAIN,20));
        //addCustomerDetails.setMargin(new Insets(0,0,0,60));//to move text on button towards left
        //addCustomerDetails.setBorder(BorderFactory.createEmptyBorder());
        addCustomerDetails.setFocusPainted(false);// to remove the rectange arround the text of button
        addCustomerDetails.addActionListener(this);
        p2.add(addCustomerDetails);
        
        updatePersonalDetails = new JButton("View Customer Detail");
        updatePersonalDetails.setBounds(0,48,300,48);
        updatePersonalDetails.setBackground(new Color(25, 42, 86));
        updatePersonalDetails.setForeground(Color.white);
        updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN,20));
        //addPersonalDetails.setMargin(new Insets(0,0,0,60));//to move text on button towards left
        //updatePersonalDetails.setBorder(BorderFactory.createEmptyBorder());
        updatePersonalDetails.setFocusPainted(false);// to remove the rectange arround the text of button
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);
        
        viewPersonalDetails = new JButton("Update Customer Detail");
        viewPersonalDetails.setBounds(0,96,300,48);
        viewPersonalDetails.setBackground(new Color(25, 42, 86));
        viewPersonalDetails.setForeground(Color.white);
        viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN,20));
        //addPersonalDetails.setMargin(new Insets(0,0,0,60));//to move text on button towards left
        //viewPersonalDetails.setBorder(BorderFactory.createEmptyBorder());
        viewPersonalDetails.setFocusPainted(false);// to remove the rectange arround the text of button
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
        deletePersonalDetails = new JButton("Delete Personal Detail");
        deletePersonalDetails.setBounds(0,144,300,48);
        deletePersonalDetails.setBackground(new Color(25, 42, 86));
        deletePersonalDetails.setForeground(Color.white);
        deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN,20));
        //addPersonalDetails.setMargin(new Insets(0,0,0,60));//to move text on button towards left
        //deletePersonalDetails.setBorder(BorderFactory.createEmptyBorder());
        deletePersonalDetails.setFocusPainted(false);// to remove the rectange arround the text of button
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);
        
        checkPackages = new JButton("Check Packages");
        checkPackages.setBounds(0,192,300,48);
        checkPackages.setBackground(new Color(25, 42, 86));
        checkPackages.setForeground(Color.white);
        checkPackages.setFont(new Font("Tahoma", Font.PLAIN,20));
        //addPersonalDetails.setMargin(new Insets(0,0,0,60));//to move text on button towards left
        //checkPackages.setBorder(BorderFactory.createEmptyBorder());
        checkPackages.setFocusPainted(false);// to remove the rectange arround the text of button
        checkPackages.addActionListener(this);
        p2.add(checkPackages);
        
        bookPackages = new JButton("Book Packages");
        bookPackages.setBounds(0,240,300,48);
        bookPackages.setBackground(new Color(25, 42, 86));
        bookPackages.setForeground(Color.white);
        bookPackages.setFont(new Font("Tahoma", Font.PLAIN,20));
        //addPersonalDetails.setMargin(new Insets(0,0,0,60));//to move text on button towards left
        //bookPackages.setBorder(BorderFactory.createEmptyBorder());
        bookPackages.setFocusPainted(false);// to remove the rectange arround the text of button
        bookPackages.addActionListener(this);
        p2.add(bookPackages);
        
        viewPackages = new JButton("View Packages");
        viewPackages.setBounds(0,288,300,48);
        viewPackages.setBackground(new Color(25, 42, 86));
        viewPackages.setForeground(Color.white);
        viewPackages.setFont(new Font("Tahoma", Font.PLAIN,20));
        //addPersonalDetails.setMargin(new Insets(0,0,0,60));//to move text on button towards left
        //bookPackages.setBorder(BorderFactory.createEmptyBorder());
        viewPackages.setFocusPainted(false);// to remove the rectange arround the text of button
        viewPackages.addActionListener(this);
        p2.add(viewPackages);
        
        viewHotels = new JButton("View Hotels");
        viewHotels.setBounds(0,336,300,48);
        viewHotels.setBackground(new Color(25, 42, 86));
        viewHotels.setForeground(Color.white);
        viewHotels.setFont(new Font("Tahoma", Font.PLAIN,20));
        //addPersonalDetails.setMargin(new Insets(0,0,0,60));//to move text on button towards left
        //bookPackages.setBorder(BorderFactory.createEmptyBorder());
        viewHotels.setFocusPainted(false);// to remove the rectange arround the text of button
        viewHotels.addActionListener(this);
        p2.add(viewHotels);
        
        bookHotels = new JButton("Book Hotels");
        bookHotels.setBounds(0,384,300,48);
        bookHotels.setBackground(new Color(25, 42, 86));
        bookHotels.setForeground(Color.white);
        bookHotels.setFont(new Font("Tahoma", Font.PLAIN,20));
        //addPersonalDetails.setMargin(new Insets(0,0,0,60));//to move text on button towards left
        //bookPackages.setBorder(BorderFactory.createEmptyBorder());
        bookHotels.setFocusPainted(false);// to remove the rectange arround the text of button
        bookHotels.addActionListener(this);
        p2.add(bookHotels);
        
        viewBookedHotels = new JButton("View Booked Hotels");
        viewBookedHotels.setBounds(0,432,300,48);
        viewBookedHotels.setBackground(new Color(25, 42, 86));
        viewBookedHotels.setForeground(Color.white);
        viewBookedHotels.setFont(new Font("Tahoma", Font.PLAIN,20));
        //addPersonalDetails.setMargin(new Insets(0,0,0,60));//to move text on button towards left
        //bookPackages.setBorder(BorderFactory.createEmptyBorder());
        viewBookedHotels.setFocusPainted(false);// to remove the rectange arround the text of button
        viewBookedHotels.addActionListener(this);
        p2.add(viewBookedHotels);
        
        destinations = new JButton("Destinations");
        destinations.setBounds(0,480,300,48);
        destinations.setBackground(new Color(25, 42, 86));
        destinations.setForeground(Color.white);
        destinations.setFont(new Font("Tahoma", Font.PLAIN,20));
        //addPersonalDetails.setMargin(new Insets(0,0,0,60));//to move text on button towards left
        //bookPackages.setBorder(BorderFactory.createEmptyBorder());
        destinations.setFocusPainted(false);// to remove the rectange arround the text of button
        destinations.addActionListener(this);
        p2.add(destinations);
        
        payments = new JButton("Payments");
        payments.setBounds(0,528,300,48);
        payments.setBackground(new Color(25, 42, 86));
        payments.setForeground(Color.white);
        payments.setFont(new Font("Tahoma", Font.PLAIN,20));
        //addPersonalDetails.setMargin(new Insets(0,0,0,60));//to move text on button towards left
        //bookPackages.setBorder(BorderFactory.createEmptyBorder());
        payments.setFocusPainted(false);// to remove the rectange arround the text of button
        payments.addActionListener(this);
        p2.add(payments);
        
        cal = new JButton("Calculator");
        cal.setBounds(0,576,300,48);
        cal.setBackground(new Color(25, 42, 86));
        cal.setForeground(Color.white);
        cal.setFont(new Font("Tahoma", Font.PLAIN,20));
        //addPersonalDetails.setMargin(new Insets(0,0,0,60));//to move text on button towards left
        //bookPackages.setBorder(BorderFactory.createEmptyBorder());
        cal.setFocusPainted(false);// to remove the rectange arround the text of button
        cal.addActionListener(this);
        p2.add(cal);
        
        notepad = new JButton("Notepad");
        notepad.setBounds(0,624,300,48);
        notepad.setBackground(new Color(25, 42, 86));
        notepad.setForeground(Color.white);
        notepad.setFont(new Font("Tahoma", Font.PLAIN,20));
        //addPersonalDetails.setMargin(new Insets(0,0,0,60));//to move text on button towards left
        //bookPackages.setBorder(BorderFactory.createEmptyBorder());
        notepad.setFocusPainted(false);// to remove the rectange arround the text of button
        notepad.addActionListener(this);
        p2.add(notepad);
        
        about = new JButton("About");
        about.setBounds(0,672,300,48);
        about.setBackground(new Color(25, 42, 86));
        about.setForeground(Color.white);
        about.setFont(new Font("Tahoma", Font.PLAIN,20));
        //addPersonalDetails.setMargin(new Insets(0,0,0,60));//to move text on button towards left
        //bookPackages.setBorder(BorderFactory.createEmptyBorder());
        about.setFocusPainted(false);// to remove the rectange arround the text of button
        about.addActionListener(this);
        p2.add(about);
        //----------------------------------------------------------------------------------------
        //-----------------------------background-------------------------------------------------
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(300, 65, 1350, 935);
        add(image);
        //-----------------------------------------------------------------------------------------
        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(115,30,2000,70);
        text.setForeground(new Color(47, 54, 64));
        text.setFont(new Font("Raleway", Font.PLAIN,55));
        image.add(text);
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == addCustomerDetails){
            new addCustomer();
        }
        else if(ae.getSource() == updatePersonalDetails){
            new ViewCustomer();
        }
        else if(ae.getSource() == viewPersonalDetails){
            new updateCustomer();
        }
        else if(ae.getSource() == deletePersonalDetails){
            new addCustomer();
        }
        else if(ae.getSource() == checkPackages){
            new CheckPackages();
        }
        else if(ae.getSource() == bookPackages){
            new addCustomer();
        }
        else if(ae.getSource() == viewPackages){
            new CheckPackages();
        }
        else if(ae.getSource() == viewHotels){
            new addCustomer();
        }
        else if(ae.getSource() == bookHotels){
            new addCustomer();
        }
        else if(ae.getSource() == viewBookedHotels){
            new addCustomer();
        }
        else if(ae.getSource() == destinations){
            new addCustomer();
        }
        else if(ae.getSource() == payments){
            new addCustomer();
        }
        else if(ae.getSource() == cal){
            try{
                Runtime.getRuntime().exec("calc");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == notepad){
            try{
                Runtime.getRuntime().exec("notepad");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            new addCustomer();
        }
        
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}

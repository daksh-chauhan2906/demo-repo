 package travel.management.system;
 
import java.awt.*;
import javax.swing.*;
 
public class BookPackage extends JFrame{
    JLabel lbltitle, lblname, lblid, lblnumber, lblCustomerName, lblgender, lblselectpackage;
    JTextField enterName, enterid, enternumber, enterCustomerName;
    Choice cpackage;
    
    BookPackage() {
        setTitle("Check Packages");
        setBounds(500, 200, 850, 550);
        setLayout(null);
        getContentPane().setBackground(new Color(113, 128, 147));

        
        lbltitle = new JLabel("Update Customer");
        lbltitle.setForeground(Color.white);
        lbltitle.setFont(new Font("Tahoma", Font.BOLD, 20));
        lbltitle.setBounds(152, 20, 200, 25);
        add(lbltitle);
        
        lblname = new JLabel("Receptionist's Name");
        lblname.setForeground(Color.white);
        lblname.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblname.setBounds(40, 80, 200, 20);
        add(lblname);
        
        enterName = new JTextField();
        enterName.setBounds(220, 80, 200, 20);
        enterName.setBorder(BorderFactory.createEmptyBorder());
        add(enterName);
        
        lblid = new JLabel("Id");
        lblid.setForeground(Color.white);
        lblid.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblid.setBounds(40, 140, 200, 20);
        add(lblid);
        
        enterid = new JTextField();
        enterid.setBounds(220, 140, 200, 20);
        enterid.setBorder(BorderFactory.createEmptyBorder());
        add(enterid);
        
        lblnumber = new JLabel("Total Persons");
        lblnumber.setForeground(Color.white);
        lblnumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblnumber.setBounds(40, 200, 200, 20);
        add(lblnumber);
        
        enternumber = new JTextField("  1");
        //enternumber.setHorizontalAlignment(JTextField.CENTER);//to align text in center in textfield 
        enternumber.setBounds(220, 200, 200, 20);
        enternumber.setBorder(BorderFactory.createEmptyBorder(0, 15, 0, 0));// to align the text after 15 spaces
        add(enternumber);
        
        lblCustomerName = new JLabel("Name");
        lblCustomerName.setForeground(Color.white);
        lblCustomerName.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblCustomerName.setBounds(40, 260, 200, 20);
        add(lblCustomerName);
        
        enterCustomerName = new JTextField();
        enterCustomerName.setBounds(220, 260, 200, 20);
        enterCustomerName.setBorder(BorderFactory.createEmptyBorder());
        add(enterCustomerName);
        
        lblgender = new JLabel("Gender");
        lblgender.setForeground(Color.white);
        lblgender.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblgender.setBounds(40, 320, 200, 20);
        add(lblgender);
        
        lblselectpackage = new JLabel("Select Package's");
        lblselectpackage.setForeground(Color.white);
        lblselectpackage.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblselectpackage.setBounds(40, 380, 150, 20);
        add(lblselectpackage);
        
        cpackage = new Choice();
        cpackage.add("Gold Package");
        cpackage.add("Silver Package");
        cpackage.add("Bronze Package");
        cpackage.setBounds(220, 380, 200, 20);
        add(cpackage);
        
        
        setVisible(true);
    }
    
    public static void main(String[] args){
        new BookPackage();
    }
}

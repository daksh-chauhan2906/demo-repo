package travel.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class addCustomer extends JFrame implements ActionListener{

    JLabel lbltitle, lblidproof, lblnumber, lblname, lblgender, lblcountry, lbladdress, lblphone, lblemail;
    JComboBox comboid;
    JTextField tfnumber, tfcountry, tfphone, tfemail, tfusername, tfname;
    JRadioButton rmale, rfemale;
    JTextArea TAaddress;
    JButton add1, back;


    addCustomer() {
        setTitle("Add Customer");
        setBounds(500,200,850,550);
        setLayout(null);
        getContentPane().setBackground(new Color(113,128,147));

        //--------------------------usrename----------------------------------
        lbltitle = new JLabel("Add Customer");
        lbltitle.setForeground(Color.white);
        lbltitle.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbltitle.setBounds(152, 40, 200, 25);
        add(lbltitle);

        
        //-----------------------------------------------------------
        //--------------------------id proof----------------------------------
        lblidproof = new JLabel("Id Proof");
        lblidproof.setForeground(Color.white);
        lblidproof.setFont(new Font("Tahoma", Font.PLAIN,16));
        lblidproof.setBounds(40, 90, 200, 25);
        add(lblidproof);

        comboid = new JComboBox(new String[] {"Passport", "Aadhar Card", "Pan Card", "Ration Card"});
        comboid.setBackground(Color.white);
        comboid.setBounds(220, 90, 200, 25 );
        add(comboid);
        //-----------------------------------------------------------
         //--------------------------number----------------------------------
        lblnumber = new JLabel("Number");
        lblnumber.setForeground(Color.white);
        lblnumber.setFont(new Font("Tahoma", Font.PLAIN,16));
        lblnumber.setBounds(40, 130, 200, 25);
        add(lblnumber);

        tfnumber = new JTextField();
        tfnumber.setBorder(BorderFactory.createEmptyBorder());
        tfnumber.setBounds(220, 130, 200, 22 );
        add(tfnumber);
        //-----------------------------------------------------------
        //--------------------------usrename----------------------------------
        lblname = new JLabel("Name");
        lblname.setForeground(Color.white);
        lblname.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblname.setBounds(40, 170, 200, 22);
        add(lblname);

        tfname = new JTextField();
        tfname.setBounds(220, 170, 200, 22 );
        tfname.setBorder(BorderFactory.createEmptyBorder());
        add(tfname);
        
        lblgender = new JLabel("Gender");
        lblgender.setForeground(Color.white);
        lblgender.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblgender.setBounds(40, 210, 200, 22);
        add(lblgender);

        rmale = new JRadioButton("Male");
        rmale.setBounds(220, 210, 70, 25);
        rmale.setBackground(new Color(113,128,147));
        rmale.setForeground(Color.WHITE);
        rmale.setFocusPainted(false);
        add(rmale);
        
        rfemale = new JRadioButton("Female");
        rfemale.setBounds(300, 210, 70, 25);
        rfemale.setBackground(new Color(113,128,147));
        rfemale.setForeground(Color.WHITE);
        rfemale.setFocusPainted(false); // ✅ Removes the border highlight/focus ring
        add(rfemale);
        
        ButtonGroup bg = new ButtonGroup();//so that both radio button won't get selected at a time
        bg.add(rmale);
        bg.add(rfemale);
        //-----------------------------------------------------------
        //-------------------------country-------------------------
        lblcountry = new JLabel("Country");
        lblcountry.setForeground(Color.white);
        lblcountry.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblcountry.setBounds(40, 250, 200, 22);
        add(lblcountry);
        
        tfcountry = new JTextField();
        tfcountry.setBorder(BorderFactory.createEmptyBorder());
        tfcountry.setBounds(220, 250, 200, 22 );
        add(tfcountry);
        //-------------------------------------------------------------
        //-------------------------address-------------------------
        lbladdress = new JLabel("Address");
        lbladdress.setForeground(Color.white);
        lbladdress.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lbladdress.setBounds(40, 290, 200, 22);
        add(lbladdress);
        
        TAaddress = new JTextArea();
        TAaddress.setBorder(BorderFactory.createEmptyBorder());
        TAaddress.setBounds(220, 290, 200, 66 );
        add(TAaddress);
        //-------------------------------------------------------------
        //-------------------------phone-------------------------
        lblphone = new JLabel("Phone");
        lblphone.setForeground(Color.white);
        lblphone.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblphone.setBounds(40, 360, 200, 22);
        add(lblphone);
        
        tfphone = new JTextField();
        tfphone.setBorder(BorderFactory.createEmptyBorder());
        tfphone.setBounds(220, 360, 200, 22 );
        add(tfphone);
        //-------------------------------------------------------------
        //-------------------------email-------------------------
        lblemail = new JLabel("E-mail");
        lblemail.setForeground(Color.white);
        lblemail.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblemail.setBounds(40, 400, 200, 22);
        add(lblemail);
        
        tfemail = new JTextField();
        tfemail.setBorder(BorderFactory.createEmptyBorder());
        tfemail.setBounds(220, 400, 200, 22 );
        add(tfemail);
        //-------------------------------------------------------------
        //----------------------button---------------------------------
        add1 = new JButton("Add");
        add1.setBounds(300,440,120,25);
        add1.setBackground(Color.WHITE);
        add1.setFocusPainted(false);
        add1.addActionListener(this);
        add(add1);
        
        back = new JButton("Back");
        back.setBounds(40,440,120,25);
        back.setBackground(Color.WHITE);
        back.setFocusPainted(false);
        back.addActionListener(this);
        add(back);
        //----------------------------------------------------------------
        //-----------------------image------------------------------------
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(480, 100,300,300);
        add(image);
        //-----------------------------------------------------------------------
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == back){
            setVisible(false);
        }
        else{
            String S_IdProof1 = (String) comboid.getSelectedItem();//this function returns a object of combobox so we need o type cast it in string
            String S_number = tfnumber.getText();
            String S_name = tfname.getText();
            String gender = null;
            if(rmale.isSelected()){
                gender = "Male";
            }
            else if(rfemale.isSelected()){
                gender = "Female";
            }
            else{
                JOptionPane.showMessageDialog(null, "Can't proceed without selecting Gender");
            }
            String country = tfcountry.getText();
            String address = TAaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            
            try{
                Conn c = new Conn();
                String query = "insert into customer(id , id_number ,name , gender , country ,  address , phone , email)" + "values('"+S_IdProof1+"','"+S_number+"','"+S_name+"','"+gender+"','"+country+"','"+address+"','"+phone+"','"+email+"')";
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Customer Details Added Successfully");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
       }
    }


    public static void main(String[] args) {
        new addCustomer();
    }
}

package travel.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.sql.*;//for ResultSet


public class ViewCustomer  extends JFrame implements ActionListener{
    JLabel searchName, lbltitle;
    JTextField enterName;
    JButton findCustomer; 
    JTable table;
    String customer[] = {"Addhar","1234567890","Daksh Chauhan","Male","India","Pune","8551995925","dakshchauhan9822@gmail.com"}; 
    
    ViewCustomer() {
        setTitle("View Customer");
        setBounds(500,200,850,550);
        setLayout(null);
        getContentPane().setBackground(new Color(113,128,147));  
        
        lbltitle = new JLabel("View Customer");
        lbltitle.setForeground(Color.white);
        lbltitle.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbltitle.setBounds(152, 40, 200, 25);
        add(lbltitle);
        
        searchName = new JLabel("Search Name");
        searchName.setForeground(Color.white);
        searchName.setFont(new Font("Tahoma", Font.PLAIN, 16));
        searchName.setBounds(40, 90, 200, 22);
        add(searchName);

        enterName = new JTextField();
        enterName.setBounds(200, 90, 200, 22 );
        enterName.setBorder(BorderFactory.createEmptyBorder());
        add(enterName);
        
        findCustomer = new JButton("Search");
        findCustomer.setBounds(430,88,120,25);
        findCustomer.setBackground(Color.WHITE);
        findCustomer.setFocusPainted(false);
        findCustomer.addActionListener(this);
        add(findCustomer);
        
        
        
       
        //-----------------------image------------------------------------
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/view_customer.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(580, 274,300,300);
        add(image);
        //-----------------------------------------------------------------------
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == findCustomer){
            try{
            String nameToBeSearched = enterName.getText();
            String query = "select * from customer where name = '"+nameToBeSearched+"'";
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery(query);
            
            if(rs.next()){
                customer[0] = rs.getString("id");
                customer[1] = rs.getString("id_number");
                customer[2] = rs.getString("name");
                customer[3] = rs.getString("gender");
                customer[4] = rs.getString("country");
                customer[5] = rs.getString("address");
                customer[6] = rs.getString("phone");
                customer[7] = rs.getString("email");
                
                //------------------------------table-------------------------------
                String[] labels = {"ID Proof", "Number", "Name", "Gender", "Country", "Address", "Phone", "Email"};
                                  //  rows         column
                String data[][] = new String[labels.length][2];
                String column[] = {"parameters","values"};
                for(int i = 0; i<labels.length; i++){
                    data[i][0] = labels[i];
                    data[i][1] = customer[i];
                }
                
                table = new JTable(data,column);
                table.setFont(new Font("Arial", Font.BOLD, 14));
                table.setTableHeader(null);
                table.setRowHeight(25);
                table.setBackground(new Color(113,128,147));
                table.setForeground(Color.white);
                //table.setBorder(BorderFactory.createEmptyBorder());
                //-------------------------------width of column-----------------------
                JScrollPane sp = new JScrollPane(table);
                add(sp);
                sp.setBounds(40,170,510,200);
                sp.setBorder(BorderFactory.createEmptyBorder());
                //--------------------------------------------------------------------
            }
            else{
            JOptionPane.showMessageDialog(null,"NO Customer found");
            }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args){
        new ViewCustomer();
    }
}

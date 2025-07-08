//Study this code as it is unique
package travel.management.system;

import java.awt.*;//for Color,
import javax.swing.*;//for JFrame 

public class CheckPackages extends JFrame{
    CheckPackages(){
        setTitle("Check Packages");
        setBounds(500, 200, 850, 550);
        setLayout(null);
        
        String[] package1 = {"GOLD PACKAGE", "6 Days and 7 Nights", "Airport Assitance", "Meet and Greet at Airport", "Welcome Drinks on Arrival", "Full Day 3 Island Cruise", "English Speaking Guide", "Extra Bed Facility", "Book Now!!    12000/-", "package1.jpg"};
        String[] package2 = {"SILVER PACKAGE", "5 Days and 6 Nights", "Toll Free and Entrance Free Tickets", "Half Day City Tour", "Welcome Drinks on Arrival", "Night Safari", "BBQ Dinner", "City Transport Included", "Book Now!!    10000/-", "package2.jpg"};
        String[] package3 = {"BRONZE PACKAGE", "3 Days and 4 Nights", "Toll Free", "Free Clubbing & other Games", "Soft Drinks Free", "Free Buffet", "Free Spa", "Evening Campfire", "Book Now!!    7000/-", "package3.jpg"};

        
        
        JTabbedPane tab = new JTabbedPane();
        
        JPanel p1 = createPackage(package1);
        tab.addTab("Package 1", null, p1); 
        
        JPanel p2 = createPackage(package2);
        tab.addTab("Package 2", null, p2); 
        
        JPanel p3 = createPackage(package3);
        tab.addTab("Package 3", null, p3); 
        tab.setBounds(0, 0, 850, 550); // or adjust as needed
        add(tab);
        
        
        setVisible(true); 
    }
    
    public JPanel createPackage(String[] pack){
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(113, 128, 147));
        
        JLabel l1 = new JLabel(pack[0]);
        l1.setBounds(50,27,300,30);
        l1.setForeground(new Color(255, 215, 0));
        l1.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(l1);
        
        JLabel l2 = new JLabel(pack[1]);
        l2.setBounds(67,70,300,30);
        l2.setForeground(Color.black);
        l2.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l2);
        
        JLabel l3 = new JLabel(pack[2]);
        l3.setBounds(67,100,300,30);
        l3.setForeground(Color.black);
        l3.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l3);
        
        JLabel l4 = new JLabel(pack[3]);
        l4.setBounds(67,130,300,30);
        l4.setForeground(Color.black);
        l4.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l4);
        
        JLabel l5 = new JLabel(pack[4]);
        l5.setBounds(67,160,300,30);
        l5.setForeground(Color.black);
        l5.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l5);
        
        JLabel l6 = new JLabel(pack[5]);
        l6.setBounds(67,190,300,30);
        l6.setForeground(Color.black);
        l6.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l6);
        
        JLabel l7 = new JLabel(pack[6]);
        l7.setBounds(67,220,300,30);
        l7.setForeground(Color.black);
        l7.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l7);
         
        JLabel l8 = new JLabel(pack[7]);
        l8.setBounds(67,250,300,30);
        l8.setForeground(Color.black);
        l8.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l8);
        
        JLabel l9 = new JLabel(pack[8]);
        l9.setBounds(67,280,300,30);
        l9.setForeground(Color.red);
        l9.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l9);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[9]));
        Image i2 = i1.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l12 = new JLabel(i3);
        l12.setBounds(350,90,500,300);
        p1.add(l12);
        
        return p1;
    }
    
    public static void main(String[] args){
        new CheckPackages();
    }
    
}

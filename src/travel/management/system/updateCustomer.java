package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class updateCustomer extends JFrame implements ActionListener {

    JTextField enterName, tfnumber, tfcountry, tfphone, tfemail, tfname;
    JTextArea TAaddress;
    JComboBox comboid;
    JRadioButton rmale, rfemale;
    JButton findCustomer, update, back;
    ButtonGroup bg;

    public updateCustomer() {
        setTitle("Update Customer");
        setBounds(500, 200, 850, 550);
        setLayout(null);
        getContentPane().setBackground(new Color(113, 128, 147));

        JLabel lbltitle = new JLabel("Update Customer");
        lbltitle.setForeground(Color.white);
        lbltitle.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbltitle.setBounds(152, 20, 200, 25);
        add(lbltitle);

        JLabel searchName = new JLabel("Search Name");
        searchName.setForeground(Color.white);
        searchName.setFont(new Font("Tahoma", Font.PLAIN, 16));
        searchName.setBounds(40, 60, 200, 22);
        add(searchName);

        enterName = new JTextField();
        enterName.setBounds(200, 60, 200, 22);
        enterName.setBorder(BorderFactory.createEmptyBorder());
        add(enterName);

        findCustomer = new JButton("Search");
        findCustomer.setBounds(430, 58, 120, 25);
        findCustomer.setBackground(Color.WHITE);
        findCustomer.addActionListener(this);
        add(findCustomer);

        // ID Proof
        addLabel("Id Proof", 90);
        comboid = new JComboBox(new String[]{"Passport", "Aadhar Card", "Pan Card", "Ration Card"});
        comboid.setBounds(200, 90, 200, 25);
        add(comboid);

        // Number
        addLabel("Number", 130);
        tfnumber = createTextField(130);

        // Name
        addLabel("Name", 170);
        tfname = createTextField(170);

        // Gender
        addLabel("Gender", 210);
        rmale = new JRadioButton("Male");
        rmale.setBounds(200, 210, 70, 25);
        rfemale = new JRadioButton("Female");
        rfemale.setBounds(280, 210, 70, 25);
        for (JRadioButton rb : new JRadioButton[]{rmale, rfemale}) {
            rb.setBackground(new Color(113, 128, 147));
            rb.setForeground(Color.WHITE);
            add(rb);
        }
        bg = new ButtonGroup();
        bg.add(rmale); bg.add(rfemale);

        // Country
        addLabel("Country", 250);
        tfcountry = createTextField(250);

        // Address
        addLabel("Address", 290);
        TAaddress = new JTextArea();
        TAaddress.setBounds(200, 290, 200, 66);
        TAaddress.setBorder(BorderFactory.createEmptyBorder());
        add(TAaddress);

        // Phone
        addLabel("Phone", 360);
        tfphone = createTextField(360);

        // Email
        addLabel("E-mail", 400);
        tfemail = createTextField(400);

        // Buttons
        update = new JButton("Update");
        update.setBounds(300, 440, 120, 25);
        update.setBackground(Color.WHITE);
        update.addActionListener(this);
        add(update);

        back = new JButton("Back");
        back.setBounds(40, 440, 120, 25);
        back.setBackground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setVisible(true);
    }

    private void addLabel(String text, int y) {
        JLabel label = new JLabel(text);
        label.setForeground(Color.white);
        label.setFont(new Font("Tahoma", Font.PLAIN, 16));
        label.setBounds(40, y, 200, 22);
        add(label);
    }

    private JTextField createTextField(int y) {
        JTextField tf = new JTextField();
        tf.setBounds(200, y, 200, 22);
        tf.setBorder(BorderFactory.createEmptyBorder());
        add(tf);
        return tf;
    }

    public void actionPerformed(ActionEvent ae) {
        Conn c = new Conn();

        if (ae.getSource() == findCustomer) {
            try {
                String nameToBeSearched = enterName.getText();
                ResultSet rs = c.s.executeQuery("SELECT * FROM customer WHERE name = '" + nameToBeSearched + "'");

                if (rs.next()) {
                    comboid.setSelectedItem(rs.getString("id"));
                    tfnumber.setText(rs.getString("id_number"));
                    tfname.setText(rs.getString("name"));

                    String gender = rs.getString("gender");
                    if (gender.equalsIgnoreCase("Male")) {
                        rmale.setSelected(true);
                    } else {
                        rfemale.setSelected(true);
                    }

                    tfcountry.setText(rs.getString("country"));
                    TAaddress.setText(rs.getString("address"));
                    tfphone.setText(rs.getString("phone"));
                    tfemail.setText(rs.getString("email"));
                } else {
                    JOptionPane.showMessageDialog(null, "No customer found");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == update) {
            try {
                String id = (String) comboid.getSelectedItem();
                String number = tfnumber.getText();
                String name = tfname.getText();
                String gender = rmale.isSelected() ? "Male" : "Female";
                String country = tfcountry.getText();
                String address = TAaddress.getText();
                String phone = tfphone.getText();
                String email = tfemail.getText();

                String query = "UPDATE customer SET id='" + id + "', id_number='" + number + "', name='" + name + "', gender='" + gender + "', country='" + country + "', address='" + address + "', phone='" + phone + "', email='" + email + "' WHERE name='" + enterName.getText() + "'";
                int rows = c.s.executeUpdate(query);

                if (rows > 0) {
                    JOptionPane.showMessageDialog(null, "Customer details updated successfully");
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Update failed");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new updateCustomer();
    }
}

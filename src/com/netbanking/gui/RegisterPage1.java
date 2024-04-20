package com.netbanking.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.netbanking.dao.Controller;
import com.netbanking.entities.User;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class RegisterPage1 extends JFrame {

	private JPanel contentPane;
	private JTextField fname;
	private JTextField email;
	private JTextField phone;
	private JTextField address;
	private JTextField City;
	private JTextField state;
	private JTextField pin;
	private JTextField name;
	private User user;
	private ButtonGroup eAccountGroup;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterPage1 frame = new RegisterPage1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegisterPage1() {
		setTitle("Heaven Bank");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Nitish\\Downloads\\jsgfsj.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblApplicationForm = new JLabel("Application Form");
		lblApplicationForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblApplicationForm.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblApplicationForm.setBounds(108, 59, 457, 29);
		contentPane.add(lblApplicationForm);
		
		JLabel lblHeavenBank = new JLabel("Heaven Bank");
		lblHeavenBank.setBounds(214, 11, 258, 49);
		lblHeavenBank.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeavenBank.setFont(new Font("Arial Black", Font.BOLD, 34));
		contentPane.add(lblHeavenBank);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Nitish\\Downloads\\jsgfsj.png"));
		lblNewLabel.setBounds(45, 0, 113, 122);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Father's Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(69, 156, 151, 29);
		contentPane.add(lblNewLabel_1);
		
		fname = new JTextField();
		fname.setBounds(261, 160, 282, 27);
		contentPane.add(fname);
		fname.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(69, 189, 151, 29);
		contentPane.add(lblNewLabel_1_1);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(261, 193, 282, 27);
		contentPane.add(email);
		
		JLabel lblNewLabel_1_2 = new JLabel("Phone");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(69, 221, 89, 29);
		contentPane.add(lblNewLabel_1_2);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(261, 225, 282, 27);
		contentPane.add(phone);
		
		JLabel don = new JLabel("Date Of Birth");
		don.setFont(new Font("Tahoma", Font.BOLD, 18));
		don.setBounds(69, 260, 130, 29);
		contentPane.add(don);
		
		JComboBox date = new JComboBox();
		date.setFont(new Font("Tahoma", Font.BOLD, 11));
		date.setModel(new DefaultComboBoxModel(new String[] {"--Date--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		date.setBounds(261, 263, 98, 29);
		contentPane.add(date);
		
		JComboBox month = new JComboBox();
		month.setFont(new Font("Tahoma", Font.BOLD, 11));
		month.setModel(new DefaultComboBoxModel(new String[] {"--Month--", "Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"}));
		month.setBounds(369, 263, 82, 29);
		contentPane.add(month);
		
		JComboBox year = new JComboBox();
		year.setFont(new Font("Tahoma", Font.BOLD, 10));
		year.setModel(new DefaultComboBoxModel(new String[] {"--Year--", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970"}));
		year.setBounds(457, 263, 86, 29);
		contentPane.add(year);
		
		JLabel gender = new JLabel("Gender");
		gender.setFont(new Font("Tahoma", Font.BOLD, 18));
		gender.setBounds(69, 300, 130, 29);
		contentPane.add(gender);
		
		JRadioButton male = new JRadioButton("Male");
		male.setBackground(new Color(176, 224, 230));
		male.setHorizontalAlignment(SwingConstants.CENTER);
		male.setFont(new Font("Tahoma", Font.BOLD, 15));
		male.setBounds(246, 301, 128, 29);
		contentPane.add(male);
		
		JRadioButton female = new JRadioButton("Female");
		female.setBackground(new Color(176, 224, 230));
		female.setHorizontalAlignment(SwingConstants.CENTER);
		female.setFont(new Font("Tahoma", Font.BOLD, 15));
		female.setBounds(406, 301, 123, 29);
		contentPane.add(female);
		eAccountGroup = new ButtonGroup();
        eAccountGroup.add(male);
        eAccountGroup.add(female);
		
		JLabel martial = new JLabel("Martial Status");
		martial.setFont(new Font("Tahoma", Font.BOLD, 18));
		martial.setBounds(69, 336, 130, 29);
		contentPane.add(martial);
		
		JRadioButton married = new JRadioButton("Married");
		married.setBackground(new Color(176, 224, 230));
		married.setHorizontalAlignment(SwingConstants.CENTER);
		married.setFont(new Font("Tahoma", Font.BOLD, 15));
		married.setBounds(258, 342, 128, 29);
		contentPane.add(married);
		
		JRadioButton unmarried = new JRadioButton("Unmarried");
		unmarried.setBackground(new Color(176, 224, 230));
		unmarried.setHorizontalAlignment(SwingConstants.CENTER);
		unmarried.setFont(new Font("Tahoma", Font.BOLD, 15));
		unmarried.setBounds(420, 342, 123, 29);
		contentPane.add(unmarried);
		eAccountGroup = new ButtonGroup();
        eAccountGroup.add(married);
        eAccountGroup.add(unmarried);
		
		JLabel lblNewLabel_1_3 = new JLabel("Address");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(69, 376, 89, 29);
		contentPane.add(lblNewLabel_1_3);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(261, 380, 282, 27);
		contentPane.add(address);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("City");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_3_1.setBounds(69, 408, 89, 29);
		contentPane.add(lblNewLabel_1_3_1);
		
		City = new JTextField();
		City.setColumns(10);
		City.setBounds(261, 412, 282, 27);
		contentPane.add(City);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("State");
		lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_3_2.setBounds(69, 441, 89, 29);
		contentPane.add(lblNewLabel_1_3_2);
		
		state = new JTextField();
		state.setColumns(10);
		state.setBounds(261, 445, 282, 27);
		contentPane.add(state);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("Pincode");
		lblNewLabel_1_3_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_3_3.setBounds(69, 474, 89, 29);
		contentPane.add(lblNewLabel_1_3_3);
		
		pin = new JTextField();
		pin.setColumns(10);
		pin.setBounds(261, 478, 282, 27);
		contentPane.add(pin);
		
		JButton next = new JButton("Next");
		next.setBackground(new Color(70, 130, 180));
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				user=new User();
				user.setName(name.getText());
				user.setFname(fname.getText());
				user.setPhone(Long.parseLong(phone.getText().toString()));
				user.setEmail(email.getText());
			   user.setDob((String) date.getSelectedItem()+""+month.getSelectedItem()+""+year.getSelectedItem());
			   user.setGender(male.isSelected()?"male":"female");
			   user.setAddress(address.getText());
			   user.setCity(City.getText());
			   user.setState(state.getText());
			 user.setPincode(Integer.parseInt(pin.getText()));
			 user.setMarital(married.isSelected()?"married":"unmarried");
			
			 
				RegisterPage2 rp=new RegisterPage2(user);
				
				
				rp.setVisible(true);
				setVisible(false);
				
			   
			   
				
				
				
				
				
			}
		});
		next.setFont(new Font("Tahoma", Font.BOLD, 15));
		next.setBounds(284, 515, 105, 35);
		contentPane.add(next);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login lg=new Login();
				lg.setVisible(true);
				setVisible(false);
			}
		});
		back.setFont(new Font("Tahoma", Font.BOLD, 15));
		back.setBackground(Color.RED);
		back.setBounds(414, 516, 105, 34);
		contentPane.add(back);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(261, 127, 282, 27);
		contentPane.add(name);
		
		JLabel lblNewLabel_1_4 = new JLabel("Name");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_4.setBounds(69, 127, 89, 29);
		contentPane.add(lblNewLabel_1_4);
	}
}


package com.netbanking.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.netbanking.dao.Controller;
import com.netbanking.entities.User;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.ComponentOrientation;
import javax.swing.JPasswordField;
import java.awt.Toolkit;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField uid;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Heaven Bank");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Nitish\\Downloads\\jsgfsj.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeavenBank = new JLabel("Heaven Bank");
		lblHeavenBank.setBounds(242, 28, 258, 49);
		lblHeavenBank.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeavenBank.setFont(new Font("Arial Black", Font.BOLD, 34));
		contentPane.add(lblHeavenBank);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Nitish\\Downloads\\abc.png"));
		lblNewLabel.setBounds(41, 70, 383, 380);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Nitish\\Downloads\\ab.png"));
		lblNewLabel_1.setBounds(538, 122, 141, 135);
		contentPane.add(lblNewLabel_1);
		
		uid = new JTextField();
		uid.setHorizontalAlignment(SwingConstants.CENTER);
		uid.setFont(new Font("Tahoma", Font.BOLD, 15));
		uid.setName("");
		uid.setBounds(525, 274, 191, 32);
		contentPane.add(uid);
		uid.setColumns(10);
		
		pass = new JPasswordField();
		pass.setFont(new Font("Tahoma", Font.BOLD, 15));
		pass.setHorizontalAlignment(SwingConstants.CENTER);
		pass.setColumns(10);
		pass.setBounds(525, 311, 191, 32);
		contentPane.add(pass);
		
		JButton login = new JButton("Login");
		login.setFont(new Font("Tahoma", Font.BOLD, 17));
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userId = uid.getText();
				String pwd = pass.getText();
				
				Controller cont=new Controller();
				User user=cont.checkLogin(userId,pwd);
				
				
				if(user==null) {
					JOptionPane.showMessageDialog(getParent(), "UserId & Password is incorrect!!");
					uid.setText("");
					pass.setText("");

				}
				else {
					JOptionPane.showMessageDialog(getParent(), "Logged-in Successfull!!");
					Home home=new Home(user);
					home.setVisible(true);
					setVisible(false);

				}
			}
		});
		login.setBounds(498, 354, 104, 32);
		contentPane.add(login);
		
		JButton register = new JButton("Register");
		register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterPage1 rg=new RegisterPage1();
				rg.setVisible(true);
				setVisible(false);
			
			}
		});
		register.setFont(new Font("Tahoma", Font.BOLD, 17));
		register.setBounds(606, 354, 110, 32);
		contentPane.add(register);
		
		JLabel lblNewLabel_2 = new JLabel("UserId :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(426, 284, 89, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Password :");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(426, 315, 89, 22);
		contentPane.add(lblNewLabel_2_1);
		
		JButton lblNewLabel_3 = new JButton("");
		lblNewLabel_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstPage fp=new FirstPage();
				fp.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_3.setBackground(new Color(176, 224, 230));
		lblNewLabel_3.setBorder(null);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Nitish\\Downloads\\hgh.png"));
		lblNewLabel_3.setBounds(41, 18, 59, 59);
		contentPane.add(lblNewLabel_3);
	}
}

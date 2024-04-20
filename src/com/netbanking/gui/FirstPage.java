package com.netbanking.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class FirstPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstPage frame = new FirstPage();
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
	public FirstPage() {
		setTitle("Heaven Bank");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Nitish\\Downloads\\jsgfsj.png"));
		setForeground(new Color(0, 255, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setForeground(new Color(0, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Heaven Bank");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 34));
		lblNewLabel.setBounds(26, 25, 781, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Nitish\\Downloads\\331.jpg"));
		lblNewLabel_1.setBounds(58, 97, 750, 376);
		contentPane.add(lblNewLabel_1);
		
		JButton proceed = new JButton("Proceed");
		proceed.setFocusPainted(false);
		proceed.setFocusTraversalPolicyProvider(true);
		proceed.setHorizontalTextPosition(SwingConstants.CENTER);
		proceed.setVerifyInputWhenFocusTarget(false);
		proceed.setRolloverEnabled(false);
		proceed.setRequestFocusEnabled(false);
		proceed.setBorder(null);
		proceed.setBorderPainted(false);
		proceed.setIgnoreRepaint(true);
		proceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(getParent(), "Welcome to Haven Bank");
				Login lg=new Login();
				lg.setVisible(true);
				setVisible(false);
			}
		});
		proceed.setBackground(new Color(240, 255, 255));
		proceed.setForeground(new Color(0, 0, 0));
		proceed.setFont(new Font("Segoe UI", Font.BOLD, 20));
		proceed.setBounds(642, 413, 154, 46);
		contentPane.add(proceed);
	}
}

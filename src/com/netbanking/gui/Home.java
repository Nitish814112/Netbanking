package com.netbanking.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.netbanking.dao.Controller;
import com.netbanking.entities.Data;
import com.netbanking.entities.User;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JSplitPane;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Home extends JFrame {

	private JPanel contentPane;
	private JButton deposit;
	private JButton withdraw;
	private JButton balance;
	private JButton statement;
	private User user;
	private JTextArea txtrDisplayBox;
	long originalBal;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Home frame = new Home();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Home(User user) {
		setTitle("Heaven Bank");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Nitish\\Downloads\\jsgfsj.png"));
	this.user=user;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeavenBank = new JLabel("Heaven Bank");
		lblHeavenBank.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeavenBank.setFont(new Font("Arial Black", Font.BOLD, 34));
		lblHeavenBank.setBounds(288, 64, 258, 49);
		contentPane.add(lblHeavenBank);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Nitish\\Downloads\\jsgfsj.png"));
		lblNewLabel.setBounds(124, 19, 113, 122);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 199, 358, 312);
		contentPane.add(scrollPane);
		
		txtrDisplayBox = new JTextArea();
		txtrDisplayBox.setAutoscrolls(false);
		scrollPane.setViewportView(txtrDisplayBox);
		//JScrollPane scrollPane = new JScrollPane(txtrDisplayBox);
		txtrDisplayBox.setWrapStyleWord(true);
		txtrDisplayBox.setLineWrap(true);
		txtrDisplayBox.setMargin(new Insets(10, 10, 10, 10));
		txtrDisplayBox.setText("Display Box");
		txtrDisplayBox.setFont(new Font("Monospaced", Font.BOLD, 18));
		txtrDisplayBox.setEditable(false);

		deposit = new JButton("Deposit");
		deposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrDisplayBox.setText("");
				int showConfirmDialog=0;
				String input = JOptionPane.showInputDialog("Enter Deposit amount :");
				if(input!=null && !input.isEmpty() ) {
					String text = deposit.getText();
					//System.out.println(text);
					
					long deposit = user.getBalance();
					long newDeposit=Long.parseLong(input);
					long balance= deposit+newDeposit;
					user.setBalance(balance);
					Date date=new Date();
					String uid = user.getUid();
					Controller cont=new Controller();
					int feedback=cont.depoType(uid,newDeposit,text,date);
//					if(feedback!=0) {
//						System.out.println("success");
//					}
//					else {
//						System.out.println("went wrong");
//					}
					int status=cont.updateBalance(uid,balance);
					if(status!=0)
					{
						JOptionPane.showMessageDialog(getParent(),"Rs."+ newDeposit+ " Successfully Added in your Account!! ");
					}
					else
					{
						JOptionPane.showMessageDialog(getParent(), "Something went wrong, please try Again!!");

					}
				}
				else 
				{
					 showConfirmDialog = JOptionPane.showConfirmDialog(getParent(), "Do you want to cancel your Transaction??");	
					
				}
				
				
			}
		});
		deposit.setFont(new Font("Tahoma", Font.BOLD, 15));
		deposit.setBounds(425, 218, 182, 41);
		contentPane.add(deposit);
		
		withdraw = new JButton("WithDraw");
		withdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrDisplayBox.setText("");
				String input = JOptionPane.showInputDialog("Enter Withdraw amount :");
				if(input!=null && !input.isEmpty())
						{
					String text = withdraw.getText();
					Date date=new Date();
					long amount = user.getBalance();
					long withdrawAmt=Long.parseLong(input);
					if(amount>withdrawAmt) {
						long balance= amount-withdrawAmt;
						user.setBalance(balance);
						String uid = user.getUid();
						
						Controller cont=new Controller();
						int feedback=cont.withdrawType(uid, withdrawAmt, text, date);
						int status=cont.updateBalance(uid,balance);
						if(status!=0)
						{
							JOptionPane.showMessageDialog(getParent(),  " Please collect!! Rs."+withdrawAmt);
						}
						else
						{
							JOptionPane.showMessageDialog(getParent(), "Something went wrong, please try Again!!");

						}
					}else {
						
						JOptionPane.showMessageDialog(getParent(), "Low Balance!!");
					}
						}
				else {
					JOptionPane.showConfirmDialog(getParent(), "Do you want to cancel your Transaction??");
				}
				
				
				
				
				
			}
		});
		withdraw.setFont(new Font("Tahoma", Font.BOLD, 15));
		withdraw.setBounds(425, 258, 182, 41);
		contentPane.add(withdraw);
		
		balance = new JButton("Balance Enquiry");
		balance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	txtrDisplayBox.setText("Available balance : Rs. "+user.getBalance());
				txtrDisplayBox.setText("         Heaven Bank \n-----------------------------\nAvailable Balance: Rs."+user.getBalance()+"\n-----------------------------\n");
				//BalanceDisplaybox.setText("your available balance : \"+user.getBalance()");
			}
		});
		balance.setFont(new Font("Tahoma", Font.BOLD, 15));
		balance.setBounds(425, 297, 182, 41);
		contentPane.add(balance);
		
		JButton passwordChange = new JButton("Password Change");
		passwordChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String pass = JOptionPane.showInputDialog(getParent(), "Enter Old Password");
				if(pass!=null && !pass.isEmpty()) {
					String uid = user.getUid();
					String password = user.getPassword();
					if(pass.equals(password)) {
						String newPassword = JOptionPane.showInputDialog(getParent(),"Enter new Password");
						user.setPassword(newPassword);
						Controller cont = new Controller();
						int status=cont.updatePassword(uid,newPassword);
						if(status!=0) {
							JOptionPane.showMessageDialog(getParent(), "Password Updated Successfully!!");
							
						}else JOptionPane.showMessageDialog(getParent(), "Something went wrong,please try Again!!");
						
					}else JOptionPane.showMessageDialog(getParent(), "Password is incorrect!!");
				}else JOptionPane.showConfirmDialog(getParent(), "Are you sure???");
				
			}
		});
		passwordChange.setFont(new Font("Tahoma", Font.BOLD, 15));
		passwordChange.setBounds(426, 377, 182, 41);
		contentPane.add(passwordChange);
		
		statement = new JButton("Mini Statement");
		statement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrDisplayBox.setText("");
				Controller cont=new Controller();
				String uid = user.getUid();
				List<Data> user1=cont.getData(uid);
				txtrDisplayBox.setText("         Heaven Bank \n\nA/C Name:"+user.getName()+" UserId :"+user.getUid()+"\n-----------------------------\nAvailable Balance: Rs."+user.getBalance()+"\n-----------------------------\n");
				for(Data d:user1) {
					txtrDisplayBox.append(d.getDate() + " " + d.getType() + " Rs. "  + d.getAmount() + "\n-----------------------------\n");
					
				}
				
				
			}
			
		});
		statement.setFont(new Font("Tahoma", Font.BOLD, 15));
		statement.setBounds(425, 337, 182, 41);
		contentPane.add(statement);
		
		JButton logOut = new JButton("LogOut");
		logOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login lg=new Login();
				lg.setVisible(true);
				setVisible(false);
			}
		});
		logOut.setFont(new Font("Tahoma", Font.BOLD, 15));
		logOut.setBounds(425, 458, 182, 41);
		contentPane.add(logOut);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Nitish\\Downloads\\hgh.png"));
		lblNewLabel_3.setBounds(40, 58, 72, 59);
		contentPane.add(lblNewLabel_3);
		String name = this.user.getName();
		
		
		JLabel lblNewLabel_1 = new JLabel("Welcome "+name);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(172, 158, 269, 30);
		contentPane.add(lblNewLabel_1);
		
		JButton btnDeleteAccount = new JButton("Delete Account");
		btnDeleteAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int showConfirmDialog = JOptionPane.showConfirmDialog(getParent(), "Are you sure you want to delete your Account ?");
				if(showConfirmDialog==0) {
					String uid = user.getUid();
					Controller cont=new Controller();
					int status=cont.deleteUser(uid);
					cont.delData(uid);
					if(status!=0)
					{
						JOptionPane.showMessageDialog(getParent(), "Account deleted successfully!!");
						FirstPage fp=new FirstPage();
						fp.setVisible(true);
						setVisible(false);
						
					}else {
						JOptionPane.showMessageDialog(getParent(), "Something went wrong,please try Again!!");
					}
				}
			}
		});
		btnDeleteAccount.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDeleteAccount.setBounds(426, 418, 182, 41);
		contentPane.add(btnDeleteAccount);
		
		//JScrollPane scrollPane = new JScrollPane();
		
	}
}

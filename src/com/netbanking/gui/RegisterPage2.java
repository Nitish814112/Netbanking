package com.netbanking.gui;

import java.awt.EventQueue;

import com.netbanking.dao.Controller;
import com.netbanking.entities.User;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;
import com.netbanking.entities.User;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

  

public class RegisterPage2 extends JFrame {
	private ButtonGroup eAccountGroup;
	private JPanel contentPane;
	private JTextField password;
	private JComboBox religion;
	private JComboBox category;
	private JComboBox income;
	private JComboBox education;
	private JComboBox occupation;
	private JRadioButton yes;
	private JRadioButton no;
	private JTextField userId;
	private User user;
	
	
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					RegisterPage2 frame = new RegisterPage2();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//		
//		
//	}
//	public RegisterPage2(User user)
//	{
//		
//	}

	/**
	 * Create the frame.
	 */
	
	
	public RegisterPage2(User user) {
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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Nitish\\Downloads\\jsgfsj.png"));
		lblNewLabel.setBounds(58, 21, 113, 122);
		contentPane.add(lblNewLabel);
		
		JLabel lblHeavenBank = new JLabel("Heaven Bank");
		lblHeavenBank.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeavenBank.setFont(new Font("Arial Black", Font.BOLD, 34));
		lblHeavenBank.setBounds(227, 32, 258, 49);
		contentPane.add(lblHeavenBank);
		
		JLabel lblApplicationForm = new JLabel("Application Form");
		lblApplicationForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblApplicationForm.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblApplicationForm.setBounds(121, 80, 457, 29);
		contentPane.add(lblApplicationForm);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Religion");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_2_1.setBounds(69, 168, 130, 29);
		contentPane.add(lblNewLabel_1_2_1);
		
		religion = new JComboBox();
		religion.setModel(new DefaultComboBoxModel(new String[] {"Select", "Hindu", "Muslim", "Others"}));
		religion.setFont(new Font("Tahoma", Font.BOLD, 11));
		religion.setBounds(281, 171, 267, 29);
		contentPane.add(religion);
		
		JLabel cat = new JLabel("Category");
		cat.setFont(new Font("Tahoma", Font.BOLD, 18));
		cat.setBounds(69, 201, 130, 29);
		contentPane.add(cat);
		
		category = new JComboBox();
		category.setModel(new DefaultComboBoxModel(new String[] {"Select", "General", "OBC", "SC", "ST", "Others"}));
		category.setFont(new Font("Tahoma", Font.BOLD, 11));
		category.setBounds(281, 204, 267, 29);
		contentPane.add(category);
		
		JLabel inc = new JLabel("Income");
		inc.setFont(new Font("Tahoma", Font.BOLD, 18));
		inc.setBounds(69, 237, 130, 29);
		contentPane.add(inc);
		
		income = new JComboBox();
		income.setModel(new DefaultComboBoxModel(new String[] {"Select", "50k---150k", "150k---350k", "350k---500k", "500k---750k", "750k & Above"}));
		income.setFont(new Font("Tahoma", Font.BOLD, 11));
		income.setBounds(281, 240, 267, 29);
		contentPane.add(income);
		
		JLabel edu = new JLabel("Education");
		edu.setHorizontalTextPosition(SwingConstants.CENTER);
		edu.setFont(new Font("Tahoma", Font.BOLD, 18));
		edu.setBounds(69, 271, 130, 32);
		contentPane.add(edu);
		
		education = new JComboBox();
		education.setModel(new DefaultComboBoxModel(new String[] {"Select", "Masters", "Graduate -IT", "Graduate-Non IT", "Intermediate", "Matic", "Others"}));
		education.setFont(new Font("Tahoma", Font.BOLD, 11));
		education.setBounds(281, 274, 267, 29);
		contentPane.add(education);
		
		JLabel occ = new JLabel("Occupation");
		occ.setHorizontalTextPosition(SwingConstants.CENTER);
		occ.setFont(new Font("Tahoma", Font.BOLD, 18));
		occ.setBounds(69, 305, 130, 32);
		contentPane.add(occ);
		
		occupation = new JComboBox();
		occupation.setModel(new DefaultComboBoxModel(new String[] {"Select", "Professional", "Non-Professional", "Govenment", "Business"}));
		occupation.setFont(new Font("Tahoma", Font.BOLD, 11));
		occupation.setBounds(281, 308, 267, 29);
		contentPane.add(occupation);
		
		JLabel lblNewLabel_1 = new JLabel("PAN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(69, 337, 89, 29);
		contentPane.add(lblNewLabel_1);
		
		JTextField pan = new JTextField();
		pan.setColumns(10);
		pan.setBounds(281, 341, 267, 27);
		contentPane.add(pan);
		
		JLabel lblNewLabel_1_1 = new JLabel("Aadhar/UID");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(69, 369, 113, 29);
		contentPane.add(lblNewLabel_1_1);
		
		JTextField adhar = new JTextField();
		adhar.setColumns(10);
		adhar.setBounds(281, 373, 267, 27);
		contentPane.add(adhar);
		
		JLabel Existingacc = new JLabel("Existing Account");
		Existingacc.setFont(new Font("Tahoma", Font.BOLD, 18));
		Existingacc.setBounds(69, 410, 150, 29);
		contentPane.add(Existingacc);
		
		yes = new JRadioButton("Yes");
		yes.setBackground(new Color(176, 224, 230));
		yes.setFont(new Font("Tahoma", Font.BOLD, 15));
		yes.setBounds(291, 407, 71, 29);
		contentPane.add(yes);
		
		no = new JRadioButton("No");
		no.setBackground(new Color(176, 224, 230));
		no.setFont(new Font("Tahoma", Font.BOLD, 15));
		no.setBounds(417, 407, 82, 29);
		contentPane.add(no);
		eAccountGroup = new ButtonGroup();
        eAccountGroup.add(yes);
        eAccountGroup.add(no);
		
		JLabel lblNewLabel_1_2 = new JLabel("UserID");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(69, 438, 89, 29);
		contentPane.add(lblNewLabel_1_2);
		
		userId = new JTextField();
		userId.setToolTipText("Must be AlphaNumeric");
		userId.setColumns(10);
		userId.setBounds(281, 442, 267, 27);
		contentPane.add(userId);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Password");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_2_2.setBounds(69, 467, 89, 29);
		contentPane.add(lblNewLabel_1_2_2);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(281, 471, 267, 27);
		contentPane.add(password);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterPage1 lg=new RegisterPage1();
				lg.setVisible(true);
				setVisible(false);
			}
		});
		back.setBackground(new Color(255, 0, 0));
		back.setFont(new Font("Tahoma", Font.BOLD, 15));
		back.setBounds(424, 509, 113, 41);
		contentPane.add(back);
		
		JButton register = new JButton("Register");
		register.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				user.setReligion((String) religion.getSelectedItem());
				user.setCategory((String) category.getSelectedItem());
				user.setIncome((String) income.getSelectedItem());
				user.setEducation((String) education.getSelectedItem());
				user.setOccupation((String) occupation.getSelectedItem());
				user.setE_account(yes.isSelected()?"Yes":"no");
			    user.setAadhar(Long.parseLong(adhar.getText().toString()));
			    user.setPan(pan.getText());
				user.setUid(userId.getText());
				user.setPassword(password.getText());
				
				Controller cont=new Controller();
				int status=cont.registerUser(user);
				if(status>0) {
					JOptionPane.showMessageDialog(getParent(), "Registration Successfull!!");
					Login lg=new Login();
					lg.setVisible(true);
					setVisible(false);				}
				else
				{
					JOptionPane.showMessageDialog(getParent(), "Something went wrong,please try Again!!");
				}
				
				
				
				
				
				
//				user.setPan(pan.getText());
				
				
				
				
				
				
				
			}
		});
		register.setBackground(new Color(0, 255, 0));
		register.setFont(new Font("Tahoma", Font.BOLD, 15));
		register.setBounds(301, 509, 113, 41);
		contentPane.add(register);
	}

	

	
	

}


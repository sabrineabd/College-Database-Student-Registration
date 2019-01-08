package com.groupone.gui;


import com.groupone.middle.Student;
import com.groupone.middle.PasswordSecurity;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;


public class CreateAccountWindow extends JFrame {


	private JPanel contentPane;
	
	private JTextField FirstName;
	private JTextField LastName;
	private JTextField Email;
	private JTextField ComfEmail;
	private JPasswordField password;  
	private JPasswordField ComfPassword;
	private JTextField Username;
	private JButton btnCreateAccount;
	private JButton btnReturn;
	
	

//Gui layout
public CreateAccountWindow() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 500, 400);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(new BorderLayout(0, 0));
	
	JPanel CreateAccountPanel = new JPanel();
	contentPane.add(CreateAccountPanel, BorderLayout.NORTH);
	
	
	GridBagLayout gbl_CreateAccountFormPanel = new GridBagLayout();
	
	gbl_CreateAccountFormPanel.columnWidths = new int[]{0, 0, 0, 0, 185, 0, 0, 0, 0, 0};
	gbl_CreateAccountFormPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
	gbl_CreateAccountFormPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	gbl_CreateAccountFormPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	CreateAccountPanel.setLayout(gbl_CreateAccountFormPanel);
	
	JLabel lblCreateAccount = new JLabel("Enter account information below.");
	
	GridBagConstraints gbc_CreateAccount = new GridBagConstraints();
	gbc_CreateAccount.gridheight = 2;
	gbc_CreateAccount.insets = new Insets(0, 0, 5, 5);
	gbc_CreateAccount.gridx = 4;
	gbc_CreateAccount.gridy = 0;
	
	
	CreateAccountPanel.add(lblCreateAccount, gbc_CreateAccount);
	lblCreateAccount.setHorizontalAlignment(SwingConstants.CENTER);
	
	//First Name field
	JLabel lblFirstName = new JLabel("First Name");
	
	GridBagConstraints gbc_lblFirstName = new GridBagConstraints();
	gbc_lblFirstName.anchor = GridBagConstraints.WEST;
	gbc_lblFirstName.insets = new Insets(0, 0, 5, 5);
	gbc_lblFirstName.gridx = 4;
	gbc_lblFirstName.gridy = 1;
	
	CreateAccountPanel.add(lblFirstName, gbc_lblFirstName);
	
	FirstName = new JTextField();
	
	GridBagConstraints gbc_FirstName = new GridBagConstraints();
	gbc_FirstName.insets = new Insets(0, 0, 5, 5);
	gbc_FirstName.fill = GridBagConstraints.HORIZONTAL;
	gbc_FirstName.gridx = 4;
	gbc_FirstName.gridy = 2;
	
	CreateAccountPanel.add(FirstName, gbc_FirstName);
	FirstName.setColumns(10);
	
	//Last Name field
	JLabel lblLastName = new JLabel("Last Name");
	
	GridBagConstraints gbc_lblLastName = new GridBagConstraints();
	gbc_lblLastName.anchor = GridBagConstraints.WEST;
	gbc_lblLastName.insets = new Insets(0, 0, 5, 5);
	gbc_lblLastName.gridx = 4;
	gbc_lblLastName.gridy = 3;
	
	CreateAccountPanel.add(lblLastName, gbc_lblLastName);
	
	LastName = new JTextField();
	
	
	GridBagConstraints gbc_LastName = new GridBagConstraints();
	gbc_LastName.insets = new Insets(0, 0, 5, 5);
	gbc_LastName.fill = GridBagConstraints.HORIZONTAL;
	gbc_LastName.gridx = 4;
	gbc_LastName.gridy = 4;
	
	CreateAccountPanel.add(LastName, gbc_LastName);
	LastName.setColumns(10);
	
	// Username Field
		JLabel lblUsername = new JLabel("Username:");
		
		GridBagConstraints gbc_lblUsernmame = new GridBagConstraints();
		gbc_lblUsernmame.anchor = GridBagConstraints.WEST;
		gbc_lblUsernmame.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsernmame.gridx = 4;
		gbc_lblUsernmame.gridy = 5;
		
		CreateAccountPanel.add(lblUsername, gbc_lblUsernmame);
		
		Username = new JTextField();
		
		
		GridBagConstraints gbc_Username = new GridBagConstraints();
		gbc_Username.insets = new Insets(0, 0, 5, 5);
		gbc_Username.fill = GridBagConstraints.HORIZONTAL;
		gbc_Username.gridx = 4;
		gbc_Username.gridy = 6;
		
		CreateAccountPanel.add(Username, gbc_Username);
		Username.setColumns(10);
		
	
	
	//Password Field
	JLabel lblPassword = new JLabel("Password:");
	
	GridBagConstraints gbc_lblPassword = new GridBagConstraints();
	gbc_lblPassword.anchor = GridBagConstraints.WEST;
	gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
	gbc_lblPassword.gridx = 4;
	gbc_lblPassword.gridy = 7;
	
	CreateAccountPanel.add(lblPassword, gbc_lblPassword);
	
	password = new JPasswordField();
	
	GridBagConstraints gbc_password = new GridBagConstraints();
	gbc_password.fill = GridBagConstraints.HORIZONTAL;
	gbc_password.insets = new Insets(0, 0, 5, 5);
	gbc_password.gridx = 4;
	gbc_password.gridy = 8;
	
	CreateAccountPanel.add(password, gbc_password);
	
	//Confirm Password field
	JLabel lblComfPassword = new JLabel("Confirm Password:");
	
	GridBagConstraints gbc_lblComfPassword = new GridBagConstraints();
	gbc_lblComfPassword.anchor = GridBagConstraints.WEST;
	gbc_lblComfPassword.insets = new Insets(0, 0, 5, 5);
	gbc_lblComfPassword.gridx = 4;
	gbc_lblComfPassword.gridy = 9;
	
	CreateAccountPanel.add(lblComfPassword, gbc_lblComfPassword);
	
	ComfPassword = new JPasswordField();
	
	
	GridBagConstraints gbc_Comfpassword = new GridBagConstraints();
	gbc_Comfpassword.fill = GridBagConstraints.HORIZONTAL;
	gbc_Comfpassword.insets = new Insets(0, 0, 5, 5);
	gbc_Comfpassword.gridx = 4;
	gbc_Comfpassword.gridy = 10;
	
	CreateAccountPanel.add(ComfPassword, gbc_Comfpassword);
	
	//Email field	
	JLabel lblEmail = new JLabel("Enter E-mail Address");
	
	GridBagConstraints gbc_lblEmail = new GridBagConstraints();
	 gbc_lblEmail.anchor = GridBagConstraints.WEST;
	 gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
	 gbc_lblEmail.gridx = 4;
	 gbc_lblEmail.gridy = 11;
	
	CreateAccountPanel.add(lblEmail,  gbc_lblEmail);
	
	Email = new  JTextField();
	
	
	GridBagConstraints gbc_Email = new GridBagConstraints();
	gbc_Email.fill = GridBagConstraints.HORIZONTAL;
	gbc_Email.insets = new Insets(0, 0, 5, 5);
	gbc_Email.gridx = 4;
	gbc_Email.gridy = 12;
	
	CreateAccountPanel.add(Email, gbc_Email);
	
	//Confirm email field
	JLabel lblComfEmail = new JLabel("Confirm E-mail Address");
	
	GridBagConstraints gbc_lblComfEmail = new GridBagConstraints();
	 gbc_lblComfEmail.anchor = GridBagConstraints.WEST;
	 gbc_lblComfEmail.insets = new Insets(0, 0, 5, 5);
	 gbc_lblComfEmail.gridx = 4;
	 gbc_lblComfEmail.gridy = 13;
	
	CreateAccountPanel.add(lblComfEmail,  gbc_lblComfEmail);
	
	ComfEmail = new  JTextField();
	
	
	GridBagConstraints gbc_ComfEmail = new GridBagConstraints();
	gbc_ComfEmail.fill = GridBagConstraints.HORIZONTAL;
	gbc_ComfEmail.insets = new Insets(0, 0, 5, 5);
	gbc_ComfEmail.gridx = 4;
	gbc_ComfEmail.gridy = 14;
	
	CreateAccountPanel.add(ComfEmail, gbc_ComfEmail);
	
	//Button create account 
	btnCreateAccount = new JButton("Create Account");
	btnCreateAccount.addActionListener(new ButtonClickListener());
	
	GridBagConstraints gbc_btnCreateAccount = new GridBagConstraints();
	gbc_btnCreateAccount.gridheight = 2;
	gbc_btnCreateAccount.anchor = GridBagConstraints.CENTER;
	gbc_btnCreateAccount.insets = new Insets(0, 0, 0, 5);
	gbc_btnCreateAccount.gridx = 4;
	gbc_btnCreateAccount.gridy = 15;
	
	CreateAccountPanel.add(btnCreateAccount, gbc_btnCreateAccount);
	
	//button return
	btnReturn= new JButton("Return");
	btnReturn.addActionListener(new ButtonClickListener());
	
	GridBagConstraints gbc_Return = new GridBagConstraints();
	gbc_Return.gridheight = 2;
	gbc_Return.anchor = GridBagConstraints.WEST;
	gbc_Return.insets = new Insets(0, 0, 0,  5);
	gbc_Return.gridx = 4;
	gbc_Return.gridy = 15;
	
	CreateAccountPanel.add(btnReturn, gbc_Return);
	
	
	
}


//Button listener
public class ButtonClickListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		 Object source = e.getSource();
		if(source == btnCreateAccount) {
				if(CheckAccountInfo()) {
				CreateAccount();
				}
				
			} else if(source == btnReturn) {
				Return();
			}
		}
	}
	//Returns to landing
	private void Return() {
		JFrame frame = new JFrame("Course Registration");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LandingPage panel = new LandingPage();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setSize(200, 140);

        frame.setVisible(true);
	   
        dispose();
	}



	// Checks to see if data is entered fully, checks if password and email match.
	// Returns true only all data is correct.
	private boolean CheckAccountInfo() {
		String StudentFirstName = this.FirstName.getText();
		String StudentLastName = this.LastName.getText();
		String StudentUsername = this.Username.getText();
		String StudentPassword = new String(this.password.getPassword());
		String StudentComfPassword = new String(this.ComfPassword.getPassword());
		String StudentEmail = this.Email.getText();
		String StudentComfEmail =  this.ComfEmail.getText();
		
		
		if (StudentFirstName.isEmpty() || StudentLastName.isEmpty() || StudentPassword.isEmpty() 
			|| StudentEmail.isEmpty() || StudentComfEmail.isEmpty() || StudentUsername.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Please fill in all forms.");
			return false;
		}
		
		if(!(StudentPassword.equals(StudentComfPassword))) {
			JOptionPane.showMessageDialog(null, "Passwords do not match.");
			return false;
		}
		if(!(StudentEmail.equalsIgnoreCase(StudentComfEmail))) {
			JOptionPane.showMessageDialog(null, "Emails do not mathch.");
					return false;
				}
			
		
		return true;
		
	}
	//Passes student account info onto database, passwords is hashed. Returns to landing if server accepts data.
	private void CreateAccount() {
		String StudentFirstName = this.FirstName.getText();
		String StudentLastName = this.LastName.getText();
		String StudentUsername = this.Username.getText();
		String StudentPassword = new String(this.password.getPassword());
		String StudentEmail = this.Email.getText();
		Student student = new Student(StudentFirstName, StudentLastName, StudentEmail, StudentUsername, StudentPassword);
		PasswordSecurity.addHashToStudent(StudentUsername, StudentPassword);
		
		if(student.emailExists()) {
			JOptionPane.showMessageDialog(null, "Emails already exist.");
		} else {
		JOptionPane.showMessageDialog(null, "Account Created");
			Return();
		}
		
		
		
	}


}

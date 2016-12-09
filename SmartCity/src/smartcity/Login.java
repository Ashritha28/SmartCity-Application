package smartcity;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField usernametext;
	private JTextField passwordtext;
	Connection connect=null;

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
		setTitle("Login");
		DbConnect db=new DbConnect();
		connect=db.dataConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500,800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\login.jpg"));
		background.setBounds(0,0, 1500, 800);
		contentPane.add(background);
		
		JLabel usernamelabel = new JLabel("Username");
		background.add(usernamelabel);
		usernamelabel.setForeground(Color.WHITE);
		usernamelabel.setBounds(454, 570, 63, 14);
		
		JLabel Passwordlabel = new JLabel("Password");
		background.add(Passwordlabel);
		Passwordlabel.setForeground(Color.WHITE);
		Passwordlabel.setBounds(454, 617, 63, 14);
		
		JButton btnLogin = new JButton("Login");
		background.add(btnLogin);
		background.setForeground(Color.BLACK);
		background.setBackground(Color.WHITE);
		btnLogin.setBounds(700, 590, 117, 25);
		
		usernametext = new JTextField();
		background.add(usernametext);
		usernametext.setBounds(561, 570, 86, 20);
		usernametext.setColumns(10);
		
		passwordtext = new JTextField();
		background.add(passwordtext);
		passwordtext.setBounds(561, 617, 86, 20);
		passwordtext.setColumns(10);
		
		JLabel lblPleaseLogin = new JLabel("Please login");
		background.add(lblPleaseLogin);
		lblPleaseLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPleaseLogin.setForeground(Color.WHITE);
		lblPleaseLogin.setBounds(510, 524, 162, 20);
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try
				{
					String query="select Username,Password from Details where Username=? and Password=?";
					PreparedStatement pst=connect.prepareStatement(query);
					pst.setString(1, usernametext.getText());
					pst.setString(2, passwordtext.getText());
					//String n=usernametext.getText();
					//System.out.println("Hello1");
					ResultSet rs=pst.executeQuery();
					int count=0;
					while(rs.next()){
						count++;
					}
					if(count==1)
					{
						dispose();
						//System.out.println("Hello2");
						JOptionPane.showMessageDialog(null,"Login Successful!");
						City c = new City();
						c.show();
						//after_login a=new after_login(n);
						//a.setVisible(true);
					}
					else
						JOptionPane.showMessageDialog(null,"Wrong Username/Password");
					rs.close();
					pst.close();
					}
				catch(Exception f)
				{
					JOptionPane.showMessageDialog(null, f);
					
				}

			}
		});
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		
		
	}
}

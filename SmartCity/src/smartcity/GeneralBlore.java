package smartcity;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class GeneralBlore extends JFrame {

	private JPanel contentPane;
	JButton goback;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GeneralBlore frame = new GeneralBlore();
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
	public GeneralBlore() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 800);
		contentPane = new JPanel();
		//JScrollPane scrPane = new JScrollPane(contentPane,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
		  //       JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		//getContentPane().add(scrPane);
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		contentPane.setBackground(Color.BLACK);
		//back= new JLabel("");
		//back.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\a-images for smartcity\\bg13.jpg"));
		//back.setBounds(0, 0, 1500, 800);
		//contentPane.add(back);
		JLabel title = new JLabel("EMERGENCY");
		contentPane.add(title);
		title.setFont(new Font("Tahoma", Font.BOLD, 18));
		title.setForeground(Color.WHITE);
		title.setBounds(10, 10, 303, 40);
		
		goback= new JButton("BACK");
		goback.setFont(new Font("Dialog", Font.ITALIC, 15));
		goback.setForeground(Color.WHITE);
		goback.setBackground(Color.BLACK);
		//ptv.setMargin(new Insets(10,10,10,10));
		//ptv.setBorder(thickBorder);
		goback.setBounds(1150, 0, 200, 34);
		contentPane.add(goback);
		goback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bangalore b=new Bangalore();
				b.show();
			}
		});
		JLabel hospitals = new JLabel("HOSPITALS");
		contentPane.add(hospitals);
		hospitals.setFont(new Font("Tahoma", Font.ITALIC, 14));
		hospitals.setForeground(Color.WHITE);
		hospitals.setBounds(10, 92, 200, 40);
		
		String text7=" Apollo Hospitals, Bengaluru\n154 / 11, Bannerghatta Road \nOpp. I.I.M\nBengaluru - 560 076\n+(91)-80-2630 4050";
		 JScrollPane scrollPane7 = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		 scrollPane7.setBounds(10,156,250,150);
		 contentPane.add(scrollPane7);
		 JTextArea textArea_7 = new JTextArea();
		 scrollPane7.setViewportView(textArea_7);
		 //back1.add(textArea_1);
		 textArea_7.setBackground(Color.WHITE);
		 textArea_7.setText(text7);
		 textArea_7.setLineWrap(true);
		 textArea_7.setWrapStyleWord(true);
		 textArea_7.setEditable(false);
		 textArea_7.setCaretPosition(0);
	}
}

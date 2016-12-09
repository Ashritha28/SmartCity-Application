package smartcity;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class HotelsBlore extends JPanel {

	/**
	 * Create the panel.
	 */
	 JButton ptv,hotels,b_l,goback; 
	    JLabel back1;
	public HotelsBlore() {
		setLayout(null);
		String text="Sheraton\nName: Sheraton\nFood type: vegetarian and non-vegetarian.\nBranches : Rajajinagar\nReviews : 5 stars";
       //JScrollPane scrollPane = new JScrollPane(,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
       //scrollPane.setBounds(32, 32, 789,469);
       setBackground(Color.BLACK);
		
		//scrPane.setPreferredSize(new Dimension(1500,800));
		
        back1= new JLabel("");
        //back1.setEnabled(false);
        //back1.setIcon(null);
		//back1.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\a-images for smartcity\\bg13.jpg"));
		back1.setBounds(0, 0, 1362, 739);
		back1.setVisible(true);
		
		//add(scrollPane);
	    ptv= new JButton("PLACES TO VISIT");
		
		ptv.setFont(new Font("Liberation Serif", Font.ITALIC, 15));
		ptv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 FrameDisplayTest.frame.remove(FrameDisplayTest.panel);
				 FrameDisplayTest.frame.setContentPane(new PlacesBLore());
				 FrameDisplayTest.frame.setVisible(true);
			}
		});
		//SetImageSize(back1,new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\a-images for smartcity\\bg13.jpg"));
		ptv.setForeground(Color.WHITE);
		ptv.setBackground(Color.BLACK);
		ptv.setBounds(0, 0, 200, 34);
		back1.add(ptv);
		
		//add(textArea_1);
		
		
		hotels = new JButton("HOTELS");
        hotels.setForeground(Color.WHITE);
		hotels.setFont(new Font("Dialog", Font.ITALIC, 15));
		hotels.setBackground(Color.BLACK);
		hotels.setBounds(199, 0, 200, 34);
		back1.add(hotels);
		
		goback= new JButton("BACK");
		goback.setFont(new Font("Dialog", Font.ITALIC, 15));
		goback.setForeground(Color.WHITE);
		goback.setBackground(Color.BLACK);
		//ptv.setMargin(new Insets(10,10,10,10));
		//ptv.setBorder(thickBorder);
		goback.setBounds(1150, 0, 200, 34);
		back1.add(goback);
		goback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bangalore b=new Bangalore();
				 b.Slideshow();
				b.show();
			}
		});
		
		b_l = new JButton("BOARDING AND LODGING");
		b_l.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameDisplayTest.frame.remove( FrameDisplayTest.panel);
				 FrameDisplayTest.frame.setContentPane(new B_LBlore());
				 FrameDisplayTest. frame.setVisible(true);
			}
		});
		b_l.setForeground(Color.WHITE);
		b_l.setFont(new Font("Dialog", Font.ITALIC, 15));
		b_l.setBackground(Color.BLACK);
		b_l.setBounds(397, 0, 250, 34);
		back1.add(b_l);
		
		JTextArea textArea_1 = new JTextArea();
		//back1.add(textArea_1);
		textArea_1.setBackground(Color.WHITE);
		textArea_1.setText(text);
		textArea_1.setLineWrap(true);
		textArea_1.setWrapStyleWord(true);
		textArea_1.setEditable(false);
		textArea_1.setCaretPosition(0);
		 JScrollPane scrollPane1 = new JScrollPane(textArea_1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		 scrollPane1.setBounds(300, 100, 250,150);
		 back1.add(scrollPane1);
		add(back1);
		
		JLabel sherton = new JLabel("");
		//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		sherton.setBounds(100, 100, 200, 150);
		SetImageSize(sherton,new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\hotel1-sherton.jpg"));
		//add(lalbagh);
		back1.add(sherton);
		
		String text2=" 37 China Town\nName: China TownFood \nType: Chinese veg and non-veg\nLocation :  37, Crescent Road, Near Race Course, Opp Mallige Hospital, High Grounds, Bengaluru, Karnataka 560001\nPhone: 080 4037 3737\nReviews : 3.4 stars ";
		JTextArea textArea_2 = new JTextArea();
		//back1.add(textArea_1);
		textArea_2.setBackground(Color.WHITE);
		textArea_2.setText(text2);
		textArea_2.setLineWrap(true);
		textArea_2.setWrapStyleWord(true);
		textArea_2.setEditable(false);
		textArea_2.setCaretPosition(0);
		 JScrollPane scrollPane2 = new JScrollPane(textArea_2,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		 scrollPane2.setBounds(1000,100,250,150);
		 back1.add(scrollPane2);
		//add(back1);
		
		JLabel chinatown = new JLabel("");
		//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		chinatown.setBounds(800, 100, 200, 150);
		SetImageSize(chinatown,new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\hotel2-37chinatown.jpg"));
		//add(lalbagh);
		back1.add(chinatown);
		
		String text3="Beijing bites\nName: Beijing Bites\nFood type: Chinese, vegetarian and non-vegetarian.\nBranches : Bannerghatta main road, Frazer town, Sahakarnagar, Sajjapur main road, Begur Hobli, Kammanahalli.\nReviews : 3.5 stars";
		JTextArea textArea_3 = new JTextArea();
		//back1.add(textArea_1);
		textArea_3.setBackground(Color.WHITE);
		textArea_3.setText(text3);
		textArea_3.setLineWrap(true);
		textArea_3.setWrapStyleWord(true);
		textArea_3.setEditable(false);
		textArea_3.setCaretPosition(0);
		 JScrollPane scrollPane3 = new JScrollPane(textArea_3,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		 scrollPane3.setBounds(300,300,250,150);
		 back1.add(scrollPane3);
		//add(back1);
		
		JLabel bb = new JLabel("");
		//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		bb.setBounds(100, 300, 200, 150);
		SetImageSize(bb,new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\hotel3-Beijingbites.jpg"));
		//add(lalbagh);
		back1.add(bb);
		
		String text4=" Nandini Palace\nName: Nandini Palace\nFood type: vegetarian and non-vegetarian.\nBranches : St Marks road, Bannerghatta main road\nReviews : 3.0 star";
		JTextArea textArea_4 = new JTextArea();
		//back1.add(textArea_1);
		textArea_4.setBackground(Color.WHITE);
		textArea_4.setText(text4);
		textArea_4.setLineWrap(true);
		textArea_4.setWrapStyleWord(true);
		textArea_4.setEditable(false);
		textArea_4.setCaretPosition(0);
		 JScrollPane scrollPane4 = new JScrollPane(textArea_4,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		 scrollPane4.setBounds(1000,300,250,150);
		 back1.add(scrollPane4);
		//add(back1);
		
		JLabel np = new JLabel("");
		//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		np.setBounds(800, 300, 200, 150);
		SetImageSize(np,new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\hotel4-nandinipalace.jpg"));
		//add(lalbagh);
		
		back1.add(np);
		
		JLabel ss = new JLabel("");
		//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		ss.setBounds(100, 500, 200, 150);
		SetImageSize(ss,new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\hotel4-shantisagar.jpg"));
		//add(lalbagh);
		back1.add(ss);
		
		String text6=" Shanti Sagar\nName: Shanti Sagar\nFood type: vegetarian\nBranches : Airport road, Rajajingar, Hoysala road, Sahakarnagar\nReviews : 3.5 stars";
		JTextArea textArea_6 = new JTextArea();
		//back1.add(textArea_1);
		textArea_6.setBackground(Color.WHITE);
		textArea_6.setText(text6);
		textArea_6.setLineWrap(true);
		textArea_6.setWrapStyleWord(true);
		textArea_6.setEditable(false);
		textArea_6.setCaretPosition(0);
		 JScrollPane scrollPane6 = new JScrollPane(textArea_6,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		 scrollPane6.setBounds(300,500,250,150);
		 back1.add(scrollPane6);
		
		 JLabel bhagini = new JLabel("");
			//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
			bhagini.setBounds(800, 500, 200, 150);
			SetImageSize(bhagini,new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\hotel6-bhagini.jpg"));
			//add(lalbagh);
			back1.add(bhagini);
			
			String text7=" Bhagini\nName: Bhagini\nFood type: vegetarian and non-vegetarian.\nBranches : Domlur, Chandra Layout, Mahadevapura, Marathalli\nReviews : 3.0 stars";
			JTextArea textArea_7 = new JTextArea();
			//back1.add(textArea_1);
			textArea_7.setBackground(Color.WHITE);
			textArea_7.setText(text7);
			textArea_7.setLineWrap(true);
			textArea_7.setWrapStyleWord(true);
			textArea_7.setEditable(false);
			textArea_7.setCaretPosition(0);
			 JScrollPane scrollPane7 = new JScrollPane(textArea_7,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			 scrollPane7.setBounds(1000,500,250,150);
			 back1.add(scrollPane7);

	}
	public void SetImageSize(JLabel label,ImageIcon im)
	{
		ImageIcon icon=im;
		Image img=icon.getImage();
		Image newImg=img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		//Image newImg=img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon newImc=new ImageIcon(newImg);
		label.setIcon(newImc);
		
	}

}

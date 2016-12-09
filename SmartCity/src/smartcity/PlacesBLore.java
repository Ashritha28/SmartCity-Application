package smartcity;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import java.awt.Button;

public class PlacesBLore extends JPanel {
    JButton ptv,hotels,b_l,goback; 
    JLabel back1;
	/**
	 * Create the panel.
	 */
	public PlacesBLore() {
		setLayout(null);
		String text="Lalbagh or Lalbagh Botanical Gardens, meaning The Red Garden in English, is a well known botanical garden in southern Bangalore, India.It has a famous glass house which hosts two annual flower shows (January 26th & August 15th). Lalbagh houses India's largest collection of tropical plants, has a lake, and is one of the main tourist attractions in Bangalore.Lal Bagh is also home to a few species of birds.";
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
		hotels.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 FrameDisplayTest.frame.remove( FrameDisplayTest.panel);
				 FrameDisplayTest.frame.setContentPane(new HotelsBlore());
				 FrameDisplayTest. frame.setVisible(true);
			}
		});
		hotels.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
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
		
		JLabel lalbagh = new JLabel("");
		//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		lalbagh.setBounds(100, 100, 200, 150);
		SetImageSize(lalbagh,new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		//add(lalbagh);
		back1.add(lalbagh);
		
		JLabel title1 = new JLabel("GARDENS");
		title1.setBounds(101,68, 55, 14);
		//back1.add(title1);
		
		JLabel title2 = new JLabel("AMUSEMENT PARKS");
		title2.setBounds(101,268, 155, 14);
		//back1.add(title2);
		
		String text2="Cubbon Park is a landmark 'lung' area of the Bangalore city, located within the heart of city in the Central Administrative Area. Originally created in 1870, when Major General Richard Sankey was the then British Chief Engineer of Mysore state, it covered an area of 100 acres (0.40 km2) and subsequent expansion has taken place and the area reported now is about 300 acres (1.2 km2). It has a rich recorded history of abundant flora and fauna plantations coupled with numerous impressive and aesthetically located buildings and statues of famous personages, in its precincts.This public park was first named as “Meade’s Park” after Sir John Meade, the acting Commissioner of Mysore in 1870 and subsequently renamed as Cubbon Park after the longest serving commissioner of the time, Sir Mark Cubbon. ";
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
		
		JLabel cubbonpark = new JLabel("");
		//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		cubbonpark.setBounds(800, 100, 200, 150);
		SetImageSize(cubbonpark,new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\cubbonpark.jpg"));
		//add(lalbagh);
		back1.add(cubbonpark);
		
		String text3="Wonderla Holidays Limited is a leading amusement park designing and operating company in India headquartered near Bidadi, 28 kilometres (17 mi) from Bangalore. It is promoted by Kochouseph Chittilappilly and his son Arun Chittilappilly. Wonderla's flagship amusement park located at the same address is the second theme parkproject from the company and has been operational since October 2005. It is spread over an area of 82 acres (33 ha). The first amusement park, Wonderla Kochi, was set up in 2000. In 2016, the third project Wonderla Hyderabad is set up. The parks have been set up with a total investment of over ₹2.5 billion (US$37 million).";
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
		
		JLabel wonderla = new JLabel("");
		//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		wonderla.setBounds(100, 300, 200, 150);
		SetImageSize(wonderla,new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\wonderla.jpg"));
		//add(lalbagh);
		back1.add(wonderla);
		
		String text4=" Innovative Film City is an awesome place to have fun. It has various attractions such as Aqua Kingdom, Cartoon City, Dino Park, Mini Golf, Mirror Maze, and many more.";
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
		
		JLabel ifc = new JLabel("");
		//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		ifc.setBounds(800, 300, 200, 150);
		SetImageSize(ifc,new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\ifc.jpg"));
		//add(lalbagh);
		
		back1.add(ifc);
		
		JLabel title3 = new JLabel("TEMPLES");
		title3.setBounds(101,468, 55, 14);
		//back1.add(title3);
		
		JLabel dg = new JLabel("");
		//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		dg.setBounds(100, 500, 200, 150);
		SetImageSize(dg,new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\dg.jpg"));
		//add(lalbagh);
		back1.add(dg);
		
		String text6=" An old temple in the oldest part of Bengaluru, carved pour of on piece of rock decorated with flowers and garlands - lots of devoted followers visit each day to worship- tourists can visit and pay respects or worship or just visit. This temple is situated in the heart of the city. Nearly half the population of Bangalore visit the temple daily.";
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
		
		 JLabel iskcon = new JLabel("");
			//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
			iskcon.setBounds(800, 500, 200, 150);
			SetImageSize(iskcon,new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\iskcon.jpg"));
			//add(lalbagh);
			back1.add(iskcon);
			
			String text7=" Sri Radha Krishna Temple has deities of Radha and Krishna located at Rajajinagar, in North Bangalore, Karnataka, India. It is one of the largest ISKCON temples in the world. The temple is a huge cultural complex that was inaugurated in 1997 by Shankar Dayal Sharma. The project was conceived and executed by Madhu Pandit Dasa following the wishes of HDG A. C. Bhaktivedanta Swami Prabhupada, the Founder-Acarya of ISKCON to promote Vedic culture and spiritual learning.";
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
	public static void main(String[] args)
    {   
        /*
         * This is the most important part of your GUI app, never forget 
         * to schedule a job for your event dispatcher thread : 
         * by calling the function, method or constructor, responsible
         * for creating and displaying your GUI.
         */
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                //new FrameDisplayTest();
                //FrameDisplayTest.frame.setContentPane(FrameDisplayTest.panel);
            	//FrameDisplayTest.frame.setContentPane(new PlacesBLore());
            	PlacesBLore p=new PlacesBLore();
            }
        });
    }
}

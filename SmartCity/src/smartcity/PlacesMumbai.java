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
import javax.swing.SwingUtilities;

public class PlacesMumbai extends JPanel {
    JButton ptv,hotels,b_l; 
    JLabel back1;
	/**
	 * Create the panel.
	 */
	public PlacesMumbai() {
		setLayout(null);
	    String text="The Gateway of India is a monument built during the 20th century in Mumbai City of Maharashtra state in Western India. It is located on the waterfront in the Apollo Bunder area in South Mumbai and overlooks the Arabian Sea. The structure is a basalt arch, 26 metres (85 feet) high. It lies at the end of Chhatrapati Shivaji Marg at the water's edge in Mumbai Harbour. It was a crude jetty used by the fishing community which was later renovated and used as a landing place for British governors and other prominent people. In earlier times, it would have been the first structure that visitors arriving by boat in Mumbai would have seen. The Gateway has also been referred to as the Taj Mahal of Mumbai";
       //JScrollPane scrollPane = new JScrollPane(,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
       //scrollPane.setBounds(32, 32, 789,469);
       
       
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
				 FrameDisplayMumbai.frame.remove(FrameDisplayMumbai.panel);
				 FrameDisplayMumbai.frame.setContentPane(new PlacesMumbai());
				 FrameDisplayMumbai.frame.setVisible(true);
			}
		});
		SetImageSize(back1,new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\a-images for smartcity\\bg13.jpg"));
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
		
		b_l = new JButton("BOARDING AND LODGING");
		b_l.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		 JScrollPane scrollPane1 = new JScrollPane(textArea_1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		 scrollPane1.setBounds(300, 100, 250,150);
		 back1.add(scrollPane1);
		add(back1);
		
		JLabel lalbagh = new JLabel("");
		//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		lalbagh.setBounds(100, 100, 200, 150);
		SetImageSize(lalbagh,new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Mumbai\\gateway of india.jpg"));
		//add(lalbagh);
		back1.add(lalbagh);
		
		JLabel title1 = new JLabel("MONUMENTS");
		title1.setBounds(101,68, 55, 34);
		back1.add(title1);
		
		
		
		
		
		JLabel title2 = new JLabel("ZOO");
		title2.setBounds(101,268, 155, 14);
		back1.add(title2);
		
		
		String text3="Sanjay Gandhi National Park (aSGNP), previously Borivali National Park, is a large protected area in the northern part of Mumbai city in Maharashtra State";
		JTextArea textArea_3 = new JTextArea();
		//back1.add(textArea_1);
		textArea_3.setBackground(Color.WHITE);
		textArea_3.setText(text3);
		textArea_3.setLineWrap(true);
		textArea_3.setWrapStyleWord(true);
		textArea_3.setEditable(false);
		 JScrollPane scrollPane3 = new JScrollPane(textArea_3,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		 scrollPane3.setBounds(300,300,250,150);
		 back1.add(scrollPane3);
		//add(back1);
		
		 String text2="Taraporewala Aquarium : Taraporewala Aquarium is India's oldest aquarium and one of the city's main attractions. It hosts marine and freshwater fishes. The aquarium is located on Marine Drive in Mumbai. In the aquarium's 16 sea water tanks and nine sweet water tanks, there are 31 types of fish, while 32 tropical tanks contains 54 kind of fishes. The tropical section of the aquarium already feature different ecosystems such as the moss aquarium for pregnant fishes, plantation aquarium that features imported varieties of water lilies and other aquatic plants and island aquarium";
			JTextArea textArea_2 = new JTextArea();
			//back1.add(textArea_1);
			textArea_2.setBackground(Color.WHITE);
			textArea_2.setText(text2);
			textArea_2.setLineWrap(true);
			textArea_2.setWrapStyleWord(true);
			textArea_2.setEditable(false);
			 JScrollPane scrollPane2 = new JScrollPane(textArea_2,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			 scrollPane2.setBounds(1000,100,250,150);
			 back1.add(scrollPane2);
			//add(back1);
			 
			
			JLabel nehruzoo = new JLabel("");
			//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
			nehruzoo.setBounds(800, 100, 200, 150);
			SetImageSize(nehruzoo,new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Mumbai\\taraporewala aquarium.jpg"));
			//add(lalbagh);
			back1.add(nehruzoo);
		 
		JLabel wonderla = new JLabel("");
		//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		wonderla.setBounds(100, 300, 200, 150);
		SetImageSize(wonderla,new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Mumbai\\sanjay gandhi national park.jpg"));
		//add(lalbagh);
		back1.add(wonderla);
		JLabel title3 = new JLabel("Hostorical Places");
		title2.setBounds(101,268, 155, 14);
		back1.add(title3);
		
		
		String text4="The Global Vipassana Pagoda is a Meditation Hall near Gorai, North-west of Mumbai, India. The Pagoda was inaugurated by Pratibha Patil, then President of India on 8 February 2009. It is built on donated land on a peninsula between Gorai creek and the Arabian Sea. The pagoda is to serve as a monument of peace and harmony. The Global Vipassana Pagoda has been built out of gratitude to the Buddha, his teaching and the community of monks practicing his teaching. Its traditional Burmese design is an expression of gratitude towards the country of Myanmar for preserving the practice of Vipassana. The shape of the pagoda is a copy of the Shwedagon Pagoda (Golden Pagoda) in Yangon, Myanmar. It was built combining ancient Indian and modern technology to enable it to last for a thousand years";
		JTextArea textArea_4 = new JTextArea();
		//back1.add(textArea_1);
		textArea_4.setBackground(Color.WHITE);
		textArea_4.setText(text4);
		textArea_4.setLineWrap(true);
		textArea_4.setWrapStyleWord(true);
		textArea_4.setEditable(false);
		 JScrollPane scrollPane4 = new JScrollPane(textArea_4,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		 scrollPane4.setBounds(1000,300,250,150);
		 back1.add(scrollPane4);
		//add(back1);
		 JLabel title4 = new JLabel("Historical");
			title2.setBounds(101,268, 155, 14);
			back1.add(title4);
		
		JLabel ifc = new JLabel("");
		//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		ifc.setBounds(800, 300, 200, 150);
		SetImageSize(ifc,new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Mumbai\\global vipassana pagoda.jpg"));
		//add(lalbagh);
		back1.add(ifc);

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
            	PlacesMumbai p=new PlacesMumbai();
            }
        });
    }
}

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

public class PlacesMangalore extends JPanel {
    JButton ptv,hotels,b_l,goback; 
    JLabel back1;
	/**
	 * Create the panel.
	 */
	public PlacesMangalore() {
		setLayout(null);
		String text="The Gokarnanatheshwara Temple, otherwise known as Kudroli Sri Gokarnanatha Kshetra, is in the Kudroli area of Mangalore in Karnataka, India. It was consecrated by Narayana Guru. It is dedicated to Gokarnanatha, a form of Lord Shiva. Compared to the other temples in and around Mangalore this temple was built recently.";
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
				 FrameDisplayMangalore.frame.remove(FrameDisplayMangalore.panel);
				 FrameDisplayMangalore.frame.setContentPane(new PlacesMangalore());
				 FrameDisplayMangalore.frame.setVisible(true);
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
				 FrameDisplayMangalore.frame.remove( FrameDisplayMangalore.panel);
				 FrameDisplayMangalore.frame.setContentPane(new HotelsMang());
				 FrameDisplayMangalore. frame.setVisible(true);
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
				Mangalore b=new Mangalore();
				 b.Slideshow();
				b.show();
			}
		});
		b_l = new JButton("BOARDING AND LODGING");
		b_l.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameDisplayMangalore.frame.remove( FrameDisplayMangalore.panel);
				 FrameDisplayMangalore.frame.setContentPane(new BLMang());
				 FrameDisplayMangalore. frame.setVisible(true);
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
		SetImageSize(lalbagh,new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Mangalore\\gokarnathtemple.jpg"));
		//add(lalbagh);
		back1.add(lalbagh);
		
		JLabel title1 = new JLabel("GARDENS");
		title1.setBounds(101,68, 55, 14);
		//back1.add(title1);
		
		JLabel title2 = new JLabel("AMUSEMENT PARKS");
		title2.setBounds(101,268, 155, 14);
		//back1.add(title2);
		
		String text2="Panambur is the site of sea port called New Mangalore Port. It is located in Mangalore at Dakshina Kannada (formerly South Canara) district of Karnataka state, India, north of the Gurupura river confluence with Arabian Sea. The name Panambur is derived from 'Panam' which means Money and 'Ur' which means place or village in Tulu language";
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
		SetImageSize(cubbonpark,new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Mangalore\\panambur.jpg"));
		//add(lalbagh);
		back1.add(cubbonpark);
		
		String text3="The Mangaladevi Temple is a Hindu temple at Bolara in the city of Mangaluru in the South Indian state of Karnataka, situated about three km southwest of the city centre. The temple is dedicated to Hindu god Shakti in the form of Mangaladevi. The city of Mangaluru is named after the presiding deity, Mangaladevi. The temple is of significant antiquity and is believed to have been built during the 9th century by Kundavarman, the most famous king of the Ahepa dynasty during the 9th century under the aegies of Matsyendranath. As per another legend, the temple is believed to have been built by Parashurama, one of the ten avatars of Hindu god Vishnu and later expanded by Kundavarman.";
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
		SetImageSize(wonderla,new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Mangalore\\mdt.jpg"));
		//add(lalbagh);
		back1.add(wonderla);
		
		String text4="Kudroli,earlier Known as Kudre-halli where Tippu Sultan, the great ruler of mysore, army used to have Horses stables and grazing land, ,is one of the oldest and well-known localities of Mangalore City located on the Western Coastal belt of Karnataka , India . Since it is the oldest locality pre-dominated by Muslim inhabitants it has become an Islamic learning center of the city which also hosts various religious functions and the festivities. It is also a historic place as the great ruler , Sher-e-Mysore, Tippu Sultan has his fort just a couple of kilometers away known as Sultan Battery. Kudroli is also famous for Gokarnatheshwara Temple. ";
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
		SetImageSize(ifc,new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Mangalore\\kudroli.jpg"));
		//add(lalbagh);
		
		back1.add(ifc);
		
		JLabel title3 = new JLabel("TEMPLES");
		title3.setBounds(101,468, 55, 14);
		//back1.add(title3);
		
		JLabel dg = new JLabel("");
		//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		dg.setBounds(100, 500, 200, 150);
		SetImageSize(dg,new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Mangalore\\malpe beach.jpg"));
		//add(lalbagh);
		back1.add(dg);
		
		String text6="Malpe is a natural port about six kilometers to the west of Udupi, Karnataka, India. An important port and fishing harbor on the Karnataka coast. It is a suburb in Udupi city . Malpe and the Mogaveera goes together. Malpe is a hub of Mogaveera population. Inhabitant for the millionaire businessmen of Mogaveera community. Tulu, Kannada and Konkani are spoken here. first Indian beach with 24/7 WiFi";
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
			SetImageSize(iskcon,new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Mangalore\\kadrimanjunath.jpg"));
			//add(lalbagh);
			back1.add(iskcon);
			
			String text7=" Kadri Manjunatha Temple is located in Mangalore in the state of Karnataka, India, was originally made by Vajrayana Buddhist but later on due to fall of Buddhism converted for the deity Manjunatha by Hindus.";
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
            	PlacesMangalore p=new PlacesMangalore();
            }
        });
    }
}

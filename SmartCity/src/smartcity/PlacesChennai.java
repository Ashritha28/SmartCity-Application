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

public class PlacesChennai extends JPanel {
    JButton ptv,hotels,b_l,goback; 
    JLabel back1;
	/**
	 * Create the panel.
	 */
	public PlacesChennai() {
		setLayout(null);
		String text=" Kapaleeshwarar Temple, Mylapore,Chennai  is a temple of Shiva located in Mylapore, Chennaiin the Indian state of Tamil Nadu. The form of Shiva's wife Parvati worshipped at this temple is called Karpagambal is from Tamil, (Goddess of the Wish-Yielding Tree). The temple was built around the 7th century CE in Dravidian architecture.";
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
				 FrameDisplayChennai.frame.remove(FrameDisplayChennai.panel);
				 FrameDisplayChennai.frame.setContentPane(new PlacesChennai());
				 FrameDisplayChennai.frame.setVisible(true);
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
				 FrameDisplayChennai.frame.remove( FrameDisplayChennai.panel);
				 FrameDisplayChennai.frame.setContentPane(new HotelsChennai());
				 FrameDisplayChennai. frame.setVisible(true);
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
				Chennai b=new Chennai();
				 b.Slideshow();
				b.show();
			}
		});
		b_l = new JButton("BOARDING AND LODGING");
		b_l.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameDisplayChennai.frame.remove( FrameDisplayChennai.panel);
				 FrameDisplayChennai.frame.setContentPane(new BLChennai());
				 FrameDisplayChennai. frame.setVisible(true);
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
		SetImageSize(lalbagh,new ImageIcon("C:\\Users\\Prajwala\\Downloads\\kapeeleshwar_temple.jpg"));
		//add(lalbagh);
		back1.add(lalbagh);
		
		JLabel title1 = new JLabel("GARDENS");
		title1.setBounds(101,68, 55, 14);
		//back1.add(title1);
		
		JLabel title2 = new JLabel("AMUSEMENT PARKS");
		title2.setBounds(101,268, 155, 14);
		//back1.add(title2);
		
		String text2="The Parthasarathy Temple is an 8th-century Hindu Vaishnavite temple dedicated to the god Krishna, located at Triplicane,Chennai, India. The temple is glorified in the Divya Prabandha, the early medieval Tamil literature canon of the Alvar saints from the 6th–9th centuries CE and is classified as among the 108 Divya Desams dedicated to Vishnu. The name 'Parthasarathy', in Sanskrit, means the 'charioteer of Arjuna', referring to Krishna's role as a charioteer to Arjuna in the epic Mahabaratha. ";
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
		SetImageSize(cubbonpark,new ImageIcon("C:\\Users\\Prajwala\\Downloads\\parthasarthy.jpg"));
		//add(lalbagh);
		back1.add(cubbonpark);
		
		String text3="Fort St. George (or historically, White Town) is the name of the first English (later British) fortress in India, founded in 1644 at the coastal city of Madras, the modern city of Chennai. The construction of the fort provided the impetus for further settlements and trading activity, in what was originally an uninhabited land. Thus, it is a feasible contention to say that the city evolved around the fortress. The fort currently houses the Tamil Nadu legislative assembly and other official buildings. The fort is one of the 163 notified areas (megalithic sites) in the state of Tamil Nadu.";
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
		SetImageSize(wonderla,new ImageIcon("C:\\Users\\Prajwala\\Downloads\\fortstgeorge.jpg"));
		//add(lalbagh);
		back1.add(wonderla);
		
		String text4="Kishkinta is a theme park located in Chennai, India. Kishkinta Theme Park is located near Vandalur Railway station which has a serene atmosphere, 13 km south of Anakaputhur. It was founded by Navodaya Appachan, the owner of Navodaya Studio. This Park is spread across 120 acres of vast area with a scenic landscape, bushes, fountains, decorations and designs. Along with these, the park has various entertainment places of Wave pools, water ridings, roller coasters, toy trains etc. especially for children who visits for picnics. It is named after the fabled simian kingdom in the epic – Ramayana.";
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
		SetImageSize(ifc,new ImageIcon("C:\\Users\\Prajwala\\Downloads\\kishkinta.jpg"));
		//add(lalbagh);
		
		back1.add(ifc);
		
		JLabel title3 = new JLabel("TEMPLES");
		title3.setBounds(101,468, 55, 14);
		//back1.add(title3);
		
		JLabel dg = new JLabel("");
		//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		dg.setBounds(100, 500, 200, 150);
		SetImageSize(dg,new ImageIcon("C:\\Users\\Prajwala\\Downloads\\golden_beach.jpg"));
		//add(lalbagh);
		back1.add(dg);
		
		String text6="Golden beach is a beach located on the Bay of Bengal in Chennai, India. VGP Golden Beach is a major tourist attraction in Chennai. It is situated on the East Coast Road, the seaside road from Chennai to Cuddalorevia Pondicherry";
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
			SetImageSize(iskcon,new ImageIcon("C:\\Users\\Prajwala\\Downloads\\marina.jpg"));
			//add(lalbagh);
			back1.add(iskcon);
			
			String text7=" Marina Beach is a natural urban beach in the city of Chennai, India, along the Bay of Bengal, part of the Indian Ocean. The beach runs from near Fort St. George in the north to Besant Nagar in the south, a distance of 13 km (8.1 mi), making it the longest natural urban beach in the country and the world's first longest natural urban beach. The Marina is primarily sandy, unlike the short, rocky formations that make up the Juhu Beach in Mumbai. The average width of the beach is 300 m (980 ft) and the width at the widest stretch is 437 m (1,434 ft). Bathing and swimming at the Marina Beach are legally prohibited because of the dangers, as the undercurrent is very turbulent. It is the most crowded beach in the country and attracts about 30,000 visitors a day during weekdays and 50,000 visitors a day during the weekends and on holidays. During summer months, about 15,000 to 20,000 people visit the beach daily.";
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
            	PlacesChennai p=new PlacesChennai();
            }
        });
    }
}

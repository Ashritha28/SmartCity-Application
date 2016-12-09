package smartcity;


import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java. io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.embed.swing.JFXPanel;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebEvent;
import javafx.scene.web.WebView;*/
 import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class City extends JFrame {

    
    private JList citylist;
    private DefaultListModel listarray;
	private JPanel contentPane;
	private JButton btnCancel,sb;
    //ListSelector lh;
	private JTextField txt;
	private JLabel back;
	JLabel pic,disp1,disp2,disp3,disp4;
	String[] cities={
			"Bangalore","Chennai","Mangalore","Hyderabad"
	};
	/**
	 * Launch the application.
	 */
	public static void main(String []args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				   City frame = new City();
					//frame.addlist();
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
	
	public String store;
    Bangalore b=new Bangalore();
    Chennai c=new Chennai();
    Mangalore mg=new Mangalore();
    //Mumbai m=new Mumbai();
    Hyderabad h = new Hyderabad();

    private JLabel view;
    public void addlist()
     {
       listarray.addElement("Bangalore");
       listarray.addElement("Chennai");
       listarray.addElement("Mangalore");
      // listarray.addElement("Mumbai");
       listarray.addElement("Hyderabad");
       // setTitle("SMART CITY");
       contentPane.add(view);
       //this.add(b);
       citylist = new JList(listarray);
       contentPane.add(citylist);
       citylist.setVisibleRowCount(3);
       JScrollPane p=new JScrollPane(citylist);
      contentPane.add(p);
       this.add(txt);
       //lh= new ListSelector();
       //citylist.addListSelectionListener(lh);
       pic.add(sb);
       submithandler sth=new submithandler();
       sb.addActionListener(sth);
      // this.add(sb);  
       //Conten.add(btnCancel);
       //btnCancel.addActionListener(b);
      // setLayout ();
      // this.add(navigate);
       //Navigate map=new Navigate();
       //navigate.addActionListener(map);
       //this.add(navigate);
       
   }
    /*class ListSelector implements ListSelectionListener
    {
        @Override
        public void valueChanged(ListSelectionEvent e)
        {
            String s=citylist.getSelectedValue().toString();
            txt.setText(citylist.getSelectedValue().toString());
           store=s;
        }
    }*/
    class submithandler implements ActionListener
    {
        @Override
       public void actionPerformed(ActionEvent e)
       {
           
             if(store.equals("Bangalore"))
            {
                b.show();
            }
            else if(store.equals("Chennai"))
            {
                c.show();
            }
             else if(store.equals("Hyderabad"))
            {
                h.show();
            }
             else if(store.equals("Mangalore"))
             {
                 mg.show();
             }
             else if(store.equals("Mumbai"))
             {
            	 //m.show();
       }
    }
    
}

    private JComboBox comboBox;
	public City() {
		setTitle("Choose City");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100, 1500, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
	    setBackground(Color.BLACK);
	    pic=new JLabel();
		pic.setBounds(0, 0, 1500, 750);
		pic.setVisible(true);
		contentPane.add(pic);
		
		disp1=new JLabel();
		disp1.setBounds(10,130,240,150);
		disp1.setVisible(true);
		pic.add(disp1);
		SetImageSize(disp1,new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\bang2.jpg"));
		
		disp2=new JLabel();
		disp2.setBounds(290,130,240,150);
		disp2.setVisible(true);
		pic.add(disp2);
		SetImageSize(disp2,new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\chennai2.jpg"));
		
		disp3=new JLabel();
		disp3.setBounds(570,130,240,150);
		disp3.setVisible(true);
		pic.add(disp3);
		SetImageSize(disp3,new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\mang2.jpg"));
		
		disp4=new JLabel();
		disp4.setBounds(850,130,240,150);
		disp4.setVisible(true);
		pic.add(disp4);
		SetImageSize(disp4,new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\hyd2.jpg"));
		
		String text1="Bangalore, officially known as Bengaluru, is the capital of the Indian state of Karnataka. It has a population of about 8.42 million and a metropolitan population of about 8.52 million, making it the third most populous city and fifth most populous urban agglomeration in India.Located in southern India on the Deccan Plateau, at a height of over 900 m (3,000 ft) above sea level, Bangalore is known for its pleasant climate throughout the year. Its elevation is the highest among the major large cities of India.";
		JTextArea textArea_1 = new JTextArea();
		JTextArea textArea_2 = new JTextArea();
		JTextArea textArea_3 = new JTextArea();
		JTextArea textArea_4 = new JTextArea();
		JTextArea textArea_5 = new JTextArea();

        textArea_1.setBackground(Color.WHITE);
        textArea_1.setText(text1);
        JScrollPane scrollPane = new JScrollPane(textArea_1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pic.add(scrollPane);
        scrollPane.setBounds(10, 300, 240,150);
        textArea_1.setCaretPosition(0);
        textArea_1.setLineWrap(true);
        textArea_1.setWrapStyleWord(true);
        textArea_1.setEditable(false);
        
        String text2="Chennai is the capital city of the Indian state of Tamil Nadu. Located on the Coromandel Coast off the Bay of Bengal, it is the biggest cultural, economic and educational centre in South India. Chennai is known as the \"Detroit of South Asia\" for its automobile industry. It is the fourth-largest city and fourth-most populous metropolitan area in the country and 36th-largest urban area in the world. Chennai is the most visited city in India by foreign tourists, and 38th most visited city in the world.\"The quality of living survey\" rated Chennai as the safest city in India.Chennai attracts about 45% of health tourists from abroad arriving in India, so the city is termed as \"health capital of India";
        textArea_2.setBackground(Color.WHITE);
        textArea_2.setText(text2);
        JScrollPane scrollPane2 = new JScrollPane(textArea_2,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        pic.add(scrollPane2);
        textArea_2.setCaretPosition(0);
        scrollPane2.setBounds(290, 300, 240,150);
        textArea_2.setLineWrap(true);
        textArea_2.setWrapStyleWord(true);
        textArea_2.setEditable(false);
        
        String text3="Mangalore, officially known as Mangaluru, is the chief port city of the Indian state of Karnataka. It is known as Kudla in Tulu, Mangaluru in Kannada, Maikāla in Beary, and Kodial in Canarese Konkani. It is located about 371 kilometres (230 mi) west of the state capital, Bangalore. Mangalore lies between the Arabian Sea and the Western Ghat mountain ranges, and is the administrative headquarters of the Dakshina Kannada (formerly South Canara) district in south western Karnataka. With its pristine beaches, broad roads and calm localities, Mangalore was ranked the 8th cleanest city of India and 2nd of Karnataka. Mangalore is the 2nd least polluted city in India and the 1st in Karnataka according to CPCB. Mangalore was ranked India's 13th and Karnataka's 2nd best destination for business.";
        textArea_3.setBackground(Color.WHITE);
        textArea_3.setText(text3);
        textArea_3.setCaretPosition(0);
        JScrollPane scrollPane3 = new JScrollPane(textArea_3,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        pic.add(scrollPane3);
        scrollPane3.setBounds(570, 300, 240,150);
        textArea_3.setLineWrap(true);
        textArea_3.setWrapStyleWord(true);
        textArea_3.setEditable(false);
        
        String text4="Mumbai is the capital city of the Indian state of Maharashtra. It is the most populous city in India and the ninth most populous agglomeration in the world, with an estimated city population of 18.4 million. Along with the neighbouring regions of the Mumbai Metropolitan Region, it is one of the most populous urban regions in the world and the seсond most populous metropolitan area in India, with a population of 20.7 million as of 2011. Mumbai lies on the west coast of India and has a deep natural harbour. In 2009, Mumbai was named an alpha world city. It is also the wealthiest city in India, and has the highest GDP of any city in South, West, or Central Asia. Mumbai has the highest number of billionaires and millionaires among all cities in India.";
         
       /* textArea_4.setBackground(Color.WHITE);
        textArea_4.setText(text4);
        JScrollPane scrollPane4 = new JScrollPane(textArea_4,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        pic.add(scrollPane4);
        textArea_4.setCaretPosition(0);
        scrollPane4.setBounds(850, 300, 230,150);
        textArea_4.setLineWrap(true);
        textArea_4.setWrapStyleWord(true);
        textArea_4.setEditable(false);*/
        
        String text5="Hyderabad is the capital of the southern Indian state of Telangana and de jure capital of Andhra Pradesh.[A] Occupying 650 square kilometres (250 sq mi) along the banks of the Musi River, it has a population of about 6.7 million and a metropolitan population of about 7.75 million, making it the fourth most populous city and sixth most populous urban agglomeration in India. At an average altitude of 542 metres (1,778 ft), much of Hyderabad is situated on hilly terrain around artificial lakes, including Hussain Sagar—predating the city's founding—north of the city centre.";
        textArea_5.setBackground(Color.WHITE);
        textArea_5.setText(text5);
        textArea_5.setCaretPosition(0);
        JScrollPane scrollPane5 = new JScrollPane(textArea_5,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        pic.add(scrollPane5);
        scrollPane5.setBounds(850, 300, 230,150);
        textArea_5.setLineWrap(true);
        textArea_5.setWrapStyleWord(true);
        textArea_5.setEditable(false);
        
		listarray=new DefaultListModel();
	    txt=new JTextField(15);
	    sb=new JButton("Submit");
	    sb.setBackground(Color.WHITE);
	    sb.setForeground(Color.BLACK);
	    sb.setBounds(575, 650, 80, 25);
	    sb.setVisible(true);
	    btnCancel=new JButton("CLOSE");
	    view=new JLabel("Select a city!");
	    view.setFont(getFont());
	    view.setForeground(Color.WHITE);
	    comboBox = new JComboBox();
	    //comboBox.setPreferredSize(new Dimension(200,130));
	    comboBox.setBounds(550, 500, 189, 41);
	    //comboBox.setBounds(getBounds());
		view.setBounds(575, 450, 200, 40);
	    view.setVisible(true);
	    int count=0;
	    for(int i = 0; i < cities.length; i++) 
	    	comboBox.addItem(cities[count++]); 
	    //add(comboBox);
	    //comboBox.setBackground(Color.red);
	   
		//addlist();
		//SetImageSize(0);
		sb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

			}
		});
	 sb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String selected=(String)comboBox.getSelectedItem();
				if(selected.equals("Bangalore"))
				{
					b.show();
				}	
				else if(selected.equals("Chennai"))
				{
					c.show();
				}
				else if(selected.equals("Mumbai")){
					//m.show();
				}
				else if (selected.equals("Mangalore")){
					mg.show();
				}
				else if(selected.equals("Hyderabad")){
					h.show();
				}
			}
		});
		
		 //add(pic);
	        
	        getContentPane().setLayout(null);
	        //setSize(1272, 712);
	       
			//SetImageSize();
	        JLabel lblNewLabel = new JLabel("CHOOSE A CITY");
			contentPane.add(lblNewLabel);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setBounds(10, 7, 300, 25);
	        contentPane.add(pic);
	        contentPane.add(view);
	        contentPane.add(comboBox);
	       // contentPane.add(pic);
	        
	        comboBox.setVisible(true);
	       
	        pic.add(sb);
	       // getContentPane().setBackground(Color.decode("#bdb67b"));
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setVisible(true);
			
		
		
		//setBackground(Color.white);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	
	
	}
	
	public void SetImageSize()
	{
		ImageIcon icon=new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\a-images for smartcity\\bg13.jpg");
		Image img=icon.getImage();
		Image newImg=img.getScaledInstance(back.getWidth(), back.getHeight(), Image.SCALE_SMOOTH);
		//Image newImg=img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon newImc=new ImageIcon(newImg);
		back.setIcon(newImc);
		
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

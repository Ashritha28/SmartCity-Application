package smartcity;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import com.teamdev.jxbrowser.chromium.Browser;
//import com.teamdev.jxbrowser.chromium.BrowserFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import AppPackage.AnimationClass;

public class Chennai extends JFrame {

	private JPanel contentPane;
	AnimationClass AC=new AnimationClass();
	static JScrollPane scroll ;
	JLabel bslide1,bslide2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chennai frame = new Chennai();
					frame.setVisible(true);
					frame.Slideshow();
					//frame.getContentPane().add(scroll);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	JLabel back ;
	//private JLabel lblNewLabel;
	public Chennai() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
	    setBackground(Color.BLACK);
		
		Slideshow();
		setBounds(100, 100, 1500, 800);
		
		
		back= new JLabel("");
		//back.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\a-images for smartcity\\bg13.jpg"));
		back.setBounds(0, 0, 1500, 750 );
		contentPane.add(back);
		
		JLabel title = new JLabel("CHENNAI");
		back.add(title);
		title.setFont(new Font("Tahoma", Font.BOLD, 18));
		title.setForeground(Color.WHITE);
		title.setBounds(10, 10, 200, 40);
		
		
         
        
        // back.add(bslide2);
         
         bslide1 = new JLabel("");
         back.add(bslide1);
         bslide1.setBounds(0, 140,840, 500);
         
         bslide2 = new JLabel("");
         bslide2.setBounds(840, 140, 840, 500);
         back.add(bslide2);
       
        
        JButton Tourism = new JButton("Tourism");
        back.add(Tourism);
        Tourism.setBackground(Color.WHITE);
        Tourism.setBounds(934, 20, 89, 23);
        
        JButton Education = new JButton("Education");
        back.add(Education);
        Education.setBackground(Color.WHITE);
        Education.setBounds(1020, 20, 100, 23);
        
        /*JButton Business = new JButton("Business");
        back.add(Business);
        Business.setBackground(Color.WHITE);
        Business.setBounds(1113, 20, 100, 23);*/
        
       JButton General = new JButton("Map");
        back.add(General);
        General.setBackground(Color.WHITE);
        General.setBounds(1113, 20, 100, 23);
      
        General.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		/* Browser browser = BrowserFactory.create();
        	        JFrame frame = new JFrame("JxBrowser Google Maps");
        	        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        	        frame.add(browser.getView().getComponent(), BorderLayout.CENTER);
        	        frame.setSize(700, 500);
        	        frame.setLocationRelativeTo(null);
        	        frame.setVisible(true);
        	        browser.loadURL("http://maps.google.com");*/
        	}
        });
      
        Education.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		EducationChennai t=new EducationChennai(); 
                t.show();
        	}
        });
        Education.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        Tourism.addMouseListener(new MouseAdapter() {
        	@SuppressWarnings("deprecation")
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		//TourismBlore t=new TourismBlore(); 
                //t.show();
        		FrameDisplayChennai t=new FrameDisplayChennai(); 
        	}
        });
        Tourism.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
         bslide1.setVisible(true);
         bslide2.setVisible(true);
	     //JPanel text = new JPanel();x
		// String all = new Scanner(new File("textExample.txt")).useDelimiter("\\A").next(); 
	     //SetImageSize();

	}
	
public void Slideshow(){
		new Thread(){
			int count=0;
			@Override
			public void run()
			{
				try{
					while(true)
					{
						switch(count)
						{
						case 0 : //System.out.println("Hello");
							    ImageIcon i1=new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\slide\\chennai3.jpg");
						        bslide1.setIcon(i1);
						        bslide1.setVisible(true);
						        Thread.sleep(2000);
							    AC.jLabelXLeft(0,-840,20,7, bslide1);
						        AC.jLabelXLeft(840, 0,20,7, bslide2);
						        count=1;
								break;
						case 1: 
							
					    ImageIcon i2=new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\slide\\chennai4.jpg");
				        bslide2.setIcon(i2);
				        bslide2.setVisible(true);
				        Thread.sleep(2000);
				        AC.jLabelXRight(-840,0,20,7, bslide1);
				        AC.jLabelXRight(0, 840,20,7, bslide2);
				        count=2;
						break;
						case 2: //Thread.sleep(2000);
					    ImageIcon i3=new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\slide\\chennai3.jpg");
				        bslide1.setIcon(i3);
				        bslide1.setVisible(true);
				        Thread.sleep(2000);
				        AC.jLabelXLeft(0,-840,20,7, bslide1);
				        AC.jLabelXLeft(840, 0,20,7, bslide2);
				        count=3;
						break;
						case 3: //Thread.sleep(2000);
					    ImageIcon i4=new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\slide\\chennai4.jpg");
				        bslide2.setIcon(i4);
				        bslide2.setVisible(true);
				        Thread.sleep(2000);
				        AC.jLabelXRight(-840,0,20,7, bslide1);
				        AC.jLabelXRight(0, 840,20,7, bslide2);
				        count=4;
						break;
						case 4: //Thread.sleep(2000);
					    ImageIcon i5=new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\slide\\chennai3.jpg");
				        bslide1.setIcon(i5);
				        bslide1.setVisible(true);
				        Thread.sleep(2000);
				        AC.jLabelXLeft(0, -840,20,7, bslide1);
				        AC.jLabelXLeft(840, 0,20,7, bslide2);
				        count=0;
				        //Thread.sleep(2000);
						break;
						}
					}
					
				}
				catch(Exception e)
				{
					
				}
			}
		}.start();
	}
}

package smartcity;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import AppPackage.AnimationClass;
import javax.swing.JLabel;

public class Test extends JFrame {

	private JPanel contentPane;
    AnimationClass AC=new AnimationClass();
    /**
     * @wbp.nonvisual location=861,119
     */
    private final JLabel bslide2 = new JLabel("");
    private final JLabel bslide1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
					frame.setVisible(true);
					frame.Slideshow();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 840, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		bslide1 = new JLabel("");
		bslide1.setBounds(0, 0, 840, 300);
		bslide2.setBounds(840, 0, 840, 300);
		
		contentPane.add(bslide1);
		contentPane.add(bslide2);
		bslide1.setVisible(true);
		//ImageIcon i1=new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\Bangalore.jpg");
        //bslide1.setIcon(i1);
		bslide2.setVisible(true);
		//System.out.println("Hello");
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
							    ImageIcon i1=new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\Bangalore.jpg");
						        bslide1.setIcon(i1);
						        bslide1.setVisible(true);
						        Thread.sleep(2000);
							    AC.jLabelXLeft(0,-840,20,7, bslide1);
						        AC.jLabelXLeft(840, 0,20,7, bslide2);
						        count=1;
								break;
						case 1: 
					    ImageIcon i2=new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\city3.jpg");
				        bslide2.setIcon(i2);
				        bslide2.setVisible(true);
				        Thread.sleep(2000);
				        AC.jLabelXRight(-840,0,20,7, bslide1);
				        AC.jLabelXRight(0, 840,20,7, bslide2);
				        count=2;
						break;
						case 2: //Thread.sleep(2000);
					    ImageIcon i3=new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\Bangalore_Palace.jpg");
				        bslide1.setIcon(i3);
				        bslide1.setVisible(true);
				        Thread.sleep(2000);
				        AC.jLabelXLeft(0,-840,20,7, bslide1);
				        AC.jLabelXLeft(840, 0,20,7, bslide2);
				        count=3;
						break;
						case 3: //Thread.sleep(2000);
					    ImageIcon i4=new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\cubbonpark.jpg");
				        bslide2.setIcon(i4);
				        bslide2.setVisible(true);
				        Thread.sleep(2000);
				        AC.jLabelXRight(-840,0,20,7, bslide1);
				        AC.jLabelXRight(0, 840,20,7, bslide2);
				        count=4;
						break;
						case 4: //Thread.sleep(2000);
					    ImageIcon i5=new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\metro.jpg");
				        bslide1.setIcon(i5);
				        bslide1.setVisible(true);
				        Thread.sleep(2000);
				        AC.jLabelXLeft(0, -840,20,7, bslide1);
				        AC.jLabelXLeft(840, 0,20,7, bslide2);
				        count=0;
				        Thread.sleep(2000);
						break;
						}
					}
					
				}
				catch(Exception e)
				{
					System.out.println("Hello");
				}
			}
		}.start();
	}

}

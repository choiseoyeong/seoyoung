import javax.swing.*;
import java.awt.*;

public class Practice6 extends JFrame{
	public Practice6() {
		setTitle("Practice6");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		String item1[] = {"apple","banana","kiwi","mango","pear","peach","berry","strawberry","blackberry"};
		String item2[] = {"kitae","seoyoung","soo","fesu"};
		ImageIcon cherry = new ImageIcon("C:\\Users\\CSW\\Pictures\\cherry.jpg"); 
		ImageIcon home = new ImageIcon("C:\\Users\\CSW\\Pictures\\home.png");
		ImageIcon key = new ImageIcon("C:\\Users\\CSW\\Pictures\\key.png");
		ImageIcon wifi = new ImageIcon("C:\\Users\\CSW\\Pictures\\wifi.png");
		ImageIcon search = new ImageIcon("C:\\Users\\CSW\\Pictures\\search.png");
		String[] month = new String[] {"January","February","March","April","May","June",
				"July","August","September","October","Novemver","December"};
		
		c.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));         //JButton
		c.add(new JButton("버튼"));
		
		   
		c.add(new JCheckBox("사과"));                                  //JCheckBox
		c.add(new JCheckBox("배"));
		JCheckBox imagecheck1 = new JCheckBox("체리",cherry);
		imagecheck1.setBorderPainted(true);
		c.add(imagecheck1);
		
		
		c.add(new JRadioButton("사과"));                               //JRadioButton
		c.add(new JRadioButton("배"));
		JRadioButton imagecheck2 = new JRadioButton("체리",cherry);
		imagecheck2.setBorderPainted(true);
		c.add(imagecheck2);
		
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL,0,200,100);   //JSlider
		slider.setMinorTickSpacing(10);
		slider.setMajorTickSpacing(50);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		c.add(slider);
	
		
		c.add(new JLabel(" 이름:"));                                  //JTextField
		c.add(new JTextField(10));
		c.add(new JLabel(" 학과:"));
		c.add(new JTextField(10));
		c.add(new JLabel("주소:"));
		c.add(new JTextField(10));
		
		c.add(new JLabel(" Enter the password:"));                  //JPasswordField
		c.add(new JPasswordField(10));
	
		JSpinner spinner = new JSpinner();                          //JSpinner
		spinner.setModel(new SpinnerListModel(month));
		c.add(new JLabel(" Month:"));
		c.add(spinner);

		
		c.add(new JTextArea(10,20));                               //JTextArea
		
		
		c.add(new JComboBox<String>(item1));                       //JComboBox
		c.add(new JComboBox<String>(item2));
		
		
		ImageIcon imageList[] = {home,search,wifi,key};            //JList
		c.add(new JList<String>(item1));
		c.add(new JList<ImageIcon>(imageList));
		JList<String> jscrollList = new JList<String>(item1);
		JScrollPane pane = new JScrollPane(jscrollList); 
		c.add(pane);                                               
				
		setSize(1200,700);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Practice6();

	}

}

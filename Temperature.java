import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;





public class Temperature extends JFrame implements ActionListener {
	private Container c;
	private ImageIcon img,img2;
	private JLabel imglabel,text,text2,textlabel,textlabel2,textlabel3,textlabel4;
	private Font f,f2;
	private JTextField Fahrenheit,Celsius,Kelvin,Output;
	private JButton F,C,K,Clear;
	private JOptionPane op1;
	private JPanel p1,p2;
	
	public Temperature()
	{
		components();
	}
	
	public void components()
	{
		c=this.getContentPane();
		c.setLayout(null);
		//c.setBackground(Color.black);
		c.setBackground(new Color(252, 253, 255));
		f= new Font("Arial",Font.BOLD,20);
		f2= new Font("Arial",Font.BOLD,28);
		
		//Icon Set.
		img=new ImageIcon(getClass().getResource("temp.png"));
		this.setIconImage(img.getImage());
		img2= new ImageIcon(getClass().getResource("tempb.png"));
		
		
		//Temperature Banner Set.
		imglabel= new JLabel(img2);
		imglabel.setBounds(40, 10, 400, 250);
		//imglabel.setBounds(20,10,img.getIconWidth(),img.getIconHeight());
		c.add(imglabel);
		
		text= new JLabel("---------------------------------------------------------------------------");
		text.setBounds(0, 260, 510, 20);
		text.setFont(f);
		text.setForeground(new Color(82, 109, 130));
		c.add(text);
		
		
		textlabel= new JLabel("Fahrenheit: ");
		textlabel.setBounds(40, 280, 150, 50);
		textlabel.setFont(f);
		textlabel.setForeground(new Color(140,22,88,255));
		c.add(textlabel);
		
		Fahrenheit = new JTextField();
		Fahrenheit.setBounds(200, 280, 230, 50);
		Fahrenheit.setFont(f);
		//Fahrenheit.setForeground(new Color(209, 209, 209 ));
		Fahrenheit.setBackground(new Color(238, 241, 255));
		Fahrenheit.addActionListener(this);
		c.add(Fahrenheit);
		
		
		
		textlabel2= new JLabel("Celsius: ");
		textlabel2.setBounds(40, 330, 150, 50);
		textlabel2.setFont(f);
		textlabel2.setForeground(new Color(192,93,72,255));
		c.add(textlabel2);
		
		Celsius = new JTextField();
		Celsius.setBounds(200, 330, 230, 50);
		Celsius.setFont(f);
		Celsius.setBackground(new Color(238, 241, 255));
		Celsius.addActionListener(this);
		c.add(Celsius);
		
		textlabel3= new JLabel("Kelvin: ");
		textlabel3.setBounds(40, 380, 150, 50);
		textlabel3.setFont(f);
		textlabel3.setForeground(new Color(48,140,83,255));
		c.add(textlabel3);
		
		Kelvin = new JTextField();
		Kelvin.setBounds(200, 380, 230, 50);
		Kelvin.setFont(f);
		Kelvin.setBackground(new Color(238, 241, 255));
		Kelvin.addActionListener(this);
		c.add(Kelvin);
		
		textlabel4= new JLabel("Output: ");
		textlabel4.setBounds(40, 430, 150, 50);
		textlabel4.setFont(f);
		textlabel4.setForeground(Color.red);
		c.add(textlabel4);
		
		Output = new JTextField();
		Output.setBounds(200, 430, 230, 50);
		Output.setFont(f);
		Output.setBackground(new Color(238, 241, 255));
		c.add(Output);
		
		Clear= new JButton("Clear");
		Clear.setBounds(329, 480, 100, 40);
		Clear.setFont(f);
		Clear.setBackground(new Color(238, 241, 255));
//		Clear.setForeground(new Color(219,34,44,255));
		Clear.addActionListener(this);
		c.add(Clear);
		
		p2 = new JPanel();
		p2.setBounds(0, 270, 510, 260);
		p2.setBackground(new Color(170, 196, 255));
		p2.setLayout(null);
		c.add(p2);
		
		
		text2= new JLabel("---------------------------------------------------------------------------");
		text2.setBounds(0, 520, 510, 20);
		text2.setFont(f);
		text2.setForeground(new Color(82, 109, 130));
		c.add(text2);
		
		F=new JButton("°F");
		F.setBounds(50, 550, 120, 100);
		F.setBackground(new Color(238, 241, 255));
		F.setForeground(new Color(140,22,88,255));
		F.setFont(f2);
		F.addActionListener(this);
		c.add(F);
		
		C=new JButton("°C");
		C.setBounds(180, 550, 120, 100);
		C.setBackground(new Color(238, 241, 255));
		C.setForeground(new Color(192,93,72,255));
		C.setFont(f2);
		C.addActionListener(this);
		c.add(C);
		
		K=new JButton("K");
		K.setBounds(310, 550, 120, 100);
		K.setBackground(new Color(238, 241, 255));
		K.setForeground(new Color(48,140,83,255));
		K.setFont(f2);
		K.addActionListener(this);
		c.add(K);
		
		
		p1= new JPanel();
		p1.setBounds(0, 530, 510, 300);
		p1.setBackground(new Color(210, 218, 255));
		p1.setLayout(null);
		c.add(p1);
		
		
		
	}

	
	public static void main(String[] args) {
		Temperature temp = new Temperature();
		temp.setVisible(true);
		temp.setDefaultCloseOperation(EXIT_ON_CLOSE);
		temp.setTitle("Temperature Converter");
		temp.setResizable(false);
		temp.setBounds(700,200,500,700);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Clear)
		{
			Fahrenheit.setText("");
			Celsius.setText("");
			Kelvin.setText("");
			Output.setText("");
		}
		else if(e.getSource()==K)
		{
			
				String s1= Fahrenheit.getText();
				String s2= Celsius.getText();
				String s3= Kelvin.getText();
				if(s1.isEmpty()&& s2.isEmpty()&&s3.isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Input a Number");
				}
				
				else if(s2.isEmpty()&& s3.isEmpty())
				{
					double a = Double.parseDouble(s1);
					Double ftok=(a-32)*5/9+273.15;
					String resultftok= String.valueOf(ftok);
					Output.setText(resultftok);
				}
				else if(s1.isEmpty()&& s3.isEmpty())
				{
					double b = Double.parseDouble(s2);
					Double ctok=(b+273.15);
					String resultctok= String.valueOf(ctok);
					Output.setText(resultctok);
				}
				else if(s1.isEmpty()&& s2.isEmpty())
				{
					Output.setText(s3);
				}

				else 
				{
					JOptionPane.showMessageDialog(null,"Enter a Single Input");
				}
				
		}
		else if(e.getSource()==C)
		{
			
			String s1= Fahrenheit.getText();
			String s2= Celsius.getText();
			String s3= Kelvin.getText();
			if(s1.isEmpty()&& s2.isEmpty()&&s3.isEmpty())
			{
				JOptionPane.showMessageDialog(null,"Input a Number");
			}
			else if(s2.isEmpty()&& s3.isEmpty())
			{
				double a = Double.parseDouble(s1);
				Double ftoc=(a-32)*5/9;
				String resultftoc= String.valueOf(ftoc);
				Output.setText(resultftoc);
			}
			else if(s1.isEmpty()&& s3.isEmpty())
			{
				double b = Double.parseDouble(s2);
				Output.setText(s2);
			}
			else if(s1.isEmpty()&& s2.isEmpty())
			{
				double c=Double.parseDouble(s3);
				Double ktoc=(c-273.15);
				String resultktoc= String.valueOf(ktoc);
				Output.setText(resultktoc);
				
			}

			else 
			{
				JOptionPane.showMessageDialog(null,"Enter a Single Input");
			}

		}
		
		else if(e.getSource()==F)
		{
			
			String s1= Fahrenheit.getText();
			String s2= Celsius.getText();
			String s3= Kelvin.getText();
			if(s1.isEmpty()&& s2.isEmpty()&&s3.isEmpty())
			{
				JOptionPane.showMessageDialog(null,"Input a Number");
			}
			else if(s2.isEmpty()&& s3.isEmpty())
			{
				double a = Double.parseDouble(s1);
				Output.setText(s1);
			}
			else if(s1.isEmpty()&& s3.isEmpty())
			{
				double b = Double.parseDouble(s2);
				Double ctof=b*1.8+32;
				String resultctof= String.valueOf(ctof);
				Output.setText(resultctof);
	
			}
			else if(s1.isEmpty()&& s2.isEmpty())
			{
				double c=Double.parseDouble(s3);
				Double ktof=(c-273.15)*9/5+32;
				String resultktof= String.valueOf(ktof);
				Output.setText(resultktof);
				
			}
			
			
			else 
			{
				JOptionPane.showMessageDialog(null,"Enter a Single Input");
			}
		
		}

		
	}
	
	
	
	

}

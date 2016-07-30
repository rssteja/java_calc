import java.lang.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


class calc extends JFrame implements ActionListener,KeyListener,MouseMotionListener
{

	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21;
	JButton b;
	JLabel t;
	JMenuBar mb;
	JMenu mfile;
	JMenuItem mclose;
	JTextField t1; 
	GridBagLayout g;
	GridBagConstraints gbc;
	String str="";
	char ch1='0',ch2='0';
	String str1="",str2="";
	double n1=0,n2=0;
	Color c =Color.getHSBColor(0.70f,0.3f,1.0f);//(hue,saturation,brightness)
			
	
			

	public void keyPressed(KeyEvent e)
	{
		char ch=e.getKeyChar();	
	
		
		if( (((int)ch>=48)&&((int)ch<=57)) || (ch=='+') || (ch=='-') || (ch=='*') ||
			(ch=='/') || (ch=='%') || (ch=='.'))
		{
			str=str+String.valueOf(ch);

			t1.setText(str);
		}

		if((((int)ch)==KeyEvent.VK_BACK_SPACE) && str.length()>=1)
		{
			str=str.substring(0,str.length()-1);
			t1.setText(str);
		}

		if((ch=='r') || (ch=='R'))
		{
			str="";
			t1.setText(str);
			t.setText("0");
		}
		
		
		if(ch=='\n')
		{
			logic();
			
			if(ch1=='0')
			{
			if(str=="")
			t.setText("="+0);
			else
			t.setText("="+String.valueOf(str));
			}

			else
			
			if(n1%2==0 || n1%2==1)
			{
			t.setText("="+String.valueOf((int)n1));
			str="";
			str=str+(int)n1;
					
			}
			else
			{
			t.setText("="+String.valueOf(n1));
			str="";
			str=str+n1;
		
			}	
		}	
		
	}

	public void keyReleased(KeyEvent e)
	{
	
		
	}

	public void keyTyped(KeyEvent e)
	{
	}

				
	
	public void actionPerformed(ActionEvent e)
	{
		
		
		if(((JButton)(e.getSource())).getText().equals("1"))
		{
			str=str+"1";
			t1.setText(str);
			
		}
		
		if(((JButton)(e.getSource())).getText().equals("2"))
		{
			str=str+"2";
			t1.setText(str);
		}
		
		if(((JButton)(e.getSource())).getText().equals("3"))
		{
			str=str+"3";
			t1.setText(str);
		}
		
		if(((JButton)(e.getSource())).getText().equals("4"))
		{
			str=str+"4";
			t1.setText(str);
		}
		
		if(((JButton)(e.getSource())).getText().equals("5"))
		{
			str=str+"5";
			t1.setText(str);
		}
		
		if(((JButton)(e.getSource())).getText().equals("6"))
		{
			str=str+"6";
			t1.setText(str);
		}
		
		if(((JButton)(e.getSource())).getText().equals("7"))
		{
			str=str+"7";
			t1.setText(str);
		}
			
		if(((JButton)(e.getSource())).getText().equals("8"))
		{
			str=str+"8";
			t1.setText(str);
		}

		if(((JButton)(e.getSource())).getText().equals("9"))
		{
			str=str+"9";
			t1.setText(str);
		}

		if(((JButton)(e.getSource())).getText().equals("0"))
		{
			str=str+"0";
			t1.setText(str);
		}

		if(((JButton)(e.getSource())).getText().equals("+"))
		{
			str=str+"+";
			t1.setText(str);
		}

		if(((JButton)(e.getSource())).getText().equals("-"))
		{
			str=str+"-";
			t1.setText(str);
		}

		if(((JButton)(e.getSource())).getText().equals("*"))
		{
			str=str+"*";
			t1.setText(str);
		}

		if(((JButton)(e.getSource())).getText().equals("/"))
		{
			str=str+"/";
			t1.setText(str);
		}
		

		if(((JButton)(e.getSource())).getText().equals("%"))
		{
			str=str+"%";
			t1.setText(str);
		}

		if(((JButton)(e.getSource())).getText().equals("."))
		{
		str=str+".";
		t1.setText(str);
		}	
	
		if(((JButton)(e.getSource())).getText().equals("=") || ((JButton)(e.getSource())).getText().equals("1/x") ||
			 ((JButton)(e.getSource())).getText().equals("sqt"))
		{

			logic();
							


			if(ch1=='0')
			{
			if(str=="")
			t.setText("="+0);
			else
			{
			if(((JButton)(e.getSource())).getText().equals("sqt"))
			{
			
			double d=Math.sqrt(Double.parseDouble(str));

			if(d%2==0 || d%2==1)
			{
			t.setText("="+String.valueOf((int)d));		
			str="";
			str=str+(int)d;
			}
			else
			{
			t.setText("="+String.valueOf(d));
			str="";
			str=str+d;
			}

			}
			else
			if(((JButton)(e.getSource())).getText().equals("1/x"))
			{
			double d=Double.parseDouble(str);
			d=1/d;

			if(d%2==0 || d%2==1)
			{
			str="";
			str=str+(int)d;
			t.setText("="+String.valueOf((int)d));		
			}
			else
			{
			t.setText("="+String.valueOf(d));
			str="";
			str=str+d;
			}
			}
			else
			t.setText("="+String.valueOf(str));	
			}
			
			}
			else
			{
			if(((JButton)(e.getSource())).getText().equals("sqt"))
			{
			n1=Math.sqrt(n1);
			if(n1%2==0 || n1%2==1)
			t.setText("="+String.valueOf((int)n1));		
			else
			t.setText("="+String.valueOf(n1));

			}
			else
			if(((JButton)(e.getSource())).getText().equals("1/x"))
			{
			n1=1/n1;
			if(n1%2==0 || n1%2==1)
			t.setText("="+String.valueOf((int)n1));		
			else
			t.setText("="+String.valueOf(n1));

			}	
			else
			if(n1%2==0 || n1%2==1)
			t.setText("="+String.valueOf((int)n1));		
			else
			t.setText("="+String.valueOf(n1));
			}	
		

		if(ch1=='0')
		{
		t1.setText(str);
		}
		else
		{
		if(n1%2==0 || n1%2==1)
		{	
		str="";
		str=str+(int)n1;
		}
		else
		{
		str="";
		str=str+n1;
		}
		
		}
			

		}

		if(((JButton)(e.getSource())).getText().equals("MR"))
		{
		str="";
		t1.setText("");
		t.setText("0");
		}

		if(((JButton)(e.getSource())).getText().equals("cut") && (str.length()>=1))
		{
		str=str.substring(0,str.length()-1);
		t1.setText(str);
		}
				
	}
		
	public void logic()
	{
		int i,j=0,m=0;
		ch1='0';ch2='0';
		str1="";str2="";
		n1=0;n2=0;
	

			for(i=0;i<str.length();i++)
			{

			
			if(str.charAt(i)!='*' && str.charAt(i)!='+'  && str.charAt(i)!='-' && str.charAt(i)!='/' && str.charAt(i)!='%' )
			
				str1=str1+String.valueOf(str.charAt(i));
			

			else
			
			{
			if(i==0)
			str1=str1+String.valueOf(str.charAt(i));
			
			else
			{
			
			if(str.charAt(i-1)=='*' || str.charAt(i-1)=='+' || str.charAt(i-1)=='-' || str.charAt(i-1)=='/' || str.charAt(i-1)=='%')
			str1=str1+String.valueOf(str.charAt(i));
			
			else
			{
			
			if(ch1!='0')
			
			ch2=str.charAt(i);
			
			if(ch1=='0')
			ch1=str.charAt(i);
			

			if(j==1)
			{
			
			n2=Double.parseDouble(str1);
			if(ch1=='+')
			n1=n1+n2;

			if(ch1=='-')
			n1=n1-n2;

			if(ch1=='*')
			n1=n1*n2;

			if(ch1=='/')
			n1=n1/n2;
		
			if(ch1=='%')
			n1=n1%n2;

			str1="";
			ch1=ch2;
			}

			if(n1==0.0F && j==0)
			{
			j++;
			n1=Double.parseDouble(str1);			
			str1="";
			}
			}
			}
			
			}

			}
		
			if(ch1=='+')
			n1=n1+Double.parseDouble(str1);

			if(ch1=='-')
			n1=n1-Double.parseDouble(str1);

			if(ch1=='*')
			n1=n1*Double.parseDouble(str1);

			if(ch1=='/')
			n1=n1/Double.parseDouble(str1);
		
			if(ch1=='%')
			n1=n1%Double.parseDouble(str1);
			
	}

	
	public void mouseMoved(MouseEvent e)
	{

	if(e.getSource() instanceof JButton)
	((JButton)e.getSource()).setBackground(c);
	
	if(b!=null && b!=((JButton)e.getSource()))
	{
	b.setBackground(null);	
	}
		
	
	b=((JButton)e.getSource());
	}

	public void mouseDragged(MouseEvent e)
	{
	}

	public calc(String str)
	{

		super(str);
		char ch;

		Font s=new Font("Times New Roman",Font.BOLD,20);
		setFont(s);
	
		mb=new JMenuBar();
		mfile=new JMenu("FILE");
		mclose=new JMenuItem("close");
		mfile.add(mclose);
		mb.add(mfile);
		
		
		g=new GridBagLayout();
		gbc=new GridBagConstraints();
		setLayout(g);
		
		t=new JLabel("",JLabel.RIGHT);
		t.setFont(s);
		
		t1=new JTextField(3);
		t1.setFont(s);
		t1.setText("");
		t1.setEnabled(false);
		t1.setDisabledTextColor(Color.BLACK);

		
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b10=new JButton("0");
		b11=new JButton("+");
		b12=new JButton("-");
		b13=new JButton("*");
		b14=new JButton("/");
		b15=new JButton("%");
		b16=new JButton("=");
		b17=new JButton("MR");
		b18=new JButton(".");
		b19=new JButton("cut");
		b20=new JButton("1/x");
		b21=new JButton("sqt");

		b1.setFocusPainted(false);
		b2.setFocusPainted(false);
		b3.setFocusPainted(false);
		b4.setFocusPainted(false);
		b5.setFocusPainted(false);
		b6.setFocusPainted(false);
		b7.setFocusPainted(false);
		b8.setFocusPainted(false);
		b9.setFocusPainted(false);
		b10.setFocusPainted(false);
		b11.setFocusPainted(false);
		b12.setFocusPainted(false);
		b13.setFocusPainted(false);
		b14.setFocusPainted(false);
		b15.setFocusPainted(false);
		b16.setFocusPainted(false);
		b17.setFocusPainted(false);
		b18.setFocusPainted(false);
		b19.setFocusPainted(false);
		b20.setFocusPainted(false);
		b21.setFocusPainted(false);


		gbc.fill=GridBagConstraints.BOTH;
		gbc.anchor=GridBagConstraints.CENTER;

		
		gbc.gridheight=1;
		gbc.gridwidth=1;
		gbc.weighty=1.0;	
		
		gbc.weightx=1.0;
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		g.setConstraints(mb,gbc);
		add(mb);
	
		gbc.gridheight=1;
		gbc.gridwidth=1;
			
		
		gbc.insets.set(10,10,0,10);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		g.setConstraints(t1,gbc);
		add(t1);


		gbc.gridheight=1;
		gbc.weighty=1.0;	
				
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		g.setConstraints(t,gbc);
		add(t);

		gbc.gridwidth=1;
		g.setConstraints(b17,gbc);
		add(b17);
		
		gbc.gridwidth=GridBagConstraints.RELATIVE;
		g.setConstraints(b19,gbc);
		add(b19);
		
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		g.setConstraints(b16,gbc);
		add(b16);
				
		gbc.gridwidth=1;
		g.setConstraints(b9,gbc);
		add(b9);
		
		gbc.gridwidth=GridBagConstraints.RELATIVE;
		g.setConstraints(b8,gbc);
		add(b8);


		gbc.gridwidth=GridBagConstraints.REMAINDER;
		g.setConstraints(b7,gbc);
		add(b7);
	
		gbc.gridwidth=1;
		g.setConstraints(b6,gbc);
		add(b6);

		gbc.gridwidth=GridBagConstraints.RELATIVE;
		g.setConstraints(b5,gbc);
		add(b5);
	
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		g.setConstraints(b4,gbc);
		add(b4);

		gbc.gridwidth=1;
		g.setConstraints(b3,gbc);
		add(b3);
	
		gbc.gridwidth=GridBagConstraints.RELATIVE;
		g.setConstraints(b2,gbc);
		add(b2);
		

		gbc.gridwidth=GridBagConstraints.REMAINDER;
		g.setConstraints(b1,gbc);
		add(b1);
		
		gbc.gridwidth=1;
		g.setConstraints(b10,gbc);
		add(b10);

		gbc.gridwidth=GridBagConstraints.RELATIVE;
		g.setConstraints(b11,gbc);
		add(b11);
	
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		g.setConstraints(b12,gbc);
		add(b12);
		
		gbc.gridwidth=1;
		g.setConstraints(b13,gbc);
		add(b13);
		
		gbc.gridwidth=GridBagConstraints.RELATIVE;
		g.setConstraints(b14,gbc);
		add(b14);

		gbc.gridwidth=GridBagConstraints.REMAINDER;
		g.setConstraints(b15,gbc);
		add(b15);
		
		gbc.gridwidth=1;
		gbc.insets.set(10,10,10,10);
		g.setConstraints(b18,gbc);
		add(b18);
		
		gbc.gridwidth=GridBagConstraints.RELATIVE;
		g.setConstraints(b20,gbc);
		add(b20);

		gbc.gridwidth=GridBagConstraints.REMAINDER;
		g.setConstraints(b21,gbc);
		add(b21);		
				
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
		b19.addActionListener(this);
		b20.addActionListener(this);
		b21.addActionListener(this);
		
		

		b1.addKeyListener(this);
		b2.addKeyListener(this);
		b3.addKeyListener(this);
		b4.addKeyListener(this);
		b5.addKeyListener(this);
		b6.addKeyListener(this);
		b7.addKeyListener(this);
		b8.addKeyListener(this);
		b9.addKeyListener(this);
		b10.addKeyListener(this);
		b11.addKeyListener(this);
		b12.addKeyListener(this);
		b13.addKeyListener(this);
		b14.addKeyListener(this);
		b15.addKeyListener(this);
		b16.addKeyListener(this);
		b17.addKeyListener(this);
		b18.addKeyListener(this);
		b19.addKeyListener(this);
		b20.addKeyListener(this);
		b21.addKeyListener(this);

		
		b1.addMouseMotionListener(this);
		b2.addMouseMotionListener(this);
		b3.addMouseMotionListener(this);
		b4.addMouseMotionListener(this);		
		b5.addMouseMotionListener(this);
		b6.addMouseMotionListener(this);
		b7.addMouseMotionListener(this);
		b8.addMouseMotionListener(this);
		b9.addMouseMotionListener(this);		
		b10.addMouseMotionListener(this);
		b11.addMouseMotionListener(this);
		b12.addMouseMotionListener(this);
		b13.addMouseMotionListener(this);
		b14.addMouseMotionListener(this);		
		b15.addMouseMotionListener(this);
		b16.addMouseMotionListener(this);
		b17.addMouseMotionListener(this);
		b18.addMouseMotionListener(this);
		b19.addMouseMotionListener(this);		
		b20.addMouseMotionListener(this);
		b21.addMouseMotionListener(this);

		addMouseMotionListener(new MouseMotionListener()
					{
					public void mouseMoved(MouseEvent e)
					{	

					if(b!=null)
					b.setBackground(null);
					}
					public void mouseDragged(MouseEvent e)
					{
					}
					});
	
		addKeyListener(this);
		addWindowListener(new WindowAdapter()
					{
					public void windowOpened(WindowEvent e)
					{
					((Window)(e.getSource())).setBounds(400,300,250,425);
					}
					
					public void windowClosing(WindowEvent e)
					{
						((JFrame)(e.getSource())).dispose();
						//System.exit(0);
					}
			
					}
					);
		mclose.addActionListener(new ActionListener()
					{
					public void actionPerformed(ActionEvent e)
					{
		
					if(((JMenuItem)(e.getSource())).getText().equals("close"))
					{		
					System.exit(0);
					}
					}
					});

		setVisible(true);
		setResizable(false);	

				
	}

	public static void main(String args[])
	{
		calc my_cal=new calc("calculator");
	}
}



		
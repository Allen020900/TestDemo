1.	import javax.swing.*;  
2.	public class FirstSwingExample 
3.	{  
4.	public static void main(String[] args) 
5.	{  
6.	JFrame f=new JFrame();//creating instance of JFrame  
7.	          
8.	JButton b=new JButton("click");//creating instance of JButton  
9.	b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
10.	          
11.	f.add(b);//adding button in JFrame  
12.	          
13.	f.setSize(400,500);//400 width and 500 height  
14.	f.setLayout(null);//using no layout managers  
15.	f.setVisible(true);//making the frame visible  
16.	}  
17.	}  

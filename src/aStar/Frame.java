package aStar;
import java.awt.GridLayout;
import javax.swing.JFrame;



public class Frame extends JFrame{
	Screen s;
	
	public Frame()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(160*5,120*5);
		setResizable(false);
		setTitle("Map");
		
		init();
	}
	
	public void init()
	{
		setLocationRelativeTo(null);
		
		setLayout(new GridLayout(1,1,0,0));
		
		s = new Screen();
		
		add(s);
		
		setVisible(true);
	}
	
	public static void main (String[] args)
	{

		new Frame();
	}
}

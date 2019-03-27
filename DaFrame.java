import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DaFrame extends JFrame
{
	
	public DaFrame()
	{
		CardLayout cl = new CardLayout();
		JPanel overall = new JPanel();
		overall.setLayout(cl);
		
		JPanel p1 = new JPanel();
		p1.add(new JLabel("panel1"));
		JButton back = new JButton("GO BACK");
		p1.add(back);
		JButton b1 = new JButton("yeee");
		p1.setLayout(new GridBagLayout());
		p1.add(b1);
		
		JPanel p2 = new JPanel();
		p2.add(new JLabel("panel 2"));
		JButton back2 = new JButton("GO BACK");
		p2.add(back2);
		JButton b2 = new JButton("this is a button");
		p2.add(b2);
		p2.setLayout(new GridBagLayout());
		
		JPanel p3 = new JPanel();
		p3.add(new JLabel("three"));
		JButton b3 = new JButton("LAST BUTTON");
		p3.add(b3);
		p3.setLayout(new GridBagLayout());
		
		overall.add(p1, "panel 1");
		overall.add(p2, "panel 2");
		overall.add(p3, "panel 3");
		
		cl.show(overall,  "panel 1");
		add(overall);
		
		b1.addActionListener(new ActionListener ()
		{
			
			public void actionPerformed(ActionEvent arg0) 
			{
				cl.show(overall, "panel 2");
			}
		});
		
		b2.addActionListener(new ActionListener ()
		{

			public void actionPerformed(ActionEvent arg0) 
			{
				cl.show(overall, "panel 3");
			}
		});
		
		b3.addActionListener(new ActionListener ()
		{

			public void actionPerformed(ActionEvent arg0) 
			{
				cl.show(overall, "panel 1");
			}
		});
		
		back.addActionListener(new ActionListener ()
		{

			public void actionPerformed(ActionEvent arg0) 
			{
				cl.show(overall, "panel 3");
			}
		});
		
		back2.addActionListener(new ActionListener ()
		{

			public void actionPerformed(ActionEvent arg0) 
			{
				cl.show(overall, "panel 1");
			}
		});
		setBounds(100, 100, 600, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) 
	{
		new DaFrame();
	}

}

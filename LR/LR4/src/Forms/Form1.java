package Forms;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Form1 extends JFrame
{
	private JTextField tf1;
	private JTextField tf2;
	private JButton button;
	
	public Form1()
	{
		Container container = getContentPane();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		
		tf1 = new JTextField("Привет");
		tf1.setPreferredSize(new Dimension(200, 65));
		tf1.setAlignmentX(Component.LEFT_ALIGNMENT);
		container.add(tf1);
		container.add(Box.createVerticalStrut(2));
		
		tf2 = new JTextField("Мир!");
		tf2.setPreferredSize(new Dimension(200, 65));
		tf2.setAlignmentX(Component.LEFT_ALIGNMENT);
		container.add(tf2);
		container.add(Box.createVerticalStrut(2));
		
		button = new JButton("Нажмите");
		button.setMaximumSize(new Dimension(10000, 10000));
		button.setPreferredSize(new Dimension(200, 65));
		button.setAlignmentX(Component.LEFT_ALIGNMENT);
		container.add(button);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

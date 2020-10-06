package Forms;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Form3 extends JFrame
{
	private JLabel label;
	private JTextArea text;
	private JButton button;
	
	public Form3()
	{
		Container container = getContentPane();
		container.setLayout(new GridLayout(2, 2, 5, 5));
		
		label = new JLabel("Введите число:");
		container.add(label);
		
		text = new JTextArea();
		text.setBackground(Color.RED);
		container.add(text);
		
		button = new JButton("Скрыть поле");
		button.addActionListener(new ButtonListiner());
		container.add(button);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	class ButtonListiner implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if (text.isVisible())
			{
				text.setVisible(false);
				button.setText("Показать поле");
			}
			else
			{
				text.setVisible(true);
				button.setText("Скрыть поле");
			}
		}
	}
}

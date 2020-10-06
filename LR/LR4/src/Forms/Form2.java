package Forms;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Form2 extends JFrame
{
	private JLabel label;
	private JTextField textField;
	private JButton button;
	private JCheckBox checkBox;
	
	public Form2()
	{
		Container container = getContentPane();
		container.setLayout(new GridLayout(2, 2, 5, 5));
		
		label = new JLabel("Введите имя:");
		container.add(label);
		
		textField = new JTextField("Джон Сноу");
		container.add(textField);
		
		button = new JButton("Все готово");
		container.add(button);
		
		checkBox = new JCheckBox("Согласны?");
		container.add(checkBox);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

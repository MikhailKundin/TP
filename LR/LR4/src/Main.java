import Forms.*;

public class Main {

	public static void main(String[] args)
	{
		Form1 form1 = new Form1();
		form1.setSize(200, 200);
		form1.setTitle("Простая программа");
		form1.setVisible(true);
		form1.setLocation(0, 200);
		
		Form2 form2 = new Form2();
		form2.setSize(300, 150);
		form2.setTitle("Простая программа");
		form2.setVisible(true);
		form2.setLocation(250, 200);
		
		Form3 form3 = new Form3();
		form3.setSize(300, 150);
		form3.setTitle("Простая программа");
		form3.setVisible(true);
		form3.setLocation(600, 200);
		
		Form4 form4 = new Form4();
		form4.setSize(300, 75);
		form4.setTitle("Простая программа");
		form4.setVisible(true);
		form4.setLocation(950, 200);
	}
}

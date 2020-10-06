package Game;

import java.util.Random;

public class Person
{
	public static final int MIN_NUMBER = 1;
	public static final int MAX_NUMBER = 20;
	public static final int DAMAGE = 10;
	
	private int m_health = 100;
	private String m_name = "Person";
	private int m_secretNumber = MIN_NUMBER;
	
	protected Random rand;
	
	public Person()
	{
		rand = new Random();
	}
		
	public void setName(String name)
	{
		m_name = name;
	}
	
	public String getName()
	{
		return m_name;
	}
	
	public void setHealth(int health)
	{
		m_health = health;
	}
	
	public int getHealth()
	{
		return m_health;
	}
	
	public void setSecretNumber(int secretNumber)
	{
		m_secretNumber = secretNumber;
	}
	
	public int getSecretNumber()
	{
		return m_secretNumber;
	}
	
	public boolean isHit(int number)
	{
		if (number == m_secretNumber)
		{
			hit();
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void hit()
	{
		m_health -= DAMAGE;
	}
}

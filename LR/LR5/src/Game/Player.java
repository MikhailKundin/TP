package Game;

public class Player extends Person
{
	public Player()
	{
		setSecretNumber(MIN_NUMBER);
	}
	
	public Player(String name)
	{
		setName(name);
		setSecretNumber(MIN_NUMBER);
	}
	
	public byte attack(Person target, int number)
	{
		if (target.isHit(number))
		{
			return 0;
		}
		else
		{
			if (target.getSecretNumber() < number)
			{
				return -1;
			}
			else
			{
				return 1;
			}
		}
	}
}

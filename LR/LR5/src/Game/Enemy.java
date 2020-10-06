package Game;

public class Enemy extends Person
{
	private int chance = MAX_NUMBER-1;
	
	public Enemy()
	{
		generateSecretNumber();
	}
	
	public Enemy(String name)
	{
		setName(name);
		generateSecretNumber();
	}
	
	public boolean attack(Person target)
	{
		int number = rand.nextInt(chance) + MIN_NUMBER;
		if (target.isHit(number))
		{
			chance = MAX_NUMBER-1;
			return true;
		}
		else
		{
			chance--;
			return false;
		}
	}
	
	public void generateSecretNumber()
	{
		setSecretNumber(rand.nextInt(MAX_NUMBER-1)+MIN_NUMBER);
	}
	
	@Override
	public void hit()
	{
		setHealth(getHealth() - DAMAGE);
		generateSecretNumber();
	}
}

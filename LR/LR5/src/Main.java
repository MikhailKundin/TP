import java.util.Scanner;

import Game.*;

public class Main
{
	final static String PLAYER_NAME = "John";
	final static String ENEMY_NAME = "Raptor";
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Player player = new Player(PLAYER_NAME);
		Enemy enemy = new Enemy(ENEMY_NAME);
		
		while (player.getHealth() > 0 && enemy.getHealth() > 0)
		{
			System.out.println("Введите число от " + Integer.toString(Person.MIN_NUMBER) +
							   " до " + Integer.toString(Person.MAX_NUMBER) + ":");
			int number = in.nextInt();
			byte playerRes = player.attack(enemy, number);
			switch (playerRes)
			{
			case 1:
				System.out.println("Вы не угадали! Число, что вы пытаетесь угадать, больше.");
				break;
			case -1:
				System.out.println("Вы не угадали! Число, что вы пытаетесь угадать, меньше.");
				break;
			default:
				int enemyHealth = enemy.getHealth();
				if (enemyHealth > 0)
				{
					System.out.printf("Вы угадали. Теперь у врага с именем %s осталось %d жизней!\n",
									  enemy.getName(), enemyHealth);
				}
				else
				{
					System.out.printf("Вы убили врага с именем %s!\n", enemy.getName());
				}
			}
			
			if (enemy.attack(player))
			{
				int playerHealth = player.getHealth();
				if (playerHealth > 0)
				{
					System.out.printf("Враг попал в вас! У %s осталось %d жизней.\n", player.getName(), playerHealth);
				}
				else
				{
					System.out.println("Вас убили!");
				}
			}
			else
			{
				System.out.println("Враг не угадал число.");
			}
		}
		
		in.close();
	}
}

package bryce;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) 
	{
		walkedIntoABar();
		
	}

	public static void walkedIntoABar()
	{
		ArrayList<Monster> m = new ArrayList<>();

		Random rand = new Random();

		for(int i = 0; i < 3; i++)
		{
			// Create a random Monster
			switch(rand.nextInt(1000000)%2)
			{
				case 0:
					m.add(new Dragon("Gargathor"));
					break;
				case 1:
					m.add(new Orc("Bob"));
					break;

			}

		}

		for(Monster myMonster : m)
		{
			if(rand.nextBoolean()) // Check for Special Attack
			{
				if(myMonster instanceof Orc)
				{
//					Orc o = (Orc) myMonster;
//					o.overwhelmingForce();
					((Orc) myMonster).overwhelmingForce();
				}
				else if (myMonster instanceof Dragon)
				{
					System.out.println("I'm a Dragon! Roar!!");
				}

			}
			else
				System.out.printf("%s: %d\n", myMonster instanceof Dragon ? "Dragon" : "Orc" ,myMonster.attack());
		}


	}

}

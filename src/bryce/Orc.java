package bryce;

public class Orc extends Monster
{
	
	public Orc(String n)
	{
		super(n, 40, 10, DamageType.ACID, DamageType.RANGED);
	}

	public int overwhelmingForce()
	{
		return (int) (damage + (damage * .1));
	}
}

package bryce;

public class Dragon extends Monster
{
	private int bonusDamage = 5;
	
	public Dragon (String n)
	{
		super(n, 100, 30, DamageType.FIRE, DamageType.PHYSICAL );
	}

	@Override
	public int attack()
	{
		return damage + bonusDamage;
	}
}

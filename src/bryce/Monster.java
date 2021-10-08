package bryce;

import java.util.ArrayList;

public class Monster {

	protected int hp, armor, damage, speed;
	protected String name, desc;
	protected ArrayList<DamageType> damageTypes;
	
	/**
	 * 
	 * @param n - Name
	 * @param hit - HP
	 * @param dam - Damage
	 */
	public Monster(String n, int hit, int dam, Object... dt)
	{
		damageTypes = new ArrayList<>();
		for(Object d : dt)
		{
			
			if (d instanceof DamageType)
				damageTypes.add((DamageType) d);
		}
		
		name = n;
		hp = hit;
		damage = dam;		
		
	}

	public int attack()
	{
		return damage;
	}
	
}

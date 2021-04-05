/**
 * ---------------------------------------------------------------------------
 * File name: Participant.java
 * Project name: 1260-SydnieDery-BrittanyCalixto-KinsleeHammonds-Project5
 * ---------------------------------------------------------------------------
 * Creator's name and email: Kinslee Hammonds, hammondsk1@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Apr 3, 2021
 * ---------------------------------------------------------------------------
 */

package zork;

import java.util.Random;


/**
 * Enter type purpose here
 *
 * <hr>
 * Date created: Apr 3, 2021
 * <hr>
 * @author Kinslee Hammonds
 */
public class Participant
{
	private String name;
	private int health;
	private Weapon weapon;
	
	/**
	 * Constructor        
	 *
	 * <hr>
	 * Date created: Apr 3, 2021 
	 *
	 * 
	 */
	public Participant ( )
	{
		name = "Random Participant";
		health = 100;
		Random rand = new Random();
		
		int num = rand.nextInt(2);
		
		if(num == 0)
		{
			weapon = new Stick();
		}
		else
		{
			weapon = new Sword();
		}
		
		

		
	}

	
	/**
	 * Constructor        
	 *
	 * <hr>
	 * Date created: Apr 3, 2021 
	 *
	 * 
	 * @param name
	 * @param health
	 * @param weapons
	 */
	public Participant (String name, int health, Weapon weapon)
	{
		this.name = name;
		this.health = health;
		Random rand = new Random();
		
		int num = rand.nextInt(2);
		
		if(num == 0)
		{
			weapon = new Stick();
		}
		else
		{
			weapon = new Sword();
		}
		
	
	}
	
	
	/**
	 * @return weapon
	 */
	public Weapon getWeapon ( )
	{
		return weapon;
	}


	
	/**
	 * @param weapon the weapon to set
	 */
	public void setWeapon (Weapon weapon)
	{
		this.weapon = weapon;
	}


	/**
	 * Date created: Apr 3, 2021 
	 *  
	 * @return name
	 */
	public String getName ( )
	{
		return name;
	}

	
	/**
	 * Date created: Apr 3, 2021 
	 *  
	 * @param name the name to set
	 */
	public void setName (String name)
	{
		this.name = name;
	}


	
	/**
	 * Date created: Apr 3, 2021 
	 * @return health
	 */
	public int getHealth ( )
	{
		return health;
	}


	
	/**
	 * Date created: Apr 3, 2021 
	 * 
	 * @param health the health to set
	 */
	public void setHealth (int health)
	{
		this.health = health;
	}

	
	/**
	 * Format object of type Participant as a String for
	 * possible display by another class
	 *
	 * Date created: Apr 3, 2021
	 * 
	 * @return the formatted string
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString ( )
	{
		String resultOut = "";
		
		resultOut += "\n" + name;
		resultOut += "\nHealth:" + health;

		return resultOut;
	} // end toString

}
/**
 * ---------------------------------------------------------------------------
 * File name: Monster.java
 * Project name: Zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Sydnie Dery, derysf@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Apr 1, 2021
 * ---------------------------------------------------------------------------
 */

package zork;

import java.util.Random;

/**
 * Enter type purpose here
 *
 * <hr>
 * Date created: Apr 1, 2021
 * <hr>
 * @author Sydnie Dery
 */
public class Monster extends Participant
{
	Random rand;

	/**
	 * 
	 * Default Constructor        
	 *
	 * <hr>
	 * Date created: Apr 2, 2021 
	 *
	 *
	 */
	public Monster()
	{
		super();
		rand = new Random ();
		super.setHealth (rand.nextInt(200));
	}
	
	/**
	 * 
	 * Constructor for a monster with  a Stick  
	 *
	 * <hr>
	 * Date created: Apr 2, 2021 
	 *
	 * 
	 * @param stick
	 */
	public Monster(String name, int health, Weapon weapons)
	{
		super(name, health, weapons);
		
		rand = new Random ();
		super.setHealth (rand.nextInt(200));
		
	}
	
	
	/**}
	 * 
	 * Subtract five health          
	 *
	 * <hr>
	 * Date created: Apr 2, 2021
	 *
	 * <hr>
	 * @param health 
	 */
	public void minusHealth(int health)
	{
		health -= 5;
	}
	
	/**
	 * 
	 * Return true if the attack is successful         
	 * I'll change this to work with the stick/sword attack method later
	 * 
	 * <hr>
	 * Date created: Apr 2, 2021
	 *
	 * <hr>
	 * @return
	 */
	public boolean attack()
	{
		boolean didYouAttack = true;
		int value = rand.nextInt(101) + 1;
		if(value < 21)
		{
			didYouAttack = false;
		}
		
		return didYouAttack;
	}


}



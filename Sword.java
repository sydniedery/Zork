/**
 * ---------------------------------------------------------------------------
 * File name: Sword.java
 * Project name: 1260-SydnieDery-BrittanyCalixto-KinsleeHammonds-Project5
 * ---------------------------------------------------------------------------
 * Creator's name and email: Brittany Calixto, calixto@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Apr 2, 2021
 * ---------------------------------------------------------------------------
 */

package zork;


/**
 * Implements the derived sword
 * class from the abstract weapon
 * class
 *
 * <hr>
 * Date created: Apr 2, 2021
 * <hr>
 * @author Brittany Calixto
 */
public class Sword extends Weapon
{

	/**
	 * Default Constructor        
	 *
	 * <hr>
	 * Date created: Apr 2, 2021
	 */
	public Sword ( )
	{
		
	}

	/**
	 * Parameterized Constructor        
	 *
	 * <hr>
	 * Date created: Apr 2, 2021 
	 *
	 * 
	 * @param type - object type
	 */
	public Sword (String type)
	{
		super ("Sword");
	}

	/**
	 * Attack. Deals damage.         
	 *
	 * <hr>
	 * Date created: Apr 2, 2021 
	 *
	 * <hr>
	 * @see zork.Weapon#attack()
	 */
	@Override
	public void attack ( )
	{
		//monster.health - 3 pts

	}

	/**
	 * Item description        
	 *
	 * <hr>
	 * Date created: Apr 2, 2021 
	 *
	 * <hr>
	 * @return - message about sword
	 */
	@Override
	public String toString ( )
	{
		return "A silver sword. Good for stabbing.";
	}

}
/**
 * ---------------------------------------------------------------------------
 * File name: Weapon.java
 * Project name: 1260-SydnieDery-BrittanyCalixto-KinsleeHammonds-Project5
 * ---------------------------------------------------------------------------
 * Creator's name and email: Brittany Calixto, calixto@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Apr 2, 2021
 * ---------------------------------------------------------------------------
 */

package zork;


/**
 * Base class for the weapons
 *
 * <hr>
 * Date created: Apr 2, 2021
 * <hr>
 * @author Brittany Calixto
 */
public abstract class Weapon
{
	protected String type;

	
	/**
	 * Default Constructor        
	 *
	 * <hr>
	 * Date created: Apr 2, 2021 
	 *
	 * 
	 * @param type
	 */
	public Weapon ( )
	{
		type = "Unknown";
	}


	
	/**
	 * Parameterized Constructor        
	 *
	 * <hr>
	 * Date created: Apr 2, 2021 
	 *
	 * 
	 */
	public Weapon (String type)
	{
		this.type = type;
	}

	/**
	 * Use the weapon
	 *
	 * <hr>
	 * Date created: Apr 2, 2021
	 * <hr>
	 * @author Brittany Calixto
	 */
	public abstract void attack();

	/**
	 * Returns message about weapon        
	 *
	 * <hr>
	 * Date created: Apr 2, 2021 
	 *
	 * <hr>
	 * @return - String message
	 */
	@Override
	public String toString ( )
	{
		return "Weapon []";
	}
	
	
}

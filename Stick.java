/**
 * ---------------------------------------------------------------------------
 * File name: Stick.java
 * Project name: 1260-SydnieDery-BrittanyCalixto-KinsleeHammonds-Project5
 * ---------------------------------------------------------------------------
 * Creator's name and email: Brittany Calixto, calixto@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Apr 2, 2021
 * ---------------------------------------------------------------------------
 */

package zork;


/**
 * Implements the derived stick
 * class from the abstract weapon
 * class
 *
 * <hr>
 * Date created: Apr 2, 2021
 * <hr>
 * @author Brittany Calixto
 */
public class Stick extends Weapon
{

	/**
	 * Default Constructor        
	 *
	 * <hr>
	 * Date created: Apr 2, 2021 
	 */
	public Stick ( )
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
	public Stick (String type)
	{
		super ("Stick");
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
		//monster.health - 1 pt

	}

	/**
	 * Item description        
	 *
	 * <hr>
	 * Date created: Apr 2, 2021 
	 *
	 * <hr>
	 * @return - message about stick
	 */
	@Override
	public String toString ( )
	{
		return "A tree branch. It's better than nothing.";
	}
	
} // end Stick class
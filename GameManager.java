import greenfoot.*;

/**
 * Used as an "intermediate" subclass between the World superclass
 * and level-specific subclasses
 * 
 * @author bcanada@uscb.edu
 * @version 2016.12.09
 */
public class GameManager extends World
{
    /**
     * Constructor for objects of class GameManager.
     * Used to initialize world-width, world-height, world-cellSize,
     *    scene number, and the x- and y- coordinates of the 
     *    current Pengu object
     */
    public GameManager( int width, int height, int cellSize, 
                        int sceneNum, int x, int y )
    {    
        super( width, height, cellSize ); 
        
        /* 
         * adds "new" Pengu to whatever the new scene number is
         * at the specified coordinates
         */
        addObject ( new Pengu( sceneNum ), x, y );
        
    } // end GameManager 6-arg constructor
    
} // end class GameManager

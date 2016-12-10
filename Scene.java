import greenfoot.*;

/**
 * Used as an "intermediate" subclass between the World superclass
 * and level-specific subclasses
 * 
 * @author bcanada@uscb.edu
 * @version 2016.12.09
 */
public class Scene extends World
{
    /**
     * Constructor for objects of class Scene (a generic Scene).
     * Used to initialize world-width, world-height, world-cellSize,
     *    and the x- and y- coordinates where the Pengu object 
     *    will be "re-instantiated" for the new scene
     */
    public Scene( int width, int height, int cellSize, int x, int y )
    {    
        // pass the width, height, and cellSize up to the
        // constructor for the parent class (World) 
        super( width, height, cellSize ); 
        
        /* 
         * adds "new" Pengu to whatever the new scene number is
         * at the specified coordinates
         */
        addObject ( new Pengu(), x, y );
        
    } // end Scene 5-arg constructor
    
} // end class GameManager

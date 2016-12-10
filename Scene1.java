import greenfoot.*; 

/**
 * This is the whole scene. It creates and contains the objects that are in it.
 * (Adapted from the Scene class in the original pengu scenario)
 * 
 * @author bcanada@uscb.edu
 * @version 2016.12.09
 */
public class Scene1 extends GameManager
{
    /**
     * This version of the Scene1 constructor sets
     * the Pengu object at the default starting location
     * of x = 66, y = 244
     */
    public Scene1()
    {    
        super(750, 500, 1, 1, 66, 244); // define size (x, y), cellSize,
                                        // starting scene number,
                                        // and starting position of Pengu

        addObject ( new Cliff(false), 85, 441);
        addObject ( new Cliff(true), 665, 441);
        
        addObject ( new Cloud(), 369, 315 );
    } // end no-arg Scene1 constructor

    /**
     * Overloaded version of the Scene1 constructor that accepts
     * three parameters:
     * -- (1) the new scene number 
     * -- the (2) x-coordinate and (2) y-coordinate where a "new" 
     *    Pengu object  will be "re-instantiated" 
     */
    public Scene1( int sceneNum, int x, int y )
    {    
        super(750, 500, 1, sceneNum, x, y); 

        addObject ( new Cliff(false), 85, 441);
        addObject ( new Cliff(true), 665, 441);
        
        addObject ( new Cloud(), 369, 315 );
    } // end 3-arg Scene1 constructor 
    
} // end class Scene2

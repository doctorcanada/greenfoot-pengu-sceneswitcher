import greenfoot.*; 

/**
 * This is the whole scene. It creates and contains the objects that are in it.
 * (Adapted from the Scene class in the original pengu scenario)
 * 
 * @author bcanada@uscb.edu
 * @version 2016.12.09
 */
public class Scene2 extends Scene
{
    /**
     * This version of the Scene2 constructor sets
     * the Pengu object at the default starting location
     * of x = 66, y = 244
     */
    public Scene2()
    {    
        super(750, 500, 1, 66, 244); // define size (x, y), cellSize,
                                     // and starting position (x, y) of Pengu

        addObject ( new Cliff(false), 85, 441);
        addObject ( new Cliff(true), 665, 441);
        
        addObject ( new Cloud(), 369, 315 );
    } // end no-arg Scene2 constructor

    /**
     * Overloaded version of the Scene1 constructor that accepts
     * two parameters: the (1) x-coordinate and (2) y-coordinate 
     * where a "new" Pengu object  will be "re-instantiated" 
     */
    public Scene2( int x, int y )
    {    
        super(750, 500, 1, x, y); 

        addObject ( new Cliff(false), 85, 441);
        addObject ( new Cliff(true), 665, 441);
        
        addObject ( new Cloud(), 369, 315 );
    } // end 2-arg Scene1 constructor 
    
} // end class Scene2

import greenfoot.*;

/**
 * A little penguin that wants to get to the other side.
 */
public class Pengu extends Mover
{
    private static final int jumpStrength = 16;
    //private int currentSceneNumber;
    
    public Pengu()
    {
        //this.currentSceneNumber = newSceneNumber;
    }
    
    public void act() 
    {
        checkKeys();        
        checkFall();
        
        // new method that checks boundary conditions
        // and switches scenes
        checkBounds();
    }
    
    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("left") )
        {
            setImage("pengu-left.png");
            moveLeft();
        } // end if
        
        if (Greenfoot.isKeyDown("right") )
        {
            setImage("pengu-right.png");
            moveRight();
        } // end if
        
        if (Greenfoot.isKeyDown("space") )
        {
            if ( onGround() )
            {
                jump();
            } // end inner if
        } // end if
    } 
    
    private void jump()
    {
        setVSpeed(-jumpStrength);
        fall();
    }
    
    private void checkFall()
    {
        if (onGround()) 
        {
            setVSpeed(0);
        }
        else 
        {
            fall();
        }
    }
    
    private void checkBounds()
    {
        // check right bound
        if ( getX() > (getWorld().getWidth() - 5) )
        {
            /* 
             * if the current scene is Scene1, then set the world to 
             * Scene2, and set the location of the "new" Pengu object
             * to be 5 pixels inside the LEFT edge of the world. 
             */ 
            if ( this.getWorld().getClass().equals( Scene1.class ) )
            {
                Greenfoot.setWorld( new Scene2( 5, getY() ) );
            }
            else // otherwise, assume current scene is Scene2, so set to Scene1
            {
                Greenfoot.setWorld( new Scene1( 5, getY() ) );
            } // end inner if/else
        } // end outer if
        
        // check left bound
        if ( getX() < 5 )
        {
            /* 
             * if the current scene is Scene1, then set the world to 
             * Scene2, and set the location of the "new" Pengu object
             * to be 5 pixels inside the RIGHT edge of the world. 
             */ 
            if ( this.getWorld().getClass().equals( Scene1.class ) )
            {
                Greenfoot.setWorld( new Scene2( (getWorld().getWidth() - 5), getY()) );
            }
            else // otherwise, assume current scene is Scene2, so set to Scene1
            {
                Greenfoot.setWorld( new Scene1( (getWorld().getWidth() - 5), getY()) );
            } // end inner if/else f
        } // end outer if
    } // end method checkBounds
} // end class Pengu

    
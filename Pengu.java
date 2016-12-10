import greenfoot.*;

/**
 * A little penguin that wants to get to the other side.
 */
public class Pengu extends Mover
{
    private static final int jumpStrength = 16;
    private int currentSceneNumber;
    
    public Pengu( int newSceneNumber )
    {
        this.currentSceneNumber = newSceneNumber;
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
        if ( getX() >= getWorld().getWidth() - 5 )
        {
            if ( currentSceneNumber == 1 )
            {
                int newSceneNumber = 2;
                Greenfoot.setWorld( new Scene2( newSceneNumber, 0, getY() ) );
            }
            else
            {
                int newSceneNumber = 1;
                Greenfoot.setWorld( new Scene1( newSceneNumber, 0, getY() ) );
            }
        }
        
        // check left bound
        if ( getX() <= 5 )
        {
            if ( currentSceneNumber == 1 )
            {
                int newSceneNumber = 2;
                Greenfoot.setWorld( new Scene2( newSceneNumber, getWorld().getWidth(), getY() ) );
            }
            else
            {
                int newSceneNumber = 1;
                Greenfoot.setWorld( new Scene1( newSceneNumber, getWorld().getWidth(), getY() ) );
            }
        }
    } // end method checkBounds
} // end class Pengu

    
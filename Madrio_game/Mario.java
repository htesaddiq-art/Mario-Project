import greenfoot.*;

/**
 * Controls Mario's movement, jumping and gravity.
 *
 * @version 1.1
 */
public class Mario extends Actor
{
    private int speed = 4;
    private int verticalVelocity = 0;
    private int gravity = 1;
    private int jumpStrength = -15;
    private boolean onGround = false;

    public void act()
    {
        movement();
        jump();
        applyGravity();
    }

    private void movement()
    {
        // Move Mario to the left
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - speed, getY());
        }

        // Move Mario to the right
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + speed, getY());
        }
    }

    private void jump()
    {
        // Only allow jumping when Mario is on the ground
        if (Greenfoot.isKeyDown("space") && onGround)
        {
            verticalVelocity = jumpStrength;
            onGround = false;
        }
    }

    private void applyGravity()
    {
        verticalVelocity += gravity;

        int groundLevel = getWorld().getHeight()
                          - getImage().getHeight() / 2;

        int nextY = getY() + verticalVelocity;

        // Check if Mario has reached the ground
        if (nextY >= groundLevel)
        {
            setLocation(getX(), groundLevel);
            verticalVelocity = 0;
            onGround = true;
        }
        else
        {
            setLocation(getX(), nextY);
            onGround = false;
        }
    }
}
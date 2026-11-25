
import greenfoot.*;

public class MyWorld extends World
{
    public MyWorld()
    {
        super(800, 480, 1);

        // Create the sky
        GreenfootImage bg = new GreenfootImage(800, 480);
        bg.setColor(new Color(107, 190, 255));
        bg.fill();
        // Draw decorative pipes into the background
        drawBackgroundPipe(bg, 48, 2);
        drawBackgroundPipe(bg, 170, 1);
        drawBackgroundPipe(bg, 290, 2);
        drawBackgroundPipe(bg, 430, 1);
        drawBackgroundPipe(bg, 560, 1);
        drawBackgroundPipe(bg, 720, 2);


        setBackground(bg);

        // Build our level
        createGround();
        createPlatforms();
    }

    // Create the ground
    private void createGround()
    {
        for (int x = 16; x < 800; x += 32)
        {
            addObject(new Tile("floor.png"), x, 464);
        }
    }

    // Create floating platforms
    private void createPlatforms()
    {
        createPlatform(144, 352, 4);
        createPlatform(368, 288, 5);
        createPlatform(592, 352, 3);
    }

    // Join the three platform pieces together
    private void createPlatform(int startX, int y, int length)
    {
        addObject(new Tile("plat_beg.png"), startX, y);

        for (int i = 1; i < length - 1; i++)
        {
            addObject(
                new Tile("plat_mid.png"),
                startX + (i * 32),
                y
            );
        }

        addObject(
            new Tile("plat_end.png"),
            startX + ((length - 1) * 32),
            y
        );
    }

    // Create all the pipes in our level
    private void createPipes()
    {
        createPipe(560, 1);
        createPipe(720, 2);
        createPipe(280, 1);
    }

    // Build a pipe using its top and body images
    private void createPipe(int x, int bodySegments)
    {
        int topY = 400 - ((bodySegments - 1) * 32);

        // Add the pipe top
        addObject(
            new Tile("pipe_top.png"),
            x,
            topY
        );

        // Add the pipe body underneath
        for (int i = 1; i <= bodySegments; i++)
        {
            addObject(
                new Tile("pipe_base.png"),
                x,
                topY + (i * 32)
            );
        }
    }

    // Draw a decorative pipe behind the gameplay
    private void drawBackgroundPipe(
        GreenfootImage bg, int x, int bodySegments)
    {
        GreenfootImage top =
            new GreenfootImage("pipe_top.png");

        GreenfootImage body =
            new GreenfootImage("pipe_base.png");

        int groundY = 448;

        int topY = groundY - top.getHeight()
                   - (bodySegments * body.getHeight());

        // Draw the pipe top
        bg.drawImage(top, x, topY);

        // Draw the pipe body
        for (int i = 0; i < bodySegments; i++)
        {
            bg.drawImage(
                body,
                x,
                topY + top.getHeight()
                + (i * body.getHeight())
            );
        }
    }

}
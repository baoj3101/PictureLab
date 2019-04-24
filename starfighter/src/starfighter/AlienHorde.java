package starfighter;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
	private int size;
	private int origSize;

	public AlienHorde(int size)
	{
            aliens = new ArrayList<Alien>();
            this.size = size;
            origSize = size;
	}

	public void add(Alien al)
	{
            aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
            for (Alien al : aliens)
			al.draw(window);
	}

	public void moveEmAll()
	{
            for (Alien al : aliens) {
                if (al.getX() > 700) {
                    al.setX(0);
                    al.setY(al.getY() + 50);
                }
            }
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
            
	}

	public String toString()
	{
		return "";
	}
}

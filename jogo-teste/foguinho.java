import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class foguinho here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class foguinho extends lana
{
    /**
     * Act - do whatever the foguinho wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void act()
    {
         moveAtaque();
         acertarAlvo();
    }
   public int contador2 =0;
public void moveAtaque() {
        double left= Math.toRadians( getRotation() );
        int x = (int) Math.round(getX() - Math.cos(left));
        int y = (int) Math.round(getY() - Math.sin(left));
        setLocation(x, y);
    }
      public void acertarAlvo() {
      Actor b= getOneIntersectingObject(inimigo.class); 
       Counter2 counter2 = (Counter2) getWorld().getObjects(Counter2.class).get(0);
        if (isTouching(inimigo.class)==true){            
            counter2.add(1);
            this.getWorld().removeObject(this);
            if (counter2.value > 4 ){
         this.getWorld().removeObject(b);
        }
        }     
        }
    }
    





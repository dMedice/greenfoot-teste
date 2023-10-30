import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hadouken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hadouken extends inimigo
{
    /**
     * Act - do whatever the hadouken wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public int contador=0;
    public void act()
    {
        moveAtaque();
        acertarAlvo();
    }
    public void moveAtaque() {
        
        double angle= Math.toRadians( getRotation() );
        int x = (int) Math.round(getX() + Math.cos(angle));
        int y = (int) Math.round(getY() + Math.sin(angle));
        
        setLocation(x, y);
    }
   public void acertarAlvo() {
      Actor b= getOneIntersectingObject(lana.class); 
    Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
        if (isTouching(lana.class)==true){            
            counter.add(1);
            if (counter.value > 1500 ){
         this.getWorld().removeObject(b);
            this.getWorld().removeObject(this);
          gameover world = new gameover();
            Greenfoot.setWorld(world);
        }
        }   
        }
    }

      


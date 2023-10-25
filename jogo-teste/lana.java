import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lana extends Actor
{
    public int speed = 3;
    private int STimer = 0;
    GreenfootSound foguinho = new GreenfootSound("foguinho.mp3");
 
    GifImage mygif = new GifImage("character.gif");
    /**
     * Act - do whatever the lana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int life =10;
    public void act()
    {
      setImage(mygif.getCurrentImage());
        movimento();   
    }
    public void movimento()
    {
       
        if (Greenfoot.isKeyDown("up")) {
        this.setLocation(this.getX(), this.getY() - speed );
        }
        else if (Greenfoot.isKeyDown("down")) {
        this.setLocation(this.getX(), this.getY() + speed );
        }
        else if (Greenfoot.isKeyDown("left")) {
        this.setLocation(this.getX() - speed, this.getY() );
        }
        else if (Greenfoot.isKeyDown("right")) {
        this.setLocation(this.getX() + speed, this.getY() );
        }
        else if (Greenfoot.isKeyDown("space")&& (STimer == 0)) {
             STimer ++;
        getWorld().addObject(new foguinho(),getX() - 110, getY() - 25); 
        foguinho.play();
        } 
        else {
            if (!Greenfoot.isKeyDown("space")) {
                STimer = 0;
            }
            
        } 
    }
    
    public void life(){
        Actor a = getOneIntersectingObject(hadouken.class); //Se tiver outro tiro, se não pode apagar esse linha
        if(a != null){
            getWorld().removeObject(a);
            life -=1;
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(1);
        } else if(life == 0){
            getWorld().removeObject(this);
        }
        
    }
}

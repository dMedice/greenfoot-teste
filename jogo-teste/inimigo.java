import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class inimigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class inimigo extends Actor
{
    public int speed = 2;
    private int STimer = 0;
    GreenfootSound hadouken = new GreenfootSound("hadouken.wav");
    
    /**
     * Act - do whatever the inimigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
       public int contador =0;
       int life = 10;
    public void act()
    {
      movimento();

    }
    public void movimento()
    {
       
        if (Greenfoot.isKeyDown("w")) {
        this.setLocation(this.getX(), this.getY() - speed );
        }
        else if (Greenfoot.isKeyDown("s")) {
        this.setLocation(this.getX(), this.getY() + speed );
        }
        else if (Greenfoot.isKeyDown("a")) {
        this.setLocation(this.getX() - speed, this.getY() );
        }
        else if (Greenfoot.isKeyDown("d")) {
        this.setLocation(this.getX() + speed, this.getY() );
        }
        else if (Greenfoot.isKeyDown("f") && (STimer == 0)) {
            STimer ++;
            hadouken.play();
            getWorld().addObject(new hadouken(),getX() - -35, getY() - 15);   
        }
        else {
            if (!Greenfoot.isKeyDown("f")) {
                STimer = 0;
                
            }
        }
    }
       public void life(){
        Actor a = getOneIntersectingObject(foguinho.class); //Se tiver outro tiro, se não pode apagar esse linha
        if(a != null){
            getWorld().removeObject(a);
            life -=1;
            Counter2 counter = (Counter2) getWorld().getObjects(Counter2.class).get(0);
            counter.add(1);
        } else if(life == 0){
            getWorld().removeObject(this);
        }
        
    }
}

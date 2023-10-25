import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Intro extends World
{

    /**
     * Constructor for objects of class Intro.
     * 
     */
    public Intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
        public void act(){
    //Gnomo do Morro a proíbe de passar
        if (Greenfoot.isKeyDown("enter")){
        setBackground(new GreenfootImage("cena2.jpg"));
    }
    //Lana desafia ele para uma luta
        if (Greenfoot.isKeyDown("enter")){
        setBackground(new GreenfootImage("cena3.jpg"));
    }
    //Iniciar o jogo
        if (Greenfoot.isKeyDown("enter")){
        Mundinhoo world = new Mundinhoo();
        Greenfoot.setWorld(world);
    }
}
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cena2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cena2 extends Intro
{

    /**
     * Constructor for objects of class cena2.
     * 
     */
    public cena2()
    {
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

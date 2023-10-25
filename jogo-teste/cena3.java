import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cena3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cena3 extends cena2
{

    /**
     * Constructor for objects of class cena3.
     * 
     */
    public cena3()
    {
    //Iniciar o jogo
        if (Greenfoot.isKeyDown("enter")){
        Mundinhoo world = new Mundinhoo();
        Greenfoot.setWorld(world);
    }
    }
}

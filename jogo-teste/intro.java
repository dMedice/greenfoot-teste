import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class intro extends World
{

    /**
     * Constructor for objects of class intro.
     * 
     */
    public intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); prepare();
    }

    public void act(){
        //cena1
        if (Greenfoot.isKeyDown("enter")){
            setBackground(new GreenfootImage("cena1.png"));
        }
        //cena2
        if (Greenfoot.isKeyDown("1")){
            setBackground(new GreenfootImage("cena2.png"));
        }
        //cena3
        if (Greenfoot.isKeyDown("2")){
            setBackground(new GreenfootImage("cena3.png"));
        }
        //Iniciar o jogo
        if (Greenfoot.isKeyDown("3")){
            Mundinhoo world = new Mundinhoo();
            Greenfoot.setWorld(world);
        }
    }
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
    }
}

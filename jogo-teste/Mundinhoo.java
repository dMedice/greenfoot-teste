import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundinhoo here.
 * 
 * @lanademedice
 * @version (a version number or a date)
 */


public class Mundinhoo extends World
{

    private GreenfootSound bgMusic = new GreenfootSound("china.mp3"); 
    
    public void started()
{ 
    bgMusic.playLoop();
}
    
public void stopped()
    {
        bgMusic.pause();
    }
    
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Mundinhoo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 

        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {

        Counter counter = new Counter();
        addObject(counter,104,35);
        Counter2 counter2 = new Counter2();
        addObject(counter2,666,35);
        inimigo inimigo = new inimigo();
        addObject(inimigo,69,414);
        lana lana = new lana();
        addObject(lana,694,358);
    }

}

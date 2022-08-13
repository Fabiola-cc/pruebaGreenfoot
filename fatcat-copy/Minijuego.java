import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Minijuego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Minijuego extends World
{

    /**
     * Constructor for objects of class Minijuego.
     * 
     */
    public Minijuego()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Pets mascota = new Pets();
        addObject (mascota, 50, 300);
    }
}

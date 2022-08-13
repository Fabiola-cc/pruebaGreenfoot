import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pets extends Actor
{
    /**
     * Act - do whatever the Pets wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        boolean pet = false;
        if (pet == false){
            System.out.println ("Selecciona a tu mascota:");
            
            Bunny c1 = new Bunny();
            
            Cat g1 = new Cat();

            Chick p1 = new Chick();
            
            Corgi d1 = new Corgi();
            
            Rottweiler d2 = new Rottweiler();
            
            Turttle t1 = new Turttle();
        } 
        
    }
}

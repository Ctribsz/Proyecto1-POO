import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class quet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monstruo extends Actor
{
    private int velocidadCaida = -1;

    public void act() {
        setLocation(getX(), getY() + velocidadCaida);
    }
}

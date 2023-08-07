import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sky extends World
{

    /**
     * Constructor for objects of class Sky.
     * 
     */
    private counter score;
    private counter level;
    
    private Personaje diego;
    private Plataforma plat;
    private Plataforma plat1;
    private Plataforma plat2;
    private Plataforma plat3;
    private Plataforma plat4;
    private Reinicio reset;
    private Sup nivel;
    
    public Sky()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 800, 1); 
        
        score = new counter("Score: 1" );
        level = new counter("Level: 1" );
        diego = new Personaje();
        plat = new Plataforma();
        plat1 = new Plataforma();
        plat2 = new Plataforma();        
        plat3 = new Plataforma();
        plat4 = new Plataforma();
        nivel = new Sup();
        reset = new Reinicio();
        
        addObject(diego,100,600);
        //Plataformas
        addObject(plat,100,700);
        addObject(plat1,200,600);
        addObject(plat2,300,500);
        addObject(plat3,400,400);
        addObject(plat4,500,300);
        addObject(nivel,500,100);
        addObject(reset, 100, 800);

        addObject(score, 140, 90);
        addObject(level, 140, 60);
        
        
    }
    public void setUpMap(){
        Monstruo enemy = new Monstruo();
        addObject(enemy, 100, 100); // Coloca el objeto "Player" en la posición (100, 100)

        Personaje player = new Personaje();
        addObject(player, 150, 150); // Coloca el objeto "Enemy" en la posición (700, 500)

    }
}

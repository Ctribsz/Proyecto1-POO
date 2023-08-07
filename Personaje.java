import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
public class Personaje extends Actor {
    private final int velocidad = 3;
    private final int fuerzaSalto = 20;
    private int velocidadVertical = 0;
    private final int gravedad = 1;
    private int nivel_actual = 1;

    public void act() {
        if (isTouching(Sup.class)) {
            Greenfoot.setWorld(new castle());
        }
        if (isTouching(Sup1.class)) {
            Greenfoot.setWorld(new Snow());
        }
        if (isTouching(Sup2.class)) {
            Greenfoot.setWorld(new Lava());
        }
        if (isTouching(Sup3.class)) {
            Greenfoot.setWorld(new Aire());
        }
        if (isTouching(Sup4.class)) {
            Greenfoot.setWorld(new Tempestad());
        }
        if (isTouching(Sup5.class)) {
            Greenfoot.setWorld(new Felicidades());
        }
        if (isTouching(Reinicio.class)) {
            Greenfoot.setWorld(new Sky());
        }
        
        // Movimiento horizontal
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - velocidad, getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + velocidad, getY());
        }

        // Salto
        if (isOnGround() && Greenfoot.isKeyDown("up")) {
            velocidadVertical = -fuerzaSalto;
        }
        
        //if (isOnGround()){
        //     Greenfoot.setWorld(new Sky());
        //}

        // Aplicar gravedad
        velocidadVertical += gravedad;
        setLocation(getX(), getY() + velocidadVertical);

        // Verificar colisión con plataformas
        if (isOnPlatform()) {
            velocidadVertical = 0;
            Actor plataformaBajoElPersonaje = getOneObjectAtOffset(0, getImage().getHeight() / 2, Plataforma.class);
            int plataformaTop = plataformaBajoElPersonaje.getY() - plataformaBajoElPersonaje.getImage().getHeight() / 2;
            setLocation(getX(), plataformaTop - getImage().getHeight() / 2);
        }
        if (isTouching(Monstruo.class)) {
            Greenfoot.stop();
            System.out.println("HAZ MUERTO");
            Greenfoot.setWorld(new Sky());// Termina el juego cuando el personaje toca al monstruo
        }
    }

    private boolean isOnGround() {
        Actor sueloBajoElPersonaje = getOneObjectAtOffset(0, getImage().getHeight() / 2, Plataforma.class);
        return sueloBajoElPersonaje != null;
        
    }

    private boolean isOnPlatform() {
        Actor plataformaBajoElPersonaje = getOneObjectAtOffset(0, getImage().getHeight() / 2, Plataforma.class);
        return plataformaBajoElPersonaje != null;
    }
}





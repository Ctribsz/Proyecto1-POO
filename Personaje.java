import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
public class Personaje extends Actor {
    private final int velocidad = 3;
    private final int fuerzaSalto = 20;
    private int velocidadVertical = 0;
    private final int gravedad = 1;

    public void act() {
        if (isTouching(Sup.class)) {
            Greenfoot.setWorld(new castle());
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
            Greenfoot.stop(); // Termina el juego cuando el personaje toca al monstruo
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





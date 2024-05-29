package Logica;

public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy Charmander y este es mi ataque placaje");
    }

    @Override
    public void atacarArañazo() {
        System.out.println("Soy Charmander y este es mi ataque Arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy Charmander y este es mi ataque mordisco");
    }

    @Override
    public void atacarPuñoFuego() {
        System.out.println("Soy Charmander y este es mi ataque puño de fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy Charmander y este es mi ataque ascuas");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Soy Charmander y este es mi ataque lanza llamas");
    }
}

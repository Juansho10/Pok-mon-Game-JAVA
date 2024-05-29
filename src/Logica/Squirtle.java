package Logica;

public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy Squirtle y este es mi ataque placaje");
    }

    @Override
    public void atacarArañazo() {
        System.out.println("Soy Squirtle y este es mi ataque arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy Squirtle y este es mi ataque mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Soy Squirtle y este es mi ataque hidrobomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy Squirtle y este es mi ataque pistola de agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy Squirtle y este es mi ataque burbuja");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Soy Squirtle y este es mi ataque hidropulso");
    }
}

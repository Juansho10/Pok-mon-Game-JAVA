package Logica;

public class EjercicioIntegrador {

    public static void main(String[] args) {

        System.out.println("Bienvenidos al mundo Pokémon");

        System.out.println("------------------");

        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Squirtle squirtle = new Squirtle();
        Pikachu pikachu = new Pikachu();

        charmander.atacarArañazo();
        charmander.atacarPuñoFuego();
        bulbasaur.atacarArañazo();
        bulbasaur.atacarHojaAfilada();
        squirtle.atacarArañazo();
        squirtle.atacarHidrobomba();
        pikachu.atacarArañazo();
        pikachu.atacarImpactrueno();

        System.out.println("---------------");

        System.out.println("Gracias por visitar");

    }
}
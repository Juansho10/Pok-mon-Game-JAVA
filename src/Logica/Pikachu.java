package Logica;

public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy Picachu y este es mi ataque placaje");
    }

    @Override
    public void atacarArañazo() {
        System.out.println("Soy Picachu y este es mi ataque arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy Picachu y este es mi ataque Mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Soy Picachu y este es mi ataque impactrueno");
    }

    @Override
    public void atacarPuñoTrueno() {
        System.out.println("Soy Picachu y este es mi ataque puño trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Soy Picachu y este es mi ataque rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Soy Picachu y este es mi ataque rayo carga");
    }
}

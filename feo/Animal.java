public class Animal extends Organismo {
    public Animal(int posicionX, int posicionY, int salud, int edad, boolean estadoReproductivo) {
        super(posicionX, posicionY, salud, edad, estadoReproductivo);
    }

    @Override
    public void interactuar(Organismo otro) {
        // Implementar interacciones específicas de los animales
    }
}
public class Planta extends Organismo {
    public Planta(int posicionX, int posicionY, int salud, int edad, boolean estadoReproductivo) {
        super(posicionX, posicionY, salud, edad, estadoReproductivo);
    }

    @Override
    public void interactuar(Organismo otro) {
        // Implementar interacciones específicas de las plantas
    }
}
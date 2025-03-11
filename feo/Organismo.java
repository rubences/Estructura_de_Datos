public abstract class Organismo {
    protected int posicionX;
    protected int posicionY;
    protected int salud;
    protected int edad;
    protected boolean estadoReproductivo;

    public Organismo(int posicionX, int posicionY, int salud, int edad, boolean estadoReproductivo) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.salud = salud;
        this.edad = edad;
        this.estadoReproductivo = estadoReproductivo;
    }

    public abstract void interactuar(Organismo otro);

    // Getters y setters
}
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
    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEstadoReproductivo() {
        return estadoReproductivo;
    }

    public void setEstadoReproductivo(boolean estadoReproductivo) {
        this.estadoReproductivo = estadoReproductivo;
    }

    @Override
    public String toString() {
        return "Organismo [posicionX=" + posicionX + ", posicionY=" + posicionY + ", salud=" + salud + ", edad=" + edad
                + ", estadoReproductivo=" + estadoReproductivo + "]";
    }

    public void incrementarSalud(int cantidad) {
        this.salud += cantidad;
    }

    public void decrementarSalud(int cantidad) {
        this.salud -= cantidad;
    }

    public void crecer() {
        this.edad++;
    }

    public void reproducirse(Organismo otro) {
        System.out.println("Los organismos se están reproduciendo.");
    }

    public void enfermar() {
        System.out.println("El organismo ha enfermado.");
    }
    

}
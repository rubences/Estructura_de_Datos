public class Ambiente {
    private String clima;
    private String terreno;
    private int recursosDisponibles;

    public Ambiente(String clima, String terreno, int recursosDisponibles) {
        this.clima = clima;
        this.terreno = terreno;
        this.recursosDisponibles = recursosDisponibles;
    }

    // Getters y setters
    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getTerreno() {
        return terreno;
    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

    public int getRecursosDisponibles() {
        return recursosDisponibles;
    }

    public void setRecursosDisponibles(int recursosDisponibles) {
        this.recursosDisponibles = recursosDisponibles;
    }
}
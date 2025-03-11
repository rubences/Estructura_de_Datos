import java.util.List;
import java.util.Random;

public class Simulador {
    private List<Organismo> organismos;
    private Ambiente ambiente;
    private Random random;

    public Simulador(List<Organismo> organismos, Ambiente ambiente) {
        this.organismos = organismos;
        this.ambiente = ambiente;
        this.random = new Random();
    }

    public void simularCiclo() {
        for (Organismo organismo : organismos) {
            // Simular crecimiento y reproducción
            // Simular eventos aleatorios
        }
    }

    public void mostrarEstadisticas() {
        // Calcular y mostrar estadísticas del ecosistema
    }
}
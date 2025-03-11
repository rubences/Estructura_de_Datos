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
            if (organismo instanceof Planta) {
                ((Planta) organismo).crecer();
                ((Planta) organismo).reproducirse();
            } else if (organismo instanceof Animal) {
                ((Animal) organismo).crecer();
                ((Animal) organismo).reproducirse();
            }

            // Simular eventos aleatorios
            if (random.nextBoolean()) {
                organismo.enfermar();
            } else {
                organismo.migrar();
            }
        }
    }

    public void mostrarEstadisticas() {
        int totalOrganismos = organismos.size();
        int totalPlantas = 0;
        int totalAnimales = 0;
        int organismosEnfermos = 0;

        for (Organismo organismo : organismos) {
            if (organismo instanceof Planta) {
                totalPlantas++;
            } else if (organismo instanceof Animal) {
                totalAnimales++;
            }
            if (organismo.estaEnfermo()) {
                organismosEnfermos++;
            }
        }

        System.out.println("Estadísticas del ecosistema:");
        System.out.println("Total de organismos: " + totalOrganismos);
        System.out.println("Total de plantas: " + totalPlantas);
        System.out.println("Total de animales: " + totalAnimales);
        System.out.println("Organismos enfermos: " + organismosEnfermos);
    }
}
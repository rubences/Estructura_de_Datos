import java.util.Scanner;

public class InterfazUsuario {
    private Simulador simulador;
    private SistemaAutenticacion sistemaAutenticacion;
    private Scanner scanner;

    public InterfazUsuario(Simulador simulador, SistemaAutenticacion sistemaAutenticacion) {
        this.simulador = simulador;
        this.sistemaAutenticacion = sistemaAutenticacion;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("1. Iniciar simulación");
            System.out.println("2. Mostrar estadísticas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    simulador.simularCiclo();
                    break;
                case 2:
                    simulador.mostrarEstadisticas();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        }
    }
}
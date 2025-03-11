import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear organismos y ambiente
        List<Organismo> organismos = new ArrayList<>();
        organismos.add(new Planta(0, 0, 100, 1, true));
        organismos.add(new Animal(1, 1, 100, 1, true));
        Ambiente ambiente = new Ambiente("Tropical", "Bosque", 1000);

        // Crear simulador y sistema de autenticación
        Simulador simulador = new Simulador(organismos, ambiente);
        SistemaAutenticacion sistemaAutenticacion = new SistemaAutenticacion();
        sistemaAutenticacion.registrarUsuario("admin", "admin");

        // Crear interfaz de usuario
        InterfazUsuario interfazUsuario = new InterfazUsuario(simulador, sistemaAutenticacion);
        interfazUsuario.mostrarMenu();
    }
}
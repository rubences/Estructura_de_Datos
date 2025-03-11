import java.util.HashMap;
import java.util.Map;

public class SistemaAutenticacion {
    private Map<String, String> usuarios;

    public SistemaAutenticacion() {
        this.usuarios = new HashMap<>();
    }

    public void registrarUsuario(String nombre, String contrasena) {
        usuarios.put(nombre, contrasena);
    }

    public boolean autenticarUsuario(String nombre, String contrasena) {
        return usuarios.containsKey(nombre) && usuarios.get(nombre).equals(contrasena);
    }
}
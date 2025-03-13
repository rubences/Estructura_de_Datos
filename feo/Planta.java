public class Planta extends Organismo {
    public Planta(int posicionX, int posicionY, int salud, int edad, boolean estadoReproductivo) {
        super(posicionX, posicionY, salud, edad, estadoReproductivo);
    }

    @Override
    public void interactuar(Organismo otro) {
        if (otro instanceof Planta) {
            competir((Planta) otro);
        } else if (otro instanceof Animal) {
            interactuarConAnimal((Animal) otro);
        }
    }

    private void competir(Planta otraPlanta) {
        // Lógica para la competencia entre plantas
        if (this.salud > otraPlanta.salud) {
            this.salud += 10;
            otraPlanta.salud -= 10;
            System.out.println("Esta planta ha ganado la competencia y ha ganado salud.");
        } else if (this.salud < otraPlanta.salud) {
            this.salud -= 10;
            otraPlanta.salud += 10;
            System.out.println("La otra planta ha ganado la competencia y ha ganado salud.");
        } else {
            System.out.println("La competencia ha terminado en empate.");
        }
    }

    private void interactuarConAnimal(Animal animal) {
        // Lógica para la interacción con animales
        if (animal.esHerbivoro()) {
            this.salud -= 20;
            animal.incrementarSalud(20);
            System.out.println("Un animal herbívoro ha comido parte de la planta.");
        } else if (animal.esPolinizador()) {
            this.estadoReproductivo = true;
            System.out.println("Un animal polinizador ha ayudado a la planta a reproducirse.");
        } else {
            System.out.println("El animal no interactúa significativamente con la planta.");
        }
    }
    public void fotosintetizar() {
        // Lógica para la fotosíntesis
        this.salud += 10;
        System.out.println("La planta ha realizado la fotosíntesis y ha ganado salud.");
    }
    public void reproducirse() {
        // Lógica para la reproducción
        System.out.println("La planta se está reproduciendo.");
        // Ejemplo de lógica de reproducción: crear una nueva Planta
        int nuevaPosicionX = this.posicionX + 1;
        int nuevaPosicionY = this.posicionY + 1;
        int nuevaSalud = this.salud / 2;
        int nuevaEdad = 0; // La edad de la nueva planta es 0
        boolean nuevoEstadoReproductivo = false; // La nueva planta no es reproductiva inicialmente

        Planta nuevaPlanta = new Planta(nuevaPosicionX, nuevaPosicionY, nuevaSalud, nuevaEdad, nuevoEstadoReproductivo);
        System.out.println("Se ha creado una nueva planta en la posición (" + nuevaPosicionX + ", " + nuevaPosicionY + ").");
    }
}

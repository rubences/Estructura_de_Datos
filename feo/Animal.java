public class Animal extends Organismo {
    public Animal(int posicionX, int posicionY, int salud, int edad, boolean estadoReproductivo) {
        super(posicionX, posicionY, salud, edad, estadoReproductivo);
    }

    @Override
    public void interactuar(Organismo otro) {
        if (otro instanceof Animal) {
            Animal otroAnimal = (Animal) otro;
            if (this.estadoReproductivo && otroAnimal.estadoReproductivo) {
                reproducirse(otroAnimal);
            } else if (this.salud > otroAnimal.salud) {
                pelear(otroAnimal);
            } else {
                huir(otroAnimal);
            }
        } else if (otro instanceof Planta) {
            Planta otraPlanta = (Planta) otro;
            if (this.salud < otraPlanta.salud) {
            consumir(otraPlanta);
            } else {
            ignorar(otraPlanta);
            }
        } else {
            System.out.println("Error: Tipo de organismo desconocido.");
        }
               
    }

    private void reproducirse(Animal otroAnimal) {
        // Lógica para la reproducción
        System.out.println("Los animales se están reproduciendo.");
        // Ejemplo de lógica de reproducción: crear un nuevo Animal
        int nuevaPosicionX = (this.posicionX + otroAnimal.posicionX) / 2;
        int nuevaPosicionY = (this.posicionY + otroAnimal.posicionY) / 2;
        int nuevaSalud = (this.salud + otroAnimal.salud) / 2;
        int nuevaEdad = 0; // La edad del nuevo animal es 0
        boolean nuevoEstadoReproductivo = false; // El nuevo animal no es reproductivo inicialmente

        Animal nuevoAnimal = new Animal(nuevaPosicionX, nuevaPosicionY, nuevaSalud, nuevaEdad, nuevoEstadoReproductivo);
        System.out.println("Se ha creado un nuevo animal en la posición (" + nuevaPosicionX + ", " + nuevaPosicionY + ").");
    }

    private void pelear(Animal otroAnimal) {
        // Lógica para la pelea
        System.out.println("Los animales están peleando.");
        if (this.salud > otroAnimal.salud) {
            otroAnimal.salud -= 10; // El animal con menor salud pierde salud
            System.out.println("El animal oponente ha perdido salud. Salud restante: " + otroAnimal.salud);
        } else {
            this.salud -= 10; // Este animal pierde salud
            System.out.println("Este animal ha perdido salud. Salud restante: " + this.salud);
        }
    }

    private void huir(Animal otroAnimal) {
        // Lógica para huir
        System.out.println("El animal está huyendo.");
        // Ejemplo de lógica de huida: mover el animal a una nueva posición
        this.posicionX += 10; // Mover el animal 10 unidades en el eje X
        this.posicionY += 10; // Mover el animal 10 unidades en el eje Y
        System.out.println("El animal ha huido a la nueva posición (" + this.posicionX + ", " + this.posicionY + ").");
    }

    private void consumir(Planta otraPlanta) {
        // Lógica para consumir
        System.out.println("El animal está consumiendo la planta.");
        this.salud += 20; // El animal gana salud al consumir la planta
        otraPlanta.salud -= 20; // La planta pierde salud al ser consumida
        System.out.println("Salud del animal después de consumir: " + this.salud);
        System.out.println("Salud de la planta después de ser consumida: " + otraPlanta.salud);
    }

    private void ignorar(Planta otraPlanta) {
        // Lógica para ignorar
        System.out.println("El animal está ignorando la planta.");
    }


}
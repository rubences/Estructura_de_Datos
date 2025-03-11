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
    }

    private void pelear(Animal otroAnimal) {
        // Lógica para la pelea
        System.out.println("Los animales están peleando.");
    }

    private void huir(Animal otroAnimal) {
        // Lógica para huir
        System.out.println("El animal está huyendo.");
    }

    private void consumir(Planta otraPlanta) {
        // Lógica para consumir
        System.out.println("El animal está consumiendo la planta.");
    }

    private void ignorar(Planta otraPlanta) {
        // Lógica para ignorar
        System.out.println("El animal está ignorando la planta.");
    }


}
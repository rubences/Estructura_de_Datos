private void interactuarConAnimal(Animal animal) {
    // Lógica para la interacción con animales
    if (animal.esHerbivoro()) {
        this.salud -= 20;
        System.out.println("Un herbívoro ha comido parte de la planta. Salud de la planta reducida.");
    } else if (animal.esPolinizador()) {
        this.estadoReproductivo = true;
        System.out.println("Un polinizador ha interactuado con la planta. La planta está en estado reproductivo.");
    } else {
        System.out.println("El animal no ha afectado a la planta.");
    }
}

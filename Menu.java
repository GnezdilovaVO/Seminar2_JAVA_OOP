public class Menu {
    public static void main(String[] args) {
        VatClinic clinica = new VatClinic();
        clinica.addNewAnimal(new Cat("Barsik", "Nikolay")).addNewAnimal(new Dog("Pushok", "Oleg"));
        for (Animal animal : clinica.getAnimals()) {
            animal.ill();
        }


    }
    
}
import java.util.ArrayList;
import java.util.List;

public class VatClinic {
    private final List<Animal> animals;

    public VatClinic() {
        this.animals = new ArrayList<>();
    }

    public VatClinic addNewAnimal(Animal animal) {
        animals.add(animal);
        return this;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Animal> getFlyingAnimals() {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                result.add(animal);
            }
        }
        return result;
    }

    public List<Animal> getSoundAnimals() {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Soundable) {
                result.add(animal);
            }
        }
        return result;
    }

    public List<Animal> getIllAnimals() {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Illable) {
                result.add(animal);
            }
        }
        return result;
    }

    public List<Animal> getSwimAnimals() {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Swimble) {
                result.add(animal);
            }
        }
        return result;
    }

    // public List<Flyable> getFlyingAnimals() {
    // List<Flyable> result = new ArrayList<>();
    // for (Animal animal : animals) {
    // if (animal instanceof Flyable) {
    // result.add((Flyable) animal);
    // }
    // }
    // return result;
    // }
}
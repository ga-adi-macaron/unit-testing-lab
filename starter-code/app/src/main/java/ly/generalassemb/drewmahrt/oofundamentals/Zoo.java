package ly.generalassemb.drewmahrt.oofundamentals;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    //Define the Zoo object
    private static Zoo zoo = null;

    //Definition of the list to hold the animals
    private static ArrayList<Animal> animals;

    private Zoo(){
        animals = new ArrayList<>();
    }

    public static Zoo getInstance(){
        if(zoo == null) {
            zoo = new Zoo();
        }
        return zoo;
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public List<Animal> getAnimals(){
        return animals;
    }
}


import java.util.List;

public interface AnimalService<U extends Animal> {

    U createAnimal(U animal);

    U findById(Integer id);

    U findByName(String name);

    void sortAnimals(List<U> animals);

    void sortAnimalsByName(List<U> animals);
    
    AnimalCage findCage(int groupNumber);

}

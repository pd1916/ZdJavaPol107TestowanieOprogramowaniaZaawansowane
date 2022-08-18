package pl.sdacademy.unit.test.advance.exercises.task2;

public class AnimalService {
    private AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public Animal getById(long id) {
        return animalRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Animal does not exist with id: " + id));
    }

    public Animal add(Animal animal) {
        return animalRepository.add(animal);
    }
}

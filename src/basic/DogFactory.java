package basic;

public class DogFactory implements Factory {
    @Override
    public Animal getAnimal() {
        return new Dog();
    }
}

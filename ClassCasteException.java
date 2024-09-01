package ExceptionHandling;

class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    public void fetch() {
        System.out.println("Fetching...");
    }
}

public class ClassCasteException {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Creating an instance of Animal

        try {
            Dog myDog = (Dog) myAnimal;  // Attempting to cast Animal to Dog
            myDog.makeSound();
            myDog.fetch();
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: " + e.getMessage());
        }
    }
}

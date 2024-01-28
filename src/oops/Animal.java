package oops;
public class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }


}

class PolymorphismExample {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.makeSound();

        System.out.println(" Dog  "+myAnimal); // Outputs "This is a Dog object"
    }
}
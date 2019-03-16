package zootask;

public class Starter {
    public static void main(String[] args) {
        Bear bear = new Bear(1, "Yogi", 232, 3);
        Dog dog = new Dog(2, "Reksio", 23);
        Wolf wolf  = new Wolf(3, "Mufasa", 340, 2);
        Tiger tiger = new Tiger(4, "Mowgli", 240, 3);

        Animal[] animals = {bear, dog, wolf, tiger};
        for (Animal animal : animals) {
            animal.introduce();
        }

        Animal[] hoowlers = {wolf, dog};
        for (Animal animal : hoowlers) {
            System.out.println("My name is: " + (animal).getName());
            Canine animalAsCanine =  (Canine) animal;

            animalAsCanine.bark();
        }

        dog.sitPretty();
    }
}

package zootask;

public class Dog extends Animal implements Canine{


    public Dog(int id, String name, float weight) {
        super(id, name, weight);
    }

    public void sitPretty() {
        System.out.println(getName() + " sits pretty!");
    }

    @Override
    public void introduce() {
        System.out.println(getId() + ". I'm a dog. My name is " + getName() + ", my weight is " + getWeight() + " kg");
    }

    @Override
    public void bark() {
        System.out.println("bark bark bark");
    }
}

package zootask;

import zootask.Animal;

public class Bear extends Animal {
    private int furLength;

    public Bear(int id, String name, float weight, int furLength) {
        super(id, name, weight);
        this.furLength = furLength;
    }

    public int getFurLength() {
        return furLength;
    }

    public void setFurLength(int furLength) {
        this.furLength = furLength;
    }

    @Override
    public void introduce() {
        System.out.println(getId() + ". I'm a bear. My name is " + getName() + ", my weight is " + getWeight() + " kg");
    }
}

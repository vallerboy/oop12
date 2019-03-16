package zootask;

public class Wolf extends Animal implements Canine{
    private int fangLength;

    public Wolf(int id, String name, float weight, int fangLength) {
        super(id, name, weight);
        this.fangLength = fangLength;
    }

    public int getFangLength() {
        return fangLength;
    }

    public void setFangLength(int fangLength) {
        this.fangLength = fangLength;
    }

    @Override
    public void introduce() {
        System.out.println(getId() + ". I'm a wolf. My name is " + getName() + ", my weight is " + getWeight() + " kg");
    }

    @Override
    public void bark() {
        System.out.println("BARK BARK BARK");
    }
}

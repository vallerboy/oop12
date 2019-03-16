package zootask;

public class Tiger extends Animal {
    private int clawLength;

    public Tiger(int id, String name, float weight, int clawLength) {
        super(id, name, weight);
        this.clawLength = clawLength;
    }

    public int getClawLength() {
        return clawLength;
    }

    public void setClawLength(int clawLength) {
        this.clawLength = clawLength;
    }

    @Override
    public void introduce() {
        System.out.println(getId() + ". I'm a tiger. My name is " + getName() + ", my weight is " + getWeight() + " kg");
    }
}

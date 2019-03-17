package tripoffice;

public class Trip {
    private float price;
    private int days;
    private Continent destination;
    private boolean canTakeDog;

    public Trip(float price, int days, Continent destination, boolean canTakeDog) {
        this.price = price;
        this.days = days;
        this.destination = destination;
        this.canTakeDog = canTakeDog;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Continent getDestination() {
        return destination;
    }

    public void setDestination(Continent destination) {
        this.destination = destination;
    }

    public boolean isCanTakeDog() {
        return canTakeDog;
    }

    public void setCanTakeDog(boolean canTakeDog) {
        this.canTakeDog = canTakeDog;
    }
}

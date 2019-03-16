public class Boss extends Manager {
    private int dayOfTimeOff;


    public Boss(String name, String surname, int salary, int dayOfTimeOff) {
        super(name, surname, salary);
        this.dayOfTimeOff = dayOfTimeOff;
    }

    public int getDayOfTimeOff() {
        return dayOfTimeOff;
    }

    public void setDayOfTimeOff(int dayOfTimeOff) {
        this.dayOfTimeOff = dayOfTimeOff;
    }

    @Override
    public void shout() {
        System.out.println("Robcie wyniki tam manadzerzy wskazniki spadaja!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");;
    }
}

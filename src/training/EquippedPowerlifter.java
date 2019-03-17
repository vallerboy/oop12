package training;

public class EquippedPowerlifter extends Powerlifter {


    public EquippedPowerlifter(int beanLeft, int squad, int deadLift, String name, String surname) {
        super(beanLeft, squad, deadLift, name, surname);
    }

    @Override
    public int getChanceToInquire() {
        return 15;
    }

    @Override
    public int getMaxBeanLeftPoints() {
        return 45;
    }

    @Override
    public int getMaxSquadPoints() {
        return 45;
    }

    @Override
    public int getMaxDeadLiftPoints() {
        return 45;
    }
}

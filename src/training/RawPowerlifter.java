package training;

public class RawPowerlifter extends Powerlifter {
    public RawPowerlifter(int beanLeft, int squad, int deadLift, String name, String surname) {
        super(beanLeft, squad, deadLift, name, surname);
    }

    @Override
    public int getChanceToInquire() {
        return 5;
    }

    @Override
    public int getMaxBeanLeftPoints() {
        return 20;
    }

    @Override
    public int getMaxSquadPoints() {
        return 20;
    }

    @Override
    public int getMaxDeadLiftPoints() {
        return 20;
    }
}

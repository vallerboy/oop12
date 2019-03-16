public class CleaningWorker extends Employee {

    public CleaningWorker(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void shout() {
        System.out.println("hejo ho czyscic by sie szlo!");
    }
}

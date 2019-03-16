public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Damian", "Kowalski");
        Manager manager = new Manager("Kamil", "Nowak", 1300);
        Boss boss = new Boss("Oskar", "Polak", Integer.MAX_VALUE, Integer.MAX_VALUE);


        Worker managerAsWorker = (Worker) manager;


        Worker[] workers = {worker, manager, boss};
        for (Worker worker1 : workers) {
            worker1.shout();
        }

        Manager[] managers = {manager, boss};

        System.out.println(manager.getName());
        System.out.println(worker.getName());
        System.out.println(boss.getName());

        manager.shout();
        boss.shout();
        worker.shout();

        printName(worker);
        printName(managerAsWorker);
        printName(manager);
        printName(boss);

        CanJump jump = boss;
        jump.jump();

    }

    public static void printName(Worker worker){
        System.out.println("Prosze panstwa prosze poznac naszego pracownika: " + worker.getName());
    }
}

public class Worker extends Employee implements CanJump{
    public Worker(String name, String surname) {
        super(name, surname);
    }


    public void shout(){
        System.out.println("Bida w panstwie, nie ma za co zyc");
    }

    @Override
    public void jump() {
        System.out.println("kazdy worker i nizej potrafi skakac!");
    }
}

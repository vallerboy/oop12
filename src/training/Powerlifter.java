package training;

import java.util.Random;

public abstract class Powerlifter {
    private int beanLeft;
    private int squad;
    private int deadLift;

    private String name;
    private String surname;

    private Random random;

    public Powerlifter(int beanLeft, int squad, int deadLift, String name, String surname) {
        this.beanLeft = beanLeft;
        this.squad = squad;
        this.deadLift = deadLift;
        this.name = name;
        this.surname = surname;
        this.random = new Random();

    }

    public void train(int time){
        for (int i = 0; i < time; i++) {
             int randChance = random.nextInt(100);
             if(randChance <= getChanceToInquire()){
                 System.out.println(name + " " + surname + " złapał kontuzje");
                 return;
             }


             if(squad == beanLeft && beanLeft == deadLift){
                 squad++;
                 System.out.println(name + " " + surname + " trenował przysiad: " + squad);
             }

             if(squad <= beanLeft && squad <= deadLift && squad < getMaxSquadPoints()){
                 squad++;
                 System.out.println(name + " " + surname + " trenował przysiad: " + squad);
             }else if(beanLeft <= squad && beanLeft <= deadLift && beanLeft < getMaxBeanLeftPoints()){
                 beanLeft++;
                 System.out.println(name + " " + surname + " trenował wyciskanie: " + beanLeft);
             }else if(deadLift < getMaxDeadLiftPoints()){
                 deadLift++;
                 System.out.println(name + " " + surname + " trenował martwy: " + deadLift);
             }else{
                 System.out.println("nie ma czego cwiczyc!");
                 return;
             }
        }
    }

    public abstract int getChanceToInquire();
    public abstract int getMaxBeanLeftPoints();
    public abstract int getMaxSquadPoints();
    public abstract int getMaxDeadLiftPoints();
}

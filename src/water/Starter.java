package water;

public class Starter {
    public static void main(String[] args) {
        MyWater myWater = new MyWater();
        myWater.addBig(5);
        myWater.addMedium(10);
        myWater.addSmall(123);


        myWater.addBig(1);

        System.out.println(myWater.countAll());
    }
}

package water;

public class MyWater {
    private static double sizeOfSmall = 0.5;
    private static double sizeOfMedium = 1;
    private static double sizeOfBig = 2;

    private int countOfSmall;
    private int countOfBig;
    private int countOfMedium;

    public MyWater() {

    }

    public void addBig(int howMany){
        countOfBig += howMany;
    }


    public void addMedium(int howMany){
        countOfMedium += howMany;
    }


    public void addSmall(int howMany){
        countOfSmall += howMany;
    }

    public double countAll() {
        return countOfSmall * sizeOfSmall +
                countOfMedium * sizeOfMedium +
                countOfBig * sizeOfBig;
    }

    public static double getSizeOfSmall() {
        return sizeOfSmall;
    }

    public static void setSizeOfSmall(double sizeOfSmall) {
        MyWater.sizeOfSmall = sizeOfSmall;
    }

    public static double getSizeOfMedium() {
        return sizeOfMedium;
    }

    public static void setSizeOfMedium(double sizeOfMedium) {
        MyWater.sizeOfMedium = sizeOfMedium;
    }

    public static double getSizeOfBig() {
        return sizeOfBig;
    }

    public static void setSizeOfBig(double sizeOfBig) {
        MyWater.sizeOfBig = sizeOfBig;
    }
}

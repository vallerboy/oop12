package enums;

public class Starter {
    public static void main(String[] args) {

        Person person = new Person("Alicja", Gender.WOMAN);

        Gender someGender = Gender.MAN;
        if(someGender == Gender.WOMAN){
            System.out.println("sa takie same");
        }else {
            System.out.println("nie sa");
        }
    }
}

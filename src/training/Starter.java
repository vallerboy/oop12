package training;

public class Starter {
    public static void main(String[] args) {
        EquippedPowerlifter robcio = new EquippedPowerlifter(15,
                18,
                12,
                "Robret",
                "Piotrkowicz");

        EquippedPowerlifter blaine = new EquippedPowerlifter(39,
                45,
                40,
                "Blaine",
                "Summer");

        robcio.train(10);

        System.out.println();

        blaine.train(10);
    }
}

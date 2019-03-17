package tripoffice;

public class Starter {
    public static void main(String[] args) {
        Trip trip = new Trip(1230, 7, Continent.EU, true);
        Trip trip1 = new Trip(5000, 9, Continent.AF, false);
        Trip trip2 = new Trip(2300, 12, Continent.EU, false);

        Office office = new Office(15);
        office.addTrip(trip);
        office.addTrip(trip1);
        office.addTrip(trip2);


        //Office office1 = new Office(2000);


        Continent[] whereUserWantToGo = {Continent.AF};

        System.out.println(office.tryReserve(2500,
                7, whereUserWantToGo,
                true));

    }
}

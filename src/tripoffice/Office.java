package tripoffice;

public class Office {
    private Trip[] freeTrips;

    public Office(int countOfTrips){
        freeTrips = new Trip[countOfTrips]; // dowolan liczbe
    }

    public void addTrip(Trip trip){
        for (int i = 0; i < freeTrips.length; i++) {
             if(freeTrips[i] == null){
                 freeTrips[i] = trip;
                 break;
             }
        }
    }

    public boolean tryReserve(int maxPrice, int minDays, Continent[] continents, boolean needBringDog){
        for (int i = 0; i < freeTrips.length; i++) {
             if(freeTrips[i] != null &&
                freeTrips[i].getPrice() <= maxPrice &&
                freeTrips[i].getDays() >= minDays &&
                (needBringDog && freeTrips[i].isCanTakeDog())){

                 for (Continent continent : continents) {
                     if(continent == freeTrips[i].getDestination()){
                          freeTrips[i] = null;
                          return true;
                     }
                 }

             }
        }

        return false;
    }

}

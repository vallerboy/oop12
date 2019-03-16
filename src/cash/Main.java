package cash;

public class Main {
    public static void main(String[] args) {
        double bill = 1193.72;

        //----------------------------------------

        int billAsInt = (int) (bill * 100);
        int[] currency = {500, 100, 50, 2, 1};
        int moneyCounter = 0;
        int currencyCounter = 0;

        while (billAsInt != 0){
            if(billAsInt - currency[currencyCounter] >= 0){
                billAsInt -= currency[currencyCounter];
                moneyCounter++;
            }else{
                currencyCounter++;
            }
        }

        System.out.println(moneyCounter);

    }
}

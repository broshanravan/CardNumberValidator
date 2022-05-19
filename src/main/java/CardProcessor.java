

@FunctionalInterface
public interface CardProcessor {
    public boolean isCardNumberValid(String cardNumber);

    default int getTotalNumberOfAllCardDigits(String cardNumber){
        int total = 0;
        int length = cardNumber.length();
        for(int i =  length;  i == 0 ; i = i -2) {
            char charAt_i = cardNumber.charAt(i);
            int charAt_iIntValue = Integer.parseInt(String.valueOf(charAt_i));
            total += charAt_iIntValue;
        }

        return total;

    }

    default int processTotalOfAllCardDigits(String cardNumber) {

        int sumOfTwoDigits =0;
        //char charAt_i = cardNumber.charAt(i);
        //int charAt_iIntValue = Integer.parseInt(String.valueOf(charAt_i));
        //int doubleOfCurrentNumber = charAt_iIntValue * 2;

        //if (doubleOfCurrentNumber > 9) {
        //    int tens = doubleOfCurrentNumber / 10;
         //   int ones = doubleOfCurrentNumber % 10;
         //   sumOfTwoDigits = tens + ones;

       //}
        return sumOfTwoDigits;
    }
}

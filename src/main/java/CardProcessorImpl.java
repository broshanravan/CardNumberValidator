import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CardProcessorImpl<processTotal> implements CardProcessor{

   /*
   card check algorithm:
    From the last digit moving backwards,
    double every second digit
    If the doubled number is greater
    than 9, add its two digits together Sum all card digits together
    If the total ends in a zero, then the number is a valid credit card

    */


    /**
     * The card number is presumed as String here
     * #iteration backward through card number
     * @param cardNumber
     * @return
     */

    public boolean isCardNumberValid(String cardNumber){
        boolean isValid = false;

        int grandTotal = getTotalNumberOfAllCardDigits(cardNumber);
        char[] arrayOfDigits = cardNumber.toCharArray();
        List cardNumbersList = Arrays.asList(arrayOfDigits);
        Collections.reverse(cardNumbersList);
        //final int[] elementIndex = {};
        int total = processTotal(cardNumber);
        grandTotal = grandTotal + total;
        if (grandTotal % 10 == 0){
            isValid = true;
        }
        return isValid;
    }


     private int processTotal(String cardNumber){
         final int[] total = {0};
         final int[] elementIndex = {1};
;
         List<String> cardNumbersList = List.of(cardNumber.split(""));

         cardNumbersList.forEach((cardDigit-> {
             System.out.println("number is: " + cardDigit);

             int doubleOfCurrentDigit = Integer.parseInt(cardDigit.toString()) * 2;
             int tens = doubleOfCurrentDigit / 10;
             int ones = doubleOfCurrentDigit % 10;
             System.out.println("Grand Total is: " + total[0]);
             if(elementIndex[0] % 2 == 0 && tens + ones > 9){
                 total[0] += (tens + ones);
             }
             System.out.println("Grand Total is: " + total[0]);
             System.out.println("Index is: " + elementIndex[0]);

             //elementIndex[0]++;



         }));



        return total[0];
    }


}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GuesTheWordImpl implements GuesTheWord{


    List referrenceList = Arrays.asList("hello","How","Are","you");
    String selectedWord ="";
    public boolean wordContainsTheCharacter(String charactorIn){
        boolean contains = false;

        int rand = new Random().nextInt(referrenceList.size() -1 );
        selectedWord = referrenceList.get(rand).toString();
        System.out.println(selectedWord);
        String[] charatersCollectoion= selectedWord.split("");

        for(int i =0 ; i<charatersCollectoion.length-1 ;i++){
            String character = charatersCollectoion[i];
            if(character.equalsIgnoreCase(charactorIn)){
                return(true);
            }

        }

        return contains;

    }

    /**
     * Asking The player to input three attempt for
     * Characters
     * @return
     */
    public boolean play( ) {
        try {

            //String enpcriptet = referenceWord.re
            System.out.println("Guess The word ****************");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            // Reading data using readLine
            String input = reader.readLine();

            int numberofAttemprs = 0;

            if (wordContainsTheCharacter(input)){
                return true;
            }

            while(!wordContainsTheCharacter(input) && numberofAttemprs < selectedWord.length() -1){
                System.out.println(" wrong Guess Start again ****************");
                input = reader.readLine();
                numberofAttemprs ++;
            }


            // Printing the read line


        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        System.out.println("Sorry you loose");
        return false;
    }

    public static void main(String[] args){
        GuesTheWord guesTheWordImpl = new GuesTheWordImpl();
        guesTheWordImpl.play();

    }
}

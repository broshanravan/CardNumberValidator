import org.junit.Test;

public class CardProcessorImplTest {

    @Test
    public void isNumberValidTest(){
        String cardNumber = "7205325372347289";
        CardProcessor cardProcessorImpl = new CardProcessorImpl();
        boolean isNumberValid = cardProcessorImpl.isCardNumberValid(cardNumber);

        assert isNumberValid;

    }
}

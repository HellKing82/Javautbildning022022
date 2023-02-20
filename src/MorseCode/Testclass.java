package MorseCode;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class Testclass {

    private Logic _logic;

    public Testclass() {
        _logic = new Logic();
    }

    @Test

    public void downToWord() {

        String testData = "HELLO";
        String expected = "hello";

        String actual = _logic.GetSmallText(testData);

        assertEquals(expected, actual);

    }

    @Test

    public void wordLenght() {


        String textData = "Morsecode";
        int expected = 9;

        int actual = _logic.GetWordLenght(textData);

        assertEquals(expected, actual);

    }

    @Test

    public void isLetter() {

        String testData = " ";
        String expected = " ";

        String actual = _logic.GetIsLetter(testData);

        assertEquals(expected, actual);

    }

    @Test

    public void CharToString() {

        Character testData = 'h';
        String expected = "h";

        String actual = _logic.GetCharToString(testData);

        assertEquals(expected, actual);

    }


    @Test

    public void TranslateEnglish() {


        Character testData = 'g';
        String expected = "--.";

        String actual = _logic.getTranslateEnglish(String.valueOf(testData));

        assertEquals(expected, actual);
    }

   /* @Test

   public void TranslateMorse() {


        String testData = "--.";
        Character expected = 'g';

    Character actual = _logic.getTranslateMorse(testData);

        assertEquals(expected, actual);
    }*/
}




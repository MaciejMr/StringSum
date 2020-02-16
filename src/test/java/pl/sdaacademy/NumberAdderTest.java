package pl.sdaacademy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberAdderTest {

    @Test
    void shouldAddNumbersInString() {
        //given
        String wordWithNumbers = "dksfgh4738b43b5mbh43mnbmn436bjb56n";
        int expected = 5321;
        //when
        int actualNumber = new NumberAdder(wordWithNumbers).addNumbers(wordWithNumbers);
        //then
        assertEquals(expected, actualNumber);
    }

}
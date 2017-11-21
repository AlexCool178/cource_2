package lesson2.ann;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RandomIntProcessorTest {
    //testStartProcess_validParams_generateRandomNumber
    @Test
    public void testStartProcess_validParams_generateRandomNumber() throws IllegalAccessException {
        // setup (given)
        RandomIntTest test = new RandomIntTest();
        //when
        RandomIntProcessor.startProcess(test);
        //then
        int number = test.getNumber();
        Assertions.assertTrue(number >= -5);
        Assertions.assertTrue(number <= 10);
    }
}

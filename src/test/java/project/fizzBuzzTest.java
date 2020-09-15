package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class fizzBuzzTest {

    @Test
    public void FizzBuzzObject(){
        //Arrange and Action
        fizzBuzz undertest = new fizzBuzz();
        //Assertion checking for object and not null
        assertTrue(undertest !=null);
    }

    @Test
    public void returnOne(){
        //Arrange
        fizzBuzz undertest = new fizzBuzz();

        //Action
        String result = undertest.interpret(1);

        //Assertion
        assertEquals("1", result);
    }
}

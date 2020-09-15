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
        String result = undertest.interpret(4);

        //Assertion
        assertEquals("4", result);
    }

    @Test
    public void returnFizz(){
        //Arrange
        fizzBuzz undertest = new fizzBuzz();

        //Action
        String result = undertest.interpret(3);

        //Assertion
        assertEquals("fizz", result);
    }

    @Test
    public void returnBuzz(){
        //Arrange
        fizzBuzz undertest = new fizzBuzz();

        //Action
        String result = undertest.interpret(5);

        //Assertion
        assertEquals("buzz", result);
    }

    @Test
    public void returnFizzBuzz(){
        //Arrange
        fizzBuzz undertest = new fizzBuzz();

        //Action
        String result = undertest.interpret(15);

        //Assertion
        assertEquals("fizzbuzz", result);
    }
}

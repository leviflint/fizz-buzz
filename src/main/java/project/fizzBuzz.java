package project;

public class fizzBuzz {


    public String interpret(int numberToSay) {
        if (numberToSay % 5 == 0 && numberToSay % 3 == 0){
            return "fizzbuzz";
        }
        if (numberToSay % 3 == 0) {
            return "fizz";
        }
        if (numberToSay % 5 == 0) {
            return "buzz";
        }
        return "" + numberToSay;
    }
}

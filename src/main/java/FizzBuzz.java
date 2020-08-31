public class FizzBuzz {

    public String fizz(int number) {
        String str = "";
        if ((number % 3) == 0) {
            str = "Fizz";
        }
        return str;
    }

    public String buzz(int number) {
        String str = "";
        if ((number % 5) == 0) {
            str = "Buzz";
        }
        return str;
    }

    public String fizzBuzz(int number) {
        String str = "";
        if (((number % 5) == 0) && ((number % 3) == 0)) {
            str = "FizzBuzz";
        }
        return str;
    }
}

public class ExecuteFizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 1; i <=100; i++) {
            if (fizzBuzz.fizzBuzz(i).equals("FizzBuzz")){
                System.out.println("FizzBuzz");
            } else if (fizzBuzz.fizz(i).equals("Fizz")){
                System.out.println("Fizz");
            } else if (fizzBuzz.buzz(i).equals("Buzz")){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

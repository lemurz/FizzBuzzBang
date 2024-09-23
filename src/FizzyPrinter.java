public class FizzyPrinter {
    private int value;
    FizzyPrinter(int value){
        this.value = value;
    }
    public String divisibleByThree(int value){
        return "Fizz";
    }

    public String divisibleByFive(int value){
        return "Buzz";
    }

    public String divisibleBySeven(int value){
        return "Bang";
    }

    public String divisibleByThreeFive(int value){
        return "Fizzbuzz";
    }

    public String divisibleByAll(int value){
        return "Fizzbuzzbang";
    }

}
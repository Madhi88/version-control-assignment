public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Printer app");
        System.out.println("This app is made by");

        String creator = "Madhavi";
        System.out.println("This app is made by: " + creator);

        int number1 = 99;
        int number2 = 04;
        // System.out.println(number1);
        System.out.println("The value of number1 is: " + number1);
        System.out.println("The value of number2 is: " + number2);
        int multiplication = number1 * number2;
        System.out.println(number1 + "*" + number2 +"=" + multiplication);

        int addition = number1 + number2;
        System.out.println(number1 + "+" + number2 +"=" + addition);

        int subtraction = number1 - number2;
        System.out.println(number1 + "-" + number2 +"=" + subtraction);

        double division = (double) number1 / number2;
        System.out.println(number1 + "/" + number2 +"=" + division);
    }
}


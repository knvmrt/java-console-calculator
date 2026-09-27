import java.util.Scanner;
public class Main {
    static final String RED = "\u001B[31m";
    static final String GREEN = "\u001B[32m";
    static final String YELLOW = "\u001B[33m";
    static final String BLUE = "\u001B[34m";
    static final String VIOLET = "\u001B[35m";
    static final String CYAN = "\u001B[36m";
    static final String WHITE = "\u001B[1m";
    static final String RESET = "\u001B[0m";
    public static void main(String[] args) {
        while (true){
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println(YELLOW + "----------------" + RESET);
                System.out.println(YELLOW +"|" + VIOLET +  "  CALCULATOR  " + RESET+ YELLOW + "|" + RESET);
                System.out.println(YELLOW + "----------------" + RESET);

                double numberOne;
                System.out.print(GREEN + "Input a value: " + RESET);
                while (!scanner.hasNextDouble()) {
                    System.out.println(RED + "Error: Please enter a valid character!" + RESET);
                    System.out.print(GREEN + "Input a value: " + RESET);
                    scanner.next();
                }
                numberOne = scanner.nextDouble();

                char operator;
                while (true) {
                    System.out.print(GREEN + "Operators " + RESET +  "[ + ; - ; * ; / ]: ");
                    String input = scanner.next();
                    if (input.length() != 1) {
                        System.out.println(RED + "Error: You cannot enter more than one character!" + RESET);
                    } else if (input.length() == 1 && "+-*/".contains(input)) {
                        operator = input.charAt(0);
                        break;
                    } else {
                        System.out.println(RED + "Hata: Please enter only a valid operator [+, -, *, /]!" + RESET);
                    }
                }

                double numberTwo;
                System.out.print(GREEN + "Enter a second value: " + RESET);
                while (!scanner.hasNextDouble()) {
                    System.out.println(RED + "Error: Please enter a valid character!" + RESET);
                    System.out.print(GREEN + "Enter a second value: " + RESET);
                    scanner.next();
                }
                numberTwo = scanner.nextDouble();

                double result = 0.0;

                switch (operator){
                    case '+':
                        result = numberOne + numberTwo;
                        break;
                    case '-':
                        result = numberOne - numberTwo;
                        break;
                    case '*':
                        result = numberOne * numberTwo;
                        break;
                    case '/':
                        if (numberTwo != 0){
                            result = numberOne / numberTwo;
                        }else {
                            System.out.println(RED + "Error: No value can be divided by zero!" + RESET);
                        }
                        break;
                    default:
                        System.out.println(RED + "Error: Invalid operator input!" + RESET);
                        break;
                }
                System.out.println(BLUE + "==================" + RESET);
                System.out.println(CYAN + " Result: " + RESET + WHITE + result + RESET);
                System.out.println(BLUE + "==================" + RESET);
            } catch (Exception error) {
                throw new RuntimeException(error);
            }
        }
    }
}

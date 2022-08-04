import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter your number: ");
        int number1 = (in.nextInt());
        System.out.print("enter your next number: ");
        int number2 = (in.nextInt());
        System.out.print("enter your operation: ");
        String operation = (in.next());
        if (operation.equals("+")) {
            System.out.println(number1 + number2);
        } else if (operation.equals("*")) {
            System.out.println(number1 * number2);
        } else if (operation.equals("/")) {
            System.out.println(number1 / number2);
        } else if (operation.equals("-")) {
            System.out.println(number1 - number2);
        } else {
            System.out.println("worng operation");
        }

    }
}

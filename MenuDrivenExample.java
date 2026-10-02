import java.util.Scanner;

public class MenuDrivenExample {
    public static void main(String[] args) {
        int userChoice = 0;

        while (userChoice != 5) {
            System.out.println("Enter your calculator choice:");
            System.out.println("1. Add");
            System.out.println("2. Sub");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit!");
            Scanner sc = new Scanner(System.in);
            userChoice = sc.nextInt();

            switch (userChoice) {
                case 1: {
                    add();
                    break;
                }
                case 2: {
                    System.out.println("Enter num1");
                    int num1 = sc.nextInt();
                    System.out.println("Enter num2");
                    int num2 = sc.nextInt();
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                }
                case 5: {
                    System.out.println("Thank you for using our app.");
                    break;
                }
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }

    private static void add() {
        System.out.println("Enter num1");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}

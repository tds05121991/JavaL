import java.util.Scanner;

public class CycleWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        while (i != 10) {
            System.out.println("You are wrong!");
            i = scanner.nextInt();
        }

        do {
            System.out.println("You are wrong!");
            i = scanner.nextInt();
        } while (i != 10);

        System.out.println("You are right!");



        int counter = 0;
        while (counter != 100) {
            System.out.println("Hello");
            counter++;
        }
    }

}

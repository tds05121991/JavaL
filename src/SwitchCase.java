import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        switch (i) {
            case 2:
                System.out.println("read 2");
                break;
            case 3:
                System.out.println("read 3");
                break;
            case 4:
                System.out.println("read 4");
                break;
            case 5:
                System.out.println("read 5");
                break;
            default:
                System.out.println("read number");
        }

        String s = scanner.next();
        switch (s) {
            case "a":
                System.out.println("read a");
                break;
            case "asd":
                System.out.println("read asd");
                break;
            default:
                System.out.println("read string");
        }

    }

}

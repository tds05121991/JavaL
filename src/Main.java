import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        byte b = 120;
        short s = 1;
        int i = 2;
        long l = 5;

        float f = 1.1f;
        double d = 2.7;

        boolean bool1 = true;
        boolean bool2 = false;

        char c = '1';
        String str = "Hello world";

        int summa = 2 + 5 + i;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! I'am java program");
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println("How old are you?");
        int age = scanner.nextInt();

        if (age > 0) {
            System.out.println("Your name is " + name + " and you are " + age + " years old");
        } else {
            System.out.println("You are hasker");
        }



        if (5 > 10) {
            System.out.println("1");
        } else {
            System.out.println("oops");
        }

        if (5 < 10) {
            System.out.println("2");
        } else {
            System.out.println("ok");
        }

        if (5 <= 5) {
            System.out.println("3");
        }
        if (6 == 6) {
            System.out.println("4");
        }
        if (5 >= 7) {
            System.out.println("5");
        }



//        System.out.println(summa);

        System.out.println("Hello, World!");    //Тут я оставлю комент
        System.out.println("My name is Anton");



    }

}

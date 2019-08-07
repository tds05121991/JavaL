import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! I'am java program");

        System.out.println("What is your name?");
        String name = scanner.next();

        System.out.println("What is your last name?");
        String lastName = scanner.next();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        int summa = 2 + 5;
        boolean check = age > 0 && age == 5;

        if (check) {
            System.out.println("Your name is " + name + " and you are " + age + " years old"
                    + " your last name is " + lastName );

            if (age < 7) {
                System.out.println("Your are in yasli");

            } else if (age < 18) {
                System.out.println("Your are in school");

            } else if (age < 65) {
                System.out.println("Your are working man");
            }

            if ( (age < 7) && (age >= 5) ) {
                System.out.println("If with &&");
            }

            if ( ((age < 18) || (age > 65)) && (age < 100)) {
                System.out.println("Your are not working");
            }

            if ( !(age < 100) ) {
                System.out.println("If with !");
            }

        } else {
            System.out.println("You are hasker");
            System.out.println("good");

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


    }
}

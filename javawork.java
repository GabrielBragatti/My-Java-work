import java.util.Scanner;

public class javawork {
    public static void main(String[] args) {

        System.out.println("Choose the number of the exercise you want to test: ");
        System.out.println("Enter '1' for exercise 9");
        System.out.println("Enter '2' for exercise 10");
        System.out.println("Enter '3' for exercise 11");
        System.out.println("Enter '4' for exercise 12");
        System.out.println("Enter '5' for exercise 13");
        System.out.println("Enter '6' for exercise 16");
        System.out.println("Enter '7' for exercise 22");
        System.out.println("Enter '8' for exercise 23");

        Scanner enter = new Scanner(System.in);
        int read = enter.nextInt();
        Scanner enterr = new Scanner(System.in);
        Scanner enterrr = new Scanner(System.in);
        Scanner enterrrr = new Scanner(System.in);
        Scanner enterrrrr = new Scanner(System.in);
        Scanner enterrrrrr = new Scanner(System.in);
        Scanner enterrrrrrr = new Scanner(System.in);
        Scanner enterrrrrrrr = new Scanner(System.in);
        int i = 0;

        if (read == 1) {

            /*
             * This loop I'm using to clear the screen, since Java doesn't have this option
             * ;-; ;-; ;-; But I'm going to use it in various parts of the code to make it
             * cleaner.
             */

            for (i = 0; i < 20; i++) {
                System.out.println("\n");
            }

            System.out.println("This is a calculator program!");
            System.out.println("First, choose an operation you want to perform: ");
            System.out.println("Type '+' for addition;");
            System.out.println("Type '-' for subtraction;");
            System.out.println("Type '/' for division;");
            System.out.println("Type '*' for multiplication.");

            char signal = enterr.next().charAt(0);

            if (signal == '+') {

                for (i = 0; i < 20; i++) {
                    System.out.println("\n");
                }

                System.out.print("Enter the first number of the sum: ");

                int first = enterrr.nextInt();

                System.out.print("Enter the second number of the sum: ");

                int second = enterrr.nextInt();

                int result = second + first;

                System.out.print("The result of the sum was: ");
                System.out.println(result);

            } else if (signal == '-') {

                for (i = 0; i < 20; i++) {
                    System.out.println("\n");
                }

                System.out.print("Enter the first number of the subtraction: ");

                int first = enterrr.nextInt();

                System.out.print("Enter the second number of the subtraction: ");

                int second = enterrr.nextInt();

                int result = second - first;

                System.out.print("The result of the subtraction was: ");
                System.out.println(result);

            } else if (signal == '/') {

                for (i = 0; i < 20; i++) {
                    System.out.println("\n");
                }

                System.out.print("Enter the first number of the division: ");

                int first = enterrr.nextInt();

                System.out.print("Enter the second number of the division: ");

                int second = enterrr.nextInt();

                int result = second / first;

                System.out.print("The result of the division was: ");
                System.out.println(result);

            } else if (signal == '*') {

                for (i = 0; i < 20; i++) {
                    System.out.println("\n");
                }

                System.out.print("Enter the first number of the multiplication: ");

                int first = enterrr.nextInt();

                System.out.print("Enter the second number of the multiplication: ");

                int second = enterrr.nextInt();

                int result = second * first;

                System.out.print("The result of the multiplication was: ");
                System.out.println(result);

            } else {

                for (i = 0; i < 20; i++) {
                    System.out.println("\n");
                }

                System.out.print("Why did you type ");
                System.out.print(signal);
                System.out.println("? I gave you the options! Choose a valid one!");

            }

        } else if (read == 2) {

            for (i = 0; i < 20; i++) {
                System.out.println("\n");
            }

            System.out.println("This is a calculator program!");
            System.out.println("First, choose an operation you want to perform: ");
            System.out.println("Type '+' for addition;");
            System.out.println("Type '-' for subtraction;");
            System.out.println("Type '/' for division;");
            System.out.println("Type '*' for multiplication.");

            char signal = enterr.next().charAt(0);

            if (signal == '+') {

                for (i = 0; i < 20; i++) {
                    System.out.println("\n");
                }

                System.out.print("Enter the first number of the sum: ");

                int first = enterrr.nextInt();

                System.out.print("Enter the second number of the sum: ");

                int second = enterrr.nextInt();

                int result = second + first;

                System.out.print("The result of the sum was: ");
                System.out.println(result);

            } else if (signal == '-') {

                for (i = 0; i < 20; i++) {
                    System.out.println("\n");
                }

                System.out.print("Enter the first number of the subtraction: ");

                int first = enterrr.nextInt();

                System.out.print("Enter the second number of the subtraction: ");

                int second = enterrr.nextInt();

                int result = second - first;

                System.out.print("The result of the subtraction was: ");
                System.out.println(result);

            } else if (signal == '/') {

                for (i = 0; i < 20; i++) {
                    System.out.println("\n");
                }

                System.out.print("Enter the first number of the division: ");

                int first = enterrr.nextInt();

                System.out.print("Enter the second number of the division: ");

                int second = enterrr.nextInt();

                if (second == 0) {

                    for (i = 0; i < 20; i++) {
                        System.out.println("\n");
                    }

                    System.out.println("No number can be divided by zero, please reopen the program and tend again!");

                } else {

                    int result = second / first;

                    for (i = 0; i < 20; i++) {
                        System.out.println("\n");
                    }

                    System.out.print("The result of the division was: ");
                    System.out.println(result);

                }

            } else if (signal == '*') {

                for (i = 0; i < 20; i++) {
                    System.out.println("\n");
                }

                System.out.print("Enter the first number of the multiplication: ");

                int first = enterrr.nextInt();

                System.out.print("Enter the second number of the multiplication: ");

                int second = enterrr.nextInt();

                int result = second * first;

                System.out.print("The result of the multiplication was: ");
                System.out.println(result);

            } else {

                for (i = 0; i < 20; i++) {
                    System.out.println("\n");
                }

                System.out.print("Why did you type ");
                System.out.print(signal);
                System.out.println("? I gave you the options! Choose a valid one!");

            }

        } else if (read == 3) {

            for (i = 0; i < 20; i++) {
                System.out.println("\n");
            }

            System.out.println(
                    "According to the medical chart\na person's ideal weight is related to height and sex. \nThis program will do this calculation according to you!\n\nPlease enter your height: ");

            Float height = enterrrr.nextFloat();

            for (i = 0; i < 20; i++) {
                System.out.println("\n");
            }

            System.out.println("Finally, type 'F' if your gender is female and 'M' if your gender is male: ");

            Double ideal = 0.0;

            String gender = enterr.nextLine();

            String uppercase = gender.toUpperCase();

            switch (uppercase) {
                case "F":

                    ideal = (62.1 * height) - 44.7;

                    for (i = 0; i < 20; i++) {
                        System.out.println("\n");
                    }

                    System.out.print("Your ideal weight is: ");
                    System.out.println(ideal);

                    break;

                case "M":

                    ideal = (72.7 * height) - 58;

                    for (i = 0; i < 20; i++) {
                        System.out.println("\n");
                    }

                    System.out.print("Your ideal weight is: ");
                    System.out.println(ideal);

                    break;

                default:

                    for (i = 0; i < 20; i++) {
                        System.out.println("\n");
                    }

                    System.out.println("Please, choose a gender between female 'F' or male 'M'");

                    break;
            }

        } else if (read == 4) {

            for (i = 0; i < 20; i++) {
                System.out.println("\n");
            }

            System.out.println(
                    "The Brazilian Swimming Confederation will promote the qualifiers for the next world championship.\nTo find out which category you fit into, enter your age below:");

            int age = enterrrrr.nextInt();

            if (age >= 5 && age < 7) {

                for (i = 0; i < 20; i++) {
                    System.out.println("\n");
                }

                System.out.println("Your category is: Children A");

            } else if (age >= 8 && age < 10) {

                for (i = 0; i < 20; i++) {
                    System.out.println("\n");
                }

                System.out.println("Your category is: Children B");

            } else if (age >= 11 && age < 13) {

                for (i = 0; i < 20; i++) {
                    System.out.println("\n");
                }

                System.out.println("Your category is: Youth A");

            } else if (age >= 14 && age < 17) {

                for (i = 0; i < 20; i++) {
                    System.out.println("\n");
                }

                System.out.println("Your category is: Youth A");

            } else {

                for (i = 0; i < 20; i++) {
                    System.out.println("\n");
                }

                System.out.println("Your category is: Senior");

            }

        } else if (read == 5) {

            for (i = 0; i < 20; i++) {
                System.out.println("\n");
            }

            System.out.println(
                    "This program indicates your electoral class according to your age.\nPlease enter your age below:");

            int age2 = enterrrrrr.nextInt();

            if (age2 < 16) {

                for (i = 0; i < 20; i++) {
                    System.out.println("\n");
                }

                System.out.println("non-voter");

            } else if (age2 > 16 && age2 < 18) {

                for (i = 0; i < 20; i++) {
                    System.out.println("\n");
                }

                System.out.println("optional voter");

            } else if (age2 > 65) {

                for (i = 0; i < 20; i++) {
                    System.out.println("\n");
                }

                System.out.println("optional voter");

            } else if (age2 >= 18 && age2 <= 65) {

                for (i = 0; i < 20; i++) {
                    System.out.println("\n");
                }

                System.out.println("mandatory voter");

            }

        } else if (read == 6) {

            for (i = 0; i < 20; i++) {
                System.out.println("\n");
            }

            System.out.println("Welcome to the \"Gabriel's delícias\" restaurant!");
            System.out.println("This week we have a really cool promotion");
            System.out.println("where you get 30% off depending on the initial letter of your name!");
            System.out.println("Enter your account value below: ");
            Float value = enterrrrrrr.nextFloat();

            for (i = 0; i < 20; i++) {
                System.out.println("\n");
            }

            System.out.println("Now enter your name: ");
            String name = enterrrrrrr.next();

            char initial4 = name.charAt(0);

            String initial = Character.toString(initial4);

            String initial3 = initial.toUpperCase();

            char[] initial2 = initial3.toCharArray();

            if (initial2[0] == 'A') {

                Float valuei = value;
                Float value2 = valuei * 30;
                Float value3 = value2 / 100;
                Float value4 = value - value3;

                for (i = 0; i < 20; i++) {
                    System.out.println("\n");
                }

                System.out.println("Congratulations!");
                System.out.println("You got the 30% discount!");
                System.out.print("With that your account went from R$ ");
                System.out.print(value);
                System.out.print(" to R$ ");
                System.out.print(value4);
                System.out.println("!");

            } else if (initial2[0] == 'D') {

                Float valuei = value;
                Float value2 = valuei * 30;
                Float value3 = value2 / 100;
                Float value4 = value - value3;

                for (i = 0; i < 20; i++) {
                    System.out.println("\n");
                }

                System.out.println("Congratulations!");
                System.out.println("You got the 30% discount!");
                System.out.print("With that your account went from R$ ");
                System.out.print(valuei);
                System.out.print(" to R$ ");
                System.out.print(value4);
                System.out.println("!");

            } else if (initial2[0] == 'M') {

                Float valuei = value;
                Float value2 = valuei * 30;
                Float value3 = value2 / 100;
                Float value4 = value - value3;

                for (i = 0; i < 20; i++) {
                    System.out.println("\n");
                }

                System.out.println("Congratulations!");
                System.out.println("You got the 30% discount!");
                System.out.print("With that your account went from R$ ");
                System.out.print(valuei);
                System.out.print(" to R$ ");
                System.out.print(value4);
                System.out.println("!");

            } else if (initial2[0] == 'S') {

                Float valuei = value;
                Float value2 = valuei * 30;
                Float value3 = value2 / 100;
                Float value4 = value - value3;

                for (i = 0; i < 20; i++) {
                    System.out.println("\n");
                }

                System.out.println("Congratulations!");
                System.out.println("You got the 30% discount!");
                System.out.print("With that your account went from R$ ");
                System.out.print(valuei);
                System.out.print(" to R$ ");
                System.out.print(value4);
                System.out.println("!");

            } else {

                for (i = 0; i < 20; i++) {
                    System.out.println("\n");
                }

                System.out.println("What a pity. This week you did not receive the discount");
                System.out.println("but keep us honoring that your turn will come!");
                System.out.println("\n");
                System.out.print("Your account remains: R$ ");
                System.out.println(value);

            }

        } else if (read == 7) {

            for (i = 0; i < 20; i++) {
                System.out.println("\n");
            }

            System.out.println("Welcome to Gabriel's store!");
            System.out.println("Enter the name of the product you want to buy: ");
            String product1 = enterrrrrrrr.nextLine();

            for (i = 0; i < 20; i++) {
                System.out.println("\n");
            }

            System.out.println("Okay, now enter the product value: ");
            Float value1 = enterrrrrrrr.nextFloat();

            for (i = 0; i < 20; i++) {
                System.out.println("\n");
            }

            System.out.println("Your purchase is finished!");

            Float final1 = value1;

            if (final1 < 10) {

                Float final1a = final1 * 70;
                Float final1b = final1a / 100;
                Float final1c = final1 + final1b;

                for (i = 0; i < 20; i++) {
                    System.out.println("\n");
                }

                System.out.println("Your purchase: \n");
                System.out.print(product1);
                System.out.print(" ---------- ");
                System.out.println(value1);
                System.out.println("\n");

                System.out.print("Total with 70% profit: ");
                System.out.println(final1c);
                System.out.println("Check back often!");

            } else if (final1 >= 10 && final1 < 30) {

                Float final1a = final1 * 50;
                Float final1b = final1a / 100;
                Float final1c = final1 + final1b;

                for (i = 0; i < 20; i++) {
                    System.out.println("\n");
                }

                System.out.println("Your purchase: \n");
                System.out.print(product1);
                System.out.print(" ---------- ");
                System.out.println(value1);
                System.out.println("\n");

                System.out.print("Total with 50% profit: ");
                System.out.println(final1c);
                System.out.println("Check back often!");

            } else if (final1 >= 30 && final1 < 50) {

                Float final1a = final1 * 40;
                Float final1b = final1a / 100;
                Float final1c = final1 + final1b;

                for (i = 0; i < 20; i++) {
                    System.out.println("\n");
                }

                System.out.println("Your purchase: \n");
                System.out.print(product1);
                System.out.print(" ---------- ");
                System.out.println(value1);
                System.out.println("\n");

                System.out.print("Total with 40% profit: ");
                System.out.println(final1c);
                System.out.println("Check back often!");

            } else {

                Float final1a = final1 * 30;
                Float final1b = final1a / 100;
                Float final1c = final1 + final1b;

                for (i = 0; i < 20; i++) {
                    System.out.println("\n");
                }

                System.out.println("Your purchase: \n");
                System.out.print(product1);
                System.out.print(" ---------- ");
                System.out.println(value1);
                System.out.println("\n");

                System.out.print("Total with 30% profit: ");
                System.out.println(final1c);
                System.out.println("Check back often!");

            }

        } else if (read == 8) {

            for (i = 0; i < 20; i++) {
                System.out.println("\n");
            }

            System.out.println("g");

        } else {

            for (i = 0; i < 20; i++) {
                System.out.println("\n");
            }

            System.out.println("No kidding, enter a valid exercise number!");

        }

    }
}

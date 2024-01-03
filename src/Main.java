import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math, physics, turkish, chemistry, music;
        double average;

        Scanner inp = new Scanner(System.in);

        // math input
        System.out.print("Please enter your Math grade: ");
        math = inp.nextInt();
        if (math < 0 || math >100) {
            System.out.println("Grade must be between 0 and 100!");
            return;
        }

        // physics input
        System.out.print("Please enter your Physics grade: ");
        physics = inp.nextInt();
        if (physics < 0 || physics > 100) {
            System.out.println("Grade must be between 0 and 100!");
            return;
        }

        // turkish input
        System.out.print("Please enter your Turkish grade: ");
        turkish = inp.nextInt();
        if (turkish <0 || turkish > 100) {
            System.out.println("Grade must be between 0 and 100!");
            return;
        }

        // chemistry input
        System.out.print("Please enter your Chemistry grade: ");
        chemistry = inp.nextInt();
        if (chemistry < 0 || chemistry > 100) {
            System.out.println("Grade must be between 0 and 100!");
            return;
        }

        // music input
        System.out.print("Please enter your Music grade: ");
        music = inp.nextInt();
        if (music < 0 || music > 100) {
            System.out.println("Grade must be between 0 and 100!");
            return;
        }

        // calculate the average
        average = (math + physics + turkish + chemistry + music) / 5.0;

            if (average <= 55) {
                System.out.println("You failed the class! :(");
            } else {
                System.out.println("Congratulations, you passed the class!");
                System.out.println("Your average is " + average);
            }
        }
    }
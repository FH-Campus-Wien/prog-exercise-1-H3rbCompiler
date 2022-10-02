package at.ac.fhcampuswien;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        char c = 'Z';
        int hex1 = 0xface;
        int a = 012;
        long lng1 = 80L;
        float flt1 = 44e-1f;
        float flt2 = 5.5f;
        double dbl1 = 8.88e1;
        double dbl2 = 99.9;

        int sum = (int)hex1 + (int)c + a + (int)lng1 + (int)flt1 + (int)flt2 + (int)dbl1 + (int)dbl2;
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x = sc.nextInt();
        System.out.print("y: ");
        int y = sc.nextInt();
        System.out.println("After Swap:");
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("n1: ");
        System.out.print("n2: ");

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if (n1 > n2) {
            System.out.println("n1 > n2");
        } else if (n1 == n2) {
            System.out.println("n1 == n2");

        } else {
            System.out.println("n2 > n1");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        System.out.print("Enter annual Revenue: ");
        Scanner sc = new Scanner(System.in);
        int revenue = sc.nextInt();

        if(revenue < 0 || revenue >= 100000){
            System.out.print("Invalid Revenue");
        }else if(revenue <= 0 || revenue < 20000){
            System.out.print("Poor Sales Revenue");
        }else if(revenue <= 20000 || revenue < 50000){
            System.out.print("Average Sales Revenue");
        }else if(revenue <= 50000 || revenue < 80000){
            System.out.print("Good Sales Revenue");
        }else if(revenue <= 80000 || revenue < 10000){
            System.out.print("Excellent Sales Revenue");
        }
        System.out.println();
    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int comClass = sc.nextInt();
        String comRate = "Your Commission Rate was set to 0.0";

        if(comClass <= 0 || comClass > 4){
            comRate = "Your Commission Rate was set to 0.0";
            System.out.println(comRate);
            return;
        }

        switch (comClass){
            case 1 :
                comRate = "Your Commission Rate was set to 0.01";
                break;
            case 2 :
                comRate = "Your Commission Rate was set to 0.02";
                break;
            case 3 :
                comRate = "Your Commission Rate was set to 0.03";
                break;
            case 4 :
                comRate = "Your Commission Rate was set to 0.04";
                break;
        }
        System.out.println(comRate);

    }

    //todo Task 9
    public void leapyear(){
        System.out.print("Year: ");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        if (i % 4 == 0 && i % 400 == 0) {
            System.out.println("Leapyear");
        }
        else if (i % 100 == 0 && i % 400 > 0){
            System.out.println("Not a Leapyear");
        }
        else System.out.println("Not a Leapyear");


    }

    //todo Task 10
    public void transposedNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int swapper = sc.nextInt();
        int a, b, c;

        if (swapper > 999){
            return;
        }
        a = swapper / 100;
        b = (swapper - (a * 100)) / 10 ;
        c = swapper % 10;
        System.out.print(c);
        System.out.print(b);
        System.out.print(a);
        System.out.println(); //Test case wollte ein leere Zeile


    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner info = new Scanner(System.in);
        Scanner info2 = new Scanner(System.in);
        String name;
        String surname;
        String country;
        int birthday;
        int birthMonth;
        int birthYear;
        double money;
        boolean vip;
        float percentage;
        String color;

        System.out.println("Welcome to the company! First we need to collect some info about you...");
        System.out.println("What is your name?(String)");
        name = info.nextLine();
        System.out.println("What is your surname?(String)");
        surname = info.nextLine();
        System.out.println("What is the month of your birth(int from 1 to 12)");
        birthMonth = info.nextInt();
        System.out.println("What is the day of your birth?(int)");
        birthday = info.nextInt();
        System.out.println("What is the year of your birth?(int)");
        birthYear = info.nextInt();
        System.out.println("How much money do you have right now?(double)");
        money = info.nextDouble();
        System.out.println("Where are you from?(String)");
        country = info2.nextLine();
        System.out.println("Do you have a vip subscription in our app?(boolean)");
        vip = info.nextBoolean();
        System.out.println("How would you rate your confidence?(float from 0 to 100)");
        percentage = info.nextFloat();
        System.out.println("What is your favourite color?(String)");
        color = info2.nextLine();
        System.out.println("Thanks for registering. Here's your data card:\n");
        System.out.println("Full name: " + name + " " + surname);
        System.out.println("Birth Date: " + birthday + "." + birthMonth + "." + birthYear);
        System.out.println("Your current balance: " + money + "$");
        System.out.println("Nation: " + country);
        System.out.println("Has VIP subscription:" + vip);
        System.out.println("Confidence rate: " + percentage + "%");
        System.out.println("Favourite Color: " + color);
    }
}
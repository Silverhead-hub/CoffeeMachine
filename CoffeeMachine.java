package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static Scanner scanner = new Scanner(System.in);

    public static int countWater = 400;
    public static int countMilk = 540;
    public static int countBeans = 120;
    public static int countCups = 9;
    public static int countMoney = 550;

    public static int addWater;
    public static int addMilk;
    public static int addBeans;
    public static int addCups;

    public static int waterEspresso = 250;
    public static int beanEspresso = 16;

    public static int waterCappuccino = 200;
    public static int milkCappuccino = 100;
    public static int beanCappuccino = 12;

    public static int waterLatte = 350;
    public static int milkLatte = 75;
    public static int beanLatte = 20;



    public static boolean workMachine = true;

    public static void main(String[] args) {
        while (workMachine){
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action();
        }
    }

    public static void action() {
        String option = scanner.nextLine();
        System.out.println();

        switch (option) {
            case "fill":
                fill();
                System.out.println();
                break;
            case "buy":
                buy();
                System.out.println();
                break;
            case "take":
                take();
                System.out.println();
                break;
            case "remaining":
                fillCoffeeMachine();
                System.out.println();
                break;
            case "exit" :
                workMachine = false;
                break;
        }
    }

    public static void fillCoffeeMachine() {
        System.out.println("The coffee machine has:");
        System.out.println(countWater + " of water");
        System.out.println(countMilk + " of milk");
        System.out.println(countBeans + " of coffee beans");
        System.out.println(countCups + " of disposable cups");
        System.out.println(countMoney + " of money");
    }

    /*public static void numberServings(){

        System.out.println("Write how many ml of water the coffee machine has: ");
        countWater = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        countMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        countCoffee = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        needCups = scanner.nextInt();

        int a = countWater/oneWater;
        int b = countMilk/oneMilk;
        int c = countCoffee/oneCoffeeBeans;

        int canBeCups = 0;
        if(a <= b && a <= c)
            canBeCups = a;
        else if(b <= a && b <= c)
            canBeCups = b;
        else if(c <= a && c <= b)
            canBeCups = c;

        if( needCups == canBeCups){
            System.out.println("Yes, I can make that amount of coffee");
        }
        else if( needCups > canBeCups)
            System.out.println("No, I can make only "+ canBeCups +" cup(s) of coffee");
        else
            System.out.println("Yes, I can make that amount of coffee (and even "+ (canBeCups - needCups) +" more than that)");
    }*/

    public static void fill() {

        System.out.println("Write how many ml of water do you want to add:");
        addWater = scanner.nextInt();
        countWater += addWater;
        System.out.println("Write how many ml of milk do you want to add:");
        addMilk = scanner.nextInt();
        countMilk += addMilk;
        System.out.println("Write how many grams of coffee beans do you want to add:");
        addBeans = scanner.nextInt();
        countBeans += addBeans;
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        addCups = scanner.nextInt();
        countCups += addCups;
    }


    public static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        String choice = scanner.nextLine();

        switch (choice){
            case "1" :
                if (waterEspresso > countWater) {
                    System.out.println("Sorry, not enough water!");
                }
                else if (beanEspresso > countBeans) {
                    System.out.println("Sorry, not enough coffee beans!");
                }
                else {
                    System.out.println("I have enough resources, making you a coffee!");
                    countWater -= 250;
                    countBeans -= 16;
                    countCups -= 1;
                    countMoney += 4;
                }
                break;
            case "2" :
                if (waterLatte > countWater) {
                    System.out.println("Sorry, not enough water!");
                }
                else if (milkLatte > countMilk) {
                    System.out.println("Sorry, not enough milk!");
                }
                else if (beanLatte > countBeans) {
                    System.out.println("Sorry, not enough coffee beans!");
                }
                else {
                    System.out.println("I have enough resources, making you a coffee!");
                    countWater -= 350;
                    countMilk -= 75;
                    countBeans -= 20;
                    countCups -= 1;
                    countMoney += 7;
                }
                break;
            case "3" :
                if (waterCappuccino > countWater) {
                    System.out.println("Sorry, not enough water!");
                }
                else if (milkCappuccino > countMilk) {
                    System.out.println("Sorry, not enough milk!");
                }
                else if (beanCappuccino > countBeans) {
                    System.out.println("Sorry, not enough coffee beans!");
                }
                else {
                    System.out.println("I have enough resources, making you a coffee!");
                    countWater -= 200;
                    countMilk -= 100;
                    countBeans -= 12;
                    countCups -= 1;
                    countMoney += 6;
                }
                break;
        }

    }

    public static void take() {
        System.out.println("I gave you $" + countMoney);
        countMoney = 0;
    }


}

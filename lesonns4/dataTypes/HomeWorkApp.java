package lesonns4.dataTypes;

public class HomeWorkApp {
    public static void main(String[] args) {

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 2;
        int b = -6;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Sum is positive");
        } else {
            System.out.println("Sum is negative");
        }
    }

    public static void printColor() {
        int value = 56;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value < 100) {
            System.out.println("Yellow");
        } else if (value > 100) {
            System.out.println("Green");
        }
    }

    public static void compareNumbers() {
        int a = 4;
        int b = 6;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean numberRange(int a, int b) {
        a = 3;
        b = 14;
        if (a + b >= 10 && a + b <= 20)
            return true;
        else {
            return false;
        }
    }

    public static void positiveOrNegativeNumber(int a) {
        if (a >= 0) {
            System.out.println("Number positive");
        } else {
            System.out.println("Number negative");
        }
    }

    public static boolean positiveOrNegativeNumberSecond(int a) {
        if (a >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printString(String string, int a) {
        System.out.println(string.repeat(a));
    }

    public static boolean leapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }


}

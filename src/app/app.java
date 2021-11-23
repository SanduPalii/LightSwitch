package app;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Width?");
        int width = scanner.nextInt();
        System.out.println("Length?");
        int length = scanner.nextInt();
        System.out.println("Area is " + Utils.areaCalc(width, length));

        }

    }

class Utils {
    int width;
    int length;

    static void printTitle(){
        System.out.println("*******");
        System.out.println("* OOP *");
        System.out.println("*******");
    }

    static int areaCalc(int width, int length){
        return width * length;
    }
}

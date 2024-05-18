package Recursion;

public class PrintNum {

    public static void main(String[] args) {
        printNumber(5);
    }

    public static void printNumber(int num) {
        if (num == 0) {
            return;
        }
        printNumber(num - 1);
        System.out.println(num);
    }

}

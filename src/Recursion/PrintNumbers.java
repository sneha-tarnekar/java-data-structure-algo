package Recursion;

public class PrintNumbers {

    private static void printAsc(int n) {
        if (n == 0) return;
        printAsc(n-1);
        System.out.print(n + " ");
    }

    private static void printDesc(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        printDesc(--n);
    }

    public static void main(String[] args) {
        System.out.print("Ascending numbers : ");
        printAsc(12);
        System.out.println();
        System.out.print("Descending numbers : ");
        printDesc(12);
    }
}

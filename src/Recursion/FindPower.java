package Recursion;

public class FindPower {

    public static int findPower(int num, int pow) {
        if(pow == 1) return num;
        return num*findPower(num, pow-1);
    }

    public static void main(String[] args) {
        int result = findPower(2, 5);
        System.out.println("Power is "+ result);
    }
}

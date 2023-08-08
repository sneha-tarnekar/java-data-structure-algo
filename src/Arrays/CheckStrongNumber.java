package Arrays;

//Check if a number is a Strong Number or not
public class CheckStrongNumber {

    public static int findFactorial(int num) {
        int fact = 0;
        int digit;
        while(num != 0) {
            digit = num % 10 ;
            int digitFact = 1;
            for (int i=1; i<=digit; i++) {
                digitFact = digitFact * i;
            }
            fact = fact + digitFact;
            num = num/10;
        }
        return fact;
    }

    public static boolean isStrongNumber(int number) {
        return number == findFactorial(number);
    }

    public static void main(String[] args) {
        if(isStrongNumber(145)) {
            System.out.println("Is a strong number");
        } else {
            System.out.println("Not a strong number");
        }
    }
}

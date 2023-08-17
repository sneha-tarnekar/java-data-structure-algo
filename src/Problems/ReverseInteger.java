package Problems;

public class ReverseInteger {

    public static int reverse(int x) {
        int rev=0;
        int num;

        while(x!=0) {
            num = x%10;
            rev = rev*10 + num;
            x = x/10;
        }

        return rev;
    }

    public static void main(String[] args) {
        int reversedEle = reverse(-124);
        System.out.println(reversedEle);
    }
    
}

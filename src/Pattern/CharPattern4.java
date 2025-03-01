package Pattern;

public class CharPattern4 {

    public static void main(String[] args) {
        pattern(4);
    }

    public static void pattern(int n) {
        int a = 65+n-1;
        char ch = (char)a;
        for(char i = ch; i>='A'; i--) {
            for(char j=i; j<=ch; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

}

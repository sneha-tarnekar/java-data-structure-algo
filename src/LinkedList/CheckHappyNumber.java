package LinkedList;

public class CheckHappyNumber {

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }

        return false;
    }

    public int findSquare(int num) {
        int sqr = 0;
        while (num > 0) {
            int rem = num % 10;
            sqr += rem * rem;
            num /= 10;
        }
        return sqr;
    }
    
}

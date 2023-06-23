package Arrays;

/*
*   You are an owner of lemonade island, each lemonade costs $5.
*   Customers are standing in a queue to buy from you and order one at a time (in the order specified by given array bills[]).
*   Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill.
*   You must provide the correct change to each customer so that the net transaction is that the customer pays $5.
*
*   NOTE: At first, you do not have any bill to provide changes with.
*   You can provide changes from the bills that you get from the previous customers.
*
*   Given an integer array bills of size N where bills [ i ] is the bill the ith customer pays,
*   return true if you can provide every customer with the correct change, or false otherwise.
 */
public class LemonadeChange {

    static boolean lemonadeChange(int N, int bills[]) {
        int[] change = new int[N];

        for(int bill: bills) {
            if(bill == 5) {
                ++change[0];
            } else if(bill == 10) {
                if(change[0]>0) {
                    --change[0];
                } else {
                    return false;
                }
                ++change[1];
            } else if(bill == 20) {
                if(change[1]>0 && change[0]>0) {
                    --change[0];
                    --change[1];
                } else if(change[0]>2) {
                    change[0] -= 3;
                } else {
                    return false;
                }

                ++change[2];
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] bills = {5, 5, 5, 10, 20};
        boolean result = lemonadeChange(bills.length, bills);
        System.out.println("result : "+result);
    }
}

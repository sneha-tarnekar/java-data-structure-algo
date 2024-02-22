package Arrays;

//  https://leetcode.com/problems/richest-customer-wealth/description/

//  You are given an m x n integer grid accounts where accounts[i][j] is the amount of money
//  the ith customer has in the jth bank. Return the wealth that the richest customer has.
//  A customer's wealth is the amount of money they have in all their bank accounts.
//  The richest customer is the customer that has the maximum wealth.

public class RichestCustomerWealth {

    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1, 6}, {2, 4}};
        int output = maximumWealth(accounts);
        System.out.println("Output : " + output);
    }

    public static int maximumWealth(int[][] accounts) {

        int richest = Integer.MIN_VALUE;

        for (int person = 0; person < accounts.length; person++) {
            int wealth = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                wealth = wealth + accounts[person][account];
            }

            if (wealth > richest) {
                richest = wealth;
            }
        }

        return richest;

    }

}

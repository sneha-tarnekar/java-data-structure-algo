package Arrays;

import java.util.Arrays;

//      You are given an integer array prices representing the prices of various chocolates in a store. You are also given a single integer money, which represents your initial amount of money.
//      You must buy exactly two chocolates in such a way that you still have some non-negative leftover money. You would like to minimize the sum of the prices of the two chocolates you buy.
//      Return the amount of money you will have leftover after buying the two chocolates. If there is no way for you to buy two chocolates without ending up in debt, return money. Note that the leftover must be non-negative.
public class BuyTwoChocolates {

    public static int buyChoco(int[] prices, int money) {
        int oriMoney = money;
        Arrays.sort(prices);

        for (int i = 0; i < 2; i++) {
            if (i <= prices.length) {
                money = money - prices[i];
            }
        }

        if (money < 0) {
            return oriMoney;
        }

        return money;
    }

    public static void main(String[] args) {
        int[] prices = {1, 2, 2};
        int money = 3;
        int remainingMoney = buyChoco(prices, money);
        System.out.println("Remaining money : " + remainingMoney);
    }


}

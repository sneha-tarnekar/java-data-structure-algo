package Arrays;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

//  Given an integer array arr of distinct integers and an integer k.
//  A game will be played between the first two elements of the array (i.e. arr[0] and arr[1]).
//  In each round of the game, we compare arr[0] with arr[1], the larger integer wins and remains at position 0, and the smaller integer moves to the end of the array.
//  The game ends when an integer wins k consecutive rounds.
//  Return the integer which will win the game. It is guaranteed that there will be a winner of the game.
public class FindWinnerOfAnArrayGame {

    // TODO: Optimize this
    public static int getWinner(int[] arr, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int value : arr) {
            list.add(value);
        }
        Map<Integer, Integer> map = new HashMap();

        while (true) {
            int key;
            if (list.get(0) < list.get(1)) {
                key = list.get(1);
                Integer ele = list.get(0);
                map.merge(key, 1, Integer::sum);
                list.remove(0);
                list.add(ele);
            } else {
                key = list.get(0);
                Integer ele = list.get(1);
                map.merge(key, 1, Integer::sum);
                list.remove(1);
                list.add(ele);
            }

            if (map.containsValue(k)) {
                return key;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 11, 22, 33, 44, 55, 66, 77, 88, 99};
        int k = 1000000000;
        int output = getWinner(arr, k);
        System.out.println("Output : " + output);
    }

}

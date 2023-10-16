package Problems;

import java.util.LinkedList;
import java.util.List;

/*
    Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
    In Pascal's triangle, each number is the sum of the two numbers directly above it
 */
public class PascalTriangleII {

    public static List<Integer> getRow(int rowIndex) {
        LinkedList<List<Integer>> resultList = new LinkedList();
        resultList.add(new LinkedList());
        resultList.getLast().add(1);

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> list = new LinkedList();
            list.add(1);
            for (int j = 1; j < i; j++) {
                list.add(resultList.getLast().get(j - 1) + resultList.getLast().get(j));
            }
            list.add(1);
            resultList.add(list);
        }

        return resultList.get(rowIndex);
    }

    public static void main(String[] args) {
        int rowIndex = 3;
        List<Integer> output = getRow(rowIndex);

        for (Integer ele : output) {
            System.out.print(ele + " ");
        }
    }

}

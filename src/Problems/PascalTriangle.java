package Problems;

import java.util.LinkedList;
import java.util.List;

public class PascalTriangle {

    public static List<List<Integer>> generate(int numRows) {
        LinkedList<List<Integer>> resultList = new LinkedList();
        resultList.add(new LinkedList());
        resultList.getLast().add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> list = new LinkedList();
            list.add(1);
            for (int j = 1; j < i; j++) {
                list.add(resultList.getLast().get(j - 1) + resultList.getLast().get(j));
            }
            list.add(1);
            resultList.add(list);
        }

        return resultList;
    }

    public static void print(List<List<Integer>> list) {
        for(int i=0; i<list.size(); i++) {
            for(int j=0; j<list.size()-i; j++) {
                System.out.print(" ");
            }

            for(int j=0; j<list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j)+ " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> output = generate(numRows);
        print(output);
    }

}

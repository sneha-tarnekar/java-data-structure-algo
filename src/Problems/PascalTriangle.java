package Problems;

import java.util.LinkedList;
import java.util.List;

public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
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

}

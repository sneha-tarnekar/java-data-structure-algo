package Problems;

import java.util.LinkedList;

//  2125. Number of Laser Beams in a Bank
public class LaserBeams {

    public static int numberOfBeams(String[] bank) {
        int c = 0;
        LinkedList<Integer> l = new LinkedList<>();
        for (int i = 0; i < bank.length; i++) {
            l.add(0);
            for (int j = 0; j < bank[i].length(); j++) {
                if (bank[i].charAt(j) == '1') {
                    l.add(l.pollLast() + 1);
                }
            }
            if (l.getLast() == 0) {
                l.removeLast();
            }
        }

        if (l.size() <= 1)
            return 0;

        for (int i = 0; i < l.size() - 1; i++) {
            c += l.get(i) * l.get(i + 1);
        }
        return c;
    }

    public static void main(String[] args) {
        String[] bank = {"011001", "000000", "010100", "001000"};
        int output = numberOfBeams(bank);
        System.out.println("Output : " + output);
    }

}

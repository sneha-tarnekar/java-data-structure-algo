package Problems;

//  Leetcode: 1894. Find the Student that Will Replace the Chalk
public class FindChalkReplacer {

    public static int chalkReplacer(int[] chalk, int k) {

        while (k > 0) {
            for (int i = 0; i < chalk.length; i++) {
                k = k - chalk[i];
                if (k < 0)
                    return i;
                else if (k == 0)
                    return i + 1 == chalk.length ? 0 : i + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] chalk = {5, 1, 5};
        int k = 22;
        int output = chalkReplacer(chalk, k);
        System.out.println("Output : " + output);
    }

}

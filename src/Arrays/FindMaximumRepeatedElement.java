package Arrays;

public class FindMaximumRepeatedElement {
    public static int[] maxRepeated(int[] input) {
        int count = 1;
        int maxRepeatedElement = input[0];
        int previousCount = 0;
        for(int i=0; i<input.length; i++) {
            for (int j=0; j<input.length; j++) {
                if(i!=j && input[i]==input[j]) {
                        count++;
                }
            }
            if(previousCount < count) {
                maxRepeatedElement = input[i];
                previousCount = count;
            }
            count = 1;
        }
        int[] result = {maxRepeatedElement, previousCount};
        return result;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 3, 4, 2, 3, 4, 3};
        int[] output = maxRepeated(input);
        System.out.print("Maximum repeated element: " + output[0] + "\nNumber of times repeated: " + output[1]);
    }
}

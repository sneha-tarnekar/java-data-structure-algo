package Problems;

import java.util.Arrays;
import java.util.List;

public class BestRacer {
    
    private static class Course {
        String title;
        int obstacleCount;

        public Course(String title, int obstacleCount) {
            this.title = title;
            this.obstacleCount = obstacleCount;
        }
    }
    
    public static class Run {
        Course course;
        boolean complete;
        List<Integer> obstacleTimes;

        public Run(Course course, boolean complete, List<Integer> obstacleTimes) {
            this.course = course;
            this.complete = complete;
            this.obstacleTimes = obstacleTimes;
        }
    }
    
    private static class RunCollection {
        Course course;
        List<Run> runs;

        public RunCollection(Course course, List<Run> runs) {
            this.course = course;
            this.runs = runs;
        }
        
    }

    private static int bestOfBests(RunCollection runCollection) {
        int sum = Integer.MAX_VALUE;

        for(Run run : runCollection.runs) {
            int count = run.obstacleTimes.stream().mapToInt(Integer::intValue).sum();
            if(run.complete ==true && count < sum) {
                sum = count;
            }
        }

        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        Course course = new Course("ABC", 4);
        Run run1 = new Run(course, true, Arrays.asList(3,4,5,6));
        Run run2 = new Run(course, true, Arrays.asList(4,4,4,5));
        Run run3 = new Run(course, true, Arrays.asList(4,5,4,6));
        Run run4 = new Run(course, false, Arrays.asList(5,5,3));

        RunCollection runCollection = new RunCollection(course, Arrays.asList(run1,run2,run3,run4));

        bestOfBests(runCollection);
    }
    
}

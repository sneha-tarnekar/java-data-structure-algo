package Problems;

//  Given a time in -hour AM/PM format, convert it to military (24-hour) time.
//  Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
//        - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
public class TimeConversion {

    public static void main(String[] args) {
        String input = "07:05:45PM";
        String output = timeConversion(input);
        System.out.println("Output : " + output);
    }

    // Approach 1
    public static String timeConversion(String s) {

        if (s.startsWith("12:") && s.endsWith("AM")) {
            s = s.replace("12", "00");
            s = s.replace("AM", "");
            return s;
        } else if (!s.startsWith("12") && s.endsWith("PM")) {
            Integer hour = Integer.parseInt("" + s.charAt(0) + s.charAt(1));
            Integer newHour = hour + 12;

            s = s.replace("" + s.charAt(0) + s.charAt(1), newHour.toString());
            s = s.replace("PM", "");
            return s;
        }
        if (s.endsWith("PM")) {
            s = s.replace("PM", "");
            return s;
        }

        s = s.replace("AM", "");
        return s;
    }

    // Approach 2
    public static String timeConversion2(String s) {

        String period = s.substring(s.length() - 2);
        String time = s.substring(0, s.length() - 2);
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        int second = Integer.parseInt(parts[2]);

        if (period.equals("AM") && hour == 12) {
            hour = 0;
        } else if (period.equals("PM") && hour != 12) {
            hour += 12;
        }

        return String.format("%02d:%02d:%02d", hour, minute, second);

    }

}

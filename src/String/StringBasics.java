package String;

import java.util.Scanner;

//  Given two strings of lowercase English letters,  and , perform the following operations:
//  Sum the lengths of  and .
//  Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
//  Capitalize the first letter in  and  and print them on a single line, separated by a space.
public class StringBasics {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length() + B.length());

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(toTitleCase(A) + " " + toTitleCase(B));
    }

    public static String toTitleCase(String str) {
        return String.valueOf(str.charAt(0)).toUpperCase() + str.subSequence(1, str.length());
    }

}

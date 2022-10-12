import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first string: ");
        String str1 = scan.nextLine();
        int str1Len = str1.length();
        System.out.println("The length of your first string is: " + str1Len);
        if (str1Len%2 == 0) {
            String half1 = str1.substring(0,(str1Len/2));
            String half2 = str1.substring(str1Len/2);
            System.out.println("The first half of your string is:" +half1);
            System.out.println("The second half of your string is:" +half2);
        } else {
            String half1 = str1.substring(0, (str1Len/2));
            String half2 = str1.substring((str1Len/2));
            System.out.println("The first half of your string is:" +half1);
            System.out.println("The second half of your string is:" +half2);
        }

        System.out.println("Enter your second string: ");
        String str2 = scan.nextLine();
        int str2Len = str2.length();
        if (str1Len>str2Len) {
            System.out.print("The length of "+str1+" is longer.\n");
        } else {
            if (str1Len < str2Len) {
                System.out.print("The length of " + str2 + " is longer.\n");
            } else {
                System.out.println("The length of both strings are the same.");
            }
        }

        if (str1.equals(str2)) {
            System.out.println("These two strings are the same sequence of characters.");
        } else {
            if (str1.compareTo(str2)<0) {
                System.out.println(str1 + " comes before " + str2+".");
            } else {
                System.out.println(str1 + " comes after " + str2+".");
            }
        }

        int index = str1.indexOf(str2);
        if (index == -1) {
            System.out.println("String 2 is not found in String 1");
        } else {
            System.out.println("The index of String 2 in String 1 is "+index+".");
        }
    }
}

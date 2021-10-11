package rev;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two strings to check if they are a rotation of each other:");
        String one = sc.next();
        String two = sc.next();

        boolean rotate;
        if (one.length() == two.length())
            rotate = isRotated(one,two);
        else {
            System.out.println("Strings must be same length");
            rotate = false;
        }


        System.out.println("The rotation is: " + rotate);
    }


    static boolean isRotated(String str1, String str2)
    {
        // Combines the first string twice and checks if second string is found anywhere within it
        // str1 = "abcdabcd"
        // str2 = "dabc"
        // str1 contains str2 within it
        return  (str1 + str1).contains(str2);
    }
}

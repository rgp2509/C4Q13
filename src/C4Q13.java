//Write a program that asks the user to enter the size of a triangle the first line will have one asterisk, the next two, and so on, with each line having one more asterisk than the previous line, up to the number entered by the user. On the next line write one fewer asterisk and continue by decreasing the number of asterisks by 1 for each successive line until only one asterisk is displayed.
//
//        For example, if the user enters 3, the output would be
//
//        *
//
//        **
//
//        ***
//
//        **
//
//        *

// @Author Ryan Pletzer
// @Class Csc 201
import java.util.Scanner;
public class C4Q13 {
    public static void main(String[] args) {
        System.out.println("Welcome to the triangle draw tool; enter how high you want me to draw it now:");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        // upper from start to peak of triangle
        for (int i = 0; i < input; i++) {
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
        }
        // lower from one after peak to base/end of the triangle.
        for (int i = 1; i < input; i++) {
            System.out.println();
            for (int k = input; k > i; k--) {
                System.out.print("*");
            }
        }
    }
}

import java.util.Scanner;
class Pattern
{
public static void main(String[] args) {
        int rows = 5; // Number of rows you want in your pattern

        for(int i = 1; i <= rows; i++) {
            // Printing stars in each row
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after printing all stars in a row
            System.out.println();
        }
    }
}
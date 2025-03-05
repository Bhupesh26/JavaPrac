import java.util.Scanner;

class Avgthreenum {
    public static int avgs(int num1, int num2, int num3)
    {
        int sum,tavg;
        sum = num1 + num2 + num3;
        tavg = sum / 3;
        return tavg;
    }
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no. ");
        a = sc.nextInt();
        System.out.println("Enter 2nd no. ");
        b = sc.nextInt();
        System.out.println("Enter 3rd no. ");
        c = sc.nextInt();
        int result = avgs(a,b,c);
        System.out.println("Average of "+a+", "+b+" and "+c+" is " +result);
    }
}
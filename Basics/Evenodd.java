import java.util.Scanner;
class Evenodd
{
    public static String oddcheck(int num1)
    {
        if(num1 % 2 == 0)
        {
            return "Even";
        }
        else
        {
            return "Odd";
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter a number");
        a = sc.nextInt();
        String result = oddcheck(a);
        System.out.println(result);
    }
}
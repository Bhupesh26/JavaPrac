import java.util.Scanner;
class Pnz
{
    public static String checkpnz(int num1)
    {
        if(num1 > 0)
        {
            return "Positive";
        }
        else if(num1 < 0)
        { 
            return "Negative";
        }
        else
        {
            return "Zero";
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter a number");
        a = sc.nextInt();
        sc.close();
        String result = checkpnz(a);
        System.out.println(result);
    }
}
import java.util.Scanner;

class Twosumfunc
{
    public static int add(int a,int b)
    {
        return a + b;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter 1st number");
        num1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        num2 = sc.nextInt();
        int sum = add(num1,num2); 
        System.out.println("Addition of "+num1+" and " +num2+ "is: "+sum);
    }
}
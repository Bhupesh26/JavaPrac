import java.util.Scanner;
class Swapno
{
    public static int[] swaps(int num1, int num2)
    {
        int tmp;
        int ans[] = new int[2];
        ans[0] = num2;
        ans[1] = num1; 
        return ans;
    }
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no.");
        a = sc.nextInt();
        System.out.println("Enter 2nd no.");
        b = sc.nextInt();
        sc.close();
        int result[] = swaps(a,b);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}

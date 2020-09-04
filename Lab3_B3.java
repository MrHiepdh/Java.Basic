package junior;
import java.util.Scanner;
public class Lab3_B3{
    public static void main(String [] args){
        Scanner s =new Scanner(System.in);
        int n;
        System.out.println("Enter the high of triangle : ");
        n = s.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n - i; j++)
            System.out.printf("  ");
        for (int j = i; j <= 2 * i - 1; j++)
        {
            if (j < 10)
            System.out.printf("%d ",j);
            else 
            System.out.printf("%d ", j - 10);
        }
        for (int j = 2 * i - 2; j >= i; j--)
        {
            if (j < 10)
            System.out.printf("%d ",j);
            else 
            System.out.printf("%d ", j - 10);
        }
        System.out.printf("\n");
    }
    s.close();
}
}
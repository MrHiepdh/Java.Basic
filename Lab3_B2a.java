package Junior;
import java.util.Scanner;
public class Lab3_B2a{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n,i,j;
        n=s.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
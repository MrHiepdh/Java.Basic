package Junior;
import java.util.Scanner;
public class Lab3_B2c {
    public static void main(String [] args){
        Scanner s =new Scanner(System.in);
        int n,j,i;
        n = s.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<2*n-1;j++){
                if(j<=n-1+i&&j>=n-1-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        s.close();
    }
}

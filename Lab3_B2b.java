package Junior;
import java.util.Scanner;
public class Lab3_B2b {
    public static void main(String [] args){
        Scanner s =new Scanner(System.in);
        int i,j,n;
        n = s.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<n-i;j++){
                System.out.print("$");
            }
            System.out.print("\n");
        }
        s.close();
    }
}

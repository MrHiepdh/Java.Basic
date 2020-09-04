package Junior;
import java.util.Scanner;
public class Lab3_B3 {
    public static void main(String []args){
        Scanner s =new Scanner(System.in);
        int i,j,n;
        int flag;
        System.out.println("Enter the high of triangle : ");
        n=s.nextInt();
        for(i=1;i<=n;i++){
            flag=i%10;
            for(j=0;j<=2*n-1;j++){
                if(j>=n-i&&j<n){
                    if(flag>9){
                        flag=0;
                    }
                    System.out.printf("%d ",flag);
                    flag++;
                }
                else if(j==n+1&&i!=1){
                    flag-=2;
                    System.out.printf("%d ",flag);
                    flag--;
                }
                else if(j>n+1&&j<n+i){
                    if(flag<0){
                        flag=9;
                    }
                    System.out.printf("%d ",flag);
                    flag--;
                }
                else if(j>=n+i||j<n-i){
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }  
    }
}


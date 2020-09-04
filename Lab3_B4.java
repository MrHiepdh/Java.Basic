package Junior;
import java.util.Scanner;
public class Lab3_B4 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n,result=1;
        n = s.nextInt();
        if(n==0||n==1){
            result=1;
        }
        else{
            for(int i=1;i<=n;i++){
                result*=i;
            }
        }
        System.out.printf("%d",result);
        s.close();
    } 
}

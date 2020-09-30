package junior;
import java.util.Scanner;
public class Lab6_B1 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int [] number;
        number =new int[10];
        for(int i=0;i<10;i++){
            number[i]=s.nextInt();
        }
        for(int i=0;i<10;i++){
            System.out.print(number[i]+" ");
        }
        s.close();
    }
    
}

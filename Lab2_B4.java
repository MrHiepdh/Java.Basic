package Junior;
import java.util.Scanner;
public class Lab2_B4 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int [] temp = new int[4];
        for (int i = 0; i < 4; i++) {
            temp[i] = s.nextInt();
        }
        int max=temp[0];
        for(int i=1;i<4;i++){
            if(max<temp[i]){
                max=temp[i];
            }
        }
        System.out.print(max);
        s.close();
    }
    
}
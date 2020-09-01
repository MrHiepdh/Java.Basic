package Junior;
import java.util.Scanner;
public class Lab2_B5 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int moth,year;
        moth = s.nextInt();
        year = s.nextInt();
        switch(moth){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.println("30 days");break;
            case 4: 
            case 6: 
            case 9: 
            case 11: System.out.println("31 days");break;
            case 2:
                if(year%4==0){
                    System.out.println("29 days");break;
                }
                else{
                    System.out.println("28 days");break;
                }
        }
        s.close();
}    
}
package Junior;    
import java.util.Scanner;
    public class Lab2_B3 {
        public static void main(String [] args){
            String color;
            Scanner s = new Scanner(System.in);
            color =s.nextLine();
            if(color.compareToIgnoreCase("r")==0){
                System.out.print("\nRed");
            }
            else if(color.compareToIgnoreCase("g")==0){
                System.out.print("\nRGreen");
            }
            else if(color.compareToIgnoreCase("b")==0){
                System.out.print("\nBlue");
            }
            else{
                System.out.print("\nBlack");
            }
            s.close();
        }
    }
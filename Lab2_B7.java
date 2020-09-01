package Junior;
import java.util.Scanner;
public class Lab2_B7{
    public static boolean equilateral(int a,int b,int c){
        if(a==b&&b==c)
            return true;
        else
        return false;
    }
    public static boolean isosceles(int a,int b,int c){
        if((a==b)||(b==c)||(a==c))
            return true;
        else
            return false;
    }
    public static boolean right_triangle(int a,int b,int c){
        if((a*a+b*b==c*c)||(a*a+c*c==b*b)||(b*b+c*c==a*a))
            return true;
        else    
            return false;
    }
    public static void main(String [] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter 3 lenghts : ");
        int a,b,c;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        if((a<=0)||(b<=0)||(c<=0)||Math.abs(a-b)>c){
            System.out.println("Not triangle. ");//triangle:tam giác
        }
        else if(Math.abs(a-b) < c && c < (a+b)){
            if(equilateral(a, b, c)){
                System.out.println("Equilateral triangle.");//equilateral:đều
            }
            else if(isosceles(a, b, c)&&right_triangle(a, b, c)){
                System.out.println("Isosceles right triangle.");//isossceles:cân
            }
            else if(!isosceles(a, b, c)&&right_triangle(a, b, c)){
                System.out.println("Right triangle.");
            }
            else if(!right_triangle(a, b, c)&&isosceles(a, b, c)){
                System.out.println("Isosceles triangle.");
            }
            else{
                System.out.println("Normal triangle.");
            }            
        }
        s.close();
    }
}
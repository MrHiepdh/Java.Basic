package Junior;
import java.util.Scanner;
public class Lab3_B5 {
    public static final String repo ="0123456789ABCDEF";

    public static String result(int a,int b){
        StringBuilder s= new StringBuilder();
        int x=0;
        while(a>0){
            x=a%b;
            a/=b;
            s.append(repo.charAt(x));
        }
        return s.reverse().toString();
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("");
        int choice;
    do{
        System.out.println("1. Convert to binary number.");
        System.out.println("2. Convert to octal number.");
        System.out.println("3. Convert to hexa number.");
        System.out.println("4. Exit.");
        choice = s.nextInt();
        switch(choice){
            case 1:{
                System.out.println("Enter the number : ");
                int n;
                n=s.nextInt();
                System.out.println("Result : "+result(n, 2));  
                break;
            }
            case 2:{
                System.out.println("Enter the number : ");
                int n;
                n=s.nextInt();
                System.out.println("Result : "+result(n, 8));           
                break;      
            }
            case 3:{
                System.out.println("Enter the number : ");
                int n;
                n=s.nextInt();
                System.out.println("Result : "+result(n, 16));  
                break;
            }
            case 4:{
                break;
            }
        }
    }while(choice!=4);
    s.close();
    }
}



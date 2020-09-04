package Junior;
import java.util.Scanner;
public class Lab3_B7 {
    public static void main(String [] args){
        Scanner s =new Scanner(System.in);
        double firstMoney,months,year_rate,monthly_interest,monthly_rate,p=1;
        System.out.println("-------AGRIBANK HA DONG Branch-------");
        System.out.print("Enter the money (VND): ");
        firstMoney=s.nextInt();
        System.out.print("Enter the interest rate (%/year) : ");
        year_rate = s.nextDouble();
        System.out.print("Enter the months : ");
        months =s.nextInt();
        monthly_rate=(year_rate/12)/100;
       
        System.out.println("-------AGRIBANK HA DONG Branch-------");
        System.out.printf("Type of money : VND   Period : %.0f   Form : compounding   Interest rate : %.3f",months,year_rate);
        System.out.print("\nMonth |     Deposíts     |  Monthly rate");
        do{
            monthly_interest=monthly_rate*firstMoney;
            System.out.printf("\n  %.0f   |   %.3f   |   %.3f    ",p,firstMoney,monthly_interest);
            firstMoney+=monthly_interest;
            p++;
            months--;
        }while(months>0);
        s.close();
    }
}

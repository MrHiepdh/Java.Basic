package Junior;
import java.util.Scanner;
public class Lab2_B6{
    public static void main(String [] args){
        Scanner s =new Scanner(System.in);
        int index1,index2,charge_fee,excess_fee,number_out,number_quota;
        int money1=1000,quota=50,money_quota=230,money_out=1,sum=0;//quota:định mức
        index1 = s.nextInt();
        index2 = s.nextInt();
        int used=index2-index1;
        if(used>quota){
            number_out=used-quota;
            number_quota=quota;
        }
        else{
            number_out=0;
            number_quota=used;
        }
        if(number_out<50){
            money_out=480;
        }
        else if(number_out<100){
            money_out=700;
        }
        else if(number_out>=100){
            money_out=900;
        }
        charge_fee=number_quota*money_quota;
        excess_fee=number_out*money_out;
        sum=charge_fee+excess_fee+money1;
        System.out.println("Index1 : "+ index1);
        System.out.println("Index2 : "+ index2);
        System.out.println("Charge Fees : "+ charge_fee);
        System.out.println("Excess Fees : "+ excess_fee);
        System.out.println("Sum Fees : "+ sum);        
    s.close();
    }
}
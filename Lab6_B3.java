package junior;
import java.util.Scanner;
public class Lab6_B3 {
    public static Boolean perfectNumber(int n){
        if(n<6)
            return false;
        int sum=0;
        for(int i=2;i<n;i++)
            if(n%i==0)
                sum+=i;
        if(sum+1==n)
            return true;
        else
            return false;
    }
    public static Boolean prime(int n){
        if(n<2)
            return false;
        for (int i = 2; i * i <= n; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n;
        n= s.nextInt();
        int []  a;
        a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        System.out.println("Mảng trước sắp xếp : ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        for(int i=0;i<n-1;i++)//sắp xếp mảng bằng thuật toán
            for(int j=n-1;j>i;j--)
                if(a[j]>a[j-1]){
                    int tem=a[j];
                    a[j]=a[j-1];
                    a[j-1]=tem;
                }
        System.out.println("\nMax : "+a[0]);//in ra Max
        System.out.println("Min : "+a[n-1]);//in ra Min
        System.out.print("Prime numbers : ");
        for(int i=0;i<n;i++)//in các số nguyên tố
                if(prime(a[i]))
                    System.out.print(a[i]+" ");
        System.out.print("\nMảng sau sắp xếp : ");
        for(int i=0;i<n;i++)//mảng sau sắp xếp
            System.out.print(a[i]+" ");
        System.out.print("\nPerfect Numbers : ");
        for(int i=0;i<n;i++)//in các số hoàn hảo
            if(perfectNumber(a[i]))
                System.out.print(a[i]+" ");
        s.close();
    }  
}

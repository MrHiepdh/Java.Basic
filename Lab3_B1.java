package Junior;
public class Lab3_B1 {
    public static void main(String [] args){
        for(int i=101;i<999;i++){
            int sum=0;
            int n=i;
            while(n>0){
                int m=n%10;
                sum+=m;
                n/=10;
            }
            if(sum%2 ==0){ 
                System.out.printf("%d ",i);
            }
        }
    }
}
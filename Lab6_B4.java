package junior;
import java.util.Scanner;
public class Lab6_B4 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n,m;
        n = s.nextInt();
        m = s.nextInt();
        int [][]  matrix;
        matrix = new int [n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                matrix[i][j]=s.nextInt();
        System.out.println("Mảng ban đầu :");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                System.out.print(matrix[i][j]+" ");
            System.out.print("\n");
        }
        for(int j=0;j<m;j++)//sắp xếp lại mảng tăng dần theo cột
            for(int i=0;i<n;i++)
                for(int h=n-1;h>i;h--)
                    if(matrix[h][j]<matrix[h-1][j]){
                        int tem=matrix[h][j];
                        matrix[h][j]=matrix[h-1][j];
                        matrix[h-1][j]=tem;
                    }
        System.out.println("Mảng sau sắp xếp :");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                System.out.print(matrix[i][j]+" ");
            System.out.print("\n");
        }
        if(m!=n)
            System.out.println("Basic Matrix.");
        else{
            int sum=0;
            for(int i=0;i<n;i++)
                for(int j=0;j<m;j++)
                    if(j==i||j==n-1-i)
                        sum+=matrix[i][j];
        System.out.println("Square Matrix :");
        System.out.println(sum);
        }
        s.close();
    }
}

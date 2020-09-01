package Junior;
import java.util.Scanner;
public class Lab2_B1 {
	public static void main(String[] args) {
		int sum,days,hours,minutes,seconds;
		Scanner s = new Scanner(System.in);
		System.out.print("enter integer number : ");
		sum =s.nextInt();
		days=sum/86400;
		hours=(sum%86400)/3600;
		minutes=((sum%86400)%3600)/60;
		seconds=sum%60;
		System.out.printf("%d : %d : %d : %d",days,hours,minutes,seconds);
        s.close();
	}

}

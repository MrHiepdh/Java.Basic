package Junior;
import java.util.Scanner;
public class Lab2_B2 {
	public static void main(String[] args) {
		String Id,FullName;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Id : ");
		Id = s.nextLine();
		System.out.print("Enter FullName : ");
		FullName = s.nextLine();
		System.out.print("Enter AverageSocer : ");
		double AverageSocer = s.nextDouble();
		System.out.print("Id : "+Id);
		System.out.print("\nFullName : "+FullName);
		if(0<= AverageSocer &&  AverageSocer <5)
			System.out.println("\nFail");
		if(5<= AverageSocer &&  AverageSocer <7)
			System.out.println("\nPassed");
		if(7<= AverageSocer &&  AverageSocer <8)
			System.out.println("\nGood");
		if(8<= AverageSocer &&  AverageSocer <=10)
			System.out.println("\nExcellent");
		s.close();
	}
}

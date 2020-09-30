package junior;
import java.util.Scanner;
public class String_Lab6 {
    public static boolean check(char i){
            if(i=='U'||i=='E'||i=='O'||i=='A'||i=='I'||i=='u'||i=='e'||i=='o'||i=='a'||i=='i')
                return true;
            else
                return false;
    }
    public static void main(String [] args){
    String str ,s1;
    Scanner s = new Scanner(System.in);
    str = s.nextLine();
    int count=0;
    System.out.println("String after upper case: "+str.toUpperCase());
    for(int i=0;i<str.length();i++)
        if(str.charAt(i)==' ')
            count++;
    System.out.println(count+1+" words!");
    int vowel = 0,consonat = 0 ;
    for(int i=0;i<str.length();i++)
        if(str.charAt(i)!=' '){
            if(check(str.charAt(i)))
                vowel++;
            else 
                consonat++;
        }
    System.out.println("Vowel : "+vowel);
    System.out.println("Consonat : "+consonat);
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)!= ' ')
            System.out.print(str.charAt(i));
        else
            System.out.print("\n");
        }
    System.out.println();
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)!= ' ')
            System.out.print(str.charAt(i));
        else
            System.out.print("-");
        }
    System.out.println();
    System.out.println("Enter the string to add: ");
    s1 = s.nextLine();
    for(int i=0;i<5;i++)
        if(str.charAt(i)!= ' ')
            System.out.print(str.charAt(i));
    System.out.print(s1);
    for(int i=5;i<str.length();i++)
        if(str.charAt(i)!= ' ')
            System.out.print(str.charAt(i));
    s.close();
    }
}

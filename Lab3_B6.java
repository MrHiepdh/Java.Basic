package Junior;
import java.util.Scanner;
public class Lab3_B6 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Menu of Japa Restaurant.");
        int choice;
    do{
        System.out.println("1. Edo-mae zushi.");
        System.out.println("2. Takoyaki.");
        System.out.println("3. Okonomiyaki.");
        System.out.println("4. Chanpuru.");
        System.out.println("5. Miso katsu.");
        System.out.println("6. Exit.");
        System.out.println("Please choose a item.");
        choice = s.nextInt();
        switch(choice){
            case 1:{
                System.out.println("Edo-mae zushi : 50$ ");
                break;
            }
            case 2:{
                System.out.println("Takoyaki : 45$ ");
                break;
            }
            case 3:{
                System.out.println("Okonomiyaki : 75$ ");
                break;
            }
            case 4:{
                System.out.println("Chanpuru : 30$ ");
                break;
            }
            case 5:{
                System.out.println("Miso katsu : 60$ ");
                break;
            }
            case 6:{
                break;
            }
        }
    }while(choice!=6);
        s.close();
    }
}



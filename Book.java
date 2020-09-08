package Junior;
import java.util.Scanner;
    public class Book{
        private String bookID,title,publiher,author;
        private int numberpages;
        private double price,discount;
        public void input(){
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the BookID : ");
            bookID = s.nextLine();
            System.out.print("\nEnter the Title : ");
            title = s.nextLine();
            System.out.print("\nEnter the Publiher : ");
            publiher = s.nextLine();
            System.out.print("\nEnter the Author : ");
            author = s.nextLine();
            System.out.print("\nEnter the Number Of Pages : ");
            numberpages = s.nextInt();
            System.out.print("\nEnter the Prices (VND) : ");
            price = s.nextDouble();
            System.out.print("\nEnter the Discount (%): ");
            discount = s.nextDouble();
            System.out.print("\nPlease wait a moment!");
            s.close();
        }
        public void display(){
            System.out.print("\n");
            System.out.print("Thanks for waiting!");
            System.out.print("BookID : "+bookID);
            System.out.print("The Title Of Book : "+ title);
            System.out.print("Publiher : "+publiher);
            System.out.print("Author : "+author);
            System.out.print("Number Of Pages : "+ numberpages);
            System.out.print("Prices : "+price);
            System.out.print("Discount (%) : "+discount);
            System.out.print("Discount Money : "+Discountmoney());
        }
        public double Discountmoney(){
            return price*discount/100;
        }
    public static void main(String [] args) {
        Book book=new Book();
        book.input();
        book.display();
        }       
    }

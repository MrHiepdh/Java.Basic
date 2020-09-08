package Junior;
import java.util.Scanner;
public class Post {
    private String postId,titel,summary,publiher,author;
    public Post(){
    }
    public Post(String postId,String titel,String summary,String publiher,String author){
        this.postId   = postId;
        this.titel    = titel;
        this.summary  = summary;
        this.publiher = publiher;
        this.author   = author;
    }
    public String get_postId(){
        return postId;
    }
    public void set_postId(String postId){
        this.postId =postId;
    }
    public String get_titel(){
        return titel;
    }
    public void set_titel(String titel){
        this.titel = titel;
    }
    public String get_summary(){
        return summary;
    }
    public void set_summary(String summary){
        this.summary =summary;
    }
    public String get_publiher(){
        return publiher;
    }
    public void set_publiher(String publiher){
        this.publiher = publiher;
    }
    public String get_author(){
        return author;
    }
    public void set_author(String author){
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void display(){
        System.out.print("\nPost ID : "+get_postId());
        System.out.print("\nPost ID : "+get_author());
        System.out.print("\nPost ID : "+get_publiher());
        System.out.print("\nPost ID : "+get_summary());
        System.out.print("\nPost ID : "+get_titel());
    }
    public static void main(String [] args){
        Post post = new Post();
        Scanner s = new Scanner(System.in);
        System.out.print("\nPost ID : ");
        post.postId = s.nextLine();
        post.set_postId(""+post.postId);
        System.out.print("\nAuthor : ");
        post.author = s.nextLine();
        post.set_author(""+post.author);
        System.out.print("\nPubliher : ");
        post.publiher = s.nextLine();
        post.set_publiher(""+post.publiher);
        System.out.print("\nSummary : ");
        post.summary = s.nextLine();
        post.set_summary(""+post.summary);
        System.out.print("\nTitel : ");
        post.titel =s.nextLine();
        post.set_titel(""+post.titel);
        post.display();
        s.close();
    }
}




    

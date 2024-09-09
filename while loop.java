import java.util.Scanner;
public class main{
    public static void main(String[]args){
        
    
    Scanner Scanner=new Scanner(System.in);
    String name="";
    while(name.isBlank()) {
        System.out.print("enter your name:");
        name=Scanner.nextLine();
    }
    System.out.println("hello"+ name);
    }
}
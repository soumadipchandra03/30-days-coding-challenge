public class main{
    public static void main(String[] args){
        String x = "water";
        String y= "juice";
        String temp;
        temp = x;
        x=y;
        
        y=temp;
        
        System.out.println("x:" +x);
        System.out.println("y:" +y);

    }
}


import java.util.*;
public class Dowhileloop {
    public static void main(String []args){
        Scanner s= new Scanner(System.in);
        int a=s.nextInt(),b;
        b=1;
        do{
            System.out.println(b+" ");
            b+=1;
        }
        while(b<=a);
    }
}


import java.util.*;
public class Numbercrunching {
    public static void main(String[]args){
     Scanner s=new Scanner(System.in);
     int a= s.nextInt();
     while(a!=0){
        System.out.println(a%10+" ");
        a/=10;
     }
     System.out.println(a);
    }
}

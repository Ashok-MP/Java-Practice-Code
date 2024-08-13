
import java.util.*;
 class While2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int i;
        for( i=2;i*i<=a;i++)
            {
                if(a%i==0);
                break;
            }
            
            if(i*i>a){
                System.out.println(" prime");
            }
            else{
                System.out.print("not");
            }
        }

    }



import java.util.*;
public class Days {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int days =s.nextInt();
        int years =days/365;
        int rea_days=days%365;
        int week=rea_days/7;
        int rea=rea_days%7;
        System.out.println(years);
        System.out.println(rea_days);
        System.out.println(week);
        System.out.println(rea);
        

    }
}

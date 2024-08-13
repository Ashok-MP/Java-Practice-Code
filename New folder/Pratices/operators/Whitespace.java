

import java.util.Scanner;

class Whitespace {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int ws =s.nextInt();
        int ps =s.nextInt();
        float a =s.nextFloat();
        String ff ="%"+ws+"."+ps+"f";
        System.out.printf(ff,a);
        
    }
}

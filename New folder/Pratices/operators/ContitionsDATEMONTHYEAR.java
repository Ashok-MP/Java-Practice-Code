

import java .util.*;
class ContitionsDATEMONTHYEAR{
    public static void main(String[]args){
        Scanner s =new Scanner(System.in);
        int days=s.nextInt();
        int months=s.nextInt();
        int years=s.nextInt();
        if(years>=1000 && years<=9999)
         {
            if(months>=1 && months<=12)
            {
               if((days >=1 && days<=31) &&(months==1 || months==3 || months==5 || months==7 || months ==8 || months ==10 || months ==12))
                 {
                    System.out.println("valid");
                 }
                else if((days>=1 && days <=30)&&(months ==4|| months==6|| months==9||months==11))
                 {
                System.out.println("valid");
                 }
                else if((days >=1 && days <=28) && months ==2){
                    System.out.println("valid");
                 }
                else if(((days ==29 ) && (months==2)) && ((years%4==0)) &&((years%100==0))|| ((years%400==0)))
                
                {
                    System.out.println("valid");
                }
               else{
                System.out.println("invalid");
               }
            }
            else
            {
                System.out.println("invalid");
            }
        }
        else 
            {
                System.out.println("invalid");
            }
        
        }
}

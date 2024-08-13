

import java.util.Scanner;

class Arraymax {
    public static void main(String []args){
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int []arr=new int [a];
        int i;
        
        for(i=0;i<a;i++){
            arr[i]=s.nextInt();
        }
        int min= arr[0];
        for(i=0;i<a;i++){

            if(arr[i]<min)
            min=arr[i];
        }
        System.out.println(min);
    }
}
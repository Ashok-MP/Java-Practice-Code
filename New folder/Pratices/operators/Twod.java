import java.util.*;
public class Twod {
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        int r=s.nextInt();
       
        int []arr=new int [r];
        for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
            arr[i]=s.nextInt();
          }
        }
        for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
              System.out.println(arr[j]);
            }
          }
        }
      }
    }
       


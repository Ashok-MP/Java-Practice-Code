import java.util.Scanner;

class Arrayreverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int []arr=new int[a];
        int i;
        for( i=0;i<a;i++)
        arr[i]=s.nextInt();
    
 
    
    for(i=a-1;i>=0;i--){
        System.out.print(arr[i]+" ");
    }
}
}

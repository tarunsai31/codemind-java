import java.util.*;
public class tarun{
    public static void main(String args[]){
        Scanner gt=new Scanner(System.in);
        int n,r,s=0;
        n=gt.nextInt();
        while(n>9){
            r=n%10;
            n=n/10;
            n=n+r;
        }
        System.out.println(n);
    }
}
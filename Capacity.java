import java.util.*;
public class tarun{
    public static void main(String args[]){
        Scanner gt=new Scanner(System.in);
        int capacity,b,s,t,KB;
         b=gt.nextInt();
         s=gt.nextInt();
         t=gt.nextInt();
         capacity=((2*s*t*b*512)/(1024)) ;
         System.out.println(capacity+" KB");
    }
}
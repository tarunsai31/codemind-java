import java.util.*;
public class tarun{
    public static void main(String args[]){
        Scanner gt=new Scanner(System.in);
        int n;
        n=gt.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=gt.nextInt();
        }int sum=0;
        for(int eachElement:a){
            sum+=eachElement;
        }
        System.out.println(sum);
    }
}
import java.util.*;
public class tarun{
    public static void main(String args[]){
        Scanner gt=new Scanner(System.in);
        double P,R,T,CI;
        P=gt.nextDouble();
        R=gt.nextDouble();
        T=gt.nextDouble();
        CI=(double)(P*(Math.pow((1+R/100),T))-P);
        System.out.printf("%.2f",CI);
       
    }
}
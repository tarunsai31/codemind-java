import java.util.*;
public class tarun{
    public static void main(String args[]){
        Scanner gt=new Scanner(System.in);
        int Num1,Num2;
        Num1=gt.nextInt();
        Num2=gt.nextInt();
        double Average;
        Average=(double)(Num1+Num2)/2;
        System.out.printf("Average of %d and %d is: %.2f",Num1,Num2,Average);
    }
}
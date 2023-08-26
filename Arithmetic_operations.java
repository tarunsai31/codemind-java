import java.util.*;
public class tarun{
    public static void main(String args[]){
        Scanner gt=new Scanner(System.in);
        int m,n,Sum,Difference,Product,Quotient,Remainder;
        m=gt.nextInt();
        n=gt.nextInt();
        Sum=m+n;
        Difference=m-n;
        Product=m*n;
        Quotient=m/n;
        Remainder=m%n;
        System.out.printf("Sum:%d
Difference:%d
Product:%d
Quotient:%d
Remainder:%d",Sum,Difference,Product,Quotient,Remainder);
    }
}
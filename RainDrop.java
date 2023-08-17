import java.util.*;
public class tarun{
    public static void main(String args[]){
        Scanner gt= new Scanner(System.in);
        int n;
        n=gt.nextInt();
        if(n%3==0 ){
            System.out.printf("Pling");
        } if(n%5==0 ){
            System.out.printf("Plang");
        } if(n%7==0 ){
            System.out.printf("Plong");
        } if(n%7!=0 && n%3!=0 && n%5!=0){
            System.out.println(n);
        }
        
    }
}
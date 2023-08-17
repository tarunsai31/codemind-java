import java.util.*;
public class tarun{
    public static void main(String args[]){
        Scanner gt=new Scanner(System.in);
        int a,b,c;
        a=gt.nextInt();
        b=gt.nextInt();
        c=gt.nextInt();
        if(a>50 && b>60 && c>100 ){
            System.out.print(10);
        }else if(a>50 && b>60  ){
            System.out.print(9);
        }else if(c>100 && b>60  ){
            System.out.print(8);
        }else if(a>50 && c>100 ){
            System.out.print(7);
        }else if(a>50 || b>60 ||c>100 ){
            System.out.print(6);
        }else{
            System.out.print(5);
        }
    }
}
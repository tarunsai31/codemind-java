import java.util.*;
public class tarun{
    public static void main(String args[]){
        Scanner gt= new Scanner (System.in);
        int n,m;
        n = gt.nextInt();
        m = gt.nextInt();
        int[][] a = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j] = gt.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum+= a[i][j];
            }
        }
        System.out.println(sum);
}
}

import java.util.*;

public class A1901{
    public static void LineTrip(int n,int x,int station[]){
          
           int ans=station[0];
           for(int i=1;i<station.length;i++){
             ans=Math.max((station[i]-station[i-1]),ans);

           }
           ans=Math.max(ans, 2*(x-station[n-1]));
        }
    
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            int n=scanner.nextInt();
            int k=scanner.nextInt();
            int station[]=new int[n];
            for(int i=0;i<n;i++){
                station[i]=scanner.nextInt();
            }
            LineTrip(n,k,station);
        }
        scanner.close();
    }
}

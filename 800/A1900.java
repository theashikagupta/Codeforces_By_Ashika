import java.util.*;

public class A1900{
    public static void CoverInWater(int m,String k){
        boolean flag=false;
        int action=0;
        for(int i=0;i<m;i++){
            if(k.charAt(i)=='.' && i+1<m && k.charAt(i+1)=='.' && i+2<m && k.charAt(i+2)=='.'){
                flag=true;
                break;
            }
            if(k.charAt(i)=='.'){
                action++;
            }
        }
        if(flag){
            System.out.println("2");
        }else{
            System.out.println(action);
        }   
           
    }
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        int t=scanner.nextInt();
        while(t-->0){
            int m=scanner.nextInt();
            String k=scanner.next();
            CoverInWater(m, k);
        }
        scanner.close();
    }
}

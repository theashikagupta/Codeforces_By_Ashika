
import java.util.*;

public class A1903 {
    public static void Boxes(long n,long k,long boxes[]){
            long[] sortedBoxes=boxes.clone();
            Arrays.sort(sortedBoxes);
            if(k==1){
                if (Arrays.equals(boxes,sortedBoxes)){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                    System.out.println("YES");
                }
        }
    
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            long n=scanner.nextLong();
            long k=scanner.nextLong();
            long boxes[]=new long[(int)n];
            for(int i=0;i<n;i++){
                boxes[i]=scanner.nextLong();
            }
            Boxes(n,k,boxes);
        }
        scanner.close();
    }
}

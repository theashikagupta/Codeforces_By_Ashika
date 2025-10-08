import java.util.*;
public class A1890 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // len of array
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();  // elements of array
            }

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int x : arr) {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }

            if (map.size() >= 3) {
                System.out.println("No");
            } else if (map.size() == 1) {
                // all elements same -> good array
                System.out.println("Yes");
            } else {
                Iterator<Integer> it = map.values().iterator();
                int freq1 = it.next();
                int freq2 = it.next();

                if (Math.abs(freq1 - freq2) > 1) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                }
            }
        }
    }
}

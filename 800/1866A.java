import java.util.Scanner;

public class AmbitiousKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean hasZero = false;
        int minAbs = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 0) {
                hasZero = true;
            } else {
                minAbs = Math.min(minAbs, Math.abs(arr[i]));
            }
        }

        if (hasZero) {
            System.out.println(0);
        } else {
            System.out.println(minAbs);
        }

        sc.close();
    }
}

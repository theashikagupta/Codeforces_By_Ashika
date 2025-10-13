import java.util.*;

public class A1901 {
    public static void LineTrip(int n, int x, int station[]) {
        int ans = station[0]; // distance from start to first station
        for (int i = 1; i < n; i++) {
            ans = Math.max(ans, station[i] - station[i - 1]); // max distance between stations
        }
        ans = Math.max(ans, 2 * (x - station[n - 1])); // distance from last station to end
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt(); // total length of the line
            int station[] = new int[n];
            for (int i = 0; i < n; i++) {
                station[i] = scanner.nextInt();
            }
            LineTrip(n, k, station);
        }
        scanner.close();
    }
}

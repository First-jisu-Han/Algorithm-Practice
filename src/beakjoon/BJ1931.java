
package beakjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BJ1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] time = new int[N][2];
        for(int i = 0; i < N; i++) {
            time[i][0] = sc.nextInt();	// 시작시간
            time[i][1] = sc.nextInt();	// 종료시간
        }
        System.out.print(maxSelect(time));
    }

    public static int maxSelect(int arr[][]) {
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[1] == b[1]) {
                    return a[0] - b[0];
                } else {
                    return a[1] - b[1];
                }
            }
        });
        int last = 0;
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (last <= arr[i][0]) {
                    last = arr[i][1];
                    cnt += 1;
                }
            }
        return cnt;

    }
}



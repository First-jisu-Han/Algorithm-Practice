package algorithm_chap5;

import samsung.Solution;

// 5장 재귀 알고리즘
public class Recursion {
    public static void main(String[] args) {
        System.out.println(solution.getMax1(144,12));
        System.out.println(solution.getMax2(132,16));
    }
}


class solution {
    // 유클리드 호제법 사용 안한경우 - 최대공약수 구하기
    public static int getMax1(int x, int y) {
        while (x % y != 0 && y % x != 0) {
            if (x > y) {
                x = x % y;
            } else if (y > x) {
                y = y % x;
            }
        }
        if (x == y) {
            return x;
        }
        return x > y ? y : x;
    }

    // 유클리드 호제법
    public static int getMax2(int x, int y) {
        if (y == 0) {
            return x;
        }
        return getMax2(y, x % y);
    }
}



package programmers.Level1;

// 아스키 문제
class Solution {
    public String solution(String s, int n) {

        String answer = "";
        StringBuffer sb = new StringBuffer();
        if (s.length() > 8000)
            return s;
        if (n < 1 || n > 25)
            return s;
        char[] c = s.toCharArray();
        int a = 0;
        for (int i = 0; i < c.length; i++) {

            if (c[i] == ' ') {
                sb.append(c[i]);
            } else {

                int asci = (int) c[i];
                if(asci < 65 || asci > 122 || (asci > 90 && asci < 97)) {
                    return s;
                }
                a = asci + n;

                if (asci >= 65 && asci <= 90) {
                    // 소문자
                    if (a > 90 && a < 97) {
                        a = a - 91;
                        sb.append(String.valueOf((char) (65 + a)));
                    } else if (a >= 98) {
                        a = a - 91;
                        sb.append(String.valueOf((char) (65 + a)));
                    } else {
                        sb.append(String.valueOf((char) a));
                    }

                } else {
                    // 대문자
                    if (a > 122) {
                        a = a - 123;
                        sb.append(String.valueOf((char) (97 + a)));
                    } else {
                        sb.append(String.valueOf((char) a));
                    }

                }

            }

        }

        return sb.toString();

    }
}

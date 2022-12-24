package programmers.Level1;

public class 크기가작은문자열 {

    public int solution(String t, String p) {
        int answer = 0;
        String tmp = "";

        for (int i = 0; i < t.length() - (p.length() - 1); i++) {
            for (int j = 0; j < p.length(); j++) {
                tmp += Character.toString(t.charAt(i + j));
            }
            if (Double.parseDouble(p) >= Double.parseDouble(tmp)) answer++;
            tmp = "";
        }

        return answer;
    }
}

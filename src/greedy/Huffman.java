package greedy;

// 허프만 코드 - 항목의 빈도수에 따라 빈도수가 높으면 비트수를 줄이고 , 항목의 빈도수가 낮으면 비트수를 늘린다.
public class Huffman {
    public static void main(String[] args) {
        Fixed fx = new Fixed();
        System.out.print(fx.getLength(new String[]{
                "a", "b", "a", "c", "d", "a", "a", "c", "a", "c"
        }));
        System.out.println();
        HuffmanCode hc = new HuffmanCode();
        System.out.print(hc.getLength(new String[]{
                "a", "b", "a", "c", "d", "a", "a", "c", "a", "c"
        }));
    }

    static class Fixed {
        String a = "00";
        String b = "01";
        String c = "10";
        String d = "11";

        public String getLength(String[] k) {
            String[] ans = new String[k.length];
            for (int i = 0; i < k.length; i++) {
                if (k[i] == "a") ans[i] = a;
                else if (k[i] == "b") ans[i] = b;
                else if (k[i] == "c") ans[i] = c;
                else ans[i] = d;
            }
            String answer = " ";
            for (String ansPart : ans) {
                answer += ansPart;
            }
            return answer;
        }
    }

    static class HuffmanCode {
        String a = "0";     // a의 빈도가 높음 - 비트수 낮춤
        String b = "110";   // b의 빈도는 낮은편 - 비트수 높음
        String c = "10";
        String d = "111";

        public String getLength(String[] k) {
            String[] ans = new String[k.length];
            for (int i = 0; i < k.length; i++) {
                if (k[i] == "a") ans[i] = a;
                else if (k[i] == "b") ans[i] = b;
                else if (k[i] == "c") ans[i] = c;
                else ans[i] = d;
            }
            String answer = " ";
            for (String ansPart : ans) {
                answer += ansPart;
            }
            return answer;
        }


    }

}
package programmers.Level1;
import java.util.*;
class 개인정보수집유효기간 {
    public int[] solution(String today, String[] terms, String[] privacies) {

        List<Integer> answer=new ArrayList<>();

        String[] t=today.split("\\."); //today day count. 
        int nowCnt=Integer.parseInt(
                t[0])*12*28+Integer.parseInt(t[1])*28+Integer.parseInt(t[2]);

        Map<String, Integer> map=new HashMap<>();
        for(String i:terms){
            String [] a=i.split("\\s");
            map.put(a[0], Integer.parseInt(a[1]));
        }
        for(int i=0;i<privacies.length;i++){
            int year=Integer.parseInt(privacies[i].substring(0, 4));
            int month=Integer.parseInt(privacies[i].substring(5, 7));
            int day=Integer.parseInt(privacies[i].substring(8,10));
            String agmt=privacies[i].substring(11, 12);

            Integer agmtVal=map.get(agmt);

            month+=agmtVal;

            int tep=year*12*28+month*28+day-1;// last valid 

            if(nowCnt>tep){
                answer.add(i+1)  ;
            }
        }
        return answer.
                stream().mapToInt(i -> i).
                toArray();
    }
}
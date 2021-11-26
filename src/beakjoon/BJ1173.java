package beakjoon;

import java.util.Scanner;

public class BJ1173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] condition = new int[5];
        String input = sc.nextLine();
        String[] inputSt = input.split(" ");
        for (int i = 0; i < condition.length; i++) {
            condition[i] = Integer.parseInt(inputSt[i]);
        }
        int time = condition[0];
        int firstBeat = condition[1];
        int maxBeat = condition[2];
        int plusBeat = condition[3];
        int minusBeat = condition[4];
        int clock = 0;
        int beat = firstBeat;
        int cnt = 0;
        while (clock < time) {
            cnt++;
            if (beat <= maxBeat) {
                beat += plusBeat;
                clock+= 1;
            } else {
                beat -= minusBeat;
                if(beat<firstBeat){
                    beat=firstBeat;
                }
            }
            if((beat+plusBeat>maxBeat) && (beat==firstBeat)){
                break;
            }
        }
        if(clock != time){
            System.out.print(-1);
        }
        else {
            System.out.print(cnt);
        }
    }
}
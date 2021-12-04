package greedy;

import java.util.Arrays;
import java.util.Comparator;
// 회의실 문제 구현 - greedy : 회의실 시간이 끝나는 시간이 최소일때만을 탐욕적으로 구하여 회의실 최대 이용 팀 수 반환
public class RoomSelect {
    public static void main(String[] args) {
        int[][] arr = {{1, 4}, {3, 5}, {0, 6}, {5, 7}, {3, 8}, {5, 9}, {6, 10}, {8, 11}, {8, 12}, {2, 13}, {12, 14}};
        System.out.print(maxSelect(arr,0,14));
    }

    public static int maxSelect(int arr[][],int start, int finish) {
        // 끝나는시간으로 정렬, 끝나는 시간이 같으면 시작시간 기준으로 정렬
        Arrays.sort(arr,new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                if(a[1]==b[1]){
                    return a[0]-b[0];
                }
                else{
                    return a[1]-b[1];
                }
        }});
        int last=0;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
           if(start>arr[i][0] || arr[i][1]>finish){
               continue;
           }
           else{
               if(last<=arr[i][0]){
                   last=arr[i][1];
                   cnt+=1;
               }
           }
        }
        return cnt;

}}

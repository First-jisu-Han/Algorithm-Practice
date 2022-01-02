package java_grammer_basic;
//자바 연습
public class PracticeChap3_2 {
    public static void main(String args[]){
        // 이차원 배열 재복습
        int[][] matrix = new int[1][2];
        matrix[0][0] = 12;
        matrix[0][1] = 24;
        int [] [] mat= {{1,2},{1,2}};  // 바깥 요수의 개수 2개의 행 , 안의 요소개수는 열로 치면 된다.
        System.out.println(matrix[0].length);
        System.out.println(mat.length);

        // 배열 복제 -  배열.clone();
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int [] k=arr.clone();
        // 확장 for 문
        for(int a:arr){
            System.out.print(" "+ a);
        }
        // 일반 for 문
        System.out.println();
        for(int i=0;i<k.length;i++){
            System.out.print(" "+arr[i]);
        }
    }



}

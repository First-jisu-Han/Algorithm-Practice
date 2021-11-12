package dp_practice;
    // 앞의 MatrixPath에서 오른쪽 하단 대각선 허용하는 문제 - 오른쪽하단, 하단, 오른쪽 이동 허용됨

// 9주차 - 1번문제 
    public class NewMatrixPath {
        public static void main(String[] args) {
            int mat[][] = { {6,7,12,5},
                    {5,3,11,18},
                    {7,17,3,3},
                    {8,10,14,9}};

            System.out.println( matrixPath(mat,3,3));
            // 39
            System.out.println(dpmatrixPath(mat,3));
        }


        //재귀 이용
        public static int matrixPath(int m[][],int i,int j){
            // 행렬은 1,1부터 시작하기 때문에
            if(i<0  || j<0) return 0;
            return m[i][j]+Math.max(Math.max(matrixPath(m,i,j-1),matrixPath(m,i-1,j)) ,matrixPath(m,i-1,j-1));
        }


        // dp알고리즘- 이용한 새로운 행렬 생성 및 효율적으로 코드변경 2 2 -> 3.3임 직접 짜봄
    /* 0    0     0      0

       0  m00   m01+m00  m01+m00+m02

       0 m10+m00

       0              m[n][n]까지 최적의 합
     */
        public static int dpmatrixPath(int m[][],int n){
            int c[][]=new int[n+2][n+2];

            for(int i=0;i<=n+1;i++) {
                c[i][0]=0;
            }
            for(int j=1;j<=n+1;j++) {
                c[0][j]=0;
            }
            for(int i=1;i<=n+1;i++)
                for(int j=1;j<=n+1;j++){
                    c[i][j]=m[i-1][j-1]+Math.max(Math.max(c[i-1][j],c[i][j-1]),c[i-1][j-1]);
                }
            return c[n+1][n+1];


        }
    }



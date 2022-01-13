package samsung;

class UserSolution
{
    int[][] buyArr=new int[100][4];  // 매도 대기 주문 리스트
    int[][] sellArr=new int[100][4];  // 매수 대기 주문 리스트


    public void init()
    {
        for(int i=0;i<buyArr.length;i++) {
            if (buyArr[i][1] != 0)  //  배열중에 빈 배열이 아닌 것만 다룬다.
                for (int j = 0; i < 4; j++) {
                    buyArr[i][j] = 0;
                }
            if (sellArr[i][1] != 0)  //  배열중에 빈 배열이 아닌 것만 다룬다.
                for (int j = 0; i < 4; j++) {
                    sellArr[i][j] = 0;
                }
        }

    }

    public int buy(int mNumber,int mStock,int mQuantity,int mPrice)
    {
        for(int i=0; i<sellArr[i][1];i++) {
            if (mStock != sellArr[i][1]) {
                buyArr[i][0] = mNumber;
                buyArr[i][1] = mStock;
                buyArr[i][2] = mQuantity;
                buyArr[i][3] = mPrice;

            }
        }
        return 0;
    }



    public int sell(int mNumber, int mStock, int mQuantity, int mPrice)
    {
        return 0;
    }

    public void cancel(int mNumber)
    {
        for(int i=0;i<sellArr.length;i++) {
            if (sellArr[i][0] == mNumber) {  // 주문 번호가 일치하면
                for (int j = 0; j < 4; j++) {   // 모두 초기화
                    sellArr[i][j] = 0;
                }
            }
        }
        for(int i=0;i<buyArr.length;i++){
            if(buyArr[i][0]==mNumber) {  // 주문 번호가 일치하면
                for (int j = 0; j < 4; j++) {   // 모두 초기화
                    buyArr[i][j] = 0;
                }
            }
    }}

    public int bestProfit(int mStock){
        return 0;
    }

}
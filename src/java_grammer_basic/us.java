package java_grammer_basic;
public class us
{
    // Main API :
    // Solution.fire(int r, int c)

    private final static int MISS 		= 0;
    private final static int CARRIER 	= 1;
    private final static int BATTLESHIP = 2;
    private final static int CRUISER 	= 3;
    private final static int SUBMARINE 	= 4;
    private final static int DESTROYER 	= 5;

    public void init(int limit){
        if(limit >= 70 && limit<=90) {
            for(int i=0;i<limit;i++) {
                play();
                i++;
            }
            }
    }

    public void play(){
        int r,c;
        Solution.fire(int r , int c );

    }


}


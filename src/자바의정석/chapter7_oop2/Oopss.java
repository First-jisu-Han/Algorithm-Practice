package 자바의정석.chapter7_oop2;

public class Oopss {
    public static void main(String[] args) {
        Deck deck=new Deck(); 
        for(Card card:deck.cards){
            System.out.println("card = " + card);
        }
    }
}


class Deck{
    static final int CARD_NUM=52;
    Card[] cards= new Card[CARD_NUM];
    
    Deck(){  // 카드 초기화 
        int i=0; 
        for(int k=Card.Kind_MAX; k>0;k--){
            for(int n=0;n<Card.NUM_MAX;n++){
                cards[i++]=new Card(k,n+1);
            }
        }
    }
    
    Card pick(int index){ 
        return cards[index]; 
    }
    void shuffle(){  // 카드 순서 섞기 
        for(int i=0;i<cards.length;i++){
            int r=(int) (Math.random()*CARD_NUM); // 0 1 2 3 4
            Card temp; 
            temp=cards[i];
            cards[i]=cards[r];
            cards[r]=temp; 
        }
    }


}


class Card{
    static final int Kind_MAX=4; //카드 무늬
    static final int NUM_MAX=13; // 무늬별 카드 수

    static final int SPADE=4;
    static final int DIAMOND=3;
    static final int HEART=2;
    static final int CLOVER=1;

    int kind;
    int number;

    Card(int kind, int number){
        this.kind=kind;
        this.number=number;
    }

}
package oops;

public class Interface {
    public static void main(String[] args) {
   queen q=new queen();
   q.moves();
   pawn p=new pawn();
   p.moves();

    }
    //All method are public abstract without implementaton,used to achieve total abstraction and variable are
    //final,static,public.
    interface chessplayer{
     void moves();

    }
    static  class queen implements chessplayer{
      public   void moves(){
            System.out.println("queen moves left right diagonal up and down!");
        }
    }
    static class king implements chessplayer{
        public void moves(){
            System.out.println("king moves left right diagonal up and down!");
        }
    }
   static  class pawn implements chessplayer{
        public void moves(){
            System.out.println("pawn moves 2 square if moves is first and after it moves 1 square forward at a time!");
        }
    }
}

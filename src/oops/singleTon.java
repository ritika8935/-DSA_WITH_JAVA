package oops;

public class singleTon {
    private singleTon(){

    }
    private static singleTon instance;
    public static singleTon getInstance(){
      if (instance==null){
          instance =new singleTon();
      }
        return instance;
    }

}

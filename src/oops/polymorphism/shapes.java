package oops.polymorphism;

public class shapes {
    void area(){
        System.out.println("i am area shapes.");
    }

    //early binding:override works,before all compilation and bytecode stuff done .
    // late binding:when after all compilation and bytecode override work.
//    final void area(){ // final cannot be override because it provide performance inhancement.
//        System.out.println("i am area shapes.");
//    }

}

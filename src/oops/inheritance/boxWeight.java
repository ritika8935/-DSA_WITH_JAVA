package oops.inheritance;

public class boxWeight extends box{
    double weight;

    public boxWeight(){
        this.weight=-1;
        this.l=-1;
    }

    public boxWeight(boxWeight other){
        super(other);
        weight=other.weight;
    }

    public boxWeight(double l,double h,double w, double weight){
        super(l,h,w);//just above cls which is box in this case.
        //call the parent class constructor
        //used to initialise values present in parent class.
        //if parameter is not given or we not call super cls then default super class will called which will have
        //no parameter.

        //System.out.println(this.weight); //not good practice becausse if super cls also have weight variable
        //then in that case it cant access that it will access local one.
        //System.out.println(super.weight);//good practice,explicitly can be refer.
        this.weight=weight;
        //super(l,h,w);//super cls,must initialize first because it does not care about sub cls.
    }
}

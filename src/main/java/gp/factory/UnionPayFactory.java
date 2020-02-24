package gp.factory;

import gp.domain.UnionPay;


public class UnionPayFactory implements  InsidePayFactory {
    private  static UnionPayFactory factory;
    //˽�л����췽��
    private  UnionPayFactory(){}

    public static UnionPayFactory getFactory(){
        if(factory==null){
            factory=new UnionPayFactory();
        }
        return factory;
    }

    public UnionPay createPay() {
        return new UnionPay();
    }
}

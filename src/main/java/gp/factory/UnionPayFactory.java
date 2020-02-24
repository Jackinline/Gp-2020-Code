package gp.factory;

import gp.domain.UnionPay;


public class UnionPayFactory implements  InsidePayFactory {
    private  static UnionPayFactory factory;
    //私有化构造方法
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

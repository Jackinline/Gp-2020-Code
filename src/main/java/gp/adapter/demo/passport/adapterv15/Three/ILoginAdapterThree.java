package gp.adapter.demo.passport.adapterv15.Three;


import gp.adapter.demo.passport.ResultMsg;

/**
 * Created by Tom.
 */
public interface ILoginAdapterThree {
    //1.要判断是什么类型
//    boolean support(Object object);
    //2.login 参数 Object [] param
    ResultMsg login(Object [] param,Object object);
//    ResultMsg login(Object ... param );

    ResultMsg login(Object [] param,Class<? extends ILoginAdapterThree> clazz);
    //class 拿过来反射获得对象，获得login方法，传入参数调用

}

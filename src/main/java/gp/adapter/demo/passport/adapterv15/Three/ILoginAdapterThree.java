package gp.adapter.demo.passport.adapterv15.Three;


import gp.adapter.demo.passport.ResultMsg;

/**
 * Created by Tom.
 */
public interface ILoginAdapterThree {
    //1.Ҫ�ж���ʲô����
//    boolean support(Object object);
    //2.login ���� Object [] param
    ResultMsg login(Object [] param,Object object);
//    ResultMsg login(Object ... param );

    ResultMsg login(Object [] param,Class<? extends ILoginAdapterThree> clazz);
    //class �ù��������ö��󣬻��login�����������������

}

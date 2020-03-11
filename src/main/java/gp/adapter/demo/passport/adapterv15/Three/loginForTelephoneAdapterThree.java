package gp.adapter.demo.passport.adapterv15.Three;

import gp.adapter.demo.passport.Member;
import gp.adapter.demo.passport.ResultMsg;

public class loginForTelephoneAdapterThree implements ILoginAdapterThree {


    public ResultMsg login(Object[] param, Object object) {
        if( object instanceof  loginForTelephoneAdapterThree){
            String a = (String) param[0];
            String b = (String) param[1];
            System.out.println("loginForTelephoneAdapterThree doing....."+a+ " "+ b);
            return new ResultMsg(200,"login OK",new Member());
        }
        return null;
    }

    public ResultMsg login(Object[] param, Class<? extends ILoginAdapterThree> clazz) {
        if( clazz ==loginForTelephoneAdapterThree.class){
            String a = (String) param[0];
            String b = (String) param[1];
            System.out.println("loginForTelephoneAdapterThree doing....."+a+ " "+ b);
            return new ResultMsg(200,"login OK",new Member());
        }
        return null;
    }
}

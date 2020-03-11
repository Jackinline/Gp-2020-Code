package gp.adapter.demo.passport.adapterv15.Four;

import gp.adapter.demo.passport.Member;
import gp.adapter.demo.passport.ResultMsg;

public class loginForTelephoneAdapterFour implements ILoginAdapterFour {


    public ResultMsg login(Object[] param, Object object) {
        if( object instanceof loginForTelephoneAdapterFour){
            String a = (String) param[0];
            String b = (String) param[1];
            System.out.println("loginForTelephoneAdapterThree doing....."+a+ " "+ b);
            return new ResultMsg(200,"login OK",new Member());
        }
        return null;
    }

    public ResultMsg login(Object[] param, Class<? extends ILoginAdapterFour> clazz) {
        if( clazz == loginForTelephoneAdapterFour.class){
            String a = (String) param[0];
            String b = (String) param[1];
            System.out.println("loginForTelephoneAdapterThree doing....."+a+ " "+ b);
            return new ResultMsg(200,"login OK",new Member());
        }
        return null;
    }
}

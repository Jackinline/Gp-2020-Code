package gp.adapter.demo.passport.adapterv15.Four;

import gp.adapter.demo.passport.Member;
import gp.adapter.demo.passport.ResultMsg;

public class loginForTokenAdapterFour implements ILoginAdapterFour {

    public ResultMsg login(Object[] param, Object object) {
        if( object instanceof loginForTokenAdapterFour){
            String a = (String) param[0];
            System.out.println("loginForTokenAdapterThree doing....."+a);
            return new ResultMsg(200,"login OK",new Member());
        }
        return null;
    }

    public ResultMsg login(Object[] param, Class<? extends ILoginAdapterFour> clazz) {
        if( clazz == loginForTokenAdapterFour.class){
            String a = (String) param[0];
            System.out.println("loginForTokenAdapterThree doing....."+a);
            return new ResultMsg(200,"login OK",new Member());
        }
        return null;
    }
}

package gp.adapter.demo.passport.adapterv15.Four;

import gp.adapter.demo.passport.Member;
import gp.adapter.demo.passport.ResultMsg;

public class loginForQQAdapterFour implements ILoginAdapterFour {

    public ResultMsg login(Object[] param, Object object) {
        if( object instanceof loginForQQAdapterFour){
            String openId = (String) param[0];
            System.out.println("loginForQQAdapterFour doing....."+openId);
            return new ResultMsg(200,"login OK",new Member());
        }
        return null;
    }

    public ResultMsg login(Object[] param, Class<? extends ILoginAdapterFour> clazz) {
        if( clazz == loginForQQAdapterFour.class){
            String openId = (String) param[0];
            System.out.println("loginForQQAdapterFour doing....."+openId);
            return new ResultMsg(200,"login OK",new Member());
        }
        return null;
    }
}

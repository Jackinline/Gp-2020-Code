package gp.adapter.demo.passport.adapterv15.Four;

import gp.adapter.demo.passport.Member;
import gp.adapter.demo.passport.ResultMsg;

public class loginForWechatAdapterFour implements ILoginAdapterFour {
    public ResultMsg login(Object[] param, Object object) {
        if( object instanceof loginForWechatAdapterFour){
            String a = (String) param[0];
            System.out.println("loginForWechatAdapterThree doing....."+a);
            return new ResultMsg(200,"login OK",new Member());
        }
        return null;
    }

    public ResultMsg login(Object[] param, Class<? extends ILoginAdapterFour> clazz) {
        if( clazz == loginForWechatAdapterFour.class){
            String a = (String) param[0];
            System.out.println("loginForWechatAdapterThree doing....."+a);
            return new ResultMsg(200,"login OK",new Member());
        }
        return null;
    }
}

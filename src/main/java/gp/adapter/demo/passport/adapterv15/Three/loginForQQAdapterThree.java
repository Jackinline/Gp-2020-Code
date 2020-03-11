package gp.adapter.demo.passport.adapterv15.Three;

import gp.adapter.demo.passport.Member;
import gp.adapter.demo.passport.ResultMsg;

public class loginForQQAdapterThree implements ILoginAdapterThree {

    public ResultMsg login(Object[] param, Object object) {
        if( object instanceof  loginForQQAdapterThree){
            String openId = (String) param[0];
            System.out.println("loginForQQAdapterThree doing....."+openId);
            return new ResultMsg(200,"login OK",new Member());
        }
        return null;
    }

    public ResultMsg login(Object[] param, Class<? extends ILoginAdapterThree> clazz) {
        if( clazz ==loginForQQAdapterThree.class){
            String openId = (String) param[0];
            System.out.println("loginForQQAdapterThree doing....."+openId);
            return new ResultMsg(200,"login OK",new Member());
        }
        return null;
    }
}

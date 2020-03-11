package gp.adapter.demo.passport.adapterv15.Three;

import gp.adapter.demo.passport.Member;
import gp.adapter.demo.passport.ResultMsg;

public class loginForTokenAdapterThree implements ILoginAdapterThree {

    public ResultMsg login(Object[] param, Object object) {
        if( object instanceof  loginForTokenAdapterThree){
            String a = (String) param[0];
            System.out.println("loginForTokenAdapterThree doing....."+a);
            return new ResultMsg(200,"login OK",new Member());
        }
        return null;
    }

    public ResultMsg login(Object[] param, Class<? extends ILoginAdapterThree> clazz) {
        if( clazz ==loginForTokenAdapterThree.class){
            String a = (String) param[0];
            System.out.println("loginForTokenAdapterThree doing....."+a);
            return new ResultMsg(200,"login OK",new Member());
        }
        return null;
    }
}

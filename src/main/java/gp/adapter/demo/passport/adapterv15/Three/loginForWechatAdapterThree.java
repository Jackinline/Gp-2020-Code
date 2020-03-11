package gp.adapter.demo.passport.adapterv15.Three;

import gp.adapter.demo.passport.Member;
import gp.adapter.demo.passport.ResultMsg;

public class loginForWechatAdapterThree implements ILoginAdapterThree {



    public ResultMsg login(Object[] param, Object object) {
        if( object instanceof  loginForWechatAdapterThree){
            String a = (String) param[0];
            System.out.println("loginForWechatAdapterThree doing....."+a);
            return new ResultMsg(200,"login OK",new Member());
        }
        return null;
    }

    public ResultMsg login(Object[] param, Class<? extends ILoginAdapterThree> clazz) {
        if( clazz ==loginForWechatAdapterThree.class){
            String a = (String) param[0];
            System.out.println("loginForWechatAdapterThree doing....."+a);
            return new ResultMsg(200,"login OK",new Member());
        }
        return null;
    }
}

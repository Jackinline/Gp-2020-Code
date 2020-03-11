package gp.adapter.demo.passport.adapterv15.One;

import gp.adapter.demo.passport.Member;
import gp.adapter.demo.passport.ResultMsg;

public class loginForQQAdapterOne {
    public ResultMsg  loginForQQ(String openId){
        System.out.println("loginQQ doing....."+openId);
        return new ResultMsg(200,"login OK",new Member());
    }
}

package gp.adapter.demo.passport.adapterv15.One;

import gp.adapter.demo.passport.Member;
import gp.adapter.demo.passport.ResultMsg;

public class loginForWechatAdapterOne {
    public ResultMsg  loginForWechat(String openId){
        System.out.println("wechat doing....."+ openId);
        return new ResultMsg(200,"login OK",new Member());
    }
}

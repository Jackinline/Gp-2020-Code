package gp.adapter.demo.passport.adapterv15.One;

import gp.adapter.demo.passport.Member;
import gp.adapter.demo.passport.ResultMsg;

public class loginForTokenAdapterOne {
    public ResultMsg  loginForToken(String token){
        System.out.println("token doing....."+ token);
        return new ResultMsg(200,"login OK",new Member());
    }
}

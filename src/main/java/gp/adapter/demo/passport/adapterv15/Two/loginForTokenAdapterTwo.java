package gp.adapter.demo.passport.adapterv15.Two;

import gp.adapter.demo.passport.Member;
import gp.adapter.demo.passport.ResultMsg;

public class loginForTokenAdapterTwo implements ILoginAdapterTwo {

    public ResultMsg login(String a, String b) {
        System.out.println("token doing....." + a);
        return new ResultMsg(200,"login OK",new Member());
    }
}

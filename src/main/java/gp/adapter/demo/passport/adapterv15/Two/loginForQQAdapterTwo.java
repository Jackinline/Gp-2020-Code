package gp.adapter.demo.passport.adapterv15.Two;

import gp.adapter.demo.passport.Member;
import gp.adapter.demo.passport.ResultMsg;

public class loginForQQAdapterTwo implements ILoginAdapterTwo {

    public ResultMsg login(String a, String b) {
        System.out.println("loginQQ doing....."+ a);
        return new ResultMsg(200,"login OK",new Member());
    }

}

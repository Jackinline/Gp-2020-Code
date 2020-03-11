package gp.adapter.demo.passport.adapterv15.One;

import gp.adapter.demo.passport.Member;
import gp.adapter.demo.passport.ResultMsg;

public class loginForTelephoneAdapterOne {

    public ResultMsg loginForTelephone(String phone, String code) {
        System.out.println("Telephone doing....."+phone +  " code " +code);
        return new ResultMsg(200,"login OK",new Member());
    }
}

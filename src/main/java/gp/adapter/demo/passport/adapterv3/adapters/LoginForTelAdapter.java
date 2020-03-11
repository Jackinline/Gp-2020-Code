package gp.adapter.demo.passport.adapterv3.adapters;


import gp.adapter.demo.passport.ResultMsg;

import java.security.InvalidParameterException;

/**
 * Created by Tom.
 */
public class LoginForTelAdapter extends AbstraceAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    public ResultMsg login(Object[] params, Object adapter) {
        if(params.length==2){
            System.out.println("LoginForTelAdapter....");
            return login((String)params[0],(String)params[1],adapter);
        }else{
            throw new InvalidParameterException("参数不对");
        }
    }

    public ResultMsg login(String id,String code, Object adapter) {
        return super.loginForRegist(id,code);
    }

}

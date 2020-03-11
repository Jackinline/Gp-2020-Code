package gp.adapter.demo.passport.adapterv3.adapters;


import gp.adapter.demo.passport.ResultMsg;

import java.security.InvalidParameterException;

/**
 * Created by Tom.
 */
public class LoginForTokenAdapter extends AbstraceAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }

    public ResultMsg login(Object[] params, Object adapter) {
        if(params.length==1){
            System.out.println("LoginForTokenAdapter....");
            return login((String)params[0],adapter);
        }else{
            throw new InvalidParameterException("参数不对");
        }
    }

    public ResultMsg login(String id, Object adapter) {
        return super.loginForRegist(id,null);
    }

}

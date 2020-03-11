package gp.adapter.demo.passport.adapterv3;


import gp.adapter.demo.passport.ResultMsg;
import gp.adapter.demo.passport.adapterv3.adapters.ILoginAdapter;
import gp.adapter.demo.passport.adapterv3.adapters.LoginForQQAdapter;
import gp.adapter.demo.passport.adapterv3.adapters.LoginForTelAdapter;
import gp.adapter.demo.passport.adapterv3.adapters.LoginForTokenAdapter;
import gp.adapter.demo.passport.adapterv3.adapters.LoginForWechatAdapter;


/**
 * Created by Tom.
 */
public class PassportForThirdAdapter implements IPassportForThird {
    public ResultMsg loginForQQ(String openId) {
        return processLogin(new Object[]{openId}, LoginForQQAdapter.class);
    }

    public ResultMsg loginForWechat(String openId) {
        return processLogin(new Object[]{openId}, LoginForWechatAdapter.class);
    }

    public ResultMsg loginForToken(String token) {

        return processLogin(new Object[]{token}, LoginForTokenAdapter.class);
    }

    public ResultMsg loginForTelphone(String phone, String code) {
        return processLogin(new Object[]{phone,code}, LoginForTelAdapter.class);
    }

    // clazz 传的是实现类
    private ResultMsg processLogin(Object[] params, Class<? extends ILoginAdapter> clazz) {
        try {
            ILoginAdapter adapter = clazz.newInstance();
            return adapter.login(params, adapter);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ResultMsg login(Object[] params, Class<? extends ILoginAdapter> adapter) {
        return processLogin(params, adapter);
    }
}

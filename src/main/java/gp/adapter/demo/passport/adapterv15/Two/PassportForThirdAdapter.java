package gp.adapter.demo.passport.adapterv15.Two;


import gp.adapter.demo.passport.PassportService;
import gp.adapter.demo.passport.ResultMsg;

/**
 * Created by Tom.
 */
public class PassportForThirdAdapter extends PassportService implements IPassportForThird {

    /**
     * 第一版 当然会想到直接建立对象
     */
    public ResultMsg loginForQQ(String openId) {
        return  new loginForQQAdapterTwo().login(openId,"");
    }

    public ResultMsg loginForWechat(String openId) {
        return new loginForWechatAdapterTwo().login(openId,"");
    }

    public ResultMsg loginForToken(String token) {
        return new loginForTokenAdapterTwo().login(token,"");
    }

    public ResultMsg loginForTelphone(String phone, String code) {
        return new loginForTelephoneAdapterTwo().login(phone,code);
    }

    public ResultMsg loginForRegist(String username, String password){
        if(null == password){
            password = "THIRD_EMPTY";
        }
        super.regist(username,password);
        return super.login(username,password);
    }
}

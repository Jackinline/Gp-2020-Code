package gp.adapter.demo.passport.adapterv15.One;


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
        return  new loginForQQAdapterOne().loginForQQ(openId);
    }

    public ResultMsg loginForWechat(String openId) {
        return new loginForWechatAdapterOne().loginForWechat(openId);
    }

    public ResultMsg loginForToken(String token) {
        return new loginForTokenAdapterOne().loginForToken(token);
    }

    public ResultMsg loginForTelphone(String phone, String code) {
        return new loginForTelephoneAdapterOne().loginForTelephone( phone,  code);
    }

    private ResultMsg loginForRegist(String username,String password){
        if(null == password){
            password = "THIRD_EMPTY";
        }
        super.regist(username,password);
        return super.login(username,password);
    }
}

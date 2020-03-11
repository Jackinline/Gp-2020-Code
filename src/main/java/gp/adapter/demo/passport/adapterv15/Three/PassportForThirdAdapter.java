package gp.adapter.demo.passport.adapterv15.Three;


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
        loginForQQAdapterThree loginForQQAdapterThree = new loginForQQAdapterThree();
        return  loginForQQAdapterThree.login(new Object[]{openId},loginForQQAdapterThree);
    }

    public ResultMsg loginForWechat(String openId) {
        loginForWechatAdapterThree loginForWechatAdapterThree = new loginForWechatAdapterThree();
        return  loginForWechatAdapterThree.login(new Object[]{openId},loginForWechatAdapterThree);
    }

    public ResultMsg loginForToken(String token) {
        loginForTokenAdapterThree loginForTokenAdapterThree = new loginForTokenAdapterThree();
        return  loginForTokenAdapterThree.login(new Object[]{token},loginForTokenAdapterThree);
    }

    public ResultMsg loginForTelphone(String phone, String code) {
        loginForTelephoneAdapterThree loginForTelephoneAdapterThree = new loginForTelephoneAdapterThree();
        return  loginForTelephoneAdapterThree.login(new Object[]{phone,code},loginForTelephoneAdapterThree);
    }

    public ResultMsg loginForRegist(String username, String password){
        if(null == password){
            password = "THIRD_EMPTY";
        }
        super.regist(username,password);
        return super.login(username,password);
    }
}

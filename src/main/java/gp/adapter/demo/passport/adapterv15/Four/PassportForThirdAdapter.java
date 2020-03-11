package gp.adapter.demo.passport.adapterv15.Four;


import gp.adapter.demo.passport.PassportService;
import gp.adapter.demo.passport.ResultMsg;

/**
 * Created by Tom.
 */
public class PassportForThirdAdapter extends PassportService implements IPassportForThird {

    /**
     * ��һ�� ��Ȼ���뵽ֱ�ӽ�������
     */
    public ResultMsg loginForQQ(String openId) {

        return  processLogin(new Object [] {openId},loginForQQAdapterFour.class);
    }

    public ResultMsg loginForWechat(String openId) {
        return  processLogin(new Object [] {openId},loginForWechatAdapterFour.class);
    }

    public ResultMsg loginForToken(String token) {
        return  processLogin(new Object [] {token},loginForTokenAdapterFour.class);
    }

    public ResultMsg loginForTelphone(String phone, String code) {
        return  processLogin(new Object [] {phone,code},loginForTelephoneAdapterFour.class);
    }

    public ResultMsg loginForRegist(String username, String password){
        if(null == password){
            password = "THIRD_EMPTY";
        }
        super.regist(username,password);
        return super.login(username,password);
    }

    // clazz ������ʵ����
    private ResultMsg processLogin(Object[] objects,Class<? extends ILoginAdapterFour> clazz){
        try {
            ILoginAdapterFour adapter = clazz.newInstance();
            return adapter.login(objects, adapter);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

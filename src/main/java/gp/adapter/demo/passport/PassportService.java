package gp.adapter.demo.passport;

/**
 * Created by Tom.
 */
public class PassportService {

    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg regist(String username,String password){
        return  new ResultMsg(200,"regist OK  !username:"+username+" password: "+password,new Member());
    }

    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username,String password){
        return  new ResultMsg(200,"Login OK ! username:"+username+" password: "+password,new Member());
    }

}

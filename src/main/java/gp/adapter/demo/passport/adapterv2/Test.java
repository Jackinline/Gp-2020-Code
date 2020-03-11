package gp.adapter.demo.passport.adapterv2;

import gp.adapter.demo.passport.PassportService;
import gp.adapter.demo.passport.adapterv2.adapters.AbstraceAdapter;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {

        //改后
        IPassportForThird adapter = new PassportForThirdAdapter();
        adapter.loginForQQ("sdfasdfasfasfas");
        AbstraceAdapter adapter1 = (AbstraceAdapter) adapter;
        adapter1.login("usernmame","password");

        //改前
        PassportService ps=new PassportService();
        ps.login("aaaaa","bbbbb");
    }
}

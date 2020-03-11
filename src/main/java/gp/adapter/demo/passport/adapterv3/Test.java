package gp.adapter.demo.passport.adapterv3;

import gp.adapter.demo.passport.PassportService;
import gp.adapter.demo.passport.ResultMsg;
import gp.adapter.demo.passport.adapterv3.adapters.AbstraceAdapter;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {

        //¸Äºó
        PassportForThirdAdapter adapter = new PassportForThirdAdapter();
        adapter.loginForQQ("1234456789").show();
        adapter.loginForTelphone("1234567","abcdefg").show();

    }
}

package gp.adapter.demo.passport.adapterv15.Three;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        PassportForThirdAdapter adapter = new PassportForThirdAdapter();
        adapter.loginForRegist("tom","123456");
        adapter.loginForQQ("sjooguwoersdfjhasjfsa");
        adapter.loginForWechat("slfsjoljsdo8234ssdfs");
    }
}

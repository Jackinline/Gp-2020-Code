package gp.adapter.demo.passport.adapterv3;


import gp.adapter.demo.passport.ResultMsg;
import gp.adapter.demo.passport.adapterv3.adapters.ILoginAdapter;

/**
 * Created by Tom.
 */
public interface IPassportForThird {

    ResultMsg login(Object [] params, Class<? extends  ILoginAdapter> adapter);

}

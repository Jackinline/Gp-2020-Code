package gp.adapter.demo.passport.adapterv3.adapters;


import gp.adapter.demo.passport.ResultMsg;

/**
 * Created by Tom.
 */
public interface ILoginAdapter {
    boolean support(Object object);
    ResultMsg login(Object [] params, Object adapter);
}

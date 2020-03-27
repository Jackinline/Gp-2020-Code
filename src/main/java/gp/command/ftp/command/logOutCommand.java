package gp.command.ftp.command;

import gp.command.ftp.receive.logOutReceive;
import gp.command.ftp.receive.loginReceive;

public class logOutCommand extends Command{
    public logOutCommand(){
        receive=new logOutReceive();
    }
}

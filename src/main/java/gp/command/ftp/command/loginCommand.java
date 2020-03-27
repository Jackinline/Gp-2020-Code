package gp.command.ftp.command;

import gp.command.ftp.receive.IReceive;
import gp.command.ftp.receive.loginReceive;

public class loginCommand  extends Command{
    public loginCommand(){
        receive=new loginReceive();
    }
}

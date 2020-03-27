package gp.command.ftp.command;

import gp.command.ftp.receive.UploadReceive;
import gp.command.ftp.receive.loginReceive;

public class UploadCommand extends Command{
    public UploadCommand(){
        receive=new UploadReceive();
    }
}

package gp.command.ftp.command;

import gp.command.ftp.receive.DownloadReceive;
import gp.command.ftp.receive.UploadReceive;

public class DownloadCommand extends Command{
    public DownloadCommand(){
        receive=new DownloadReceive();
    }
}

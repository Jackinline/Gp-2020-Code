package gp.command.ftp.receive;

public class DownloadReceive implements   IReceive{
    @Override
    public void doing() {
        System.out.println("下载中...");
        System.out.println("下载完成...");
    }
}

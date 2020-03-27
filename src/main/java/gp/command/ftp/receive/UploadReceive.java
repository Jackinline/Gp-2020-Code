package gp.command.ftp.receive;

public class UploadReceive implements   IReceive{
    @Override
    public void doing() {
        System.out.println("上传中...");
        System.out.println("上传完成...");
    }
}

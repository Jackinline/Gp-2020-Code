package gp.command.ftp.receive;

public class logOutReceive implements   IReceive{
    @Override
    public void doing() {
        System.out.println("正在关闭...");
        System.out.println("已关闭...");
    }
}

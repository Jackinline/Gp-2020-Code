package gp.command.ftp.command;

import gp.command.ftp.receive.IReceive;

public abstract class Command {
    public IReceive receive;


    public void execute() {
        receive.doing();
    }
}

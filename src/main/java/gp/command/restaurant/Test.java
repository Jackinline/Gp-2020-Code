package gp.command.restaurant;

import gp.command.restaurant.command.NoodlesCommand;
import gp.command.restaurant.command.FriedRiceCommand;
import gp.command.restaurant.command.SoupCommand;

public class Test {
    public static void main(String[] args) {
        NoodlesCommand nCmd = new NoodlesCommand();
        FriedRiceCommand fCmd = new FriedRiceCommand();
        SoupCommand sCmd = new SoupCommand();
        Waiter waiter=new Waiter(nCmd,fCmd,sCmd);
        waiter.action();

    }
}

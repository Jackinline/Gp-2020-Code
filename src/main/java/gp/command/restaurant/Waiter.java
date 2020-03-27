package gp.command.restaurant;

import gp.command.restaurant.command.Command;

import java.util.Arrays;
import java.util.List;

public class Waiter {

    private List <Command> Commands;

    public Waiter( List <Command> cmd) {
        this.Commands = cmd;
    }
    public Waiter(Command... cmd) {
        this.Commands=Arrays.asList(cmd);
    }

    public void action() {
        Commands.forEach(Command::execute);
    }
}


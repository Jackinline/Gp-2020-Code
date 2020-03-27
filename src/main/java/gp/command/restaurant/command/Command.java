package gp.command.restaurant.command;

import gp.command.restaurant.chef.Chef;

public abstract class Command {
    public Chef chef ;

    public void execute() {
        chef.cook();
    }
}

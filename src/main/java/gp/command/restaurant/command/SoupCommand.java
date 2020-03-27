package gp.command.restaurant.command;

import gp.command.restaurant.chef.SoupChef;

public class SoupCommand extends Command {

    public SoupCommand(){
        chef = new SoupChef();
    }
}

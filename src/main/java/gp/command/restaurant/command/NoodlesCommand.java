package gp.command.restaurant.command;

import gp.command.restaurant.chef.NoodlesChef;


public class NoodlesCommand extends Command{

    public NoodlesCommand(){
        chef = new NoodlesChef();
    }

}
package gp.command.restaurant.command;
import gp.command.restaurant.chef.RiceChef;


public class FriedRiceCommand extends Command{

    public FriedRiceCommand(){
        chef = new RiceChef();
    }

}
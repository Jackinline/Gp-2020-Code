package gp.decorator.Menu;

public class ShoppingDecorator extends BaseMenuDecorator {

    public ShoppingDecorator(iMenu baseMenu) {
        super(baseMenu);
    }

    public String getMenu() {
        return super.getMenu()+"Shopping ";
    }

}

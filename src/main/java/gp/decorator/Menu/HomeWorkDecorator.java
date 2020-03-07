package gp.decorator.Menu;

public class HomeWorkDecorator extends BaseMenuDecorator {

    public HomeWorkDecorator(iMenu baseMenu) {
        super(baseMenu);
    }

    public String getMenu() {
        return super.getMenu()+"HomeWork ";
    }

}

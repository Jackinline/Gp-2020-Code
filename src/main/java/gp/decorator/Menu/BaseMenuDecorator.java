package gp.decorator.Menu;

public class BaseMenuDecorator implements iMenu {

    private  iMenu baseMenu;

    public BaseMenuDecorator(iMenu baseMenu) {
        this.baseMenu = baseMenu;
    }

    public String getMenu() {
        return baseMenu.getMenu();
    }
}

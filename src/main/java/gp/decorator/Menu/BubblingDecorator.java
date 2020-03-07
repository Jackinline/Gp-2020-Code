package gp.decorator.Menu;

public class BubblingDecorator extends BaseMenuDecorator {

    public BubblingDecorator(iMenu baseMenu) {
        super(baseMenu);
    }

    public String getMenu() {
        return super.getMenu()+"Bubbling ";
    }

}

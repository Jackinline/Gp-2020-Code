package gp.decorator.Menu;

public class GrowthWallDecorator extends BaseMenuDecorator {

    public GrowthWallDecorator(iMenu baseMenu) {
        super(baseMenu);
    }

    public String getMenu() {
        return super.getMenu()+"GrowthWall ";
    }

}

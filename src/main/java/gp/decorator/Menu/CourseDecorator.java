package gp.decorator.Menu;

public class CourseDecorator extends BaseMenuDecorator {

    public CourseDecorator(iMenu baseMenu) {
        super(baseMenu);
    }

    public String getMenu() {
        return super.getMenu()+"Course ";
    }

}

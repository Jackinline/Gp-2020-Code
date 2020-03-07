package gp.decorator.Menu;

public class ArticleDecorator extends BaseMenuDecorator {

    public ArticleDecorator(iMenu baseMenu) {
        super(baseMenu);
    }

    public String getMenu() {
        return super.getMenu()+"Article ";
    }

}

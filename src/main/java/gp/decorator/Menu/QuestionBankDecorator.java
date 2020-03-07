package gp.decorator.Menu;

public class QuestionBankDecorator extends BaseMenuDecorator {

    public QuestionBankDecorator(iMenu baseMenu) {
        super(baseMenu);
    }

    public String getMenu() {
        return super.getMenu()+"QuestionBank ";
    }

}

package gp.decorator.Menu;

public class QuestionsAndAnswersDecorator extends BaseMenuDecorator {

    public QuestionsAndAnswersDecorator(iMenu baseMenu) {
        super(baseMenu);
    }

    public String getMenu() {
        return super.getMenu()+" QuestionsAndAnswers ";
    }

}

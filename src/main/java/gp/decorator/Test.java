package gp.decorator;


import gp.decorator.Menu.ArticleDecorator;
import gp.decorator.Menu.BaseMenu;
import gp.decorator.Menu.BubblingDecorator;
import gp.decorator.Menu.CourseDecorator;
import gp.decorator.Menu.GrowthWallDecorator;
import gp.decorator.Menu.HomeWorkDecorator;
import gp.decorator.Menu.QuestionBankDecorator;
import gp.decorator.Menu.QuestionsAndAnswersDecorator;
import gp.decorator.Menu.ShoppingDecorator;

public class Test  {
    public static void main(String[] args) {

        BaseMenu menu =new BaseMenu();
        ShoppingDecorator menu1=new ShoppingDecorator( new BubblingDecorator(new CourseDecorator(new QuestionsAndAnswersDecorator(new ArticleDecorator(menu))))) ;
        System.out.println("Sign off:"+menu1.getMenu());
//        QuestionsAndAnswersDecorator menu1=new QuestionsAndAnswersDecorator(new ArticleDecorator(menu));
//        System.out.println("µÇÂ¼£º"+menu1.getMenu());
        ShoppingDecorator menu2=new ShoppingDecorator(  new HomeWorkDecorator( new QuestionBankDecorator( new GrowthWallDecorator(new BubblingDecorator(new CourseDecorator(new QuestionsAndAnswersDecorator(new ArticleDecorator(menu)))))))) ;
        System.out.println("Sign on:"+menu2.getMenu());


    }

}

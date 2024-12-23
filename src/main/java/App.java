import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());


        Cat bean_cat =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean_cat.getName());

        Cat bean_cat2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean_cat2.getName());

        System.out.println(bean == bean2);
        System.out.println(bean_cat == bean_cat2);
    }
}
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

        Cat bean3 =
                (Cat) applicationContext.getBean("Cat");
        System.out.println(bean3.getMeaw());

        Cat bean4 =
                (Cat) applicationContext.getBean("Cat");
        System.out.println(bean4.getMeaw());

        boolean a = bean == bean2 ;
        boolean b = bean3 == bean4;
        System.out.println(a);
        System.out.println(b);
    }
}
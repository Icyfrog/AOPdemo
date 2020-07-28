import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("applicationContext.xml");

        IStudent person = (IStudent)ctx.getBean("student");
        person.addStudent("test111");

    }
}

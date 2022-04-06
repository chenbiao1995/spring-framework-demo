import com.chenbiao.pojo.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenbiao
 * @version 1.0
 * @description
 * @date 2022/4/6 16:48
 */
public class MyDemo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("demo.xml");
		Person person = classPathXmlApplicationContext.getBean(Person.class);
		System.out.println(person);
	}
}

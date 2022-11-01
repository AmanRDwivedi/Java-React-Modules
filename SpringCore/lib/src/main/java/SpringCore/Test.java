package SpringCore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String args[]) {
		
		/*Employee emp1 = new Employee(1001,"Ram");
		
		Employee emp2 = new Employee();
		emp2.setEmpId(1002);
		emp2.seteName("Raman");
		
		System.out.println(emp1);
		System.out.println(emp2);
*/
		
		Resource rs = new ClassPathResource("applicationContext.xml");
		BeanFactory fact =  new XmlBeanFactory(rs);
		
		//get beans from beanfactory
		
		Employee emp1 = (Employee) fact.getBean("empBean1");
		System.out.println(emp1.getEmpId());
		//do it for other objects and classes
		
		
		Address A1 = (Address) fact.getBean("empBean3");
		System.out.println(A1.getCity());
		
		
		Employee emp2 = (Employee) fact.getBean("empBean1");
		System.out.println(emp2.getEmpId());
		System.out.println(emp2.address.getState());
		
		
		
		//Creating applicationContrext container
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContextInj.xml");
		
		Employee e3 = (Employee) context.getBean("iBean1");
		System.out.println(e3.getEmpId());
	}

}

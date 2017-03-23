package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import servicesDao.interactionServiceDao;

public class interactionServiceTest {

	public static void main(String[] args) {
	ApplicationContext application=new ClassPathXmlApplicationContext("applicationContext.xml");
	interactionServiceDao dao=(interactionServiceDao)application.getBean("interactionServiceDao");
	/*try {
		dao.getById(1);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/

	}

}

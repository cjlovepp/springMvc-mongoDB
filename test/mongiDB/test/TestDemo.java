package mongiDB.test;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.spring.dao.MongoDbTestDao;
import com.spring.entity.HomeWork;

/**
 * @author CJ
 *
 * @date 2014年10月23日 下午1:46:59
 */
/**
 * @author CJ
 *
 * @date 2014年10月24日 上午11:32:25
 */
public class TestDemo {
	
	ApplicationContext context;
	MongoDbTestDao mongo;
	//获取配置文件上下文
	@Before
	public void initContext(){
		context = new ClassPathXmlApplicationContext("spring-context.xml");
		mongo = context.getBean(MongoDbTestDao.class);
	}
	
	
	@Test
	public void testDataSource() throws SQLException {
		MongoTemplate dataSource = context.getBean("mongoTemplate",MongoTemplate.class) ;
		System.out.println(dataSource.getDb());
	}
	
	@Test
	public void testInsert() throws SQLException {
		MongoDbTestDao mongo = context.getBean(MongoDbTestDao.class);
		HomeWork homeWork = new HomeWork();
		homeWork.setTitle("肖XX");
		homeWork.setPublished("publish");
		homeWork.setFinishedTime(new Date());
		mongo.insert(homeWork);
	}
	
	@Test
	public void testFindAll() throws SQLException{
		List<HomeWork> homeWorkList = mongo.findAll();
		for (HomeWork homeWork : homeWorkList) {
			System.out.println(homeWork.getTitle());
		}
		
	}
	
	@Test
	public void testFindById() throws SQLException{
		HomeWork homeWork = mongo.findById("5450ac45302d90a901d44bab");
		System.out.println(homeWork.getId());
		System.out.println(homeWork.getTitle());
	}
	
	@Test
	public void testUpdate() throws SQLException{
		mongo.update("5450ac45302d90a901d44bab", "张XX");
		HomeWork homeWork = mongo.findById("5450ac45302d90a901d44bab");
		System.out.println(homeWork.getId());
		System.out.println(homeWork.getTitle());
	}
	
	@Test
	public void testDelet() throws SQLException{
		mongo.delet("5450ac9d302d7da9a14a8821");
	}
	
	
	
}

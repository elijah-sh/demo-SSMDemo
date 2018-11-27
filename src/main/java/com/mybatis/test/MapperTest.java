package com.mybatis.test;

import com.counter.dto.Counter;
import com.counter.dto.Customer;
import com.counter.mapper.ActorMapper;
import com.counter.mapper.CounterMapper;
import com.counter.mapper.CustomerMapper;
import com.mybatis.dto.Actor;
import com.mybatis.dto.Language;
import com.mybatis.service.ActorService;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 测试dao层的工作
 *推荐Spring的项目就可以使用Spring的单元测试，可以自动注入我们需要的组件
 *1、导入SpringTest模块
 *2、@ContextConfiguration指定Spring配置文件的位置
 *3、直接autowired要使用的组件即可
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {

	@Autowired
	ActorMapper actorMapper;

	@Autowired
	CounterMapper counterMapper;

	@Autowired
	CustomerMapper customerMapper;

	@Autowired
	DataSource dataSource;

	@Test
	public void testCustomerMapper(){
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
	 	CustomerMapper bean = ioc.getBean(CustomerMapper.class);
		 Customer customer = new Customer();
		 customer.setCustomerId(1);
		 customer.setFirstName("Shen");
		 customer.setLastName("Shuai ");
	 	int result = bean.updateCustomer(customer); //bean.updateCustomer(customer);
		 System.out.println(result);
	/*	List list = new ArrayList();
		list.add("沈");
		list.add("张");


		List<Customer> customerList = bean.selectCustomersByforeach(list);
		System.out.println(customerList.size());*/


	}
	@Test
	public void testCounterMapper() {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		 CounterMapper mapper = ioc.getBean(CounterMapper.class);
	//	Counter counter = mapper.getCounter("add");

 List<Counter> counterList = mapper.findCounter();
	 	System.out.println(counterList.size());
	}
	@Test
	public void testCRUD(){
	 	//1、创建SpringIOC容器
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2、从容器中获取mapper
		/*CounterMapper mapper = ioc.getBean(CounterMapper.class);
		Counter counter = mapper.getCounter("add");
		System.out.println(counter.getCount());*/
		ActorMapper bean = ioc.getBean(ActorMapper.class);
		Actor actor = new Actor();
		// actor.setFirstName("shen");
		 actor.setLastName("帅");
		Language language = new Language();
		actor.setLanguage(language);
		List list = new ArrayList();
		list.add("沈");
		list.add("张");

		List<Actor> actorList =  actorMapper.selectActorsLike(actor);
		System.out.println(actorList);

		/*EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
		for(int i = 0;i<1000;i++){
			String uid = UUID.randomUUID().toString().substring(0,5)+i;
			mapper.insertSelective(new Employee(null,uid, "M", uid+"@atguigu.com", 1));
		}*/
//		System.out.println("批量完成");
		
	}

}

package org.zerock.sample;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.config.SingletonConfig;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {SingletonConfig.class})
@Log4j
public class SingletonConfigTest {
	@Autowired
	private Date date;
	
	@Autowired
	private Date date2;
	
	@Autowired
	@Qualifier("date")
	private Date date3;
	
	@Autowired
	private Singleton singleton;
	
	@Test
	public void testDate() {
		assert date.equals(date3);
		log.info(date);
		log.info(date.getTime());
		log.info(date2);
		log.info(date2.getTime());
		log.info(date3.getTime());
	}
	
	@Test
	public void testSingleton() {
		assert singleton.getDate().equals(date);
		log.info(singleton); // Singleton(date=...)
	}
}

package org.zerock.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MapperTests {

	@Test
	public void testSample() throws Exception {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		SampleDTO user = new SampleDTO();
		user.setName("홍길동");
		user.setAge(10);
		String json = objectMapper.writeValueAsString(user);
		log.info(json); // {"name":"홍길동", "age":10}
		assertEquals("{\"name\":\"홍길동\", \"age\":10}", json);
	}
	
}

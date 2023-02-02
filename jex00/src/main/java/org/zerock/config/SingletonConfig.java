package org.zerock.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zerock.sample.Singleton;

@Configuration
public class SingletonConfig {
	@Bean
	public Date date() { // 타입이 Date이고 ID가 date인 빈 등록
		return new Date(); // 현재 시간으로 딱 한 번 생성
	}
	
	@Bean
	public Date date2() { // 타입이 Date이고 ID가 date2인 빈 등록
		return new Date();
	}
	
	@Bean
	public Singleton singleton() {
		return new Singleton(date());
	}
}

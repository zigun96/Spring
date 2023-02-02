package org.zerock.config;

import javax.servlet.http.*;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class CharacterEncodingInterceptor extends HandlerInterceptorAdapter {

	private String charset;

	public CharacterEncodingInterceptor(String charset) {
		this.charset = charset;
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		response.setCharacterEncoding(charset);
		return true;
	}
}

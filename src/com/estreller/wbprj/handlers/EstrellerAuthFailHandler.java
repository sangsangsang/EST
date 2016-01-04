package com.estreller.wbprj.handlers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

public class EstrellerAuthFailHandler implements AuthenticationFailureHandler {

	@Override
	public void onAuthenticationFailure(HttpServletRequest request,
			HttpServletResponse response, 
			AuthenticationException exception)
			throws IOException, ServletException
	{
		System.out.println("인증실패");
		response.sendRedirect("/EST/home/loginPage?error=1");//인증실패시 되돌아가는페잊
		/*request.setAttribute("error", "아이디 또는 비밀번호가 잘못되었습니다.");
		request.getRequestDispatcher("/joinus/loginPage").forward(request,response);*/
		//super.onAuthenticationFailure(request, response, exception);
	
	}

}

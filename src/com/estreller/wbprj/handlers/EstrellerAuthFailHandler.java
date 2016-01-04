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
		System.out.println("��������");
		response.sendRedirect("/EST/home/loginPage?error=1");//�������н� �ǵ��ư�������
		/*request.setAttribute("error", "���̵� �Ǵ� ��й�ȣ�� �߸��Ǿ����ϴ�.");
		request.getRequestDispatcher("/joinus/loginPage").forward(request,response);*/
		//super.onAuthenticationFailure(request, response, exception);
	
	}

}

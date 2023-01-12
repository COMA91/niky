package kr.co.shop.customer.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession(false);
		
		if (session != null) {
			Object login = session.getAttribute("login");
			if (login == null) {
				
				String uri = request.getRequestURI();
				String query = request.getQueryString();
				
				String dest = query == null? uri : uri+"?"+query;
				
				session.setAttribute("dest", dest);
				
				response.sendRedirect("/customer/login");
				return false;
			}
			
		}else {
			
			session = request.getSession();
			
			String uri = request.getRequestURI();
			String query = request.getQueryString();
			
			String dest = query == null? uri : uri+"?"+query;
			
			session.setAttribute("uri", uri);
			session.setAttribute("dest", dest);
			
			response.sendRedirect("/customer/login");
			
			return false;
		}
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	
	}

	
	
}

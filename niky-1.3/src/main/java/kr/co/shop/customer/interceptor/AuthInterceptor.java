package kr.co.shop.customer.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import kr.co.shop.customer.domain.CustomerDTO;
import kr.co.shop.manager.domain.ManagerDTO;

public class AuthInterceptor extends HandlerInterceptorAdapter{
	
@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession();
		
		
			Object login = session.getAttribute("login");						
			
			
			
			if (login == null) {
				
				String uri = request.getRequestURI();
				String query = request.getQueryString();
				
				String dest = query == null? uri : uri+"?"+query;
				
				session.setAttribute("dest", dest);
				
				response.sendRedirect("/customer/login");
				return false;
			}else {
				
				
				if(login.getClass().equals(CustomerDTO.class)) {
					
					CustomerDTO dto = (CustomerDTO) login;
					String[] arr = request.getRequestURI().split("/");
		
					if(!dto.getId().equals(arr[arr.length-1])) {
						session.invalidate();
						response.sendRedirect("/customer/login");
						return false;
					}
					
				}else {
					if (! request.getRequestURI().contains("/customer/update") && ! request.getRequestURI().contains("/customer/updatepw") && ! request.getRequestURI().contains("/customer/delete")) {
						return true;
					}else {
						response.sendRedirect("/");
					}
					
				}
			}
			
		
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	
	}

	
	
}

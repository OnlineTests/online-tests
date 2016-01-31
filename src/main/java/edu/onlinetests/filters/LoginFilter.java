package edu.onlinetests.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.onlinetests.frontend.Pages;
import edu.onlinetests.model.User;
import edu.onlinetests.utils.SessionUtils;

public class LoginFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest)request;
		User user = (User) httpRequest.getSession().getAttribute(SessionUtils.SESSION_USER_KEY);
		if(user != null) {
			chain.doFilter(request, response);
		} else {
			((HttpServletResponse)response).sendRedirect(httpRequest.getContextPath() + Pages.LOGIN_PAGE_WITHOUT_REDIRECT);
		}
	}

	@Override
	public void destroy() {

	}

}

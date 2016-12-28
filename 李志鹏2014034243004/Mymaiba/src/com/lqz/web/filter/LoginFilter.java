package com.lqz.web.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lqz.util.UrlUtil;

@WebFilter("/*")
public class LoginFilter implements Filter {

	private String LOGON_URL = "/login/";

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException { // 过滤用户url， 进行权限控制
		System.out.println("------- login filter -------");
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		HttpSession session = httpServletRequest.getSession();
		ServletContext application = session.getServletContext();

		if (isLogonUrl(httpServletRequest.getRequestURI())) { // 如果是需要校验登录的页面
			System.out.println("------- 需要校验登录的页面 -------");

			if (session.getAttribute("user") == null) { // 用户没登录
				session.setAttribute("forwordURL", UrlUtil.getURL(httpServletRequest));
				System.out.println("------- " + httpServletRequest.getRequestURL() + " ----> 未登录\n");
				httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/result/user-non-login.jsp");
				return;
			} else {
				System.out.println("------- " + httpServletRequest.getContextPath() + " ----> 已登录\n");
				chain.doFilter(request, response); // 到达用户请求页面
			}
		} else { // 不需要登录权限既可以查看的页面
			System.out.println("------- 不需要登录权限既可以查看的页面 -------");
			System.out.println("------- " + httpServletRequest.getContextPath() + "\n");
			chain.doFilter(request, response);
		}

	}

	// 判断是否符合条件: url中包含有 */logon/*
	private boolean isLogonUrl(String requestURI) {
		return requestURI.contains(LOGON_URL);
	}

	@Override
	public void destroy() {

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}

}
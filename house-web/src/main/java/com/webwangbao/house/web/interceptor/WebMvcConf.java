package com.webwangbao.house.web.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author :wangbao02
 * @desc:拦截器注册
 */
@Configuration
public class WebMvcConf extends WebMvcConfigurerAdapter {

	//注入声明为bean的拦截器

	@Autowired
	private AuthActionInterceptor authActionInterceptor;
	
	@Autowired
	private AuthInterceptor authInterceptor;

	/**
	 * 进行拦截器拦截路径的注册
	 * @param registry
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry){
		 registry.addInterceptor(authInterceptor).excludePathPatterns("/static").addPathPatterns("/**");
		    registry
		        .addInterceptor(authActionInterceptor).addPathPatterns("/house/toAdd")
		        .addPathPatterns("/accounts/profile").addPathPatterns("/accounts/profileSubmit")
		        .addPathPatterns("/house/bookmarked").addPathPatterns("/house/del")
		        .addPathPatterns("/house/ownlist").addPathPatterns("/house/add")
		        .addPathPatterns("/house/toAdd").addPathPatterns("/agency/agentMsg")
		        .addPathPatterns("/comment/leaveComment").addPathPatterns("/comment/leaveBlogComment");
		    super.addInterceptors(registry);
	}

	
}

package com.FrontTarjetaFidelizacion.mvc.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.cglib.proxy.Dispatcher;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();

		webApplicationContext.setConfigLocation("com.FrontTarjetaFidelizacion.mvc.config");
		
		javax.servlet.ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcherServlet", new DispatcherServlet(webApplicationContext));
	
		dispatcher.addMapping("/");
		
		dispatcher.setLoadOnStartup(1);
	}

}

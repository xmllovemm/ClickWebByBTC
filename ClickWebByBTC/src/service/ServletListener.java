package service;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;

public class ServletListener implements ServletContext,ServletContextAttributeListener{
	private ServletContext context = null;
	
	public void contextInitialized(ServletContextEvent event) {
		context = event.getServletContext();
	}
	
	
	public void	contextDestroyed(ServletContextEvent event) {
		this.context = null;
	}
	
	public void attributeAdded(ServletContextAttributeEvent event) {
		
	}
	
	public void attributeRemoved(ServletContextAttributeEvent event) {
		
	}
	
	public void attributeReplaced(ServletContextAttributeEvent event)
	{
		
	}
}

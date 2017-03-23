package listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import util.AppConfig;

/**
 * Application Lifecycle Listener implementation class contextLinstener
 *
 */
public class contextLinstener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public contextLinstener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent event)  { 
        ServletContext context=event.getServletContext();
       AppConfig.setRootPath(context.getRealPath("/"));
       
    }
	
}

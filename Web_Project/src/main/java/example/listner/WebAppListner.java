package example.listner;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class WebAppListner
 *
 */
@WebListener
public class WebAppListner implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public WebAppListner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         System.out.println("Application is staring up...");
         //OBTAINING A HANDLE TO THE APPLICATION SPECIFIC OBJECT  I.E . SERVLETCONTEXT
         ServletContext appContext = sce.getServletContext();
         //BINDING SOME DATA AT APPLICATION LEVEL
         appContext.setAttribute("ourSlogan", "Change is the way of life");
         
         
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
    		System.out.println("Application is shuting down...");
    }
	
}

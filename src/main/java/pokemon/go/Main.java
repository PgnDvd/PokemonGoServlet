package pokemon.go;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;
import org.eclipse.jetty.servlet.ServletMapping;

public class Main {
	public static void main(String[] args) throws Exception
	{
                   
		ElasticServlet dotServlet = new ElasticServlet();
        
		ServletHandler handler = new ServletHandler();
		handler.addServletWithMapping(ElasticServlet.class, "/");

//		ServletMapping dotMapping = new ServletMapping();
//        dotMapping.setPathSpec("/asset");


	    Server server = new Server(8080);
//	    server.setHandler(new HelloHandler());
	    server.setHandler(handler);
		 
	    server.start();
	    server.join();
	}

}

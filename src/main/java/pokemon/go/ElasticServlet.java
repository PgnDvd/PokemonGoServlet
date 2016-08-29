package pokemon.go;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.GsonBuilder;
public class ElasticServlet extends HttpServlet {
	private final static Logger _LOG = LoggerFactory.getLogger(ElasticServlet.class);

	@Override
	@SuppressWarnings("restriction")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter writer = null;
		XMLStreamWriter xg = null;
		try {
			writer = response.getWriter();
			response.setContentType("application/xml; charset=utf8");

			_LOG.info("Servlet request {}", request);

			XMLOutputFactory xmlFactory = XMLOutputFactory.newInstance();
			xg = xmlFactory.createXMLStreamWriter(writer);

			xg.writeStartDocument();
			xg.writeStartElement("div");
			xg.writeStartElement("p");
			xg.writeCharacters("hello world");
			xg.writeEndElement();
			xg.writeEndElement();
			xg.writeEndDocument();

			if (xg != null) {
				xg.close();
			}
			if (writer != null) {
				writer.close();
			}
		}
		catch (IOException e) {
			_LOG.error("Caught an exception while processing Report request", e);
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		}
		catch (XMLStreamException e) {
			_LOG.error("Caught an exception while processing Report request", e);
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		}
		catch (Exception e) {
			_LOG.error("Caught an exception while processing Report request", e);
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		}
	}
}

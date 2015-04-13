package notebook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/")
public class HomeServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Notebook> empList = new ArrayList<Notebook>();
		Notebook notebook = new Notebook();
		notebook.setAge(3);
		request.setAttribute("htmlTagData", "<br/> creates a new line.");
		request.setAttribute("url", "http://www.journaldev.com");
//		RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
//		rd.forward(request, response);
	}

	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void destroy() {

	}
}
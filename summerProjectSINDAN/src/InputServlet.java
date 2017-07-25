import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InputServlet extends HttpServlet {
		public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws IOException,ServletException {
			req.setCharacterEncoding("Windows-31J");
			
			String name = req.getParameter("name");
			String pass = req.getParameter("pass");
			
			req.setAttribute("name", name);
			req.setAttribute("pass", pass);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("output");
			
			dispatcher.forward(req, res);
		}
}

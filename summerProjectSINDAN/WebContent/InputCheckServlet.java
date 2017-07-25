import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InputCheckServlet extends HttpServlet {
		public void doPost(HttpServletRequest req, HttpServletResponse res)
		throws IOException,ServletException {
			req.setCharacterEncoding("Windows-31J");
			
			String name = req.getParameter("name");
			
			req.setAttribute("name", name);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("outputCheck");
			
			dispatcher.forward(req, res);
		}
}

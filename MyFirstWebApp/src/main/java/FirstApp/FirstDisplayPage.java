package FirstApp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FirstDisplayPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public FirstDisplayPage() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pass=request.getParameter("pass");
		String cpass=request.getParameter("cpass");
		if(pass.equals(cpass))
		{
			response.sendRedirect("AfterLogin.jsp");
		}
		else
		{
			response.sendRedirect("LoginFail.jsp");
		}
	}

}

package WebApp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class GettingValues
 */
public class GettingValues extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GettingValues() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Id=request.getParameter("id");
		int id=Integer.parseInt(Id);
		String NAME=request.getParameter("name");
		String DEPT=request.getParameter("dept");
		String SALARY=request.getParameter("salary");
		Double sal=Double.parseDouble(SALARY);
		
		
		request.setAttribute("id",id);
		request.setAttribute("name",NAME);
		request.setAttribute("dept",DEPT);
		request.setAttribute("salary",sal);
		request.getRequestDispatcher("ValuesReceive.jsp").forward(request, response);
	}

}

package WebApp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import Employee.EmployeeDat;

/**
 * Servlet implementation class GetMethod
 */
public class GetMethod extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetMethod() {
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
		
		EmployeeDat emp=new EmployeeDat(id,NAME,DEPT,sal);
		//System.out.println(emp);
		
		request.setAttribute("EMP", emp);
		request.getRequestDispatcher("ObjectDisplay.jsp").forward(request, response);
		
//		InsertDataByMethods insert=new InsertDataByMethods();
//		
//		try {
//			insert.insert();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}

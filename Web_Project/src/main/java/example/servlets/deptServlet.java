package example.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import example.dao.AppDao;
import example.dao.DepartmentDao;
import example.entity.Department;

/**
 * Servlet implementation class deptServlet
 */
@WebServlet("/deptSearch")
public class deptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deptServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String dept_no = request.getParameter("dept_no");
		int deptNo = Integer.parseInt(dept_no);
		AppDao<Department, Integer> daoRef = new DepartmentDao();
		Department searchedDept = daoRef.getById(deptNo);
		RequestDispatcher dispatcher = null;
		if(searchedDept == null) {//IF DEPT ID DOES NOT EXIT
			//GO BACK
			dispatcher = request.getRequestDispatcher("deptSearch.html");
			out.println("<h1>Department not Found, try again...</h1>");
			dispatcher.include(request, response);
		}
		else {
			//GO HEAD
			dispatcher = request.getRequestDispatcher("DeptView");
			//ATTATCHING THE LOADED DEPT DATA TO THE EXISTING REQUEST
			request.setAttribute("LoadedDept", searchedDept);
			dispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

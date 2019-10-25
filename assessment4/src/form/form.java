package form;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 * Servlet implementation class form
 */
@WebServlet("/form")
public class form extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public form() {
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
		// TODO Auto-generated method stub
		doGet(request, response);
	HttpSession session = request.getSession();
String opt=request.getParameter("optradio");
		switch(opt) {
		case "job offered":
			
			session.setAttribute("id",opt);
			request.getRequestDispatcher("add").forward(request, response);
			break;
		case "gig offered":
			session.setAttribute("id",opt);
			request.getRequestDispatcher("add").forward(request, response);
			break;
		case "resume/job wanted":
			session.setAttribute("id",opt);
			request.getRequestDispatcher("add").forward(request, response);
			break;
		case "housing offered":
			session.setAttribute("id",opt);
			request.getRequestDispatcher("add").forward(request, response);
			break;
		case "housing wanted":
			session.setAttribute("id",opt);
			request.getRequestDispatcher("add").forward(request, response);
			break;
		case "for sale by owner":
			session.setAttribute("id",opt);
			request.getRequestDispatcher("add").forward(request, response);
			break;
		case "for sale by dealer":
			session.setAttribute("id",opt);
			request.getRequestDispatcher("add").forward(request, response);
			break;
		case "wanted by owner":
			session.setAttribute("id",opt);
			request.getRequestDispatcher("add").forward(request, response);
			break;
			
		case "wanted by dealer":
			session.setAttribute("id",opt);
			request.getRequestDispatcher("add").forward(request, response);
			break;
		case "service offered":
			session.setAttribute("id",opt);
			request.getRequestDispatcher("add").forward(request, response);
			break;
		case "community":
			session.setAttribute("id",opt);
			request.getRequestDispatcher("add").forward(request, response);
			break;
		case "event/class":
			session.setAttribute("id",opt);
			request.getRequestDispatcher("add").forward(request, response);
			break;
			
			
			
			
			
		
		
		}
		
	}

}

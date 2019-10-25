package add;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

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
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;


/**
 * Servlet implementation class add
 */
@WebServlet("/add")
public class add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
		MongoDatabase database = mongoClient.getDatabase("date");
		MongoCollection<Document> collection = database.getCollection("ad");
		List<ad> ads=new LinkedList<>();
		HttpSession session = request.getSession();
		String id1=(String) session.getAttribute("id");
		//String id1=request.getParameter("lol");
		MongoCursor<Document> cursor1 =  collection.find(Filters.eq("id",id1)).iterator();
		while (cursor1.hasNext()) {
			Document d = (Document) cursor1.next();

			ad ad1 = new ad(d.getString("id"), d.getString("title"), d.getString("city"),d.getString("pin"),d.getString("desp"),d.getString("email"),d.getString("phone"));
			ads.add(ad1);		
			}
		request.setAttribute("ad", ads);
		request.getRequestDispatcher("form.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
		MongoDatabase database = mongoClient.getDatabase("date");
		MongoCollection<Document> collection = database.getCollection("ad");
		String id1=request.getParameter("lol");
		HttpSession session = request.getSession();
		if(request.getParameter("title")!=null) {
		String title=request.getParameter("title");
		String city=request.getParameter("city");
		String pin=request.getParameter("pin");
		String desp=request.getParameter("desp");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String opt=request.getParameter("optradio");
	
		//String id1=(String) session.getAttribute("lol");
		request.setAttribute("id1",id1);
		Document doc=new Document().append("id",id1).append("title", title).append("city",city).append("pin",pin).append("desp",desp).append("email",email).append("phone", phone);
		collection.insertOne(doc);
		List<ad> ads=new LinkedList<>();
		MongoCursor<Document> cursor =  collection.find(Filters.eq("id",id1)).iterator();
		while (cursor.hasNext()) {
			Document d = (Document) cursor.next();

			ad ad1 = new ad(d.getString("id"), d.getString("title"), d.getString("city"),d.getString("pin"),d.getString("desp"),d.getString("email"),d.getString("phone"));
			ads.add(ad1);		
			}
		request.setAttribute("ad", ads);
		String s=request.getParameter("add");
		
		
		
		
		
		}
		String s=request.getParameter("add");
		
			request.getRequestDispatcher("form.jsp").forward(request, response);
		
		
	}

}

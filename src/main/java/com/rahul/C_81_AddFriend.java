package com.rahul;


import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class C_81_AddFriend
 */
@WebServlet("/addFriend")
public class C_81_AddFriend extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DAO_81_FriendDao friendDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public C_81_AddFriend() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		friendDao = new DAO_81_FriendDao();
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int age;
		try {
			age = Integer.parseInt(request.getParameter("age"));
		}
		catch (Exception e) {
			age = 0;
		}
		
		String favouriteColor = request.getParameter("favouriteColor");
		
		//Validation for name
		if(!name.isEmpty()) {
			
			M_81_Friend friend = new M_81_Friend(name, email, age, favouriteColor);
			
			friendDao.insertFriend(friend);
		}
		
		response.sendRedirect("V_81_Friends.jsp");
	}

}

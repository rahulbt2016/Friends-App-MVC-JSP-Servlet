package com.rahul;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class C_81_DeleteFriend
 */
@WebServlet("/deleteFriend")
public class C_81_DeleteFriend extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DAO_81_FriendDao friendDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public C_81_DeleteFriend() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		
		friendDao = new DAO_81_FriendDao();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		friendDao.deleteFriend(id);
		response.sendRedirect("V_81_Friends.jsp");
	}

}

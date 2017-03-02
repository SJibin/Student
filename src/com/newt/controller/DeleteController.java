package com.newt.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.newt.dao.StudentDAO;

public class DeleteController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String sid = request.getParameter("id");
		int id = Integer.parseInt(sid);
		int status = StudentDAO.delete(id);
		if (status > 0) {
			out.println("<p>Record Delete successfully!</p>");
			request.getRequestDispatcher("StudentReg.jsp").include(request, response);
		} else {
			log("Sorry! unable to Delete record");
		}
	}
}

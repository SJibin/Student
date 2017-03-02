package com.newt.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.newt.dao.StudentDAO;
import com.newt.entity.Student;

public class UpdateController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		Date admissionDate = null;
		java.sql.Date sqlDate = null;
		String id = request.getParameter("sId");
		int sId = Integer.parseInt(id);
		String name = request.getParameter("sName");
		String cntNo = request.getParameter("contactNo");
		long contactNo = Long.parseLong(cntNo);
		String pertge = request.getParameter("percentage");
		double percentage = Double.parseDouble(pertge);
		String admDate = request.getParameter("admissionDate");
		try {
			admissionDate = new SimpleDateFormat("YYYY-MM-dd").parse(admDate);
			sqlDate = new java.sql.Date(admissionDate.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Student s = new Student();
		s.setsId(sId);
		s.setsName(name);
		s.setContactNo(contactNo);
		s.setPercentage(percentage);
		s.setAdmissionDate(sqlDate);

		int status = StudentDAO.update(s);
		if (status > 0) {
			out.println("<p>Record Updated successfully!</p>");
			request.getRequestDispatcher("StudentReg.jsp").include(request, response);
		} else {
			log("Sorry! unable to Update record");
		}

		out.close();
	}
}

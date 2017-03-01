package com.newt.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import com.newt.entity.Student;


public class StudentDAO {
	public static int save(Student s) {
		int status = 0;
		try {
			Connection con = Database.getConnection();
			PreparedStatement ps = con
					.prepareStatement("insert into student(sId,sName,contactNo,percentage,admissionDate) values (?,?,?,?,?)");
			ps.setInt(1, s.getsId());
			ps.setString(2, s.getsName());
			ps.setLong(3, s.getContactNo());
			ps.setDouble(4, s.getPercentage());
			ps.setDate(5, (Date) s.getAdmissionDate());

			status=ps.executeUpdate();

			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return status;

	}

	public static int update(Student s) {
		int status = 0;
		try {
			Connection con = Database.getConnection();
			PreparedStatement ps = con
					.prepareStatement("update student set sName=?,contactNo=?,percentage=?,admissionDate=? where sId=?");
			
			ps.setString(1, s.getsName());
			ps.setLong(2, s.getContactNo());
			ps.setDouble(3, s.getPercentage());
			ps.setDate(4, (Date) s.getAdmissionDate());
			ps.setInt(5, s.getsId());

			status = ps.executeUpdate();

			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return status;
	}

	public static int delete(int id) {
		int status = 0;
		try {
			Connection con = Database.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from student where sId=?");
			ps.setInt(1, id);
			status=ps.executeUpdate();

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;

	}
}

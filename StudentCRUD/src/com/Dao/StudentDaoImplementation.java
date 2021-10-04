package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.Configuration.DBConnect4;
import com.Model.Student;

public class StudentDaoImplementation implements StudentDao
{
	public boolean addStudent (Student s)
	{
		try (Connection con = DBConnect4.getConnection();
	PreparedStatement pst = con.prepareStatement("insert into student values (?,?,?,?,?,?) "))
			{
				pst.setInt(1, s.getSid());
				pst.setString(2, s.getSname());
				pst.setString(3, s.getAddress());
				pst.setString(4, s.getMobno());
				pst.setString(5, s.getEmailId());
				pst.setString(6, s.getQualification());
				pst.executeUpdate();
				return true;	
			} 
		catch (SQLException e)
			{
				e.printStackTrace();
			}
		return false;
	}	
	
	public boolean updateStudent (Student s)
	{
		try (Connection con1 = DBConnect4.getConnection();
	PreparedStatement pst1 = con1.prepareStatement ("update student set sname= ? where sid = ? "))
			{
				pst1.setString(2, s.getSname());
				pst1.setInt(1, s.getSid());
				pst1.executeUpdate();
				return true;
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		return false;
	}
	
	public boolean deleteStudent (int id) 
	{
		try (Connection con2 = DBConnect4.getConnection();
				PreparedStatement pst2 = con2.prepareStatement ("delete from student where sid = ? "))
		{
			pst2.setInt(1, id);
			pst2.executeUpdate();
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return false;
	}			
	public List<Student> getAllStudents()
	{
		ArrayList <Student> studlist = new ArrayList <>();
		try (Connection con3 = DBConnect4.getConnection();
				PreparedStatement pst3 = con3.prepareStatement (" select * from student "))
		{		
			ResultSet rs = pst3.executeQuery();
			
			while (rs.next())
			{
				Student s = new Student ();
				s.setSid(rs.getInt(1));
				s.setSname(rs.getString(2));
				studlist.add(s);
			}
		}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
			return studlist;
		}

	
				
}

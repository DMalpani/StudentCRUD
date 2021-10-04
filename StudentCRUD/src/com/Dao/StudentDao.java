package com.Dao;
 
import java.util.List;
import com.Model.Student;


public interface StudentDao 
{
	boolean addStudent (Student s);
	boolean updateStudent (Student s);
	boolean deleteStudent (int id);
	List <Student> getAllStudents();
	
}

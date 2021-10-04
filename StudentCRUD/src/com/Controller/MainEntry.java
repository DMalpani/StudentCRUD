package com.Controller;
import java.util.List;
import java.util.Scanner;

import com.Model.Student;
import com.Dao.StudentDao;
import com.Dao.StudentDaoImplementation;

public class MainEntry 
{

	public static void main(String[] args) 
	{
				
				StudentDaoImplementation sdao = new StudentDaoImplementation ();	//StudentDao object creation
	
				do {
					Scanner sc = new Scanner(System.in);
					System.out.println("Welcome Student CRUD System");
					System.out.println("1->Add \n2->Update \n3->Delete \n4->View All Student \n5->Exit");
					System.out.println("Enter your choice");
					int choice = sc.nextInt();
					switch (choice) 
					{
						
				case 1: System.out.println("Enter sid,sname,address,mobno,email_id,qualification");
						int sid = sc.nextInt();
						String sname = sc.next();
						String address = sc.next();
						String mobno = sc.next();
						String email_id = sc.next();
						String qualification = sc.next();
						
						Student s1 = new Student(sid,sname,address,mobno,email_id,qualification);	//Student object creation
						
						boolean isinsert = sdao.addStudent(s1);
						
						if (isinsert)
							System.out.println("Record added sucessfully");
						else
							System.out.println("Unsucessful insertion");
						break;
						
				case 2: System.out.println("In Updation");
						System.out.println("Enter sid to update");
						int id = sc.nextInt();
						System.out.println("Enter new sname");
						String nm = sc.next();
						Student s2 = new Student ();
						s2.setSid(id);
						s2.setSname(nm);
						
						boolean isUpdated = sdao.updateStudent(s2);
						
						if (isUpdated)
							System.out.println("Record updated sucessfully");
						else
							System.out.println("Unsucessful updation");
						break;
						
				case 3: System.out.println("Enter id to delete");
						int id1 = sc.nextInt();
						Student s3 = new Student ();
					
						boolean isDelete = sdao.deleteStudent(id1);
						
						if (isDelete)
							System.out.println("Record updated sucessfully");
						else
							System.out.println("Unsucessful updation");
						break;
						
				
				case 4: List <Student> studlist =sdao.getAllStudents();
				
						for (Student ss : studlist)
						{
							System.out.println(ss);
						}
						break;
					}
					
				if (choice == 5)
				{
					System.out.println("Exit : Thank you...!!!");
				}
					break;
					
				} while (true);
			
			}
       }







	
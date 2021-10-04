package com.Model;

public class Student {
	private int sid;
	private String sname;
	private String address;
	private String mobno;
	private String email_id;
	private String qualification;
	
	public Student ()
	{
		
	}
	
	public Student(int sid,String sname,String address, String mobno,String email_id,String qualification)
	{
		this.sid = sid;
		this.sname = sname;
		this.address = address;
		this.mobno = mobno;
		this.email_id = email_id;
		this.qualification = qualification;
	}
	
	public void setSid (int sid)
	{
		this.sid = sid;
	}
	public int getSid ()
	{
		return sid;
	}
	public void setSname(String sname)
	{
		this.sname = sname;
	}
	public String getSname ()
	{
		return sname;
	}
	public void setAddress (String address)
	{
		this.address = address;
	}
	public String getAddress()
	{
		return address;
	}
	public void setMobno (String mobno)
	{
		this.mobno = mobno;
	}
	public String getMobno ()
	{
		return mobno;
	}
	public void setEmailId (String email_id)
	{
		this.email_id = email_id;
	}
	public String getEmailId ()
	{
		return email_id;
	}
	public void setQualification (String qualification)
	{
		this.qualification = qualification;
	}
	public String getQualification ()
	{
		return qualification;
	}
	
	public String toString ()
	{
		return "Student [sid= " + sid + ",sname= " + sname + ","
				+ "address= " + address + ",mobno= " + mobno + ",email_id= " + email_id + ",qualification= " + qualification + "]";
	}


}

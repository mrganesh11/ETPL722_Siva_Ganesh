import com.webobjects.foundation.NSMutableArray;
public class EmployeeBean 
{
	String myName;
	String address;
	String selectbg;
	double Salary;
	public String gender;
	protected NSMutableArray KL;
	protected NSMutableArray skillListP;
	public String getMyName() 
	{
		return myName;
	}
	public void setMyName(String myName) 
	{
		this.myName = myName;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getSelectbg() 
	{
		return selectbg;
	}
	public void setSelectbg(String selectbg) 
	{
		this.selectbg = selectbg;
	}
	public double getSalary() 
	{
		return Salary;
	}
	public void setSalary(double salary)
	{
		Salary = salary;
	}
	public String getGender() 
	{
		return gender;
	}
	public void setGender(String gender) 
	{
		this.gender = gender;
	}
	public NSMutableArray getKL()
	{
		return KL;
	}
	public void setKL(NSMutableArray kL) 
	{
		KL = kL;
	}
	public NSMutableArray getSkillListP()
	{
		return skillListP;
	}
	public void setSkillListP(NSMutableArray skillListP)
	{
		this.skillListP = skillListP;
	}
}

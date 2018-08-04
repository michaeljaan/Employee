//employee class
public class Employee
{
	private final int id=101;//employee ID(attributes)
	private String name;//Employee Name(attributes)
	private double monthlyBasic;//(attributes)
	
	double MonthlyGrossSalary;
	double MonthlyDeduction;
	double MonthlyTakeHome;
	static double pf;
	
		
	public int getId()//getter
	{
		return id;
	}


	public String getName()//getter
	{
		return name;
	}


	public void setName(String name)//getter
	{
		this.name = name;
	}
	
	public double getMonthlyBasic() //getter
	{
		return monthlyBasic;
	}

	public void setMonthlyBasic(double monthlyBasics)//setter
	{
		this.monthlyBasic = monthlyBasics;
	}

	double getAnnualBasic()//calculte Annual basic
	{
		double annualBasics= monthlyBasic * 12;
		return annualBasics;
	}
	
	public double getMonthlyGrossSalary()//calculate Monthly Gross
	{
		double hra= monthlyBasic*0.5;
		double medical=1250, conveyance=800;
		MonthlyGrossSalary= monthlyBasic + medical + conveyance +hra;
		return MonthlyGrossSalary;
	}
	
	double getAnnualGrossSalary()//calculate annual Gross
	{
		double AnnualGrossSalary = 12 * MonthlyGrossSalary;
		return AnnualGrossSalary;
	}
	
	double getMonthlyDeduction()//calculate monthly Deduction
	{
		double pf,esic,profTax;
		if(monthlyBasic > 6500)
		{
		pf =monthlyBasic * 0.1;
		}
		else
		{
			pf = 6500;
		}
		if(monthlyBasic<=5000)
		{
		esic= monthlyBasic * 0.475;
		}
		else
		{
			esic=0;
		}
		if(monthlyBasic <=10000)
		{
			profTax=50;
		}
		else
		{
		profTax=100;
		}
		MonthlyDeduction= pf + esic + profTax;
		return MonthlyDeduction;
	}
	
	double getMonthlyTakeHome()//calculate monthly take_home
	{
		MonthlyTakeHome= MonthlyGrossSalary-MonthlyDeduction;
		return MonthlyTakeHome;
	}
	
	double getAnnualTakeHome()//calculate Annual take home
	{
		double AnnualTakeHome= MonthlyTakeHome*12;
		return AnnualTakeHome;
	}
	
	public static double getPf()//getter 
	{
		return pf;
	}
	
	public static void setPf(double pf)//setter
	{
		Employee.pf = pf;
	}
}

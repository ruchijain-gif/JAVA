import java.time.LocalDate;
import java.time.Period;
class assignment_3
{
	public static void main(String args[])
	{
		
		
		LocalDate joiningDate = LocalDate.of(2018,5,5);
		Period d = Period.between(joiningDate,LocalDate.now());
		int days = d.getDays(); 
		int months = d.getMonths(); 
		int years = d.getYears();
		System.out.println("Experience : " + years + " years " + months + " months " + days + " days." );
		
	}
}

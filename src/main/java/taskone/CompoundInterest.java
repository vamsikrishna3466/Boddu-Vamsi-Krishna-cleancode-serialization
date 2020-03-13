
package taskone;
public class CompoundInterest {
	public double compoundInterestCalculation(double princple,double rateofinterest,
			double timeperiod,String type)
	{
		Period periodTypeObject;
		double value=(1+(rateofinterest)/100.00);
		if(type.equalsIgnoreCase("Annually"))
				{
			periodTypeObject=new Annually(); 
				}
		else if(type.equalsIgnoreCase("halfyearly"))
		{
	periodTypeObject=new HalfYearly(); 
		}
		else if(type.equalsIgnoreCase("quarterly"))
		{
	periodTypeObject=new Quaterly(); 
		}
		else
		{
			return 0.0;
		}
		double amount=periodTypeObject.calculation(value, timeperiod);
		return (amount*princple-princple);
		
	
	}
}

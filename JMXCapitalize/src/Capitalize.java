
public class Capitalize implements CapitalizeMBean {
	private String capitalizer="default";
	public void setCapitalize(String capitalizer)
	{
		this.capitalizer=capitalizer;
	}
	public String getCapitalize()
	{
		return capitalizer;
	}
	public String Convertor(String s1)
	{
		String temp=s1;
		if(capitalizer=="small")
			return temp.toLowerCase();
		else if(capitalizer=="capital")
			return temp.toUpperCase();
		return temp;
	}

}
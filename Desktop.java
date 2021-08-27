package w3.Day2.Assgmt;

interface Software
{
	void softwareResources();
}

interface Hardware
{
	void hardwareResources();
}

class Desktop implements Software,Hardware
{
	void desktopModel() {
		System.out.println("Method from class called dekstopModel");
	}

	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Method from interface1 called hardwareResouces");
		
	}

	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Method from interface2 called softwareResouces");
		
	}
	
	public static void main(String args[])
	{
		Desktop obj = new Desktop();
		obj.desktopModel();
		obj.hardwareResources();
		obj.softwareResources();
		System.out.println("Hence Multiple Inheritance proved.");
	}	
}
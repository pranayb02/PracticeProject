package PracticePackage;

public class PracticeClass {

	public static void main(String[] args) {
		
		           float score=1.85f;
		           
				    if (score >=0.9 & score<=1.0)
				    {
					System.out.println("Your grade is A");
				    }
				    else if (score<0.9 & score>=0.8)
				    {
					System.out.println("Your grade is B");	
				    }
				    else if (score<0.8 & score>=0.7)
				    {
					System.out.println("Your grade is C");
				    }
				    else if (score<0.7 & score>=0.6)
				    {
				    System.out.println("Your grade is D");
				    }
				    else if (score<0.6)
				    {
				    	System.out.println("Your grade is F");
				    }
				    
				    else
				    {
				    	System.out.println("Please enter score between '0.0-1.0' ");
				    }
	}
	
	public void PracticeMethod()
	{
		System.out.println("Method is Dummy");
	}
	
	public void GitPurpose() 
	{
		System.out.println("Again dummy method");
	}
				    
	}



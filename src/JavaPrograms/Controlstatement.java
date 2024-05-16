package JavaPrograms;

public class Controlstatement {

	public static void main(String[] args) {
		
		
		// if condition or statement 
		
		
		int num=3;      // variable initialization
		
		
		if (num <10)                        // condition 
		{
			
			System.out.println("number is smaller than 10 ");            // Block of code
			
		}
		
System.out.println("================If condition end===============================");
		

//if-else  condition 
		
		
		int x=35;
		
		if(x<30)
		{
			
			System.out.println("x is smaller value ");
		}
		
		else
		{
			
			System.out.println("x is grater value");
		}
		
		
		System.out.println("================if else condition end ==================================================");
		
		
		//else if condition 
		
		
		int age=50;
		
		if (age<20)
		{
			System.out.println("he is child");
		}
		
		else if (age<40)
		{
			System.out.println("he is young man");
		}
		
		else
		{
			System.out.println("he is older ");
		}
		
		
		System.out.println("================else if  condition end ==================================================");
		
		
		
		// Nested if 
		
		
		String un ="abc";
		
		String pwd="XYZ";
		
		
		if (un=="abc")
		{
			
			if (pwd=="XYZ")
			{
				System.out.println("Login successful");	
				
			}
			
			else 
			{
				
				System.out.println("wrong password");
			}
			
	     }
		
		else 
		{
			System.out.println("wrong username");
		}
		
			
	
		System.out.println("================nested if  condition end ==================================================");
		
		
		//Switch statement - instead of number of if else statement we can use switch statement 
		
		
		int day=8;
		
		switch(day)
		{
		
		case 1:
			
			System.out.println("monday");

		break;
		
        case 2:
			
			System.out.println("Tuesday");

		break;
		
        case 3:
			
			System.out.println("Wednesday");

		break;
		
        case 4:
		
		System.out.println("Thurseday");

		break;
		
        case 5:
		
		System.out.println("Friday");

		break;
		
        case 6:
		
		System.out.println("Saturday");

		break;
		
        case 7:
    		
    		System.out.println("Sunday");

    		break;
    		
		
        default:
		
		System.out.println("This is out of calender");

		
		}
		
	}

}

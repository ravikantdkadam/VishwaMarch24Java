package OOpsPrograms;

public class TestInterface {
	
	
	

	public static void main(String[] args) {
		
		ICICIBank i1= new ICICIBank();                      // object of ICICI Bank 
		
		i1.eduloan();
		i1.homeloan();
		i1.goldloan();
		i1.mutualfund();
		
	
		
		System.out.println(RBIBank.loan);
	}

}



public class Passengers {
	String pgr;  //passenger
	static String adr; // address
	static String cont; //contact
 	
	private static int idCounter; //private static int attribute in the Passenger class and name it idCounter.
	
	public Passengers(String address, String contact){
		adr= address;
		cont=contact;
		int id= idCounter;
		 
	  
	
	}
	
	
	private static class Address{
		String Adr = adr;
		String Street;
		String State;
		String City;
		public String getAdr() {
			return Adr;
		}
		
		
		public void setAdr(String Adr) {
			this.Adr= Adr;
		}
	}
	private static class Contact {
		String Cont = cont;
		String Name;
		String PhoneNumber;
		String EmailId;
		public String getCont() {
			return Cont;
		}
		
		public void setCont(String Cont) {
			this.Cont= Cont;
		}
	}

	public int getPassengerCount(){
		idCounter= idCounter +1;  //In the Passenger constructor, you can initialize the id attribute with idCounter and increment the idCounter by one.
		return idCounter;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        
        
	}

}

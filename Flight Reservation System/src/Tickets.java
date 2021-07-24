
public abstract class Tickets {
	String ticket;
	String flight;
	String regularTickets;
	String touristTickets;
	
	//parameterized constructor inside the Ticket class to initialize all the common attributes.
	public Tickets(String ticket, String flight,String regularTickets, String touristTickets){
		this.ticket = ticket;
		this.flight = flight;
		this.regularTickets = regularTickets;
		this.touristTickets = touristTickets;
	}
	
	
	public String getTicket() {
		String PNR = "186154161"; 	
		System.out.println(PNR);
		 return ticket; 
		 
	 }
     public void setTicket(String ticket) {
    	 
    	 this.ticket= ticket;
    	 
     }
      // code reusability
 	public String getRegTickets() { //getter & setter of child (Regular tickets)class
		 String PNR="13879247881";
		 
		 return regularTickets; 
	 }
    public void setRegTickets(String regularTickets) {
   	 
   	 this.regularTickets= regularTickets;
   	 
    }
    
    
     public String getTourTickets() { // getter & setter of child (Tourist tickets)class 
 		 return touristTickets; 
	 }
     public void setTourTicket(String touristTickets) {
    	 
    	 this.touristTickets= touristTickets;
    	 
     }


	public class RegularTickets extends Tickets{
		 	public RegularTickets(){
		 		
		 	
		 	}
	
	 		
	 		
	     public  void printTicketDetails(String ticket) {
	    	 String PNR = this.ticket;
	    	
			 System.out.println("YOUR PNR:"+ PNR);
			  
			}
		
	}
	public class TouristTickets extends Tickets{
		
		public TouristTickets(){
			super();	
			
		}
		
	     public  void printTicketDetails(String ticket) {
	    	 String PNR = this.ticket;
			 System.out.println("YOUR PNR:"+ PNR);
			  
			}

	}
		
    	
    	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	
    	Tickets obj1 = new RegularTickets();
    	Tickets obj2 = new TouristTickets();
    	obj1.printTicketDetail("1564186418");
		obj2.printTicketDetail("1864348152");
		
		
	}
	
}
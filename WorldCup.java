package Cricket;

public class WorldCup extends AsiaCup implements AfricaCup {

	private String ballBrand;
	private int ticketPrice;
	private int sitNumber;
	
	public WorldCup () {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public WorldCup(String ballBrand, int ticketPrice, int sitNumber) {
		super();
		this.ballBrand = ballBrand;
		this.ticketPrice = ticketPrice;
		this.sitNumber = sitNumber;
	}
	public String getBallBrand() {
		return ballBrand;
	}
	public void setBallBrand(String ballBrand) {
		this.ballBrand = ballBrand;
	}
	public int getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public int getSitNumber() {
		return sitNumber;
	}
	public void setSitNumber(int sitNumber) {
		this.sitNumber = sitNumber;
	}
	public void groupA() {
		System.out.println("In group A : Australia, India, Pakistan");
		
	}
	public void groupB() {
		System.out.println("In group B : SouthAfrica, England, Bangladesh");
		
	}
	public void groupC() {
		System.out.println("In group C : Zimbabwe, West-Indies, Sri-Lanka");
		
	}

	public void superSix() {
		System.out.println("In Super Eight : SouthAfrica, England, Bangladesh, Australia, India, Pakistan ");
		
	}

	public void quaterFinal() {
		System.out.println("In Quater Final : SouthAfrica, England, Bangladesh, Australia");
		
	}
	
	public void superEight() {
		System.out.println("Only 2 teams made it to the final : Bangladesh, Australia");
		
		
	}
	

}

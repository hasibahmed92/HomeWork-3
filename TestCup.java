package Cricket;

public class TestCup {

	public static void main(String[] args) {
		
		AfricaCup ap = new WorldCup();
        ap.groupA();
        ap.groupB();
        ap.groupC();
        
        AsiaCup asp = new WorldCup();
        asp.groupA();
        asp.groupB();
        asp.groupC();
        asp.quaterFinal();
        asp.semiFinal();
        asp.superEight();
        
        WorldCup wc = new WorldCup();
        wc.groupA();
        wc.groupB();
        wc.groupC();
        wc.quaterFinal();
        wc.semiFinal();
        wc.superEight();
        wc.semiFinal();
        
        WorldCup wcc = new WorldCup("Kokabura", 100, 60);
        
        System.out.println("Name of the BrandBall Name : " +wcc.getBallBrand()+ "Ticket price " +wcc.getTicketPrice()+ " Sit Number :" +wcc.getSitNumber());
	}

}

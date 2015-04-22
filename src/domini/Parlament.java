package domini;

import java.util.Vector;

public class Parlament {
	private Vector<Diputat> diputats;
	public Parlament() {
		diputats=new Vector<Diputat>();
		Diputat lol=new Diputat("antonio");
		Diputat lol2=new Diputat("jose");
		diputats.addElement(lol2);
		diputats.addElement(lol);
	}
	public Vector<Diputat> getParlament(){
		
		return (Vector<Diputat>) diputats.clone();
	}
}
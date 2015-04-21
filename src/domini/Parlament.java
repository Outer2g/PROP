package domini;

import java.util.Vector;

public class Parlament {
	private Vector<Diputat> diputats;
	public Vector<Diputat> getParlament(){
		Diputat lol=new Diputat("antonio");
		Diputat lol2=new Diputat("jose");
		diputats.add(lol2);
		diputats.add(lol);
		return diputats;
	}
}
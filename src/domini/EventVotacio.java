package domini;

import java.util.ArrayList;
import java.util.Date;

public class EventVotacio extends Event {
	private ArrayList[] votacions;
	public EventVotacio(String tipusEvent, Date dataEvent, String nomEvent) {
		super(tipusEvent, dataEvent, nomEvent);
	}
	public EventVotacio(Date dataEvent,String nomEvent){
		super("Votacio",dataEvent,nomEvent);
		votacions= new ArrayList[4];
	}
	public void IntroduirDades(int diputat,int votacio){
		votacions[votacio].add(diputat);
	}
	public ArrayList[] consultaVotacions(){
		return votacions.clone();
	}
}

package domini;

import java.util.ArrayList;

public class EventVotacio extends Event {
	private ArrayList[] votacions;
	public EventVotacio(String tipusEvent, Data dataEvent, String nomEvent) {
		super(tipusEvent, dataEvent, nomEvent);
	}
	public EventVotacio(Data dataEvent,String nomEvent){
		super("Votacio",dataEvent,nomEvent);
		votacions= new ArrayList[4];
	}
	public void IntroduirDades(Integer diputat,int votacio){
		votacions[votacio].add(diputat);
	}
	public ArrayList[] consultaVotacions(){
		return votacions.clone();
	}
}

package domini.drivers;

import domini.Data;
import domini.EventVotacio;

public class EventVotacioDriver {
	private static EventVotacio evento;

	public static void main(String[] args) {
		try{
			Data data = new Data(15,3,2015);
		evento= new EventVotacio(data,"Votacio1");
		}
		catch(Exception e){	
		}
		
	}

}

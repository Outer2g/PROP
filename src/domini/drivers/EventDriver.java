
	package domini.drivers;

	import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

import domini.Diputat;
import domini.Event;

	public class EventDriver {
		public static Event evento;
		public static Scanner inputs= new Scanner(System.in);
		public static void imprimeDiputados(){
			int n=evento.consultarAssociats().size();
			System.out.print("diputats: ");
			for(int i=0;i<n;++i){
				System.out.print(evento.consultarAssociats().get(i).nom+" ");
			}
			System.out.println();
		}
		private static void tryAssociarDiputat(){
			System.out.print("especifiqui el diputat que vol associar:");
			String s=inputs.next();
			Diputat d= new Diputat(s);
			evento.associarDiputat(d);
		}
		private static void tryEliminarDiputat(){
			System.out.print("especifiqui el diputat que vol desassociar");
			String s=inputs.next();
			Diputat d=new Diputat(s);
			evento.eliminarDiputat(d);			
		}
		private static void tryAssociarDiputats(){
			System.out.print("Especifiqui el numero de diputats a associar:");
			int n=inputs.nextInt();
			Vector<Diputat> v = new Vector<Diputat>(n);
			System.out.print("Especifiqui els diputats: ");
			Diputat d;
			for(int i=0;i<n;++i){
				String s=inputs.next();
				d=new Diputat(s);
				v.addElement(d);
			}
			evento.associarDiputats(v);
		}
		private static void tryEliminarDiputats(){
			System.out.print("Especifiqui el numero de dipuats a desassociar: ");
			int n= inputs.nextInt();
			Vector<Diputat> v=new Vector<Diputat>(n);
			Diputat d;
			System.out.print("Especifiqui els diputats: ");
			String s;
			for(int i=0;i<n;++i){
				s=inputs.next();
				d=new Diputat(s);
				v.addElement(d);
			}
			evento.eliminarDiputats(v);
		}
		public static void main(String[] args) {
			int n=0;
			Scanner inputs=new Scanner(System.in);
			Date data=new Date(2015,4,17);
			evento=new Event("tipus1",data,"nom1");
			System.out.println("Escriu numero de test, per a "
					+ "veure tests disponibles pulsa \"0\":");
			while (n!=-1){
				n=inputs.nextInt();
				switch (n){
				case 0:
					tryAssociarDiputat();
					break;
				case 1:
					tryEliminarDiputat();
					break;
				case 2:
					tryAssociarDiputats();
					break;
				case 3:
					imprimeDiputados();
					break;
				case 4:
					tryEliminarDiputats();
					break;
				}
			}
		}

	}




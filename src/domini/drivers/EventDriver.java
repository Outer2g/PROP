
	package domini.drivers;

import java.util.Scanner;
import java.util.Vector;

import domini.Data;
import domini.Event;
import domini.Parlament;

	public class EventDriver {
		public static Event evento;
		public static Parlament parlament;
		public static Scanner inputs= new Scanner(System.in);
		public static void imprimeDiputados(){
			int n=evento.consultarAssociats().size();
			System.out.print("diputats: ");
			for(int i=0;i<n;++i){
				System.out.print(evento.consultarAssociats().get(i)+" ");
			}
			System.out.println();
		}
		private static void tryAssociarDiputat(){
			System.out.print("especifiqui el diputat que vol associar:");
			try {
				evento.associarDiputat(inputs.nextInt());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		private static void tryEliminarDiputat(){
			System.out.print("especifiqui el diputat que vol desassociar");
			evento.eliminarDiputat(inputs.nextInt());			
		}
		private static void tryAssociarDiputats(){
			System.out.print("Especifiqui el numero de diputats a associar:");
			int n=inputs.nextInt();
			Vector<Integer> v = new Vector<Integer>(n);
			System.out.print("Especifiqui els diputats: ");
			for(int i=0;i<n;++i){
				v.addElement(inputs.nextInt());
			}
			if(n>0)evento.associarDiputats(v);
		}
		private static void tryEliminarDiputats(){
			System.out.print("Especifiqui el numero de dipuats a desassociar: ");
			int n= inputs.nextInt();
			Vector<Integer> v=new Vector<Integer>(n);
			if(n>0)System.out.print("Especifiqui els diputats: ");
			for(int i=0;i<n;++i){
				v.addElement(inputs.nextInt());
			}
			evento.eliminarDiputats(v);
		}
		private static void tryAssociarParlament(){
			evento.associarParlament(parlament);
			System.out.println("s'ha afegit el parlament (antonio y jose)");
		}
		private static void usage(){
			System.out.println("Escriu el numero de la prova desitjada: ");
			System.out.println("0: associar diputat");
			System.out.println("1: desassociar diputat");
			System.out.println("2: associar varis diputats");
			System.out.println("3: desassociar diversos diputats");
			System.out.println("4: Associar Parlament");
			System.out.println("5: Desassociar Parlament");
			System.out.println("6: Modificar tipus d'event");
			System.out.println("7: Consultar tipus d'event");
			System.out.println("8: Modificar nom del event");
			System.out.println("9: Consultar nom del event");
			System.out.println("10: Modificar data");
			System.out.println("11:  Consultar data");
			System.out.println("12: imprimeix diputats associats");
		}
		private static void tryEliminarParlament(){
			evento.eliminarParlament(parlament);

			System.out.println("s'ha dessasociat el parlament");
		}
		public static void imprimirException(String s){
			System.out.println(s);
		}
		private static void tryModificarTipusEvent(){
			System.out.println("introdueixi el nou tipus");
			String s= inputs.next();
			evento.modificarTipus(s);
		}
		private static void tryConsultaTipusEvent(){
			System.out.print("Tipus event: ");
			System.out.println(evento.consultarTipus());
		}
		private static void tryModificarNom(){
			System.out.print("introdueixi el nou nom");
			String s=inputs.next();
			evento.modificarNom(s);
		}
		private static void tryConsultarNom(){
			System.out.print("Nom event: ");
			System.out.println(evento.consultarNomEvent());
		}
		private static void tryModificarData(){
			System.out.print("Introdueixi la data en el format : dia mes any");
			int dia=inputs.nextInt();
			int mes=inputs.nextInt();
			int any=inputs.nextInt();
			Data d;
			try {
				d = new Data(dia,mes,any);
				evento.modificarData(d);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		private static void tryConsultarData(){
			System.out.print("Data del event ");
			Data d=evento.consultarData();
			System.out.println((d.getDia())+" "+d.getMes()+" "+(d.getAny()));
		}
		
		public static void main(String[] args){
			int n=0;
			Scanner inputs=new Scanner(System.in);
			try{
				Data data=new Data(17,04,2015);
			evento=new Event("tipus1",data,"nom1");
			}
			catch(Exception e){
				System.out.println(e.getMessage());
				System.exit(0);
			}
			parlament=new Parlament();
			usage();
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
				case 12:
					imprimeDiputados();
					break;
				case 3:
					tryEliminarDiputats();
					break;
				case 4:
					tryAssociarParlament();
					break;
				case 5:
					tryEliminarParlament();
					break;
				case 6:
					tryModificarTipusEvent();
					break;
				case 7:
					tryConsultaTipusEvent();
					break;
				case 8:
					tryModificarNom();
					break;
				case 9:
					tryConsultarNom();
					break;
				case 10:
					tryModificarData();
					break;
				case 11:
					tryConsultarData();
					break;
				}
			}
		}

	}




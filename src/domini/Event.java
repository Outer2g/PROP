package domini;

import java.util.Date;
import java.util.Vector;

public class Event {
	private String nom;
	private Date data;
	private String tipus;
	private Vector<Diputat> diputatsAssociats;
	private boolean trobat(Diputat d){
		int n=diputatsAssociats.size();
		for(int i=0;i<n;++i){
			if(diputatsAssociats.get(i).nom.equals(d.nom)) return true;
		}
		return false;
	}
	public Event(String tipusEvent,Date dataEvent,String nomEvent){
		nom=nomEvent;
		data= dataEvent;
		this.tipus=tipusEvent;
		this.diputatsAssociats= new Vector<Diputat>();
	}
	public void associarDiputat(Diputat diputat){
		Exception exc=new Exception("Diputat ja estava associat");
		try{
			if(trobat(diputat)) throw exc;
			else this.diputatsAssociats.addElement(diputat);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			
		}
	}
	public void eliminarDiputat(Diputat diputat){
		Exception myexc=new Exception("Error al eliminar diputat: no hi ha diputats associats"
				+ " o el diputat no existeix");
		try{
			if(this.diputatsAssociats.isEmpty()) throw myexc;
			if (!this.diputatsAssociats.removeElement(diputat)) throw myexc;
		}
		catch(Exception p){
			System.out.println(p.getMessage());
		}
	}
	public void eliminarDiputats(Vector<Diputat> diputats){
		this.diputatsAssociats.removeAll(diputats);
	}
	public void associarParlament(Parlament parlamentAssociat){
		this.diputatsAssociats=new Vector<Diputat>(parlamentAssociat.getParlament());
	}
	public void eliminarParlament(Parlament parlament){
		Exception exc= new Exception("Error: No hi ha cap diputat associat");
		try{
			if(this.diputatsAssociats.size()==0) throw exc;
			else this.diputatsAssociats.removeAll(parlament.getParlament());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	public void associarDiputats(Vector<Diputat> diputats){
		boolean b= this.diputatsAssociats.addAll(diputats);
	}
	
	public void modificarTipus(String nom){
		if (nom.contentEquals("votacio")){
			diputatsAssociats.removeAllElements();
		}
		else{
			this.tipus=nom;
		}
	}
	public void modificarData(Date data){
		this.data=data;
	}
	public void modificarNom(String s){
		this.nom=s;
	}
	public String consultarNomEvent(){
		return this.nom;
	}
	public Date consultarData(){
		return this.data;
	}
	public String consultarTipus(){
		return String.valueOf(this.tipus);
	}
	public Vector<Diputat> consultarAssociats(){
		return (Vector<Diputat>) this.diputatsAssociats.clone();
	}
}
	
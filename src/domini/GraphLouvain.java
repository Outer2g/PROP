package domini;

import java.util.HashMap;
import java.util.Vector;

public class GraphLouvain<N extends Node, E extends Edge> extends Graph<N,E> {
	private Integer nb_nodes;
	private long nb_links;
	private double total_weight;
	
	public Integer nb_neighbors(Node node){
		return nb_nodes;}
	public double nb_selfloops(Node nodes){
		return nb_links;}
	public double weighted_degree(Node node){
		return nb_links;}
	public Vector<Pair<Node,Double>> neighbors(Node node){
		return null;}
	double getTotalWeight(){
		return total_weight;
	}
	//getWeights;
	public HashMap<Integer, Double> getWeights() {
		return null;
	}
}

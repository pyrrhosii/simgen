package com.simgen;

import java.util.ArrayList;
import java.util.List;

public class Individual {
	
	public static Long idseq = 0L;
	
	private List<Chromosome> chromosomes = new ArrayList<Chromosome>();
	private Long id;
	
	public Individual(List<Chromosome> chromosomes){
		Individual.idseq++;
		this.id = Individual.idseq; 
		this.chromosomes =chromosomes;
	}
	
	public List<Gamete> generateGametes() {
		
		return null;
		
	}

}

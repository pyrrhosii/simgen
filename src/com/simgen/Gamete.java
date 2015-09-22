package com.simgen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

public class Gamete {
	
	private Logger logger = Logger.getLogger(Gamete.class.getName());
	private int parentIndividualId;
	
	private List<Gene> genes;

	public Gamete(Chromosome x, Chromosome y, int parentIndividualId, List<Double> crossovers){
		
		this.parentIndividualId = parentIndividualId;
		List<Gene> xGenes = x.getGenes();
		List<Gene> yGenes = y.getGenes();
		
		genes = new ArrayList<Gene>();
		
		Random random = new Random();
		
		for( Double value : crossovers){
			
			if ( random.nextBoolean() ){
				genes.addAll(x.getGenesBefore(value));
			}
			else{
				genes.addAll(y.getGenesBefore(value));
			}
		}
	}
	
}

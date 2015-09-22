package com.simgen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

/**
 * A Chromosome contains a list of genes. Each individual has 2 chromosomes (X and Y)
 * @author ckunzi
 *
 */
public class Chromosome {

	private Logger logger = Logger.getLogger(Chromosome.class.getName());
	
	public static int X = 0;
	public static int Y = 1;
	
	private List<Gene> genes;
	
	public List<Gamete> generateGametes(){

		return null;
	}

	public List<Gene> getGenes() {
		if ( null == genes)
		{
			genes = new ArrayList<Gene>();
		}
		return genes;
	}

	public List<Gene> getGenesBefore(Double value) {
		List<Gene> returnGenes = new ArrayList<Gene>();
		
		for(Gene gene : genes){
			if ( gene.getPosition() <= value){
				returnGenes.add(gene);
			}
		}
		
		return returnGenes;
	}
	
}

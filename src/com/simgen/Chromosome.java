package com.simgen;

import java.util.List;

/**
 * A Chromosome contains a list of genes. Each individual has 2 chromosomes (X and Y)
 * @author ckunzi
 *
 */
public class Chromosome {

	public static int X = 0;
	public static int Y = 1;
	
	private List<Crossover> crossovers;
	
	private List<Gene> genes;
	
}

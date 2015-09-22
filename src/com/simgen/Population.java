package com.simgen;

import java.util.ArrayList;
import java.util.List;

public class Population {

	private List<Individual> individuals;
	
	public Population(int size){
		
		initPopulation(size);
	}

	private void initPopulation(int size) {
		individuals = new ArrayList<Individual>();
		for(int i=0; i<size ; i++){
			individuals.add(new Individual());
		}	
	}
	
	private void nextGeneration(){
		
		List<Gamete> gametePool = new ArrayList<Gamete>();
		
		for(Individual individual : individuals){
			gametePool.addAll(individual.generateGametes());
		}
		
		
	}
}

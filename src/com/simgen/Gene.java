package com.simgen;

public class Gene {

	private String description;
	private String value;
	private double fitness;
	
	public Gene(String desc, String value, double fitness){
		this.description = desc;
		this.value = value;
		this.fitness = fitness;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public double getFitness() {
		return fitness;
	}

	public void setFitness(double fitness) {
		this.fitness = fitness;
	}
}

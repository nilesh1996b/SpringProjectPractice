package com.masai.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Gym { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int gym_id;
	private String gym_name;
	private int monthly_fee;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Person> gym = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Trainer> tr = new ArrayList<Trainer>();

	public Gym() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Gym(String gym_name, int monthly_fee, List<Person> gym) {
		super();

		this.gym_name = gym_name;
		this.monthly_fee = monthly_fee;
		this.gym = gym;
	}


	public int getGym_id() {
		return gym_id;
	}


	public void setGym_id(int gym_id) {
		this.gym_id = gym_id;
	}


	public String getGym_name() {
		return gym_name;
	}


	public void setGym_name(String gym_name) {
		this.gym_name = gym_name;
	}


	public int getMonthly_fee() {
		return monthly_fee;
	}


	public void setMonthly_fee(int monthly_fee) {
		this.monthly_fee = monthly_fee;
	}


	public List<Person> getGym() {
		return gym;
	}


	public void setGym(List<Person> gym) {
		this.gym = gym;
	}


	@Override
	public String toString() {
		return "Gym [gym_id=" + gym_id + ", gym_name=" + gym_name + ", monthly_fee=" + monthly_fee + ", gym=" + gym
				+ "]";
	}

	
	

}

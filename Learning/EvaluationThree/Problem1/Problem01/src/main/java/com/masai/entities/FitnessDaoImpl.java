package com.masai.entities;

import java.util.List;

import javax.persistence.EntityManager;

import com.masai.utility.EMUtil;

public class FitnessDaoImpl implements FitnessDao {

	@Override
	public void addGym(Gym gym) {
		EntityManager em = EMUtil.provideEntityManager();		
		em.getTransaction().begin();
		
		em.persist(new Gym(gym.setGym(),gym));
		em.persist(dept2);
		
		
		em.getTransaction().commit();
		
	}

	@Override
	public void registerPerson(Person person, int gym_id) throws GymException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerTrainer(Trainer trainer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assignTrainerWithGym(int trainer_id, int gym_id) throws TrainerException, GymException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Person> getAllthePersonByGymName(String gym_name) throws GymException {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.typeoverflow.alertHelper;

import java.util.ArrayList;

import com.typeoverflow.Exercise.Exercise;

public class CurrentExercise{
	private ArrayList<Exercise> currentExercise=new ArrayList<Exercise>();
	private int reps;
	private double time;
	public CurrentExercise()
	{
		
	}
	public void addtoCurrent(Exercise exercise)
	{
		currentExercise.add(exercise);
	}
	public void setReps(int index, int reps)
	{
		currentExercise.get(index).setReps(reps);
	}
	public int getReps(int index)
	{
		return currentExercise.get(index).getReps();
	}

}

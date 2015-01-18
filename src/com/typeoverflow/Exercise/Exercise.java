package com.typeoverflow.Exercise;

public class Exercise {
	private String exerciseName;
	private int reps;
	private String description;
	public Exercise()
	{
		exerciseName="";
		reps=0;
		description="";
	}
	public void setReps(int reps)
	{
		this.reps=reps;
		
	}
	public void setName(String name)
	{
		this.exerciseName=name;
	}
	public void setDescription(String description)
	{
		this.description=description;
	}
	public String getName()
	{
		return exerciseName;
	}
	public int getReps()
	{
		return reps;
	}
	public String getDesc()
	{
		return description;
	}

}

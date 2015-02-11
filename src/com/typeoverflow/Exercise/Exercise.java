package com.typeoverflow.Exercise;

import com.example.alert.R;
import com.example.alert.R.id;

public class Exercise {
	private String exerciseName;
	private String reps;
	private String description;
	public Exercise()
	{
		exerciseName="eat";
		reps="ni";
		description="yep";
	}
	public void setReps(String reps)
	{
		this.reps=reps;
		
	}
	public void setName(String name)
	{
		exerciseName=name;
	}
	public void setDescription(String description)
	{
		this.description=description;
	}
	public String getName()
	{
		return exerciseName;
	}
	public String getReps()
	{
		return reps;
	}
	public String getDesc()
	{
		return description;
	}
	

}

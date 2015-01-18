package com.typeoverflow.alertHelper;
import java.util.ArrayList;

import com.typeoverflow.Exercise.Exercise;

public class ExerciseLoader {
	private ArrayList<Exercise> exerciseList=new ArrayList<Exercise>();
	private Exercise pushup;
	private Exercise pullup;
	private Exercise situp;
	public ExerciseLoader()
	{
		loadList();
	}
	private void loadList()
	{
		setList();
		exerciseList.add(pullup);
		exerciseList.add(situp);
		exerciseList.add(pullup);
	}
	private void setList()
	{
		pushup.setName("Push Up");
		pushup.setDescription("Simple description here");
		pullup.setName("Pull Up");
		pullup.setDescription("Simple description here");
		situp.setName("Set Up");
		situp.setDescription("Simple description here");
	}
}

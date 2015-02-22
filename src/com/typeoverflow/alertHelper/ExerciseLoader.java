package com.typeoverflow.alertHelper;

import java.util.ArrayList;

import com.example.alert.R.id;
import com.typeoverflow.Exercise.Exercise;

public class ExerciseLoader {
	private ArrayList<Exercise> exerciselist=new ArrayList<Exercise>();
	private Exercise pushup=new Exercise();
	private Exercise pullup=new Exercise();
	private Exercise situp=new Exercise();
	public ExerciseLoader() {
		load();
	}

	private void load() {
		setNames();
		setD();
		exerciselist.add(pushup);
		exerciselist.add(pullup);
		exerciselist.add(situp);

	}

	private void setNames() {
		pushup.setName("Push Up");
		pullup.setName("Pull Up");
		situp.setName("Sit Up");
	}

	private void setD() {
		pushup.setDescription("push up descriptions");
		pullup.setDescription("pull up descriptions");
		situp.setDescription("sit up descriptions");
	}
	public ArrayList<Exercise> getList() {
		return exerciselist;
	}

}

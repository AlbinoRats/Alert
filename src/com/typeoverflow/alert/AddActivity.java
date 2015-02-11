package com.typeoverflow.alert;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.example.alert.R;
import com.example.alert.R.id;
import com.typeoverflow.Exercise.Exercise;
import com.typeoverflow.alertHelper.ExerciseLoader;

public class AddActivity extends ActionBarActivity {
	private ExerciseLoader loader = new ExerciseLoader();
	private ArrayList<Button> listofButton = new ArrayList<Button>();
	private Button button=new Button(this);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		button=new Button(this);
		setContentView(R.layout.activity_add);
		Intent intent = getIntent();
		createButtons();
		textButtons();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void createButtons() {
		for (int i = 0; i < loader.getList().size(); i++) {
			String buttonID = "btn" + i;
			int resID = getResources().getIdentifier(buttonID, "id",
					getPackageName());
			listofButton.add(((Button) findViewById(resID)));
			// listofButton.get(i).setText("This is a test");
		}
	}

	public void textButtons() {
		listofButton.get(0).setText("Test");
	}

}

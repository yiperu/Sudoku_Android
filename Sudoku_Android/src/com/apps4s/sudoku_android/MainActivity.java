package com.apps4s.sudoku_android;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;

public class MainActivity extends Activity  implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Configurar escuchadores del Click para todos los botones
        Button aboutBoton = (Button)findViewById(R.id.about_button);
        aboutBoton.setOnClickListener(this);
        Button continueBoton = (Button)findViewById(R.id.continue_button);
        continueBoton.setOnClickListener(this);
        Button nuevoBoton = (Button)findViewById(R.id.new_button);
        nuevoBoton.setOnClickListener(this);
        Button exitBoton = (Button)findViewById(R.id.exit_button);
        exitBoton.setOnClickListener(this);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.main, menu);
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.about_button:
			Intent i = new Intent(this,AboutActivity.class);
			startActivity(i);
			break;

		default:
			break;
		}
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case R.id.settings:
			startActivity(new Intent(this, Prefs.class));
			return true;
		case R.id.new_button:
			openNewGameDialog();
			break;
		case R.id.exit_button:
			finish();
			break;
		//default:
		//	break;
		}
		return false;
				
	}

private static final String TAG = "Sudoku";
	private void openNewGameDialog() {
		// TODO Auto-generated method stub
		new AlertDialog.Builder(this)
		.setTitle(R.string.new_game_title)
		.setItems(R.array.difficulty, new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialoginterface, int i){
				startGame(i);
			}
		})
		.show();
	}


	protected void startGame(int i) {
		// TODO Auto-generated method stub
		Log.d(TAG,"clicked on " + i);
		// El juego empieza aqui.
	}
    
}

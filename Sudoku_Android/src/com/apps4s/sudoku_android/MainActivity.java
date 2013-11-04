package com.apps4s.sudoku_android;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

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
    
}

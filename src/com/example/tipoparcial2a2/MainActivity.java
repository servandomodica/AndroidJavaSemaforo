package com.example.tipoparcial2a2;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity {
	Semaforo semaforo1;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		semaforo1 = (Semaforo) findViewById(R.id.semaforo1);
	}

	public void cambiar(View v) {
		semaforo1.cambiar();

		if (semaforo1.retornarValor() == 1) {
			Toast.makeText(this, "Frene", Toast.LENGTH_LONG).show();
		} else if (semaforo1.retornarValor() == 2) {
			Toast.makeText(this, "Avance", Toast.LENGTH_LONG).show();
		} else {
			Toast.makeText(this, "Precaución", Toast.LENGTH_LONG).show();
		}

	}
}
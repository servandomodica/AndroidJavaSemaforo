package com.example.tipoparcial2a2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

//Nueva clase, que hereda de android.view.View

public class Semaforo extends View { //implemento el 2do constructor (tiene 2 parámetros)
	private int valor = 1;

	public Semaforo(Context context, AttributeSet attrs) {
		super(context, attrs);

	}
	
	protected void onDraw(Canvas canvas) { //Para crearlo voy a Source, Override, onDraw
		super.onDraw(canvas);
				
		int ancho = getWidth();
		int alto = getHeight();
		
		canvas.drawRGB(0, 0, 0);
		
		Paint pincel1 = new Paint();
		
		if (valor == 1) {
			pincel1.setARGB(255, 255, 0, 0);
			canvas.drawCircle(ancho * 0.5f, alto * 0.20f, 30, pincel1);
			pincel1.setARGB(255, 55, 55, 55);
			canvas.drawCircle(ancho * 0.5f, alto * 0.50f, 30, pincel1);
			pincel1.setARGB(255, 55, 55, 55);
			canvas.drawCircle(ancho * 0.5f, alto * 0.80f, 30, pincel1);				
		}
		
		if (valor == 2) {
			pincel1.setARGB(255, 55, 55, 55);
			canvas.drawCircle(ancho * 0.5f, alto * 0.20f, 30, pincel1);
			pincel1.setARGB(255, 55, 55, 55);
			canvas.drawCircle(ancho * 0.5f, alto * 0.50f, 30, pincel1);
			pincel1.setARGB(255, 0, 255, 00);
			canvas.drawCircle(ancho * 0.5f, alto * 0.80f, 30, pincel1);		
		}
		
		if (valor == 3) {
			pincel1.setARGB(255, 55, 55, 55);
			canvas.drawCircle(ancho * 0.5f, alto * 0.20f, 30, pincel1);
			pincel1.setARGB(255, 255, 255, 0);
			canvas.drawCircle(ancho * 0.5f, alto * 0.50f, 30, pincel1);
			pincel1.setARGB(255, 55, 55, 55);
			canvas.drawCircle(ancho * 0.5f, alto * 0.80f, 30, pincel1);		
		}
	}
	
	
	public void cambiar() {
		valor++;
		
		if (valor == 4)
			valor = 1;		
		
		invalidate();
	}
	
	
	public int retornarValor() {
		return valor;
	}

}
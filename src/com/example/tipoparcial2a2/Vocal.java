package com.example.tipoparcial2a2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class Vocal extends View implements OnTouchListener {
	private String letra = "a";

	public Vocal(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		this.setOnTouchListener(this);
	}


	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		
		int ancho = getWidth();
		int alto = getHeight();
		
		Paint p = new Paint();
		p.setARGB(255, 0, 0, 0);		
		canvas.drawCircle(ancho * 0.50f, alto * 0.50f, ancho * 0.50f, p);
		
		Paint p2 = new Paint();
		p2.setARGB(255, 255, 0, 0);
		p2.setTextSize(ancho * 0.50f);
		canvas.drawText(letra, ancho * 0.4f, alto * 0.60f, p2);
	}


	public boolean onTouch(View arg0, MotionEvent arg1) {
		if (letra.equals("a"))
			letra = "e";
		else if (letra.equals("e"))
			letra = "i";
		else if (letra.equals("i"))
			letra = "o";
		else if (letra.equals("o"))
			letra = "u";
		else if (letra.equals("u"))
			letra = "a";

		this.invalidate();
		return false;
	}

}
package mx.edu.ittepic.ricardojimenez.tpdm_u4_ejercicio2_ricardojimenez;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.CountDownTimer;

import android.view.MotionEvent;
import android.view.View;

public class Lienzo extends View {
    Circulo c1,c2,c3,c4;
    int maxW,maxH;
    CountDownTimer timer;
    public Lienzo(Context context) {
        super(context);
        maxW = getResources().getSystem().getDisplayMetrics().widthPixels;
        maxH = getResources().getSystem().getDisplayMetrics().heightPixels-200;
        c1= new Circulo(300,300);
        c2= new Circulo(100,700);
        c3= new Circulo(600,100);
        c4 = new Circulo((int)Math.random()*(maxW-100)+20,(int)Math.random()*(maxH-100)+20);
        timer = new CountDownTimer(200000,100000) {
            @Override
            public void onTick(long millisUntilFinished) {
//                cada que el lapso llega a 0
                invalidate();
            }

            @Override
            public void onFinish() {
//              cuando el ultimo lapso termina
                start();
            }
        };
    }
    protected void onDraw(Canvas c){
        c1.pintar(c);
        c1.desplazar(maxW,maxH);

        c2.pintar(c);
        c2.desplazar(maxW,maxH);

        c3.pintar(c);
        c3.desplazar(maxW,maxH);

        c4.pintar(c);
        c4.desplazar(maxW,maxH);
        timer.start();
    }


}

package mx.edu.ittepic.ricardojimenez.tpdm_u4_ejercicio2_ricardojimenez;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.CountDownTimer;

import java.util.Random;

public class Circulo {
    int x,y,tamano,desp,cx,cy,col;
    Paint p;
    Random rdn;
    public Circulo(int x, int y) {
        this.x = x;
        rdn = new Random();
        tamano = rdn.nextInt(400-70+1)+70;
        this.y = y;
        desp = 400;
        cx=1;
        cy=1;
        col = rdn.nextInt(10-1+1)+1;
        p = new Paint();
        switch (col){
            case 1:
                p.setColor(Color.GRAY);
                break;
            case 2:
                p.setColor(Color.BLUE);
                break;
            case 3:
                p.setColor(Color.BLACK);
                break;
            case 9:
                p.setColor(Color.YELLOW);
                break;
            case 5:
                p.setColor(Color.GREEN);
                break;
            case 6:
                p.setColor(Color.DKGRAY);
                break;
            case 8:
                p.setColor(Color.rgb(27,57,106));
                break;
            case 10:
                p.setColor(Color.RED);
                break;
            case 7:
                p.setColor(Color.rgb(128,57,96));
                break;
            case 4:
                p.setColor(Color.rgb(37,223,44));
                break;
        }

    }

    public void pintar(final Canvas c){
        c.drawCircle(x,y,(float)tamano,p);
    }
    public void desplazarX(final Canvas c){
        c.drawCircle(x+desp,y,(float)tamano,p);
    }
    public void desplazar(int maxW,int maxH){
        if (x-tamano<=0){
            cx=1;
        }else if( x+tamano > maxW){
            cx=-1;
        }
        if(y+tamano > maxH){
            cy=-1;
        }else if(y-tamano<=0){
            cy=1;
        }
        x+=(desp/(tamano/3))*cx;
        y+=(desp/(tamano/3))*cy;
    }

}

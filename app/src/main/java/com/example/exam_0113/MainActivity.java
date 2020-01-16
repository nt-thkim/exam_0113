package com.example.exam_0113;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
//hi
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyView vw = new MyView(this);
        setContentView(vw);
    }

    class MyView extends View {
        public MyView(Context context) {
            super(context);
        }

        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.LTGRAY);
            Paint pnt = new Paint();
            pnt.setColor(Color.BLUE);
            canvas.drawCircle(100, 100, 80, pnt);

            pnt.setColor(Color.YELLOW);
            canvas.drawRect(200, 700, 60, 300, pnt);
        }
    }

}

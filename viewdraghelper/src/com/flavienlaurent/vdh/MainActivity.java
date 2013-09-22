package com.flavienlaurent.vdh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Flavien Laurent (flavienlaurent.com) on 23/08/13.
 */
public class MainActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.buttonDragH).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DragActivity.class);
                intent.putExtra("horizontal", true);
                startActivity(intent);
            }
        });
        findViewById(R.id.buttonDragV).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DragActivity.class);
                intent.putExtra("vertical", true);
                startActivity(intent);
            }
        });
        findViewById(R.id.buttonDragEdge).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DragActivity.class);
                intent.putExtra("edge", true);
                startActivity(intent);
            }
        });
        findViewById(R.id.buttonDragCapture).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DragActivity.class);
                intent.putExtra("capture", true);
                startActivity(intent);
            }
        });
        findViewById(R.id.buttonYoutube).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, YoutubeActivity.class);
                startActivity(intent);
            }
        });
    }
}
package com.flavienlaurent.vdh;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

/**
 * Created by Flavien Laurent (flavienlaurent.com) on 23/08/13.
 */
public class DragActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drag);

        DragLayout dragLayout = (DragLayout) findViewById(R.id.dragLayout);

        if(getIntent().getBooleanExtra("horizontal", false)) {
            dragLayout.setDragHorizontal(true);
        }
        if(getIntent().getBooleanExtra("vertical", false)) {
            dragLayout.setDragVertical(true);
        }
        if(getIntent().getBooleanExtra("edge", false)) {
            dragLayout.setDragEdge(true);
        }
        if(getIntent().getBooleanExtra("capture", false)) {
            dragLayout.setDragCapture(true);
        }
    }
}

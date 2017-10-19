package cn.m15.xys;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class startActivity extends Activity {
    Context mContext = null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
	setContentView(R.layout.main);
	mContext = this;
	
	/**进入游戏世界 - view**/
        Button botton0 = (Button)findViewById(R.id.button0);
        botton0.setOnClickListener(new OnClickListener() {
	    
	    @Override
	    public void onClick(View arg0) {
		 Intent intent = new Intent(mContext,ViewAcitvity.class); 
		 startActivity(intent);

	    }
	});
        
	/**进入游戏世界 - SurfaceView**/
        Button botton1 = (Button)findViewById(R.id.button1);
        botton1.setOnClickListener(new OnClickListener() {
	    @Override
	    public void onClick(View arg0) {
		 Intent intent = new Intent(mContext,SurfaceViewAcitvity.class); 
		 startActivity(intent);
	    }
	});
        
    }
}

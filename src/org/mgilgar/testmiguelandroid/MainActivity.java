package org.mgilgar.testmiguelandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity 
	extends Activity 
	// The Activity listens to click events, at this moment only the button1 can generate a click event.
	implements View.OnClickListener {

	private Button button1;
	private EditText editText1;
	private TextView textView1;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // R contains references to the elements in res/layout/main_activity.xml
        // With this line we connect this class with the xml layout definition
        setContentView(R.layout.activity_main);
        // From this MainActivity and based in the constant we recover the elements
        button1 = (Button)findViewById(R.id.button1);
		editText1 = (EditText)findViewById(R.id.editText1);
        textView1 = (TextView)findViewById(R.id.textView1);
        button1.setOnClickListener(this);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void onClick(View view){
    	// Not need to distinguish where this click comes from in this activity as button1 is the only possible cause.
    	textView1.setText(editText1.getEditableText());
    }
    
}

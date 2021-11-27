package com.michaldabski.filemanager;

/*import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.michaldabski.filemanager.AboutActivity;*/
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

import com.michaldabski.filemanager.AboutActivity;
import com.michaldabski.filemanager.R;
import com.michaldabski.utils.FontApplicator;

//public class MessageActivity extends AppCompatActivity {
public class MessageActivity extends android.app.Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
    }
    public void onClick(View view){
        try{
            Intent MessageIntent = new Intent(this, com.michaldabski.filemanager.about.AboutActivity.class);
            //Intent MessageIntent = new Intent(this, AboutActivity.class);
            startActivity(MessageIntent);
        }
        catch (Exception e)
        {
            //e.printStackTrace();
            Toast.makeText(this,"error",Toast.LENGTH_SHORT).show();
        }
    }

}

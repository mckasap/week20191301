package org.kasapbasi.week20191301;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        Configuration config = getResources().getConfiguration();

        FragmentManager fm= getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();


        switch (config.orientation){

            case Configuration.ORIENTATION_LANDSCAPE:
                Toast.makeText(getApplicationContext(),"LANDSCAPE",Toast.LENGTH_LONG).show();

                LM_Fragmant lf= new LM_Fragmant();

                ft.replace(android.R.id.content,lf);

                break;
            case Configuration.ORIENTATION_PORTRAIT:

                PM_Fragmant pm= new PM_Fragmant();
                ft.replace(android.R.id.content,pm);
                Toast.makeText(getApplicationContext(),"PORTRAIT",Toast.LENGTH_LONG).show();

                break;
            default:

        }
        ft.commit();

    }
}

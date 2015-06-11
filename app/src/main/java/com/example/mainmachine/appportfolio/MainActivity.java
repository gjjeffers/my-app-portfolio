package com.example.mainmachine.appportfolio;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements ButtonFragment.OnFragmentInteractionListener {


    public void SpotifyButtonClicked(View view){
        Context context = view.getContext();
        String message = "All around the country from coast to coast...";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context,message,duration);
        toast.show();
    }

    public void ScoresButtonClicked(View view){
        Context context = view.getContext();
        String message = "People always ask \"What do you like most?\"...";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context,message,duration);
        toast.show();
    }
    public void LibraryButtonClicked(View view){
        Context context = view.getContext();
        String message = "I don't wanna brag...";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context,message,duration);
        toast.show();
    }
    public void BuildButtonClicked(View view){
        Context context = view.getContext();
        String message = "I don't wanna boast...";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context,message,duration);
        toast.show();
    }
    public void XyzButtonClicked(View view){
        Context context = view.getContext();
        String message = "I just tell them \"I like toast!\"";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context,message,duration);
        toast.show();
    }
    public void CapstoneButtonClicked(View view){
        Context context = view.getContext();
        String message = "YEAH TOAST!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context,message,duration);
        toast.show();
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .commit();
        }
     }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onFragmentInteraction(Uri uri){}


}

package sg.edu.sit.ict.lab1part1_logcat;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null)
        {
            Log.d("CREATE", "Activity went to the onCreate() state.");
        }
    }

    @Override
    protected void onRestart()
    {
        /* This means that the activity is being navigated back after being
         * INACTIVE for a while.
         */
        super.onRestart();
        Log.v("RESTARTED", "Activity is currently executing onRestart() state.");

    }
    @Override
    protected void onStop()
    {
        /* This means that the current activity is not visible to the user
         * Could be due to the user is being diverted to another app
         * OR another activity.
         */
        super.onStop();
        Log.w("STOP", "Executing onStop() function.\nActivity currently not visible to the user !!!");
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
}

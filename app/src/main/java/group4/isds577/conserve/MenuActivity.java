package group4.isds577.conserve;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.ParseUser;


public class MenuActivity extends ActionBarActivity {


    /** Called when the user clicks the sign in button */
    //public void openLogin(View view) {
        //Intent intent = new Intent(this, LoginActivity.class);
       // Button button = (Button)findViewById(R.id.btSignInMain);
       // startActivity(intent);
        // Do something in response to button
   // }

    public void openProfile(View view)
    {
        System.out.println("openProfile");
        setContentView(R.layout.activity_profile2);
        //  Intent profileIntent = new Intent(this, MenuActivity.class);
        //  Button button = (Button)findViewById();
        //  myactivity
        //          startActivity(profileIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
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
            ParseUser.getCurrentUser().logOut();
            startActivity(new Intent(MenuActivity.this, DispatchActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

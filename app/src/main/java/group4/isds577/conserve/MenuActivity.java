package group4.isds577.conserve;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import android.widget.EditText;

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

        ParseUser user2 = ParseUser.getCurrentUser();
        EditText profileUserName = (EditText)findViewById(R.id.editTextUsername);
        profileUserName.setText(user2.getUsername());

        System.out.println("user is " + user2.getUsername());

        EditText profileEmail = (EditText)findViewById(R.id.editTextEmail);
        profileEmail.setText(user2.getEmail());

        System.out.println("email is " + user2.getEmail());

        EditText profilePassword = (EditText)findViewById(R.id.editTextPassword);
       // profileUserName.setText(user2.get);

    }

    public void backButtonPressed(View view)
    {
        System.out.println("going back");
        setContentView(R.layout.activity_menu);
    }

    public void saveProfileButtonPressed(View view)
    {
        System.out.println("saving");
        //setContentView(R.layout.activity_menu);
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

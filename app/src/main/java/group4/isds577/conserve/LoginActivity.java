package group4.isds577.conserve;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.view.View;
import android.widget.Button;


public class LoginActivity extends ActionBarActivity{


    //opens SignUp activity
    public void openSignUp(View view) {
        Intent intent2 = new Intent(this, SignUpActivity.class);
        Button button = (Button)findViewById(R.id.btSignUpLogin);
        startActivity(intent2);
        // Do something in response to button
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //calls the openLogin method from MainActivity.java//
        Intent intent = getIntent();
        setContentView(R.layout.activity_login);
    }




/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
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
    }*/
}

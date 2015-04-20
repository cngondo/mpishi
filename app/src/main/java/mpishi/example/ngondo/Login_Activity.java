package mpishi.example.ngondo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;


public class Login_Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getActionBar().hide();
        requestWindowFeature(Window.FEATURE_NO_TITLE);


    }



}

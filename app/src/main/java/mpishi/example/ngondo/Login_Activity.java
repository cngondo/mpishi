package mpishi.example.ngondo;


import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.Window;
import android.support.v4.app.FragmentTransaction;
import android.view.WindowManager;
import com.facebook.FacebookSdk;

public  class Login_Activity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Let's first hide the action bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        Initialize fb sdk
        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.activity_login);
//call the fragment
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
// Replace the contents of the container with the new fragment
        ft.replace(R.id.fragment_container, new FbLogin());
// Complete the changes added above
        ft.commit();
    }



}

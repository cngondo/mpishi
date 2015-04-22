package mpishi.example.ngondo;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.facebook.FacebookSdk;
import com.facebook.login.widget.LoginButton;



public class Login_Activity extends Activity {


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

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        FbLogin frag_login = new FbLogin();
        ft.add(R.id.com_facebook_fragment_container, frag_login, "Hello");
        ft.commit();



    }



}

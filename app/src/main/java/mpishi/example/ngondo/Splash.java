package mpishi.example.ngondo;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
//import mpishi.example.ngondo.Hashkey;


public class Splash extends Activity {
    FbLogin frag_login;

//Interval display of the splash screen
    private static int splashInterval = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);
////        Loads the fragment for fb login
//        frag_login = new FbLogin();




//Handler that displays it and fires a new intent to main
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(Splash.this, Login_Activity.class);
                startActivity(i);
                //This exits the SplashScreen activity
                finish();
            }
        },splashInterval);


//        Hashkey hash = new Hashkey();
//        hash.printHashKey();
    }
}

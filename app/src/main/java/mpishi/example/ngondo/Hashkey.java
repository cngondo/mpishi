package mpishi.example.ngondo;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import android.util.Log;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by ngondo on 21/04/15.
 */
public class Hashkey extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        printHashKey();
    }
//    Generates the hash key for us
    public void printHashKey(){
        try {
            PackageInfo info = getPackageManager().getPackageInfo(
                    "mpishi.example.ngondo",
                    PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                Log.d("NGONDO", Base64.encodeToString(md.digest(), Base64.DEFAULT));
            }
        } catch (PackageManager.NameNotFoundException e) {

        } catch (NoSuchAlgorithmException e) {

        }
    }
}

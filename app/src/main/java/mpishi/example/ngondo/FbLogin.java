package mpishi.example.ngondo;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.login.widget.LoginButton;

import com.facebook.FacebookSdk;

/**
 * A simple {@link Fragment} subclass.
 */
public class FbLogin extends Fragment {


    public FbLogin() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getActivity().getApplicationContext());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fb_login, container, false);

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        LoginButton btn_fblogin = (LoginButton) view.findViewById(R.id.login_button);
        btn_fblogin.setReadPermissions("user_friends");
        btn_fblogin.setFragment(this);

    }
}

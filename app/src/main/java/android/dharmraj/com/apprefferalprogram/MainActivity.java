package android.dharmraj.com.apprefferalprogram;

import android.Manifest;
import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.dharmraj.com.apprefferalprogram.R;
import android.dharmraj.com.apprefferalprogram.digit.LoginPage;
import android.dharmraj.com.apprefferalprogram.fbAccountKit.ErrorActivity;
import android.dharmraj.com.apprefferalprogram.fbAccountKit.FbAccountKit;
import android.dharmraj.com.apprefferalprogram.fbAccountKit.TokenActivity;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.digits.sdk.android.Digits;
import com.facebook.accountkit.AccessToken;
import com.facebook.accountkit.AccountKit;
import com.facebook.accountkit.AccountKitLoginResult;
import com.facebook.accountkit.ui.AccountKitActivity;
import com.facebook.accountkit.ui.AccountKitConfiguration;
import com.facebook.accountkit.ui.LoginType;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onLoginWithFb(final View view) {
        startActivity(new Intent(this, FbAccountKit.class));
    }

    public void onLoginWithDigits(final View view) {
        startActivity(new Intent(this, LoginPage.class));
    }

}

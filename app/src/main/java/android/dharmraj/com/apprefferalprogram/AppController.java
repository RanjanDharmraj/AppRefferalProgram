package android.dharmraj.com.apprefferalprogram;

import android.app.Application;
import android.os.Build;
import android.os.StrictMode;

import com.digits.sdk.android.Digits;
import com.facebook.accountkit.AccountKit;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterCore;

import io.branch.referral.Branch;
import io.fabric.sdk.android.Fabric;

/**
 * Created by Dharmraj on 2/3/2017.
 */

public class AppController extends Application {

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "AHw2iJQ1h5HU9bOFrvOVCigTS";
    private static final String TWITTER_SECRET = "7rcKRo1sP24MJI6Bld4DKci4XxK76dgo4KbI8RzwD99LLLoMT0";



    @Override
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            // Kitkat and lower has a bug that can cause in correct strict mode
            // warnings about expected activity counts
            enableStrictMode();
        }

        AccountKit.initialize(getApplicationContext());
        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Digits.Builder digitBuilder =  new Digits.Builder().withTheme(R.style.CustomDigitsTheme);
        Fabric.with(this, new TwitterCore(authConfig), digitBuilder.build());

        Branch.getAutoInstance(this);

    }

    public void enableStrictMode() {
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                .detectAll()
                .penaltyLog()
                .penaltyDeath()
                .build());
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder()
                .detectAll()
                .penaltyLog()
                .penaltyDeath()
                .build());
    }


}

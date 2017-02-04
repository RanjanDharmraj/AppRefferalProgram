package android.dharmraj.com.apprefferalprogram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import org.json.JSONObject;

import io.branch.referral.Branch;
import io.branch.referral.BranchError;

import static io.branch.referral.Defines.Jsonkey.DeepLinkPath;

public class RefferalPage extends AppCompatActivity {

    Branch branch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refferal_page);
        branch = Branch.getInstance();
    }

    @Override
    protected void onStart() {
        super.onStart();

        branch.initSession(new Branch.BranchReferralInitListener(){
            @Override
            public void onInitFinished(JSONObject referringParams, BranchError error) {
                if (error == null) {

                    Gson gson = new Gson();
                    DeepLinkPath deepLinkPath = gson.fromJson(String.valueOf(referringParams),DeepLinkPath.class);

                    if(deepLinkPath.getCategoryid() != null){
                        startActivity(new Intent(RefferalPage.this, HomeActivity.class));
                    } else {
                        startActivity(new Intent(RefferalPage.this, HomeActivity.class));
                    }
                } else {
                    Log.i("MyApp", error.getMessage());
                }
            }
        }, this.getIntent().getData(), this);
    }

    @Override
    public void onNewIntent(Intent intent) {
        this.setIntent(intent);
    }


}

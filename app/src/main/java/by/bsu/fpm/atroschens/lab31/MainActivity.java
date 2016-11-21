package by.bsu.fpm.atroschens.lab31;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onGoToAct2Click(View v) {
        startActivity(new Intent(this, SecondActivity.class));
    }

    public void onGoToAct3Click(View view) {
        startActivity(new Intent(this, ThirdActivity.class));
    }

    public void onGoToAct4Click(View view) {
        startActivity(new Intent(this, FourthActivity.class));
    }

    public void onCloseClick(View view) {
        finishAffinity();
        System.exit(0);
    }
}

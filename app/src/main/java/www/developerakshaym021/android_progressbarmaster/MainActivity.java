package www.developerakshaym021.android_progressbarmaster;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import www.developerakshaym021.mandroid_progressbarmaster.ProgressDialogBuilder;
import www.developerakshaym021.mandroid_progressbarmaster.ProgressStyle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onProgrssOne(View view) {
        new ProgressDialogBuilder(this)
                .setProgressStyle(ProgressStyle.STYLE_1)
                .show();
    }

    public void onProgrssTwo(View view) {
        new ProgressDialogBuilder(this)
                .setProgressStyle(ProgressStyle.STYLE_2)
                .show();
    }

    public void onProgrssThree(View view) {
        new ProgressDialogBuilder(this)
                .setProgressStyle(ProgressStyle.STYLE_3)
                .show();
    }

    public void onProgrss(View view) {
        new ProgressDialogBuilder(this)
                .show();
    }

    public void exitInit(View view) {
        Toast.makeText(this, "ThankYou Visit For More Details,\nwww.github.com/developerakshym021/", Toast.LENGTH_LONG).show();
        onBackPressed();
        finish();
    }
}

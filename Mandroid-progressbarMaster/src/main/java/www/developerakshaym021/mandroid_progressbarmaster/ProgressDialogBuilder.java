package www.developerakshaym021.mandroid_progressbarmaster;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

public class ProgressDialogBuilder extends Dialog {

    private ProgressStyle mStyle;

    public ProgressDialogBuilder(Context context) {
        super(context);
    }
    public ProgressDialogBuilder setProgressStyle(ProgressStyle style){
        this.mStyle=style;
        return this;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        if (mStyle!=null) {
            switch (mStyle) {
                case STYLE_1:
                    setContentView(R.layout.activity_dialog_a);
                    break;
                case STYLE_2:
                    setContentView(R.layout.activity_dialog_b);
                    break;
                case STYLE_3:
                    setContentView(R.layout.activity_dialog_c);
                    break;
            }
        }else {
            setContentView(R.layout.activity_dialog_a);
        }
    }
}

package com.lvntyyl.button.library;

import android.content.Context;
import android.util.AttributeSet;

public class ModernButton extends android.support.v7.widget.AppCompatButton {

    public ModernButton(Context context) {
        super(context);
        init();
    }

    public ModernButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ModernButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        this.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_bg));
        this.setTextColor(0xFFAAAAAA);
    }

    @Override
    public void setPressed(boolean pressed) {
        super.setPressed(pressed);
        this.setTextColor(pressed ? 0xFF000000 : 0xFFAAAAAA);
    }
}

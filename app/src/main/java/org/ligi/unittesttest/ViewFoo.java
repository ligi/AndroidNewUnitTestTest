package org.ligi.unittesttest;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class ViewFoo extends TextView {

    public ViewFoo(Context context) {
        super(context);
    }

    public String returnSomething() {
        return "something";
    }

}

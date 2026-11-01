package com.google.android.setupdesign.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class WrapTextView extends android.support.v7.widget.AppCompatTextView {
    public WrapTextView(android.content.Context context) {
        super(context);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        android.text.Layout layout;
        int lineCount;
        super.onMeasure(i, i2);
        if (android.view.View.MeasureSpec.getMode(i) != Integer.MIN_VALUE || (lineCount = (layout = getLayout()).getLineCount()) <= 1) {
            iMakeMeasureSpec = i;
        } else {
            float fMax = 0.0f;
            for (int i3 = 0; i3 < lineCount; i3++) {
                fMax = java.lang.Math.max(fMax, layout.getLineWidth(i3));
            }
            int iCeil = ((int) java.lang.Math.ceil(fMax)) + getTotalPaddingLeft() + getTotalPaddingRight();
            if (iCeil < getMeasuredWidth()) {
                iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iCeil, Integer.MIN_VALUE);
            } else {
                iMakeMeasureSpec = i;
            }
        }
        if (iMakeMeasureSpec != i) {
            super.onMeasure(iMakeMeasureSpec, i2);
        }
    }

    public WrapTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WrapTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

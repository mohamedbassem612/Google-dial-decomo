package com.android.dialer.dialpadview;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class DigitsEditText extends hq {
    private final int a;
    private int b;
    private final int c;
    private final int d;

    public DigitsEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        int textSize = (int) getTextSize();
        this.a = textSize;
        this.b = textSize;
        this.d = (int) context.getResources().getDimension(2131165615);
        this.c = android.text.TextUtils.getLayoutDirectionFromLocale(java.util.Locale.getDefault()) == 1 ? getContext().getResources().getDimensionPixelSize(2131165619) : getContext().getResources().getDimensionPixelSize(2131165618);
        setInputType(getInputType() | 524288);
        setShowSoftInputOnFocus(false);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            setAutoHandwritingEnabled(false);
        }
    }

    private final void d() {
        int width;
        float fMax;
        if (getText() == null || (width = getWidth()) == 0 || getHeight() == 0) {
            return;
        }
        float fMeasureText = width / getPaint().measureText(getText().toString());
        if (fMeasureText <= 1.0f) {
            fMax = java.lang.Math.max(this.d, this.b * fMeasureText);
        } else {
            fMax = this.b;
        }
        setTextSize(0, fMax);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void onFocusChanged(boolean z, int i, android.graphics.Rect rect) {
        super.onFocusChanged(z, i, rect);
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getContext().getSystemService(android.view.inputmethod.InputMethodManager.class);
        if (inputMethodManager == null || !inputMethodManager.isActive(this)) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(getApplicationWindowToken(), 0);
    }

    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.b = java.lang.Math.min(this.a, i2 - (this.c << 1));
        d();
    }

    protected final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getContext().getSystemService(android.view.inputmethod.InputMethodManager.class);
        if (inputMethodManager != null && inputMethodManager.isActive(this)) {
            inputMethodManager.hideSoftInputFromWindow(getApplicationWindowToken(), 0);
        }
        return zOnTouchEvent;
    }
}

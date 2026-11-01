package com.android.dialer.widget;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class DialerToolbar extends android.support.v7.widget.Toolbar {
    private android.widget.TextView B;
    private android.widget.TextView C;

    public DialerToolbar(android.content.Context context) {
        super(context);
        G();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void G() {
        android.content.Context context = getContext();
        inflate(context, 2131624144, this);
        this.B = (android.widget.TextView) findViewById(2131429285);
        this.C = (android.widget.TextView) findViewById(2131429042);
        setElevation(getResources().getDimensionPixelSize(2131167880));
        setBackgroundColor(urg.c(context, android.R.attr.colorBackground));
        android.graphics.drawable.Drawable drawable = context.getDrawable(2131231946);
        drawable.setTint(urg.c(context, 2130968958));
        t(drawable);
        q(2132020591);
        u(new defpackage.vxa(context, 9));
        setPaddingRelative(getPaddingStart(), getPaddingTop(), getResources().getDimensionPixelSize(2131167881), getPaddingBottom());
    }

    public final void E(int i) {
        x(getResources().getString(i));
    }

    public final void F() {
        android.graphics.drawable.Drawable drawable = getContext().getDrawable(2131231925);
        drawable.setTint(urg.c(getContext(), 2130968958));
        t(drawable);
        q(2132020590);
        u(new defpackage.vxa(this, 10));
    }

    public final java.lang.CharSequence i() {
        android.widget.TextView textView = this.B;
        return textView != null ? textView.getText() : ((android.support.v7.widget.Toolbar) this).q;
    }

    public final void w(java.lang.CharSequence charSequence) {
        if (charSequence != null) {
            this.C.setText(pez.aq(getContext(), charSequence));
            this.C.setVisibility(0);
        }
    }

    public final void x(java.lang.CharSequence charSequence) {
        this.B.setText(charSequence);
    }

    public DialerToolbar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        G();
    }

    public DialerToolbar(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        G();
    }
}

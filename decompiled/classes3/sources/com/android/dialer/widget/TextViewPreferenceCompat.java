package com.android.dialer.widget;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class TextViewPreferenceCompat extends androidx.preference.Preference {
    private int a;
    private java.lang.CharSequence b;
    private android.graphics.drawable.Drawable c;
    private android.widget.TextView d;

    public TextViewPreferenceCompat(android.content.Context context) {
        super(context, (android.util.AttributeSet) null);
        this.a = 0;
        ((androidx.preference.Preference) this).A = 2131624659;
    }

    public final void K(android.graphics.drawable.Drawable drawable) {
        this.c = drawable;
        if (this.d != null) {
            int layoutDirectionFromLocale = android.text.TextUtils.getLayoutDirectionFromLocale(java.util.Locale.getDefault());
            android.widget.TextView textView = this.d;
            if (layoutDirectionFromLocale == 1) {
                textView.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawable, (android.graphics.drawable.Drawable) null);
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            }
        }
    }

    public final void P(int i) {
        this.a = i;
        Q(((androidx.preference.Preference) this).j.getString(i));
    }

    public final void Q(java.lang.CharSequence charSequence) {
        this.a = 0;
        this.b = charSequence;
        android.widget.TextView textView = this.d;
        if (textView != null) {
            textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            this.d.setText(charSequence);
        }
    }

    public final void a(gfc gfcVar) {
        this.d = (android.widget.TextView) gfcVar.C(2131429240);
        int i = this.a;
        if (i != 0) {
            P(i);
        } else {
            java.lang.CharSequence charSequence = this.b;
            if (charSequence != null) {
                Q(charSequence);
            }
        }
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            K(drawable);
        } else if (s() != null) {
            K(s());
        }
    }

    public final java.lang.CharSequence v() {
        int i = this.a;
        if (i != 0) {
            return ((androidx.preference.Preference) this).j.getString(i);
        }
        java.lang.CharSequence charSequence = this.b;
        return charSequence != null ? charSequence : ((androidx.preference.Preference) this).r;
    }

    public TextViewPreferenceCompat(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.preferenceStyle, 0);
    }

    public TextViewPreferenceCompat(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TextViewPreferenceCompat(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = 0;
        ((androidx.preference.Preference) this).A = 2131624659;
    }
}

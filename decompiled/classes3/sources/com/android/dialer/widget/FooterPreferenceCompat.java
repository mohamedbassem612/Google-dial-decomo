package com.android.dialer.widget;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class FooterPreferenceCompat extends androidx.preference.Preference {
    public FooterPreferenceCompat(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        ((androidx.preference.Preference) this).q = -1;
        ((androidx.preference.Preference) this).A = 2131624236;
        J(2131231962);
        ((androidx.preference.Preference) this).v = false;
        ad();
    }

    public final void a(gfc gfcVar) {
        super.a(gfcVar);
        android.widget.TextView textView = (android.widget.TextView) gfcVar.a.findViewById(android.R.id.title);
        textView.setMovementMethod(new android.text.method.LinkMovementMethod());
        textView.setClickable(false);
        textView.setLongClickable(false);
    }

    public FooterPreferenceCompat(android.content.Context context) {
        this(context, null);
    }
}

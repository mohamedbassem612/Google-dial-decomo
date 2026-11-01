package com.android.dialer.multibindingsettings.impl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class BannerPreference extends androidx.preference.Preference {
    public java.lang.String a;
    public android.view.View.OnClickListener b;
    public java.lang.String c;
    public java.lang.String d;
    public android.graphics.drawable.Drawable e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        aooh.f(context, "context");
        aooh.f(context, "context");
        ((androidx.preference.Preference) this).A = 2131624023;
    }

    public final void a(gfc gfcVar) {
        aooh.f(gfcVar, "viewHolder");
        super.a(gfcVar);
        gfcVar.u = false;
        gfcVar.v = false;
        android.view.View viewC = gfcVar.C(2131427542);
        aooh.d(viewC, "null cannot be cast to non-null type android.widget.ImageView");
        android.widget.ImageView imageView = (android.widget.ImageView) viewC;
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
        }
        android.view.View viewC2 = gfcVar.C(2131427546);
        aooh.d(viewC2, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) viewC2;
        java.lang.String str = this.c;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
        android.view.View viewC3 = gfcVar.C(2131427544);
        aooh.d(viewC3, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView2 = (android.widget.TextView) viewC3;
        java.lang.String str2 = this.d;
        if (str2 == null) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(str2);
            textView2.setVisibility(0);
        }
        android.view.View viewC4 = gfcVar.C(2131427539);
        aooh.d(viewC4, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView3 = (android.widget.TextView) viewC4;
        java.lang.String str3 = this.a;
        if (str3 == null || this.b == null) {
            textView3.setVisibility(8);
            return;
        }
        textView3.setText(str3);
        textView3.setOnClickListener(this.b);
        textView3.setVisibility(0);
    }
}

package com.android.dialer.widget;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class SwitchWithLinkPreference extends androidx.preference.SwitchPreference {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchWithLinkPreference(android.content.Context context) {
        super(context);
        aooh.f(context, "context");
    }

    public final void a(gfc gfcVar) {
        aooh.f(gfcVar, "viewHolder");
        super.a(gfcVar);
        android.widget.TextView textView = (android.widget.TextView) gfcVar.C(android.R.id.summary);
        if (textView != null) {
            textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        }
    }
}

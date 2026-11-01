package com.android.dialer.patrick.impl.settings.ui;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class CallingCardComposePreferenceCompat extends androidx.preference.Preference {
    public final ccp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallingCardComposePreferenceCompat(android.content.Context context, ccp ccpVar) {
        super(context);
        aooh.f(context, "context");
        aooh.f(ccpVar, "uiData");
        this.a = ccpVar;
        ((androidx.preference.Preference) this).A = 2131624360;
    }

    public final void a(gfc gfcVar) {
        aooh.f(gfcVar, "holder");
        super.a(gfcVar);
        androidx.compose.ui.platform.ComposeView composeViewFindViewById = gfcVar.a.findViewById(2131427788);
        if (composeViewFindViewById == null) {
            throw new java.lang.IllegalStateException("ComposeView shouldn't be null!");
        }
        composeViewFindViewById.a(new cja(1995909145, true, new defpackage.rzg(this, 2)));
    }
}

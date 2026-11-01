package com.android.dialer.externals.aicore.ui;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class DialerAiCorePreference extends androidx.preference.Preference {
    private final yse a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialerAiCorePreference(android.content.Context context, yse yseVar) {
        super(context);
        aooh.f(context, "context");
        this.a = yseVar;
        this.v = false;
        ad();
        this.A = 2131623978;
    }

    @Override // androidx.preference.Preference
    public final void a(defpackage.gfc gfcVar) {
        aooh.f(gfcVar, "holder");
        super.a(gfcVar);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) gfcVar.a;
        android.content.Context context = frameLayout.getContext();
        aooh.e(context, "getContext(...)");
        aooh.f(context, "context");
        yse yseVar = this.a;
        aooh.f(yseVar, "aiCoreFeature");
        defpackage.ojl ojlVar = new defpackage.ojl(context);
        defpackage.oji ojiVarY = ojlVar.y();
        aooh.f(yseVar, "<set-?>");
        ojiVarY.c = yseVar;
        frameLayout.addView(ojlVar);
    }
}

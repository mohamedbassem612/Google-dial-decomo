package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sje extends or {
    public final /* synthetic */ android.content.Intent createIntent(android.content.Context context, java.lang.Object obj) {
        defpackage.abxt abxtVar = (defpackage.abxt) obj;
        aooh.f(context, "context");
        android.content.Intent component = new android.content.Intent().setComponent(new android.content.ComponentName("com.google.android.dialer", "com.android.dialer.patrick.account.sharing.ui.CallingCardSharingActivity"));
        component.putExtra("patrickDataKey", abxtVar != null ? abxtVar.i() : null);
        aooh.e(component, "apply(...)");
        return component;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object parseResult(int i, android.content.Intent intent) {
        byte[] byteArrayExtra;
        if (i != 0 || intent == null || (byteArrayExtra = intent.getByteArrayExtra("OnboardingFlowArgument")) == null) {
            return null;
        }
        return (defpackage.abxn) alad.y(defpackage.abxn.a, byteArrayExtra);
    }
}

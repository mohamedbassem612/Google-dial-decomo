package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sjd extends or {
    public final /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context context, java.lang.Object obj) {
        aooh.f(context, "context");
        aooh.f((aojh) obj, "input");
        android.content.Intent component = new android.content.Intent().setComponent(new android.content.ComponentName("com.google.android.dialer", "com.android.dialer.patrick.account.ui.CallingCardAccountActivity"));
        aooh.e(component, "setComponent(...)");
        return component;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object parseResult(int i, android.content.Intent intent) {
        byte[] byteArrayExtra;
        if (i != -1 || intent == null || (byteArrayExtra = intent.getByteArrayExtra("OnboardingFlowArgument")) == null) {
            return null;
        }
        return (defpackage.abxn) alad.y(defpackage.abxn.a, byteArrayExtra);
    }
}

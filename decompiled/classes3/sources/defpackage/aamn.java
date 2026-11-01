package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aamn extends defpackage.aamu {
    final /* synthetic */ android.content.Intent a;
    final /* synthetic */ java.lang.ref.WeakReference b;
    final /* synthetic */ aaoo c;

    public aamn(defpackage.aamr aamrVar, android.content.Intent intent, java.lang.ref.WeakReference weakReference, aaoo aaooVar) {
        this.a = intent;
        this.b = weakReference;
        this.c = aaooVar;
        j$.util.Objects.requireNonNull(aamrVar);
    }

    @Override // defpackage.aamu
    public final void c(com.google.android.gms.googlehelp.GoogleHelp googleHelp) {
        android.content.Intent intent = this.a;
        long jNanoTime = java.lang.System.nanoTime();
        intent.putExtra("EXTRA_START_TICK", jNanoTime);
        android.app.Activity activity = (android.app.Activity) this.b.get();
        if (activity != null) {
            aaoo aaooVar = this.c;
            if (aaooVar != null) {
                aaoo.v(activity.getApplicationContext(), aaooVar, jNanoTime, googleHelp);
            }
            googleHelp.z = aabx.b;
            com.google.android.gms.googlehelp.internal.common.TogglingData togglingData = googleHelp.w;
            if (togglingData != null) {
                togglingData.c = aaoo.k(activity);
            }
            defpackage.aamr.b(activity, intent, googleHelp);
        }
    }
}

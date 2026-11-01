package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aamo extends defpackage.aamu {
    final /* synthetic */ java.lang.ref.WeakReference a;
    final /* synthetic */ aaoo b;

    public aamo(defpackage.aamr aamrVar, java.lang.ref.WeakReference weakReference, aaoo aaooVar) {
        this.a = weakReference;
        this.b = aaooVar;
        j$.util.Objects.requireNonNull(aamrVar);
    }

    @Override // defpackage.aamu
    public final void d(com.google.android.gms.googlehelp.InProductHelp inProductHelp) {
        long jNanoTime = java.lang.System.nanoTime();
        com.google.android.gms.googlehelp.GoogleHelp googleHelp = inProductHelp.a;
        android.content.Intent intentPutExtra = new android.content.Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_START_TICK", jNanoTime);
        android.app.PendingIntent pendingIntent = googleHelp.y;
        if (pendingIntent != null) {
            intentPutExtra.putExtra("EXTRA_CUSTOM_FEEDBACK", pendingIntent);
            googleHelp.y = null;
        }
        aehj.bU(inProductHelp, intentPutExtra);
        android.app.Activity activity = (android.app.Activity) this.a.get();
        if (activity != null) {
            aaoo aaooVar = this.b;
            if (aaooVar != null) {
                aaoo.v(activity.getApplicationContext(), aaooVar, jNanoTime, googleHelp);
            }
            googleHelp.z = aabx.b;
            com.google.android.gms.googlehelp.internal.common.TogglingData togglingData = googleHelp.w;
            if (togglingData != null) {
                togglingData.c = aaoo.k(activity);
            }
            defpackage.aamr.b(activity, intentPutExtra, googleHelp);
        }
    }
}

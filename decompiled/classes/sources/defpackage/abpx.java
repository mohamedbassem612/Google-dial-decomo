package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class abpx implements java.lang.Runnable {
    public final /* synthetic */ defpackage.ajdd a;

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.ajdd ajddVar = this.a;
        try {
            android.os.Looper.prepare();
            ajddVar.o(android.os.Looper.myLooper());
            android.os.Looper.loop();
            if ("robolectric".equals(android.os.Build.FINGERPRINT)) {
                return;
            }
            defpackage.afec.a().post(new fvl(15));
        } catch (java.lang.Throwable th) {
            ajddVar.o(android.os.Looper.myLooper());
            throw th;
        }
    }
}

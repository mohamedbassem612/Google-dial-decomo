package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dew implements android.view.Choreographer.FrameCallback {
    final /* synthetic */ defpackage.aosb a;
    final /* synthetic */ defpackage.aonj b;

    public dew(defpackage.aosb aosbVar, defpackage.aonj aonjVar) {
        this.a = aosbVar;
        this.b = aonjVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        java.lang.Object aoivVar;
        try {
            aoivVar = this.b.a(java.lang.Long.valueOf(j));
        } catch (java.lang.Throwable th) {
            aoivVar = new defpackage.aoiv(th);
        }
        this.a.w(aoivVar);
    }
}

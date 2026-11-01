package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qhy extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.qhz a;

    public qhy(defpackage.qhz qhzVar) {
        this.a = qhzVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        aomy aomyVar;
        aooh.f(context, "context");
        aooh.f(intent, "intent");
        defpackage.qhz qhzVar = this.a;
        ahok ahokVarF = qhzVar.c.f(609, "Broadcast to ScreenOffDetector");
        try {
            if (aooh.n(intent.getAction(), "android.intent.action.SCREEN_OFF") && (aomyVar = qhzVar.e) != null) {
                aomyVar.a();
            }
            ajsz.ak(ahokVarF, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahokVarF, th);
                throw th2;
            }
        }
    }
}

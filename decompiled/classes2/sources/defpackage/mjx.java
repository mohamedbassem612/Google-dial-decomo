package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mjx extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.mki a;
    final /* synthetic */ aows b;

    public mjx(defpackage.mki mkiVar, aows aowsVar) {
        this.a = mkiVar;
        this.b = aowsVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        aooh.f(context, "context");
        aooh.f(intent, "intent");
        defpackage.mki mkiVar = this.a;
        ahpz ahpzVar = mkiVar.j;
        aows aowsVar = this.b;
        ahok ahokVarF = ahpzVar.f(358, "Broadcast to SimSelectorFlow");
        try {
            mkiVar.o.e((java.lang.Object) null);
            aowsVar.b(aojh.a);
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

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gwc extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.gwd a;

    public gwc(defpackage.gwd gwdVar) {
        this.a = gwdVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(intent, "intent");
        this.a.c(intent);
    }
}

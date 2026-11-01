package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class etu extends android.content.BroadcastReceiver {
    final /* synthetic */ afpb a;

    public etu(afpb afpbVar) {
        j$.util.Objects.requireNonNull(afpbVar);
        this.a = afpbVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        this.a.e.execute(new defpackage.esz(this, context, 4, null));
    }
}

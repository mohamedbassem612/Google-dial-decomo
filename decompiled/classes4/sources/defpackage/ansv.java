package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ansv extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.answ a;

    public ansv(defpackage.answ answVar) {
        j$.util.Objects.requireNonNull(answVar);
        this.a = answVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        defpackage.answ answVar = this.a;
        j$.util.Objects.requireNonNull(answVar);
        defpackage.alvr alvrVar = new defpackage.alvr(answVar, 13);
        anrc anrcVar = answVar.g;
        anrcVar.b(alvrVar);
        j$.util.Objects.requireNonNull(anrcVar);
        answVar.f.execute(new defpackage.alvr(anrcVar, 14));
    }
}

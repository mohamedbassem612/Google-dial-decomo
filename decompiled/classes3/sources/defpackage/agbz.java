package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class agbz implements android.os.Handler.Callback {
    final /* synthetic */ defpackage.agcb a;

    public agbz(defpackage.agcb agcbVar) {
        j$.util.Objects.requireNonNull(agcbVar);
        this.a = agcbVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        if (message.what != 0) {
            return false;
        }
        defpackage.agcb agcbVar = this.a;
        defpackage.agca agcaVar = (defpackage.agca) message.obj;
        synchronized (agcbVar.a) {
            if (agcbVar.c == agcaVar || agcbVar.d == agcaVar) {
                agcbVar.d(agcaVar, 2);
            }
        }
        return true;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class antf extends defpackage.antg {
    public final void a(int i, defpackage.antl antlVar) throws android.os.RemoteException {
        if (!b(i, antlVar.b())) {
            throw new android.os.RemoteException(a.bs(i, "BinderProxy#transact(", ", FLAG_ONEWAY) returned false"));
        }
    }
}

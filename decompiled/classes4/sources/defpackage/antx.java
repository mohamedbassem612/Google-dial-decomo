package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class antx implements defpackage.ansy {
    final /* synthetic */ int a;
    final /* synthetic */ java.util.logging.Logger b;
    final /* synthetic */ defpackage.ansy c;

    public antx(int i, java.util.logging.Logger logger, defpackage.ansy ansyVar) {
        this.a = i;
        this.b = logger;
        this.c = ansyVar;
    }

    @Override // defpackage.ansy
    public final boolean a(int i, android.os.Parcel parcel) {
        int callingUid = android.os.Binder.getCallingUid();
        int i2 = this.a;
        if (callingUid == i2) {
            return this.c.a(i, parcel);
        }
        this.b.logp(java.util.logging.Level.WARNING, "io.grpc.binder.internal.TransactionUtils$1", "handleTransaction", a.bf(i2, callingUid, "dropped txn from ", " !="));
        return false;
    }
}

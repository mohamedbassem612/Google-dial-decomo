package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class ansb implements defpackage.ansy {
    static final defpackage.ansb a = new defpackage.ansb();

    @Override // defpackage.ansy
    public final boolean a(int i, android.os.Parcel parcel) {
        if (i == 1 && parcel.readInt() > 0) {
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            try {
                defpackage.antl antlVarC = defpackage.antl.c();
                try {
                    antlVarC.a().writeInt(0);
                    strongBinder.transact(2, antlVarC.a(), null, 1);
                    antlVarC.close();
                } catch (java.lang.Throwable th) {
                    try {
                        antlVarC.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (android.os.RemoteException e) {
                defpackage.ansc.a.logp(java.util.logging.Level.WARNING, "io.grpc.binder.internal.BinderServer$GoAwayHandler", "handleTransaction", "Couldn't reply to post-shutdown() SETUP_TRANSPORT.", (java.lang.Throwable) e);
            }
        }
        return false;
    }
}

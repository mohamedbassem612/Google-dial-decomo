package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ansz extends android.os.Binder {
    private static final java.util.logging.Logger b = java.util.logging.Logger.getLogger(defpackage.ansz.class.getName());
    public defpackage.ansy a;

    public ansz(defpackage.ansy ansyVar) {
        this.a = ansyVar;
    }

    @Override // android.os.Binder
    protected final boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) {
        defpackage.ansy ansyVar = this.a;
        boolean zA = false;
        if (ansyVar != null) {
            try {
                if ((i2 & 1) == 0) {
                    b.logp(java.util.logging.Level.WARNING, "io.grpc.binder.internal.LeakSafeOneWayBinder", "onTransact", a.bj(i2, "ignoring non-oneway transaction. flags="));
                } else {
                    zA = ansyVar.a(i, parcel);
                }
            } catch (java.lang.RuntimeException e) {
                b.logp(java.util.logging.Level.WARNING, "io.grpc.binder.internal.LeakSafeOneWayBinder", "onTransact", a.bj(i, "failure sending transaction "), (java.lang.Throwable) e);
            }
        }
        return zA;
    }

    @Override // android.os.Binder, android.os.IBinder
    public final boolean pingBinder() {
        return this.a != null;
    }
}

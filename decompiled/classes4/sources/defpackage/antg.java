package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class antg extends anth {
    protected final android.os.IBinder b;

    public antg(android.os.IBinder iBinder) {
        ahvr.ci(iBinder);
        this.b = iBinder;
    }

    public final boolean b(int i, android.os.Parcel parcel) {
        try {
            return this.b.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final void c(android.os.IBinder.DeathRecipient deathRecipient) throws android.os.RemoteException {
        this.b.linkToDeath(deathRecipient, 0);
    }

    public final void d(android.os.IBinder.DeathRecipient deathRecipient) {
        this.b.unlinkToDeath(deathRecipient, 0);
    }
}

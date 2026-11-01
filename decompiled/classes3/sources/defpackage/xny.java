package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class xny extends ylc implements defpackage.xnz {
    public xny() {
        super("com.android.onboarding.tasks.service.IObserverHandle");
    }

    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeInt(1);
            return true;
        }
        if (i != 2) {
            return false;
        }
        a();
        return true;
    }
}

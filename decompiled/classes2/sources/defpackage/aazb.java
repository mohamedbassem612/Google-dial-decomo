package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aazb extends ylb implements android.os.IInterface {
    public aazb(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.ims.ipc.IAudioService");
    }

    public final int a() {
        android.os.Parcel parcelEQ = eQ(1, eP());
        int i = parcelEQ.readInt();
        parcelEQ.recycle();
        return i;
    }
}

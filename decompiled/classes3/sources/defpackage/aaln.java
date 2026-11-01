package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaln extends ylb implements android.os.IInterface {
    public aaln(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int a() {
        android.os.Parcel parcelEQ = eQ(6, eP());
        int i = parcelEQ.readInt();
        parcelEQ.recycle();
        return i;
    }
}

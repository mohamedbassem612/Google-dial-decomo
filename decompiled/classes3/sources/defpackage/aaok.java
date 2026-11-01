package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaok extends ylb implements android.os.IInterface {
    public aaok(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    public final int a() {
        android.os.Parcel parcelEQ = eQ(9, eP());
        int i = parcelEQ.readInt();
        parcelEQ.recycle();
        return i;
    }
}

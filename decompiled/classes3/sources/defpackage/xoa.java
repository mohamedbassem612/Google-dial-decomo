package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xoa extends ylb implements defpackage.xoc {
    public xoa(android.os.IBinder iBinder) {
        super(iBinder, "com.android.onboarding.tasks.service.IPersistableBundleStream");
    }

    @Override // defpackage.xoc
    public final byte[] a() {
        android.os.Parcel parcelEQ = eQ(2, eP());
        byte[] bArrCreateByteArray = parcelEQ.createByteArray();
        parcelEQ.recycle();
        return bArrCreateByteArray;
    }
}

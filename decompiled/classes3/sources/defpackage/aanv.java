package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aanv extends ylb implements android.os.IInterface {
    public aanv(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @java.lang.Deprecated
    public final void a(com.google.android.gms.location.internal.LocationRequestUpdateData locationRequestUpdateData) {
        android.os.Parcel parcelEP = eP();
        yld.d(parcelEP, locationRequestUpdateData);
        eR(59, parcelEP);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaru extends ylb implements android.os.IInterface {
    public aaru(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.people.internal.IPeopleService");
    }

    public final void a(defpackage.aart aartVar, boolean z, int i, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
        android.os.Parcel parcelEP = eP();
        yld.f(parcelEP, aartVar);
        parcelEP.writeInt(z ? 1 : 0);
        parcelEP.writeString(null);
        parcelEP.writeString(null);
        parcelEP.writeInt(i);
        yld.d(parcelEP, apiMetadata);
        android.os.Parcel parcelEQ = eQ(11, parcelEP);
        parcelEQ.recycle();
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaai extends defpackage.ylb implements android.os.IInterface {
    public aaai(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    public final void a(defpackage.aaah aaahVar, com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable batchedLogErrorParcelable) {
        android.os.Parcel parcelEP = eP();
        defpackage.yld.f(parcelEP, aaahVar);
        defpackage.yld.d(parcelEP, batchedLogErrorParcelable);
        eS(8, parcelEP);
    }
}

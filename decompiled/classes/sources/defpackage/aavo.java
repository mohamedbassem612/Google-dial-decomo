package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aavo extends defpackage.ylb implements android.os.IInterface {
    public aavo(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingService");
    }

    public final void a(zyp zypVar, defpackage.aavn aavnVar) {
        android.os.Parcel parcelEP = eP();
        defpackage.yld.f(parcelEP, zypVar);
        defpackage.yld.f(parcelEP, aavnVar);
        eR(4, parcelEP);
    }
}

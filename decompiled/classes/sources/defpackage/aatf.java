package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aatf extends defpackage.ylb implements android.os.IInterface {
    public aatf(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService");
    }

    public final void a(defpackage.aate aateVar, java.lang.String str) {
        android.os.Parcel parcelEP = eP();
        java.lang.ClassLoader classLoader = defpackage.yld.a;
        parcelEP.writeStrongBinder(aateVar);
        parcelEP.writeString(str);
        eR(5, parcelEP);
    }
}

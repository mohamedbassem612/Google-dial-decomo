package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yrr extends ylb implements android.os.IInterface {
    public yrr(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.apps.tachyon.contacts.reachability.IReachabilityService");
    }

    public final void a(java.util.List list, defpackage.yrq yrqVar) {
        android.os.Parcel parcelEP = eP();
        parcelEP.writeStringList(list);
        yld.f(parcelEP, yrqVar);
        eS(2, parcelEP);
    }
}

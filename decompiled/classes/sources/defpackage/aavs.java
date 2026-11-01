package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aavs extends defpackage.aagp {
    private final java.util.concurrent.atomic.AtomicReference a;

    public aavs(android.content.Context context, android.os.Looper looper, defpackage.aagi aagiVar, defpackage.aadc aadcVar, defpackage.aadd aaddVar) {
        super(context, looper, 41, aagiVar, aadcVar, aaddVar);
        this.a = new java.util.concurrent.atomic.AtomicReference();
    }

    @Override // defpackage.aagf
    public final void C() {
        try {
            zyp zypVar = (zyp) this.a.getAndSet(null);
            if (zypVar != null) {
                aavq aavqVar = new aavq();
                defpackage.aavo aavoVar = (defpackage.aavo) v();
                android.os.Parcel parcelEP = aavoVar.eP();
                defpackage.yld.f(parcelEP, zypVar);
                defpackage.yld.f(parcelEP, aavqVar);
                aavoVar.eR(5, parcelEP);
            }
        } catch (android.os.RemoteException e) {
            android.util.Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", e);
        }
        super.C();
    }

    public final void N(zyp zypVar, zyp zypVar2, defpackage.aaec aaecVar) {
        defpackage.aavn aavrVar = new aavr((defpackage.aavo) v(), aaecVar, zypVar2);
        if (zypVar == null) {
            if (zypVar2 == null) {
                aaecVar.c(com.google.android.gms.common.api.Status.a);
                return;
            } else {
                ((defpackage.aavo) v()).a(zypVar2, aavrVar);
                return;
            }
        }
        defpackage.aavo aavoVar = (defpackage.aavo) v();
        android.os.Parcel parcelEP = aavoVar.eP();
        defpackage.yld.f(parcelEP, zypVar);
        defpackage.yld.f(parcelEP, aavrVar);
        aavoVar.eR(10, parcelEP);
    }

    @Override // defpackage.aagp, defpackage.aagf, defpackage.aacv
    public final int a() {
        return 12600000;
    }

    @Override // defpackage.aagf
    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        return iInterfaceQueryLocalInterface instanceof defpackage.aavo ? (defpackage.aavo) iInterfaceQueryLocalInterface : new defpackage.aavo(iBinder);
    }

    @Override // defpackage.aagf
    protected final java.lang.String c() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    @Override // defpackage.aagf
    protected final java.lang.String d() {
        return "com.google.android.gms.usagereporting.service.START";
    }

    @Override // defpackage.aagf
    public final boolean e() {
        return true;
    }

    @Override // defpackage.aagf
    public final com.google.android.gms.common.Feature[] g() {
        return defpackage.aavd.g;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aatg extends defpackage.aagp {
    public aatg(android.content.Context context, android.os.Looper looper, defpackage.aagi aagiVar, defpackage.aadc aadcVar, defpackage.aadd aaddVar) {
        super(context, looper, 51, aagiVar, aadcVar, aaddVar);
    }

    @Override // defpackage.aagf
    public final boolean K() {
        return false;
    }

    @Override // defpackage.aagp, defpackage.aagf, defpackage.aacv
    public final int a() {
        return 9410000;
    }

    @Override // defpackage.aagf
    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return iInterfaceQueryLocalInterface instanceof defpackage.aatf ? (defpackage.aatf) iInterfaceQueryLocalInterface : new defpackage.aatf(iBinder);
    }

    @Override // defpackage.aagf
    protected final java.lang.String c() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override // defpackage.aagf
    protected final java.lang.String d() {
        return "com.google.android.gms.phenotype.service.START";
    }

    @Override // defpackage.aagf
    public final com.google.android.gms.common.Feature[] g() {
        return defpackage.aasp.k;
    }
}

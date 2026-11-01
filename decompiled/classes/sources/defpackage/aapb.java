package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aapb extends defpackage.aagp {
    public aapb(android.content.Context context, android.os.Looper looper, defpackage.aagi aagiVar, defpackage.aaei aaeiVar, defpackage.aafi aafiVar) {
        super(context, looper, 215, aagiVar, aaeiVar, aafiVar);
    }

    @Override // defpackage.aagf
    public final boolean I() {
        return true;
    }

    @Override // defpackage.aagp, defpackage.aagf, defpackage.aacv
    public final int a() {
        return 19621000;
    }

    @Override // defpackage.aagf
    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdisync.internal.IMdiSyncService");
        return iInterfaceQueryLocalInterface instanceof defpackage.aaoy ? (defpackage.aaoy) iInterfaceQueryLocalInterface : new defpackage.aaoy(iBinder);
    }

    @Override // defpackage.aagf
    protected final java.lang.String c() {
        return "com.google.android.gms.mdisync.internal.IMdiSyncService";
    }

    @Override // defpackage.aagf
    protected final java.lang.String d() {
        return "com.google.android.gms.mdisync.service.START";
    }

    @Override // defpackage.aagf
    public final boolean e() {
        return true;
    }

    @Override // defpackage.aagf
    protected final boolean f() {
        return true;
    }

    @Override // defpackage.aagf
    public final com.google.android.gms.common.Feature[] g() {
        return defpackage.aaov.c;
    }
}

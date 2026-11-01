package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaag extends defpackage.aagp {
    public aaag(android.content.Context context, android.os.Looper looper, defpackage.aagi aagiVar, defpackage.aadc aadcVar, defpackage.aadd aaddVar) {
        super(context, looper, 40, aagiVar, aadcVar, aaddVar);
    }

    @Override // defpackage.aagp, defpackage.aagf, defpackage.aacv
    public final int a() {
        return 11925000;
    }

    @Override // defpackage.aagf
    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return iInterfaceQueryLocalInterface instanceof defpackage.aaai ? (defpackage.aaai) iInterfaceQueryLocalInterface : new defpackage.aaai(iBinder);
    }

    @Override // defpackage.aagf
    protected final java.lang.String c() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    @Override // defpackage.aagf
    protected final java.lang.String d() {
        return "com.google.android.gms.clearcut.service.START";
    }

    @Override // defpackage.aagf
    public final com.google.android.gms.common.Feature[] g() {
        return new com.google.android.gms.common.Feature[]{defpackage.zzp.a, defpackage.zzp.c};
    }
}

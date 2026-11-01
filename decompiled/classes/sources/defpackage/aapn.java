package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aapn extends defpackage.aagp {
    public aapn(android.content.Context context, android.os.Looper looper, defpackage.aagi aagiVar, defpackage.aadc aadcVar, defpackage.aadd aaddVar) {
        super(context, looper, 160, aagiVar, aadcVar, aaddVar);
    }

    @Override // defpackage.aagp, defpackage.aagf, defpackage.aacv
    public final int a() {
        return 12600000;
    }

    @Override // defpackage.aagf
    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mobstore.IMobStoreFileService");
        return iInterfaceQueryLocalInterface instanceof defpackage.aaph ? (defpackage.aaph) iInterfaceQueryLocalInterface : new defpackage.aaph(iBinder);
    }

    @Override // defpackage.aagf
    protected final java.lang.String c() {
        return "com.google.android.gms.mobstore.IMobStoreFileService";
    }

    @Override // defpackage.aagf
    protected final java.lang.String d() {
        return "com.google.android.mobstore.service.START";
    }

    @Override // defpackage.aagf
    public final boolean e() {
        return true;
    }

    @Override // defpackage.aagf
    public final com.google.android.gms.common.Feature[] g() {
        return defpackage.aamx.f;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zxo extends defpackage.aagp {
    public zxo(android.content.Context context, android.os.Looper looper, defpackage.aagi aagiVar, defpackage.aaei aaeiVar, defpackage.aafi aafiVar) {
        super(context, looper, 153, aagiVar, aaeiVar, aafiVar);
    }

    @Override // defpackage.aagp, defpackage.aagf, defpackage.aacv
    public final int a() {
        return 12451000;
    }

    @Override // defpackage.aagf
    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IAccountDataService");
        return iInterfaceQueryLocalInterface instanceof defpackage.zxl ? (defpackage.zxl) iInterfaceQueryLocalInterface : new defpackage.zxl(iBinder);
    }

    @Override // defpackage.aagf
    protected final java.lang.String c() {
        return "com.google.android.gms.auth.account.data.IAccountDataService";
    }

    @Override // defpackage.aagf
    protected final java.lang.String d() {
        return "com.google.android.gms.auth.account.data.service.START";
    }

    @Override // defpackage.aagf
    public final boolean e() {
        return true;
    }

    @Override // defpackage.aagf
    public final com.google.android.gms.common.Feature[] g() {
        return new com.google.android.gms.common.Feature[]{defpackage.zwi.a, defpackage.zwi.b, defpackage.zwi.c, defpackage.zwi.d, defpackage.zwi.e, defpackage.zwi.f};
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zxz extends defpackage.aagp {
    private final android.os.Bundle a;

    public zxz(android.content.Context context, android.os.Looper looper, defpackage.aagi aagiVar, defpackage.zxw zxwVar, defpackage.aaei aaeiVar, defpackage.aafi aafiVar) {
        super(context, looper, 16, aagiVar, aaeiVar, aafiVar);
        this.a = zxwVar == null ? new android.os.Bundle() : new android.os.Bundle(zxwVar.a);
    }

    @Override // defpackage.aagp, defpackage.aagf, defpackage.aacv
    public final int a() {
        return 12451000;
    }

    @Override // defpackage.aagf
    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return iInterfaceQueryLocalInterface instanceof defpackage.zyb ? (defpackage.zyb) iInterfaceQueryLocalInterface : new defpackage.zyb(iBinder);
    }

    @Override // defpackage.aagf
    protected final java.lang.String c() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // defpackage.aagf
    protected final java.lang.String d() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // defpackage.aagf
    public final boolean e() {
        return true;
    }

    @Override // defpackage.aagf
    protected final android.os.Bundle h() {
        return this.a;
    }

    @Override // defpackage.aagf, defpackage.aacv
    public final boolean i() {
        defpackage.aagi aagiVar = ((defpackage.aagp) this).u;
        android.accounts.Account account = aagiVar.a;
        if (!android.text.TextUtils.isEmpty(account != null ? account.name : null)) {
            if (((uzx) aagiVar.d.get(defpackage.zxv.a)) != null) {
                throw null;
            }
            if (!aagiVar.b.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}

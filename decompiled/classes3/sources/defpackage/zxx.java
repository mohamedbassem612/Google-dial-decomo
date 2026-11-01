package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zxx extends aagp {
    private final defpackage.zxs a;

    public zxx(android.content.Context context, android.os.Looper looper, aagi aagiVar, defpackage.zxs zxsVar, aadc aadcVar, aadd aaddVar) {
        super(context, looper, 68, aagiVar, aadcVar, aaddVar);
        defpackage.zxr zxrVar = new defpackage.zxr(zxsVar == null ? defpackage.zxs.a : zxsVar);
        zxrVar.b = defpackage.aamy.a();
        this.a = new defpackage.zxs(zxrVar);
    }

    public final int a() {
        return 12800000;
    }

    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof defpackage.zxy ? (defpackage.zxy) iInterfaceQueryLocalInterface : new defpackage.zxy(iBinder);
    }

    protected final java.lang.String c() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    protected final java.lang.String d() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    protected final android.os.Bundle h() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("consumer_package", null);
        defpackage.zxs zxsVar = this.a;
        bundle.putBoolean("force_save_dialog", zxsVar.c);
        bundle.putString("log_session_id", zxsVar.d);
        return bundle;
    }
}

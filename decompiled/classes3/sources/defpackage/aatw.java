package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aatw extends aagp implements aacv {
    public final aagi a;
    public final java.lang.Integer v;
    private final boolean w;
    private final android.os.Bundle x;

    public aatw(android.content.Context context, android.os.Looper looper, aagi aagiVar, android.os.Bundle bundle, aadc aadcVar, aadd aaddVar) {
        super(context, looper, 44, aagiVar, aadcVar, aaddVar);
        this.w = true;
        this.a = aagiVar;
        this.x = bundle;
        this.v = aagiVar.h;
    }

    public final int a() {
        return 12451000;
    }

    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof defpackage.aatv ? (defpackage.aatv) iInterfaceQueryLocalInterface : new defpackage.aatv(iBinder);
    }

    protected final java.lang.String c() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    protected final java.lang.String d() {
        return "com.google.android.gms.signin.service.START";
    }

    protected final android.os.Bundle h() {
        aagi aagiVar = this.a;
        java.lang.String packageName = ((aagf) this).b.getPackageName();
        java.lang.String str = aagiVar.e;
        if (!packageName.equals(str)) {
            this.x.putString("com.google.android.gms.signin.internal.realClientPackageName", str);
        }
        return this.x;
    }

    public final boolean i() {
        return this.w;
    }
}
